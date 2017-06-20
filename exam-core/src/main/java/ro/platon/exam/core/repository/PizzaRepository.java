package ro.platon.exam.core.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.platon.exam.core.model.Pizza;

/**
 * Created by vladplaton on 20/06/2017.
 */
@Repository
@Transactional
public interface PizzaRepository extends EntityRepository<Pizza, Long> {
    @Modifying
    @Query("update Pizza set price = (price+?1)")
    void incrementAll(Float value);
}
