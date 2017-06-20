package ro.platon.exam.core.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by vladplaton on 19/06/2017.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity<ID extends Serializable> implements Serializable{
    @Id
    @GeneratedValue
    private ID id;
}
