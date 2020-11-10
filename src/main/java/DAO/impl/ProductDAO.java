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
import Model.ProductModel;

public class ProductDAO extends AbstractDAO<ProductModel>  implements IProductDAO {

	@Override
	public List<ProductModel> findProductId() {
		String sql = "SELECT * FROM product";
		return query(sql, new ProductMapper());
	}
	
	



}
