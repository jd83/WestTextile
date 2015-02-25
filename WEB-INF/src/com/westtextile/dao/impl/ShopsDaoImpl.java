package com.westtextile.dao.impl;


import org.apache.ibatis.session.SqlSession;
//import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.westtextile.persistence.mybatis.client.ShopsMapper;
import com.westtextile.persistence.mybatis.model.*;
import com.westtextile.dao.ShopsDao;

public class ShopsDaoImpl extends MySqlSessionDaoSupport implements ShopsDao{	
	
	public void insertShop(Shops shop){
		SqlSession session = this.getSqlSession();
		ShopsMapper shopMapper = session.getMapper(ShopsMapper.class);
		shopMapper.insert(shop);
		session.commit();
		session.close();
	}	
	public Shops getShopByShopName(String shopname){
		SqlSession session = this.getSqlSession();
		ShopsMapper shopMapper = session.getMapper(ShopsMapper.class);
		Shops shop=shopMapper.selectByShopName(shopname);
		return shop;
	}
	public int deleteShopByShopName(String shopname) {
		int result=0;
		SqlSession session = this.getSqlSession();
		ShopsMapper shopMapper = session.getMapper(ShopsMapper.class);
		result=shopMapper.deleteByShopName(shopname);
		session.commit();
		session.close();
		return result;
	}
}