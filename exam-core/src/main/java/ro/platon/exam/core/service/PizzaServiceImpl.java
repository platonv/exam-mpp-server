package ro.platon.exam.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.platon.exam.core.model.Ingredient;
import ro.platon.exam.core.model.Pizza;
import ro.platon.exam.core.repository.PizzaRepository;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by vladplaton on 20/06/2017.
 */
@Service
public class PizzaServiceImpl implements PizzaService {

    private static final Logger log = LoggerFactory.getLogger(PizzaServiceImpl.class);

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public Pizza get(Long id) {
        log.trace("Service - Begin get pizza with id {}", id);
        Pizza p = pizzaRepository.findOne(id);
        log.trace("Service - Got pizza {}", p);
        return p;
    }

    @Override
    public List<Pizza> getAll() {
        log.trace("Service - Returning all pizzas");
        return pizzaRepository.findAll();
    }

    @Override
    public Pizza updatePizza(Long id, Float price) {
        System.out.println(id);
        System.out.println(price);
        log.trace("Service - Begin update pizza with id {}'s price to ", id, price);
        Pizza p = pizzaRepository.findOne(id);
        p.setPrice(price);
        pizzaRepository.save(p);
        log.trace("Service - Updated pizza with id {}'s price to ", id, price);
        return p;
    }

    @Override
    public List<Pizza> updatePizza(Float value) {
        log.trace("Service - Begin update pizzas");
        pizzaRepository.incrementAll(value);
        log.trace("Service - Updated pizzas");
        return pizzaRepository.findAll();
    }

    @Override
    @Transactional
    public List<Ingredient> getIngredientsForPizza(Long pizzaID) {
        log.trace("Service - Get all ingredients for pizza {}", pizzaID);
        Pizza pizza = pizzaRepository.findOne(pizzaID);
        Set<Ingredient> pizzaIngredients = pizza.getIngredients();
        log.trace("Service - got all ingredients");
        return pizzaIngredients.stream().collect(Collectors.toList());
    }
}
