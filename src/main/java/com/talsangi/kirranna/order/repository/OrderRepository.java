package com.talsangi.kirranna.order.repository;

import com.talsangi.kirranna.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
