package com.westtextile.dao.impl;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
//import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.westtextile.persistence.mybatis.client.ShopsMapper;
import com.westtextile.persistence.mybatis.model.*;
import com.westtextile.dao.ShopsDao;

public class ShopsDaoImpl extends MySqlSessionDaoSupport implements ShopsDao{	
	
	public void insertShop(Shops shop) {
		SqlSession session = this.getSqlSession();
		ShopsMapper shopMapper = session.getMapper(ShopsMapper.class);
		shopMapper.insert(shop);
		session.commit();
	}	
	public Shops getShopByShopName(String shopname){
		SqlSession session = this.getSqlSession();
		ShopsMapper shopMapper = session.getMapper(ShopsMapper.class);
		Shops shop;
		shop=shopMapper.selectByShopName(shopname);
		return shop;
	}
	
	public List<Shops> getShopByUserName(String username){
		SqlSession session = this.getSqlSession();
		ShopsMapper shopMapper = session.getMapper(ShopsMapper.class);
		List<Shops> shop;
		shop=shopMapper.selectByUserName(username);
		return shop;
	}
	
	public int deleteShopByShopName(String shopname) {
		int result=0;
		SqlSession session = this.getSqlSession();
		ShopsMapper shopMapper = session.getMapper(ShopsMapper.class);
		result=shopMapper.deleteByShopName(shopname);
		session.commit();
		return result;
	}
	
	public int deleteShopByUserName(String username){
		int result=0;
		SqlSession session = this.getSqlSession();
		ShopsMapper shopMapper = session.getMapper(ShopsMapper.class);
		result=shopMapper.deleteByUserName(username);
		return result;
	}
}