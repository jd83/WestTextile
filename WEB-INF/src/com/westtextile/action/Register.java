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




import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.westtextile.persistence.mybatis.model.Shops;
import com.westtextile.persistence.mybatis.model.UserWithBLOBs;
import com.westtextile.service.RegisterService;
import com.westtextile.service.impl.RegisterServiceImpl;
import com.westtextile.dao.ShopsDao;
import com.westtextile.dao.UserDao;
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
	private List<Shops> shops;

    public String execute() throws Exception {
    	refresh();
        return SUCCESS;
    }
    
    public void refresh(){
    	RegisterService registerService=new RegisterServiceImpl();
    	//if login,show user info edit,else show user register
    	String loginUsername;
    	Map map=ActionContext.getContext().getSession();    	
    	loginUsername=(map==null||map.size()==0)?"":map.get("username").toString();
    	if(loginUsername!=null && loginUsername!=""){
    		userWithBLOBs=registerService.getUserByUserName(loginUsername);
    		shops=registerService.getShopByUserName(loginUsername);
    		this.setUserWithBLOBs(userWithBLOBs);
    	}
		if(shops==null||shops.size()==0){
			shops=new ArrayList<Shops>();
			shops.add(new Shops());
		}
    }
    
    
	public String registerUser() throws Exception {
		String result = INPUT;
		String username = new String(userWithBLOBs.getUsername().getBytes(
				"ISO-8859-1"), "gb2312");
		userWithBLOBs.setUsername(username);

		RegisterService registerService = new RegisterServiceImpl();
		UserDao userDao = new UserDaoImpl();
		//basic check
		checkUserInfo();
		// username exist check
		UserWithBLOBs user = userDao.getUserByUserName(userWithBLOBs
				.getUsername());
		if (user != null) {
			this.addFieldError("username", "该手机/邮箱已经注册！");
		}
		if (!this.hasErrors()) {
			// insert user
			// username exist check
			registerService.addUser(userWithBLOBs);

			// insert shop
			registerService.addShop(shop);
			result = SUCCESS;
		}
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
			//insert shop
			registerService.addShop(shop);
			result=SUCCESS;
		}	
		refresh();
		return result;			
	}
	
	public void checkUserInfo() {
		//check password
		if(!repassword.equals(userWithBLOBs.getPassword())){
			this.addFieldError("repassword", "两次密码必须一致！");
		}
		//check shop type
		if(!shop.getShopname().isEmpty()&&shop.getShoptype()==null){
			this.addFieldError("shop.shoptype", "必须选择商铺类型！");
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

	public List<Shops> getShops() {
		return shops;
	}

	public void setShops(List<Shops> shops) {
		this.shops = shops;
	}

}
