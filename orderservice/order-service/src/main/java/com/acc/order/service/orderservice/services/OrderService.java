package com.acc.order.service.orderservice.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.order.service.orderservice.model.Item;

import com.acc.order.service.orderservice.model.OrderDetail;
import com.acc.order.service.orderservice.model.RequestOrder;
import com.acc.order.service.orderservice.repo.ItemRepo;
import com.acc.order.service.orderservice.repo.OrderRepo;

@Service
public class OrderService {


	@Autowired
	OrderRepo orderRepo;

	@Autowired
	ItemRepo itemRepo;

	public Optional<OrderDetail> getOrderById(int orderid) {

		return orderRepo.findById(orderid);
	}

	public OrderDetail saveOrUpdate(RequestOrder reqOrder) {
		double amount = 0.0;
		OrderDetail order = new OrderDetail();
		List<Item> listItem = new ArrayList();
		for (Item itemDetails : reqOrder.getItems()) {
			amount = amount + itemDetails.getPrice().doubleValue();
			Item item = new Item();
			item.setItemDescription(itemDetails.getItemDescription());
			item.setPrice(itemDetails.getPrice());
			item.setQuantity(itemDetails.getQuantity());
			item.setTitle(itemDetails.getTitle());
			listItem.add(item);
		}

		order.setDeliveryStatus(reqOrder.getDeliveryStatus());
		order.setUser(reqOrder.getUser());

		for (Item itemDetails : reqOrder.getItems()) {
			amount = amount + itemDetails.getPrice().doubleValue();

		}
		order.setItemList(listItem);
		order.setAmount(BigDecimal.valueOf(amount));

		orderRepo.save(order);


		return order;
	}

}
