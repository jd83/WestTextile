package com.westtextile.service.impl;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.westtextile.dao.ShopsDao;
import com.westtextile.dao.UserDao;
import com.westtextile.dao.impl.ShopsDaoImpl;
import com.westtextile.dao.impl.UserDaoImpl;
import com.westtextile.persistence.mybatis.model.*;
import com.westtextile.service.RegisterService;

public class RegisterServiceImpl implements RegisterService{
	
	UserDao userDao = new UserDaoImpl();
	ShopsDao shopsDao=new ShopsDaoImpl();
	public void addUser(User user) {
		userDao.insertUser(user);
	}
	

	public int updateUser(User user) {
		
		int result=userDao.updateByUserName(user);
		return result;
	}
	
	public User getUserByUserName(String username) {
		User user;
		user=userDao.getUserByUserName(username);
		return user;
	}
	
	public Shops getShopByShopName(String shopname) {
		Shops shop;
		shop=shopsDao.getShopByShopName(shopname);
		return shop;
	}
	
	public void register(User user,List<Shops> shops) {
		try {
			for (Shops sp : shops) {
				if (sp != null) {
					sp.setUsername(user.getUsername());
				} else {
					shops.remove(sp);
				}
			}
			addUser(user);
			addShops(shops);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void modify(User user,List<Shops> shops) {
		for (Shops sp : shops) {
			if (sp != null) {
				sp.setUsername(user.getUsername());
			} else {
				shops.remove(sp);
			}
		}
		updateUser(user);
		addShops(shops);
	}
	
	public List<Shops> getShopByUserName(String username) {
		List<Shops> shopList=shopsDao.getShopByUserName(username);
		return shopList;
	}
	
	public void addShops(List<Shops> shops){
		//get userid
		if(shops.size()>0 && shops.get(0).getUsername()!=null){
			String username=shops.get(0).getUsername();
			//delete shop of this user
			shopsDao.deleteShopByUserName(username);
		}
		for (Iterator iterator = shops.iterator(); iterator.hasNext();) {
			Shops shop = (Shops) iterator.next();
			//data prepare
			String[] shopnames=shop.getShopname().split("-");
			shop.setBuildnumber(Integer.parseInt(shopnames[0]));
			shop.setFloornumber(Integer.parseInt(shopnames[1]));
			//shop price
			BigDecimal shopprice=BigDecimal.valueOf(shop.getShopamount()).divide(shop.getShopsquare());
			shop.setShopprice(shopprice);
			//data insert		
			shopsDao.insertShop(shop);				
		}
	}
}