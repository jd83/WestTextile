package com.westtextile.service.impl;


import com.opensymphony.xwork2.ActionContext;
import com.westtextile.dao.ShopsDao;
import com.westtextile.dao.UserDao;
import com.westtextile.dao.impl.ShopsDaoImpl;
import com.westtextile.dao.impl.UserDaoImpl;
import com.westtextile.persistence.mybatis.model.*;
import com.westtextile.service.RegisterService;

public class RegisterServiceImpl implements RegisterService{
	
	public void addUser(UserWithBLOBs userWithBLOBs) {
		UserDao daoImpl = new UserDaoImpl();
		daoImpl.insertUser(userWithBLOBs);
	}

	public int updateUser(UserWithBLOBs userWithBLOBs) {
		UserDao daoImpl = new UserDaoImpl();
		int result=daoImpl.updateByUserName(userWithBLOBs);
		return result;
	}
	
	public void addShop(Shops shop){
		UserDao userDao=new UserDaoImpl();
		ShopsDao shopsDao=new ShopsDaoImpl();
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
	}
}