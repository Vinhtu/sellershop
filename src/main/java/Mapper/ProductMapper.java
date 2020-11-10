package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.CategoryModel;
import Model.ProductModel;

public class ProductMapper implements IRowMapper<ProductModel> {
	@Override
	public ProductModel mapRow(ResultSet resultSet) {
		try {	
			ProductModel product = new ProductModel();
//			product.setId_category(resultSet.getInt("id"));
//			product.setCode(resultSet.getString("code"));
			product.setName(resultSet.getString("name"));
			return product;
		}catch(SQLException e) {
			return null;
		}
	}
}
