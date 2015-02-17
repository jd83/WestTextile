package com.westtextile.dao;
import com.westtextile.persistence.mybatis.model.UserWithBLOBs;
public interface UserDao {	
	UserWithBLOBs getUserByUserId(int userId);
	UserWithBLOBs getUserByUserName(String username);
	int updateByUserName(UserWithBLOBs user);
	void insertUser(UserWithBLOBs user);
}