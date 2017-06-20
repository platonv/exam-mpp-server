package ro.platon.exam.web.dto;

import lombok.*;
import org.hibernate.sql.Update;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladplaton on 20/06/2017.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AllUpdateDTO {
    List<UpdateDTO> updateDTOS = new ArrayList<>();
}
