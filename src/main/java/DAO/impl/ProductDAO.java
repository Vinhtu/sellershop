package DAO.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.IProductDAO;
import Mapper.CategoryMapper;
import Mapper.IRowMapper;
import Mapper.ProductMapper;
import Model.CategoryModel;
import Model.ProductModel;

public class ProductDAO extends AbstractDAO<ProductModel>  implements IProductDAO {

	@Override
	public List<ProductModel> findProductId() {
		String sql = "SELECT * FROM product";
		return query(sql, new ProductMapper());
	}

	@Override
	public Long save(ProductModel productModel) {
		String sql  = "INSERT INTO product(name, img, caption) VALUES (?,?,?) ";
		return insert(sql, productModel.getName(), productModel.getImg(), productModel.getCaption());
	}

	@Override
	public ProductModel findOne(Long id) {
		String sql = "SELECT * FROM product Where id_product = ?";
		List<ProductModel> product =  query(sql, new ProductMapper(), id);
		return product.isEmpty() ? null :  product.get(0);
	}

	@Override
	public void update(ProductModel updateProductModel) {
		StringBuilder sql = new StringBuilder("UPDATE product SET name = ? , img = ?, caption = ? ,   ");
		sql.append("content = ? , promotion = ? , description = ? , categories = ? , date = ?  WHERE 	id_product = ? "); 
		 insert(sql.toString(),  updateProductModel.getName(), updateProductModel.getImg(), 
				 updateProductModel.getCaption(), updateProductModel.getContent(), 
				 updateProductModel.getPromotion(), updateProductModel.getDescription(), 
				 updateProductModel.getCategories(), updateProductModel.getDate(), updateProductModel.getId_product());
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM product WHERE id_product = ?";
		update(sql, id);
		
	}

	



}
