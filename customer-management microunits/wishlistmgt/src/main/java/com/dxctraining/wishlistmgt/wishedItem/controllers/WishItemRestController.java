package com.dxctraining.wishlistmgt.wishedItem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dxctraining.wishlistmgt.wishedItem.dto.CreateWishedItemRequest;
import com.dxctraining.wishlistmgt.wishedItem.dto.WishedItemDto;
import com.dxctraining.wishlistmgt.wishedItem.entities.WishedItem;
import com.dxctraining.wishlistmgt.wishedItem.service.IWishlistService;
import com.dxctraining.wishlistmgt.wishedItem.util.WishedItemUtil;

@RestController
@RequestMapping("/wishitems")
public class WishItemRestController {
	
	@Autowired
	private IWishlistService service;
	
	@Autowired
	private WishedItemUtil util;
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public WishedItemDto create(@RequestBody CreateWishedItemRequest requestData) {
		WishedItem wishedItem = new WishedItem();
		wishedItem.setProductId(requestData.getProductId());
		wishedItem.setCustomerId(requestData.getCustomerId());
		wishedItem = service.save(wishedItem);
		WishedItemDto response = util.wishedItemDto(wishedItem);
		return response;
	}

}
