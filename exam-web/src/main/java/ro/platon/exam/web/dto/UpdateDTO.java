package ro.platon.exam.web.dto;

import lombok.*;

/**
 * Created by vladplaton on 20/06/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UpdateDTO {
    Long id;
    Float price;
}
