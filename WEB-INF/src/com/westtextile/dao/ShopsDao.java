package com.westtextile.dao;
import com.westtextile.persistence.mybatis.model.Shops;

public interface ShopsDao {	
	void insertShop(Shops shop);
	Shops getShopByShopName(String shopname);
	int deleteShopByShopName(String shopname);
}