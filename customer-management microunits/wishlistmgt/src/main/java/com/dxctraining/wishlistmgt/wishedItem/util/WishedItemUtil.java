package com.dxctraining.wishlistmgt.wishedItem.util;

import org.springframework.stereotype.Component;

import com.dxctraining.wishlistmgt.wishedItem.dto.WishedItemDto;
import com.dxctraining.wishlistmgt.wishedItem.entities.WishedItem;

@Component
public class WishedItemUtil {
	
	
	public WishedItemDto  wishedItemDto(WishedItem wishedItem) {
		WishedItemDto dto = new WishedItemDto(wishedItem.getId(), wishedItem.getProductId(),wishedItem.getCustomerId());
		return dto;
		
	}

}
