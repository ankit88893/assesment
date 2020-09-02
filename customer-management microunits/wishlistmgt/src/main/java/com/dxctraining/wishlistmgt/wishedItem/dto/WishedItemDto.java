package com.dxctraining.wishlistmgt.wishedItem.dto;

public class WishedItemDto {

	private String id;
	private String productId;
	private Integer customerId;

	public WishedItemDto() {

	}

	public WishedItemDto(String id, String productId, Integer customerId) {
		this.customerId = customerId;
		this.productId = productId;
		this.id = id;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

}
