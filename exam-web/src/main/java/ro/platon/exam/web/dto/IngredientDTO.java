package ro.platon.exam.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.platon.exam.core.model.Ingredient;

/**
 * Created by vladplaton on 20/06/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngredientDTO {
    long id;
    String name;

    public IngredientDTO(Ingredient ingredient) {
        this.id = ingredient.getId();
        this.name = ingredient.getName();
    }
}
