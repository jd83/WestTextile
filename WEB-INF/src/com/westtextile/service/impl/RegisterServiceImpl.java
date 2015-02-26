package com.westtextile.service.impl;


import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.westtextile.dao.ShopsDao;
import com.westtextile.dao.UserDao;
import com.westtextile.dao.impl.ShopsDaoImpl;
import com.westtextile.dao.impl.UserDaoImpl;
import com.westtextile.persistence.mybatis.model.*;
import com.westtextile.service.RegisterService;

public class RegisterServiceImpl implements RegisterService{
	
	UserDao userDao = new UserDaoImpl();
	ShopsDao shopsDao=new ShopsDaoImpl();
	public void addUser(UserWithBLOBs userWithBLOBs) {
//		UserDao userDao = new UserDaoImpl();
		userDao.insertUser(userWithBLOBs);
	}
	

	public int updateUser(UserWithBLOBs userWithBLOBs) {
		
		int result=userDao.updateByUserName(userWithBLOBs);
		return result;
	}
	
	public UserWithBLOBs getUserByUserName(String username) {
		UserWithBLOBs user;
		user=userDao.getUserByUserName(username);
		return user;
	}
	
	public Shops getShopByShopName(String shopname) {
		Shops shop;
		shop=shopsDao.getShopByShopName(shopname);
		return shop;
	}
	
	public List<Shops> getShopByUserName(String username) {
		List<Shops> shopList=new ArrayList<Shops>();
		int userid=userDao.getUserByUserName(username).getUserid();
		shopList=shopsDao.getShopByUserId(userid);
		return shopList;
	}
	
	public void addShop(Shops shop){
//		UserDao userDao=new UserDaoImpl();
		
		try {
			//data prepare
			String[] shopnames=shop.getShopname().split("-");
			shop.setBuildnumber(Integer.parseInt(shopnames[0]));
			shop.setFloornumber(Integer.parseInt(shopnames[1]));
			//get userid
			String username=ActionContext.getContext().getSession().get("username").toString();
			int userid=userDao.getUserByUserName(username).getUserid();
			shop.setUserid(userid);
			//delete shop of this user
			shopsDao.deleteShopByShopName(shop.getShopname());
			//data insert		
			shopsDao.insertShop(shop);
		} catch (NumberFormatException e) {
			throw e;
		}
	}
}