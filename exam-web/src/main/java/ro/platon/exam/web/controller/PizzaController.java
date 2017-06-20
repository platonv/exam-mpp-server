package ro.platon.exam.web.controller;

import org.hibernate.sql.Update;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ro.platon.exam.core.model.Ingredient;
import ro.platon.exam.core.model.Pizza;
import ro.platon.exam.core.service.PizzaService;
import ro.platon.exam.web.dto.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by vladplaton on 20/06/2017.
 */
@RestController
public class PizzaController {
    private static final Logger log = LoggerFactory.getLogger(PizzaController.class);

    @Autowired
    private PizzaService pizzaService;

    @RequestMapping(value = "/pizzas", method = RequestMethod.GET)
    PizzasDTO getPizzas(){
        log.trace("Controller - get pizzas");
        List<Pizza> pizzas = pizzaService.getAll();
        log.trace("Controller - got all");

        PizzasDTO pizzasDTO = new PizzasDTO(pizzas.stream().map(p -> new PizzaDTO(p)).collect(Collectors.toList()));
        return pizzasDTO;
    }

    @RequestMapping(value = "/pizzas/{pizzaId}", method = RequestMethod.PUT)
    PizzaDTO upatePizza(@PathVariable Long pizzaId, @RequestBody UpdateDTO priceDTO){
        log.trace("Controller - update pizza {} {}", pizzaId, priceDTO);
        System.out.println(priceDTO);
        Pizza pizza = pizzaService.updatePizza(pizzaId, priceDTO.getPrice());
        log.trace("Controller - updatedPizza");

        return new PizzaDTO(pizza);
    }

    @RequestMapping(value = "/pizzas", method = RequestMethod.PUT)
    PizzasDTO updatePizzas(@RequestBody UpdateDTO priceData){
        System.out.println(priceData);
        log.trace("Controller - update all pizza {} {}", priceData);
        List<Pizza> pizzas = pizzaService.updatePizza(priceData.getPrice());
        log.trace("Controller - updatedPizza all");

        PizzasDTO pizzasDTO = new PizzasDTO(pizzas.stream().map(p -> new PizzaDTO(p)).collect(Collectors.toList()));
        return pizzasDTO;
    }

    @RequestMapping(value = "/ingredients/{pizzaID}", method = RequestMethod.GET)
    IngredientsDTO getIngredients(@PathVariable Long pizzaID){
        log.trace("Controller - get ingredients for pizza {}", pizzaID);
        List<Ingredient> allIngredients = this.pizzaService.getIngredientsForPizza(pizzaID);
        log.trace("Controller - got all ingredients");

        IngredientsDTO result = new IngredientsDTO(allIngredients.stream().map(i -> new IngredientDTO(i)).collect(Collectors.toList()));
        return result;
    }

}
