package com.westtextile.service;

import com.westtextile.persistence.mybatis.model.*;
public interface RegisterService{
	int updateUser(UserWithBLOBs user);
	void addUser(UserWithBLOBs user);
	void addShop(Shops shop);
}