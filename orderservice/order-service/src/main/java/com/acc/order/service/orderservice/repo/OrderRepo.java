package com.acc.order.service.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acc.order.service.orderservice.model.OrderDetail;

@Repository
public interface OrderRepo extends JpaRepository<OrderDetail, Integer>{

}
