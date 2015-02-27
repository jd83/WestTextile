package com.westtextile.dao;
import java.util.List;

import com.westtextile.persistence.mybatis.model.Shops;

public interface ShopsDao {	
	void insertShop(Shops shop);
	Shops getShopByShopName(String shopname);
	List<Shops> getShopByUserId(int userid);
	int deleteShopByShopName(String shopname);
	int deleteShopByUserId(int userid);
}