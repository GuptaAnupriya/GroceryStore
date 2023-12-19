package com.acc.order.service.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.order.service.orderservice.model.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

}
