package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 
	 * 1.通过订单id来获取商品列表
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	
	/**
	 * 1.在保存商品订单时
	 * 2.减少商品库存
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}