package ro.platon.exam.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.platon.exam.core.model.Pizza;

/**
 * Created by vladplaton on 20/06/2017.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PizzaDTO {
    long id;
    String name;
    String description;
    Float price;

    public PizzaDTO(Pizza p){
        this.id = p.getId();
        this.name = p.getName();
        this.description = p.getDescription();
        this.price = p.getPrice();
    }
}
