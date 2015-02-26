package com.westtextile.service;
import java.util.List;


import com.westtextile.persistence.mybatis.model.*;
public interface RegisterService{
	int updateUser(UserWithBLOBs user);
	void addUser(UserWithBLOBs user);
	UserWithBLOBs getUserByUserName(String username);
	Shops getShopByShopName(String shopname);
	List<Shops> getShopByUserName(String username);
	void addShop(Shops shop);
	
}