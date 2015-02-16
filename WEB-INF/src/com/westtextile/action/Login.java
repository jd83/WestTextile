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

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.westtextile.persistence.mybatis.model.UserWithBLOBs;
import com.westtextile.dao.impl.UserDaoImpl;

/**
 * <code>Set welcome message.</code>
 */
public class Login extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5116793257658151173L;
	private UserWithBLOBs userWithBLOBs;


	public String execute() throws Exception {
		return SUCCESS;
	}
	
	@Validations(requiredStrings={
	        @RequiredStringValidator(fieldName="userWithBLOBs.username",message="用户名不能为空！"),
	        @RequiredStringValidator(fieldName="userWithBLOBs.password",message="密码不能为空！")
	    }
	)
	public String loginUser() throws Exception {
		String username = new String(userWithBLOBs.getUsername().getBytes(
				"ISO-8859-1"), "gb2312");
		userWithBLOBs.setUsername(username);
		
		UserDaoImpl daoImpl = new UserDaoImpl();
		userWithBLOBs=daoImpl.getUserByUserName(userWithBLOBs.getUsername());
		
		Map map=ActionContext.getContext().getSession();
		map.put("username", userWithBLOBs.getUsername());
		return SUCCESS;
	}

	public UserWithBLOBs getUserWithBLOBs() {
		return userWithBLOBs;
	}

	public void setUserWithBLOBs(UserWithBLOBs userWithBLOBs) {
		this.userWithBLOBs = userWithBLOBs;
	}

}
