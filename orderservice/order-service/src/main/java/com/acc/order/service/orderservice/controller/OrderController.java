package com.acc.order.service.orderservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acc.order.service.orderservice.model.OrderDetail;
import com.acc.order.service.orderservice.model.RequestOrder;
import com.acc.order.service.orderservice.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	// creating a get mapping that retrieves the detail of a specific order
	@GetMapping("/order/{orderid}")
	private Optional<OrderDetail> getBooks(@PathVariable("orderid") int orderid) {
		return orderService.getOrderById(orderid);
	}

	// creating post mapping that post the item detail in the database
		@PostMapping("/order")
		private OrderDetail saveItem(@RequestBody RequestOrder reqOrder) {
			OrderDetail order = new OrderDetail();
			order = orderService.saveOrUpdate(reqOrder);
			return order;
		}

}
