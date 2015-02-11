package com.westtextile.dao;
import java.util.List;
import com.westtextile.persistence.mybatis.model.User;
import com.westtextile.persistence.mybatis.model.UserWithBLOBs;
public interface UserDao {	
	UserWithBLOBs getUserByUserId(int userId);
	void insertUser(User user);
}