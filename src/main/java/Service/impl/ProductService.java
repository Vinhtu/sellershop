package Service.impl;

import java.util.List;

import DAO.IProductDAO;
import DAO.impl.ProductDAO;
import Model.ProductModel;
import Service.IProductService;

public class ProductService implements IProductService {

	private IProductDAO productDao;
	
	public ProductService() {
		productDao = new ProductDAO();
	}
	
	
	@Override
	public List<ProductModel> findProductId() {
		// TODO Auto-generated method stub	
		return productDao.findProductId();
	}


	@Override
	public ProductModel save(ProductModel productModel) {
		Long id_product =  productDao.save(productModel);
		return productDao.findOne(id_product);
	}
	
	@Override
	public ProductModel update(ProductModel updateProductModel) {
//		ProductModel oldProduct  	= productDao.findOne((long) updateProductModel.getId_product());
		productDao.update(updateProductModel);
		return productDao.findOne((long) updateProductModel.getId_product());
	}


	@Override
	public void delete(int id) {
//		for(int id: arrId) {
		  //delete comment
		//delete news	
			productDao.delete(id);
			
//		}
		
	}






}
