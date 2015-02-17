package com.westtextile.service.impl;


import com.westtextile.dao.UserDao;
import com.westtextile.dao.impl.UserDaoImpl;
import com.westtextile.persistence.mybatis.model.UserWithBLOBs;
import com.westtextile.service.LoginService;

public class LoginServiceImpl implements LoginService{
	public boolean checkLoginInfo(String username,String password){
		boolean isCorrect=false;
		UserDao daoImpl = new UserDaoImpl();
		UserWithBLOBs userWithBLOBs=daoImpl.getUserByUserName(username);
		
		if(userWithBLOBs!=null && userWithBLOBs.getPassword().equals(password)){
			isCorrect=true;
		}
		return isCorrect;
	}
}