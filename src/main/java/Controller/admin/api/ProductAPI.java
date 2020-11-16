package Controller.admin.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import Model.ProductModel;
import Service.IProductService;
import Service.impl.ProductService;
import utils.HttpUtil;


@WebServlet(urlPatterns = {"/api-admin-product"})
public class ProductAPI extends HttpServlet {
	
	private IProductService productService;
	public ProductAPI() {
		productService = new ProductService();
	}
	
	private static final long serialVersionUID = -915988021506484384L;
	protected void doPost(HttpServletRequest request , HttpServletResponse response  ) 
		throws ServletException, IOException{
		ObjectMapper obmapper = new ObjectMapper();
		request.setCharacterEncoding	("UTF-8");
		response.setContentType("application/json");		
		ProductModel productModel = 	HttpUtil.of(request.getReader()).toModel(ProductModel.class);
		productModel = productService.save(productModel);
		obmapper.writeValue(response.getOutputStream(), productModel);
			
		}

	protected void doPut(HttpServletRequest request , HttpServletResponse response  ) 
			throws ServletException, IOException{
		
		ObjectMapper obmapper = new ObjectMapper();
		request.setCharacterEncoding	("UTF-8");
		response.setContentType("application/json");		
		ProductModel updateProductModel  = HttpUtil.of(request.getReader()).toModel(ProductModel.class);
        updateProductModel = productService.update(updateProductModel);
        obmapper.writeValue(response.getOutputStream(), updateProductModel);
				
		
			}
	protected void doDelete(HttpServletRequest request , HttpServletResponse response  ) 
			throws ServletException, IOException{
				ObjectMapper obmapper = new ObjectMapper();
				request.setCharacterEncoding	("UTF-8");
				response.setContentType("application/json");		
				ProductModel productModel  = HttpUtil.of(request.getReader()).toModel(ProductModel.class);
				productService.delete(productModel.getId_product());
				obmapper.writeValue(response.getOutputStream(), "{}");
			}
	
	

}
