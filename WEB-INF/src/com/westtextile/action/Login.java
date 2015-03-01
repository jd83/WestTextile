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

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.westtextile.persistence.mybatis.model.User;
import com.westtextile.dao.UserDao;
import com.westtextile.dao.impl.UserDaoImpl;

/**
 * <code>Set welcome message.</code>
 */
public class Login extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5116793257658151173L;
	protected User user;



	@SkipValidation
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	@Validations(requiredStrings={
	        @RequiredStringValidator(fieldName="user.username",message="用户名不能为空！"),
	        @RequiredStringValidator(fieldName="user.password",message="密码不能为空！")
	    }
	)
	public String loginUser() throws Exception {
		String result=INPUT;
		String username = new String(user.getUsername().getBytes(
				"ISO-8859-1"), "gb2312");
		user.setUsername(username);
		
		//check password and user
		loginCheck();
		
		if(!this.hasFieldErrors()){
			Map map=ActionContext.getContext().getSession();
			map.put("username", user.getUsername());
			result= SUCCESS;
		}
		return result;
	}

	@SkipValidation
	public String logoutUser() throws Exception {
		Map map=ActionContext.getContext().getSession();
		map.remove("username");
		return SUCCESS;
	}
	
	
	public void loginCheck() {
		UserDao userDao=new UserDaoImpl();
		User userDb=userDao.getUserByUserName(user.getUsername());

		//username not exist
		if(userDb==null){
			this.addFieldError("user.username", "该手机/邮箱未注册！");
	
		}
		//password check
		else if(!userDb.getPassword().equals(user.getPassword())){
			super.addFieldError("user.password", "密码错误！");
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
