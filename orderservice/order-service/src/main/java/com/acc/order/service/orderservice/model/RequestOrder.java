package com.acc.order.service.orderservice.model;

import java.sql.Date;
import java.util.List;

public class RequestOrder {

	public String user;
	public Date orderDate;
	public String deliveryStatus;
	public List<Item> items;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "RequestOrder [user=" + user + ", orderDate=" + orderDate + ", deliveryStatus=" + deliveryStatus
				+ ", items=" + items + "]";
	}
	public RequestOrder() {

	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



}
