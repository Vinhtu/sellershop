package Service.impl;

import java.util.List;

import DAO.ICartDAO;
import DAO.impl.CartDAO;
import Model.CartModel;
import Service.ICartService;

public class CartService implements ICartService {

	private ICartDAO cartDao;
	public CartService() {
		cartDao = new CartDAO();
	}
	
	@Override
	public List<CartModel> getCartAll() {
		return cartDao.getCartAll();
	}

}
