package DAO;

import java.util.List;

import Model.ProductModel;

public interface IProductDAO extends GenericDAO<ProductModel> {
	ProductModel findOne(Long id);
	List<ProductModel> findProductId();
	Long save(ProductModel productModel);
	void update(ProductModel updateProductModel);
	void delete(int id);
}
