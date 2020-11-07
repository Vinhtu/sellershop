package DAO.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.ICartDAO;
import Model.CartModel;
import Model.CategoryModel;

public class CartDAO implements ICartDAO {

	
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
	public List<CartModel> getCartAll() {
	
		List<CartModel> results = new ArrayList<>();
		String sql = "SELECT * FROM cart";
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		if(connection != null) {
			try {
				statement = connection.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while(resultSet.next()) {
					CartModel cart = new CartModel();
					cart.setId_cart(resultSet.getInt("id_cart"));
					cart.setCode(resultSet.getString("code"));
					cart.setTotal_price(resultSet.getString("total_price"));
					cart.setName(resultSet.getString("name"));
					cart.setProduct(resultSet.getString("product"));
					results.add(cart);
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
