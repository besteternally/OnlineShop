package org.ljy.shoppingcart.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.ljy.domain.Goods;
import org.ljy.shoppingcart.dao.IShoppingCartDao;
import org.springframework.stereotype.Repository;
@Repository("shoppingCartImpl")
public class ShoppingCartImpl implements IShoppingCartDao {

	@Override
	public void addGoods(HashMap<String, Object> cartIDGoodsIDAndGoodsNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGoods(HashMap<String, Object> cartIDAndGoodsID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGoods(HashMap<String, Object> cartIDAndGoodsID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Goods> queryGoodsByGoodsName(HashMap<String, Object> cartIDAndGoodsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods queryGoodsByGoodsID(HashMap<String, Object> cartIDAndGoodsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> listAll(String cartID) {
		// TODO Auto-generated method stub
		return null;
	}

}
