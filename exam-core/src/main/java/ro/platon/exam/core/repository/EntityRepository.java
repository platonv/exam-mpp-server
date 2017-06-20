package ro.platon.exam.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;
import ro.platon.exam.core.model.BaseEntity;

import java.io.Serializable;

/**
 * Created by vladplaton on 19/06/2017.
 */
@NoRepositoryBean
@Transactional
public interface EntityRepository<T extends BaseEntity<ID>, ID extends Serializable> extends JpaRepository<T, ID> {
}
