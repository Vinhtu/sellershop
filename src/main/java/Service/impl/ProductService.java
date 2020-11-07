package Service.impl;

import java.util.List;

import javax.inject.Inject;

import DAO.IProductDAO;
import DAO.impl.ProductDAO;
import Model.ProductModel;
import Service.IProductService;

public class ProductService implements IProductService {

//	@Inject
//	private IProductDAO productDao;
	
	private IProductDAO productDao;
	
	public ProductService() {
		productDao = new ProductDAO();
	}
	
	
	@Override
	public List<ProductModel> findProductId() {
		// TODO Auto-generated method stub	
		return productDao.findProductId();
	}

}
