package ro.platon.exam.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladplaton on 20/06/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngredientsDTO {
    List<IngredientDTO> ingredients = new ArrayList<>();
}
