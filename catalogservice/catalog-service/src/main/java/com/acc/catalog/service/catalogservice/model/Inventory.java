package com.acc.catalog.service.catalogservice.model;



import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String itemType;
    private String itemDescription;
    private Integer quantity;

    private BigDecimal price;
    @JsonIgnore
    private Date quantityDate;

    // for JPA only, no use
    public Inventory() {
    }

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

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
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

	public Date getQuantityDate() {
		return quantityDate;
	}

	public void setQuantityDate(Date quantityDate) {
		this.quantityDate = quantityDate;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", title=" + title + ", itemType=" + itemType + ", itemDescription="
				+ itemDescription + ", quantity=" + quantity + ", price=" + price + ", quantityDate=" + quantityDate
				+ "]";
	}

}

