package com.dxctraining.wishlistmgt.wishedItem.entities;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "whished items")
public class WishedItem {
@Id
@GeneratedValue
	private String id;

	private Integer customerId;

	private String productId;

	public WishedItem() {

	}

	public WishedItem(String id) {
		this.id = id;

	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
