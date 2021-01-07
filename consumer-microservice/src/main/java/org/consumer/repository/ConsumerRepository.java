package org.consumer.repository;

import org.consumer.model.ConsumerBeans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<ConsumerBeans, Long>{

}
