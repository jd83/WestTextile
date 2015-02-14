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



import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import com.westtextile.persistence.mybatis.model.UserWithBLOBs;
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
//	private String username;
//    private String password;
//    private String repassword;
//    private String displayname;
//    private String identityid;
//    private String qqnumber;
//    private String career;
//    private String age;
    
    private String shopname;
    private String shoptype;
    private String shopsquare;
    private String shopamount;

    public String execute() throws Exception {

        return SUCCESS;
    }
    
	public String registerUser() throws Exception {
		String username=new String(userWithBLOBs.getUsername().getBytes("ISO-8859-1"),"gb2312"); 
		userWithBLOBs.setUserid(1);
		userWithBLOBs.setUsername(username);
		UserDaoImpl daoImpl =new UserDaoImpl();
		
		try {
			daoImpl.insertUser(userWithBLOBs);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
		
	}


//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getDisplayname() {
//		return displayname;
//	}
//
//	public void setDisplayname(String displayname) {
//		this.displayname = displayname;
//	}
//
//	public String getRepassword() {
//		return repassword;
//	}
//
//	public void setRepassword(String repassword) {
//		this.repassword = repassword;
//	}
//
//	public String getIdentityid() {
//		return identityid;
//	}
//
//	public void setIdentityid(String identityid) {
//		this.identityid = identityid;
//	}
//
//	public String getQqnumber() {
//		return qqnumber;
//	}
//
//	public void setQqnumber(String qqnumber) {
//		this.qqnumber = qqnumber;
//	}
//
//	public String getCareer() {
//		return career;
//	}
//
//	public void setCareer(String career) {
//		this.career = career;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getShoptype() {
		return shoptype;
	}

	public void setShoptype(String shoptype) {
		this.shoptype = shoptype;
	}

	public String getShopsquare() {
		return shopsquare;
	}

	public void setShopsquare(String shopsquare) {
		this.shopsquare = shopsquare;
	}

	public String getShopamount() {
		return shopamount;
	}

	public void setShopamount(String shopamount) {
		this.shopamount = shopamount;
	}

	public UserWithBLOBs getUserWithBLOBs() {
		return userWithBLOBs;
	}

	public void setUserWithBLOBs(UserWithBLOBs userWithBLOBs) {
		this.userWithBLOBs = userWithBLOBs;
	}

}
