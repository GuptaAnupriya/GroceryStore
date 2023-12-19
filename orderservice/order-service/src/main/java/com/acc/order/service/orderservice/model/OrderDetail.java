package com.acc.order.service.orderservice.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="orderDetail")
public class OrderDetail {
	 @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String user;
	public BigDecimal amount;
	public Date orderDate;
	public String deliveryStatus;
	 @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "order_id", referencedColumnName = "id")
	    private List<Item> itemList ;
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}


	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}


	public int getId() {
		return id;
	}
	public OrderDetail() {

	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", user=" + user + ", amount=" + amount + ", orderDate=" + orderDate
				+ ", deliveryStatus=" + deliveryStatus + ", itemList=" + itemList + "]";
	}


}
