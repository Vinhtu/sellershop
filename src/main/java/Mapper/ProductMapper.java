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
			product.setId_product(resultSet.getInt("id_product"));
			product.setName(resultSet.getString("name"));
			product.setImg(resultSet.getString("img"));
			product.setCaption(resultSet.getString("caption"));
			product.setContent(resultSet.getString("content") );
			product.setPromotion(resultSet.getString("promotion") );
			product.setDescription(resultSet.getString("description") );
			product.setCategories(resultSet.getString("categories") );
			product.setDate(resultSet.getString("date") );
			return product;
		}catch(SQLException e) {
			return null;
		}
	}
}
