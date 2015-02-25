/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.westtextile.action;




import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.westtextile.persistence.mybatis.model.Shops;
import com.westtextile.persistence.mybatis.model.UserWithBLOBs;
import com.westtextile.service.RegisterService;
import com.westtextile.service.impl.RegisterServiceImpl;
import com.westtextile.dao.ShopsDao;
import com.westtextile.dao.impl.ShopsDaoImpl;
import com.westtextile.dao.impl.UserDaoImpl;

/**
 * <code>Set welcome message.</code>
 */
public class Register extends ActionSupport {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5116793257658151173L;
	private UserWithBLOBs userWithBLOBs;
	private String repassword;

	private Shops shop;

    public String execute() throws Exception {
    	//if login,show user info edit,else show user register
    	String loginUsername;
    	Map map=ActionContext.getContext().getSession();    	
    	loginUsername=(map==null||map.size()==0)?"":map.get("username").toString();
    	if(loginUsername!=null && loginUsername!=""){
    		UserDaoImpl daoImpl =new UserDaoImpl();
    		userWithBLOBs=daoImpl.getUserByUserName(loginUsername);
    		this.setUserWithBLOBs(userWithBLOBs);
    	}
        return SUCCESS;
    }
    
	public String registerUser() throws Exception {
		String result=INPUT;
		String username=new String(userWithBLOBs.getUsername().getBytes("ISO-8859-1"),"gb2312");
		userWithBLOBs.setUsername(username);
		//insert user
		RegisterService registerService =new RegisterServiceImpl();		
		checkUserInfo();
		if(!this.hasErrors()){
			registerService.addUser(userWithBLOBs);
			result=SUCCESS;
		}	
		//insert shop
		registerService.addShop(shop);
		
		return result;
	}

	public String updateUser() throws Exception {
		String result=INPUT;
		String username=new String(userWithBLOBs.getUsername().getBytes("ISO-8859-1"),"gb2312"); 
		userWithBLOBs.setUsername(username);


		RegisterService registerService =new RegisterServiceImpl();					
		checkUserInfo();
		if(!this.hasErrors()){
			registerService.updateUser(userWithBLOBs);
			result=SUCCESS;
		}		
		
		//insert shop
		registerService.addShop(shop);
		return result;			
	}
	
	public void checkUserInfo() {
		//check password
		if(!repassword.equals(userWithBLOBs.getPassword())){
			this.addFieldError("repassword", "两次密码必须一致！");
		}
	}
	

	public UserWithBLOBs getUserWithBLOBs() {
		return userWithBLOBs;
	}

	public void setUserWithBLOBs(UserWithBLOBs userWithBLOBs) {
		this.userWithBLOBs = userWithBLOBs;
	}


	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public Shops getShop() {
		return shop;
	}

	public void setShop(Shops shop) {
		this.shop = shop;
	}

}
