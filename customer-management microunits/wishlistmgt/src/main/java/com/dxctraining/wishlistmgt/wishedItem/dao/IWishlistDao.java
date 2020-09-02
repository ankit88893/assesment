package com.dxctraining.wishlistmgt.wishedItem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxctraining.wishlistmgt.wishedItem.entities.WishedItem;

public interface IWishlistDao extends JpaRepository<WishedItem,String> {

}
