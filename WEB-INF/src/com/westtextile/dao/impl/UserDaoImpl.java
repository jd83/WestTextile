package com.westtextile.dao.impl;


import org.apache.ibatis.session.SqlSession;
//import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.westtextile.persistence.mybatis.client.UserMapper;
import com.westtextile.persistence.mybatis.model.*;
import com.westtextile.dao.UserDao;
public class UserDaoImpl extends MySqlSessionDaoSupport implements UserDao{	
	

	public User getUserByUserId(int userId){
		
        SqlSession session =this.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        return userMapper.selectByPrimaryKey(userId);
	}
	
	public User getUserByUserName(String username){
		
        SqlSession session =this.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        return userMapper.selectByUserName(username);
	}
	
	public void insertUser(User user){
		SqlSession session = this.getSqlSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		userMapper.insert(user);
		session.commit();
//		session.close();
	}

	public int updateByUserName(User user){
		SqlSession session = this.getSqlSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		int result=userMapper.updateByUserNameWithBLOBs(user);
		session.commit();
//		session.close();
		return result;
	}
	
}