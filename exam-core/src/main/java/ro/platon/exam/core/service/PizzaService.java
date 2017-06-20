package ro.platon.exam.core.service;

import ro.platon.exam.core.model.Ingredient;
import ro.platon.exam.core.model.Pizza;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by vladplaton on 20/06/2017.
 */
public interface PizzaService {
    Pizza get(Long id);
    List<Pizza> getAll();
    Pizza updatePizza(Long id, Float price);
    List<Pizza> updatePizza(Float value);
    List<Ingredient> getIngredientsForPizza(Long pizzaId);
}
