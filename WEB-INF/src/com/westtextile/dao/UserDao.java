package com.westtextile.dao;
import com.westtextile.persistence.mybatis.model.User;
public interface UserDao {	
	User getUserByUserId(int userId);
	User getUserByUserName(String username);
	int updateByUserName(User user);
	void insertUser(User user);
}