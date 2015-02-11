package com.westtextile.dao.impl;


import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.westtextile.persistence.mybatis.client.UserMapper;
import com.westtextile.persistence.mybatis.model.*;
import com.westtextile.dao.UserDao;
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{	
	
	SqlSession session = this.getSqlSession();
	UserMapper userMapper = session.getMapper(UserMapper.class);
	public UserWithBLOBs getUserByUserId(int userId){
//        SqlSession session = this.getSqlSession();
//        UserMapper userMapper = session.getMapper(UserMapper.class);
        return userMapper.selectByPrimaryKey(userId);
	}
	
	public void insertUser(UserWithBLOBs user){
		userMapper.insert(user);
	}

}