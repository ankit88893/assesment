package com.dxctraining.wishlistmgt.wishedItem.service;

import com.dxctraining.wishlistmgt.wishedItem.entities.WishedItem;

public interface IWishlistService {

	WishedItem save(WishedItem wishedItem);

	void remove(String id);

	WishedItem findById(String id);

}
