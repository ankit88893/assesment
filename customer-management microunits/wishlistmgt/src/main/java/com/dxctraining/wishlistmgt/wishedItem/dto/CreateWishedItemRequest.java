package com.dxctraining.wishlistmgt.wishedItem.dto;

public class CreateWishedItemRequest {

	private Integer customerId;
	private String productId;

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

}
