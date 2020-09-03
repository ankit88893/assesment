package com.dxctraining.wishlistmgt.wishedItem.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.wishlistmgt.wishedItem.dao.IWishlistDao;
import com.dxctraining.wishlistmgt.wishedItem.entities.WishedItem;
import com.dxctraining.wishlistmgt.wishedItem.exception.WishlistNotFoundException;

@Service
@Transactional
public class WishlistServiceImpl implements IWishlistService {
	@Autowired
	private IWishlistDao wishlistDao;

	@Override
	public WishedItem save(WishedItem wishedItem) {
		wishedItem = wishlistDao.save(wishedItem);
		return wishedItem;

	}
	
	@Override
	public void remove(String id) {
		wishlistDao.deleteById(id);
	}

	@Override
	public WishedItem findById(String id) {
		Optional<WishedItem> optional = wishlistDao.findById(id);
		if (!optional.isPresent()) {
			throw new WishlistNotFoundException("supplier not found for id=" + id);
		}
		WishedItem wishedItem = optional.get();
		return wishedItem;
	}

}
