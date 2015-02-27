package com.westtextile.persistence.mybatis.client;

import java.util.List;

import com.westtextile.persistence.mybatis.model.Shops;

public interface ShopsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbggenerated  Mon Feb 16 11:26:29 CST 2015
	 */
	int deleteByPrimaryKey(Integer shopid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbggenerated  Mon Feb 16 11:26:29 CST 2015
	 */
	int insert(Shops record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbggenerated  Mon Feb 16 11:26:29 CST 2015
	 */
	int insertSelective(Shops record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbggenerated  Mon Feb 16 11:26:29 CST 2015
	 */
	Shops selectByPrimaryKey(Integer shopid);
	Shops selectByShopName(String shopname);
	List<Shops> selectByUserId(int userid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbggenerated  Mon Feb 16 11:26:29 CST 2015
	 */
	int updateByPrimaryKeySelective(Shops record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbggenerated  Mon Feb 16 11:26:29 CST 2015
	 */
	int updateByPrimaryKey(Shops record);
	int deleteByShopName(String shopname);
	int deleteByUserId(int userid);
}