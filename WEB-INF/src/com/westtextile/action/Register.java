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

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.westtextile.persistence.mybatis.model.Shops;
import com.westtextile.persistence.mybatis.model.User;
import com.westtextile.service.RegisterService;
import com.westtextile.service.impl.RegisterServiceImpl;
import com.westtextile.dao.UserDao;
import com.westtextile.dao.impl.UserDaoImpl;

/**
 * <code>Set welcome message.</code>
 */
public class Register extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5116793257658151173L;
	protected User user;
	protected String repassword;
	private String hasshopinfo;
	private String hasadditioninfo;
	private Shops shop;
	protected List<Shops> shops;
	protected List<String> filename;
	protected List<String> shopname;
	private String uploadfilehtml;

	RegisterService registerService = new RegisterServiceImpl();
	@Validations(requiredStrings={
	        @RequiredStringValidator(fieldName="user.username",message="手机/邮箱不能为空！"),
	        @RequiredStringValidator(fieldName="user.password",message="密码不能为空！")
	    }
	)
	@SkipValidation
	public String execute() throws Exception {
		refresh();
		return SUCCESS;
	}

	@SkipValidation
	public void refresh() {
		RegisterService registerService = new RegisterServiceImpl();
		// if login,show user info edit,else show user register
		String loginUsername;
		Map map = ActionContext.getContext().getSession();
		loginUsername = (map == null || map.size() == 0) ? "" : map.get(
				"username").toString();
		if (loginUsername != null && loginUsername != "") {
			user = registerService.getUserByUserName(loginUsername);
			shops = registerService.getShopByUserName(loginUsername);
			this.setUser(user);
			this.setShops(shops);
			// set hasadditioninfo used to display ui
			if ((user.getIdentityid()!=null && !user.getIdentityid().isEmpty())
					|| (user.getName()!=null && !user.getName().isEmpty())
					|| (user.getSex()!=null && !user.getSex().isEmpty())
					|| (user.getQqnumber() != null && user.getQqnumber() != 0)
					|| (user.getCareer()!=null && !user.getCareer().isEmpty())
					|| (user.getAge() != null && user.getAge() != 0)
					|| (user.getNote()!=null && !user.getNote().isEmpty()) ) {
				hasadditioninfo = "checked='checked'";
			}
		}
		if (shops == null || shops.size() == 0) {
			shops = new ArrayList<Shops>();
			shops.add(new Shops());
		} else {
			hasshopinfo = "checked='checked'";
		}
	}

	public String registerUser() throws Exception {
		String result = INPUT;
		String username = new String(user.getUsername().getBytes(
				"ISO-8859-1"), "gb2312");
		user.setUsername(username);


		// user part check
		registerCheckPassword();
		registerCheckUserDup();
		// shop part check
		registerCheckShopInfo();
		
		if (!this.hasErrors()) {
			// insert user and shop
			registerService.register(user,shops);
			result = SUCCESS;
		}
		return result;
	}

	public String updateUser() throws Exception {
		String result = INPUT;
		String username = new String(user.getUsername().getBytes(
				"ISO-8859-1"), "gb2312");
		user.setUsername(username);

		RegisterService registerService = new RegisterServiceImpl();
		// user part check
		registerCheckPassword();
		// shop part check
		registerCheckShopInfo();
		if (!this.hasErrors()) {

			// insert shop
			registerService.modify(user, shops);
			result = SUCCESS;
		}
		return result;
	}
	
	@SkipValidation
	public void registerCheckPassword() {
		// check password
		if (!repassword.equals(user.getPassword())) {
			this.addFieldError("repassword", "两次密码必须一致！");
		}			
	}
	
	@SkipValidation	
	public void registerCheckUserDup() {
		UserDao userDao=new UserDaoImpl();
		User userDb = userDao.getUserByUserName(user
				.getUsername());
		// check duplicate username register
		if (userDb != null) {
			this.addFieldError("username", "该手机/邮箱已经注册！");
		}
				
	}
	
	@SkipValidation	
	public void registerCheckShopInfo() {

		for (int i = 0; i < shops.size(); i++) {
			if (shops.get(i) != null) {
				// check shop name format
				if (shops.get(i).getShopname().split("-").length != 3) {
					this.addFieldError("shops[" + i + "].shoptype",
							"商铺号格式为x-x-x，如1-1-1.");
				}
				// check shop type
				if (!shops.get(i).getShopname().isEmpty()){
					if(shops.get(i).getShoptype() == null) {
						this.addFieldError("shops[" + i + "].shoptype", "必须选择商铺类型！");
					}
					if(shops.get(i).getShopsquare() == null) {
						this.addFieldError("shops[" + i + "].shopsquare", "必须输入商铺面积！");
					}
					if(shops.get(i).getShopamount() == null) {
						this.addFieldError("shops[" + i + "].shopamount", "必须输入商铺总价！");
					}
				}
			} else {
				shops.remove(i);
			}
		}
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

	public String getHasshopinfo() {
		return hasshopinfo;
	}

	public void setHasshopinfo(String hasshopinfo) {
		this.hasshopinfo = hasshopinfo;
	}

	public String getHasadditioninfo() {
		return hasadditioninfo;
	}

	public void setHasadditioninfo(String hasadditioninfo) {
		this.hasadditioninfo = hasadditioninfo;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<String> getFilename() {
		return filename;
	}

	public void setFilename(List<String> filename) {
		this.filename = filename;
	}

	public List<String> getShopname() {
		return shopname;
	}

	public void setShopname(List<String> shopname) {
		this.shopname = shopname;
	}

	public String getUploadfilehtml() {
		return uploadfilehtml;
	}

	public void setUploadfilehtml(String uploadfilehtml) {
		this.uploadfilehtml = uploadfilehtml;
	}


}
