package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.ProductModel;

public class NewMapper implements RowMapper<ProductModel> {

	@Override
	public ProductModel mapRow(ResultSet resultSet) {
		ProductModel product = new ProductModel();
		try {
			product.setId_product(resultSet.getInt("id_product"));
			product.setImg(resultSet.getString("img"));
			product.setName(resultSet.getString("name"));
			product.setCaption(resultSet.getString("caption"));
			product.setContent(resultSet.getString("content"));
			product.setPromotion(resultSet.getString("promotion"));
			product.setDescription(resultSet.getString("Description"));
			product.setCategories(resultSet.getInt("categories"));
			product.setDate(resultSet.getString("date"));
			return product;
		} catch (SQLException e) {
	       	return null;
		}
	
		
		
	}

}
