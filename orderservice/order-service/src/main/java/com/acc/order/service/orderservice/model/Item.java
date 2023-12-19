package com.acc.order.service.orderservice.model;



import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="item")
public class Item {
	 @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;

    private String itemDescription;
    private Integer quantity;
    private BigDecimal price;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Item() {

	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", itemDescription=" + itemDescription + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}


}

