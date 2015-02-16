package com.westtextile.dao;
import com.westtextile.persistence.mybatis.model.UserWithBLOBs;
public interface UserDao {	
	UserWithBLOBs getUserByUserId(int userId);
	void insertUser(UserWithBLOBs user);
}