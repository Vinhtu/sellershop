package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CategoryModel;
import Service.ICartService;
import Service.ICategoryService;
import Service.IProductService;
import Service.impl.CartService;
import Service.impl.CategoryService;
import Service.impl.ProductService;

import java.sql.*;  

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private ICategoryService category;
	private IProductService product;
	private ICartService cart;
	
    public HomeController() {
    	category = new CategoryService();
    	product = new ProductService();
    	cart = new CartService();
    }

//    @Inject
//    private ICategoryService category;
//    @Inject
//    private IProductService product;
    
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			int id_category = 7;
			String code ="giay-ca -sau";
			String name = "Giày Cá Sấu";
			CategoryModel categoryModel = new CategoryModel();
			categoryModel.setId_category(id_category);
			categoryModel.setCode(code);
			categoryModel.setName(name);
			category.save(categoryModel);
//	        request.setAttribute("product",  product.findProductId());
	    	request.setAttribute("categories", category.GetCategoryAll());
			RequestDispatcher rd = request.getRequestDispatcher("views/user/Home/index.jsp");
			rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
