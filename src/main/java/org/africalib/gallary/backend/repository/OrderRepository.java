package org.africalib.gallary.backend.repository;

import org.africalib.gallary.backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
