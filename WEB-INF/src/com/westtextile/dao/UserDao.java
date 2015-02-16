package com.westtextile.dao;
import com.westtextile.persistence.mybatis.model.UserWithBLOBs;
public interface UserDao {	
	UserWithBLOBs getUserByUserId(int userId);
	UserWithBLOBs getUserByUserName(String username);
	void insertUser(UserWithBLOBs user);
}