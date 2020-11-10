package DAO;

import java.util.List;

import Model.ProductModel;

public interface IProductDAO extends GenericDAO<ProductModel> {
	List<ProductModel> findProductId();
}
