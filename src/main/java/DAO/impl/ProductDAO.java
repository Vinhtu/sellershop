package DAO.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.IProductDAO;
import Mapper.RowMapper;
import Model.ProductModel;

public class ProductDAO  implements IProductDAO {
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sellershopmvc";
			String user = "root";
			String password = "";
			return DriverManager.getConnection(url, user, password);
			
			
		}catch(ClassNotFoundException | SQLException e) {
			return null;
		}
	}

	@Override
	public List<ProductModel> findProductId() {
		List<ProductModel> results = new ArrayList<>();
		String sql = "SELECT * FROM product";
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		if(connection != null) {
			try {
				statement = connection.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while(resultSet.next()) {
					ProductModel product = new ProductModel();
					product.setId_product(resultSet.getInt("id_product"));
					product.setImg(resultSet.getString("img"));
					product.setName(resultSet.getString("name"));
					product.setCaption(resultSet.getString("caption"));
					product.setContent(resultSet.getString("content"));
					product.setPromotion(resultSet.getString("promotion"));
					product.setDescription(resultSet.getString("description"));
					product.setCategories(resultSet.getInt("categories"));
					product.setDate(resultSet.getString("date"));
					results.add(product);
				}	
			}
			catch(SQLException e) {
				return null;
			}
			finally {
				try {
						if(connection != null) {
							connection.close();
						}
						if(statement != null) {
							statement.close();
						}
						if(resultSet != null) {
							resultSet.close();
						}
				}catch(SQLException e) {
					return null;
				}
				
			}
		}
		return results;
	}



}
