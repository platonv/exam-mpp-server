package ro.platon.exam.core.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vladplaton on 20/06/2017.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Ingredient extends BaseEntity<Long> {
    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;
}
