package com.westtextile.service;
import java.util.List;


import com.westtextile.persistence.mybatis.model.*;
public interface RegisterService{
	int updateUser(User user);
	void addUser(User user);
	User getUserByUserName(String username);
	Shops getShopByShopName(String shopname);
	List<Shops> getShopByUserName(String username);
	void addShops(List<Shops> shops);
	void register(User user,List<Shops> shops);
	void modify(User user,List<Shops> shops);
	
}