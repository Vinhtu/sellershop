package DAO.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.ICategoryDAO;
import Mapper.CategoryMapper;
import Mapper.RowMapper;
import Model.CategoryModel;
import Model.ProductModel;

public class CategoryDAO  implements ICategoryDAO {

	
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
	public List<CategoryModel> GetCategoryAlL() {
		List<CategoryModel> results = new ArrayList<>();
		String sql = "SELECT * FROM category";
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		if(connection != null) {
			try {
				statement = connection.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while(resultSet.next()) {
					CategoryModel category = new CategoryModel();
					category.setId_category(resultSet.getInt("id_category"));
					category.setName(resultSet.getString("name"));
					category.setCode(resultSet.getString("code"));
					results.add(category);
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
