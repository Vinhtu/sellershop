package Controller.user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Constant.SystemConstant;
import Model.AccountModel;
import Model.CategoryModel;
import Model.ProductModel;
import Service.IAccountService;
import Service.ICartService;
import Service.ICategoryService;
import Service.IProductService;
import Service.impl.AccountService;
import Service.impl.CartService;
import Service.impl.CategoryService;
import Service.impl.ProductService;
import utils.FormUtil;
import utils.SessionUtil;

import java.sql.*;  

@WebServlet(urlPatterns = {"/home", "/login", "/logout"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private ICategoryService category;
	private IProductService product;
	private ICartService cart;
	private IAccountService accountService;

	
    public HomeController() {
    	category = new CategoryService();
    	product = new ProductService();
    	cart = new CartService();
    	accountService = new AccountService();

    }

//    @Inject
//    private ICategoryService category;
//    @Inject
//    private IProductService product;
    
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//	
//			int id_category = 7;
//			String code ="giay-ca -sau";
//			String name = "Giày Cá tre";
//			CategoryModel categoryModel = new CategoryModel();
//			ProductModel productModel = new ProductModel();
//			
//			categoryModel.setId_category(id_category);
//			categoryModel.setCode(code);
//			categoryModel.setName(name);
//			
//			productModel.setId_product(5);
//			productModel.setName("product name");
//			productModel.setImg("image product");
//			productModel.setCaption("caption product");
//			productModel.setContent("content product");
//			productModel.setPromotion("promotion product");
//			productModel.setDescription("description product");
//			productModel.setCategories("5");
//			productModel.setDate("date product");
//			
////			category.save(categoryModel);
////			product.save(productModel);
////	        request.setAttribute("product",  product.findProductId());
//			
//			CategoryModel model = new CategoryModel();
//			model.setListResult(category.GetCategoryAll());
////			model.setGetTotalItem(category.getTotalItem());
//	    	request.setAttribute(SystemConstant.MODEL, model);
//	 
		
		
		String action = request.getParameter("action");
		if(action != null && action.equals("login")) {
//			AccountModel model = FormUtil.toModel(AccountModel.class, request);
			RequestDispatcher rd = request.getRequestDispatcher("views/user/Login/index.jsp");
			rd.forward(request, response);
		}
		else if(action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request,"ACCOUNTMODEL");
			response.sendRedirect(request.getContextPath()+ "/home");
			
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("views/user/Home/index.jsp");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null && action.equals("login")) {
			AccountModel model = FormUtil.toModel(AccountModel.class, request);
			model = accountService.findByAccountStatus(model.getUsername(),model.getPassword(), model.getStatus());
		    if(model != null) {
		    	SessionUtil.getInstance().putValue(request, "ACCOUNTMODEL", model);
		    	if(model.getRole().getCode().equals("user")) {
		    		response.sendRedirect(request.getContextPath() + "/home");
		    	}
		    	else  if(model.getRole().getCode().equals("admin")) {
		    		response.sendRedirect(request.getContextPath() + "/admin");
		    	}
		    }
		    else {
		    	response.sendRedirect(request.getContextPath() + "/login?action=login");
		    }
			
			
		
		}
	}

}
