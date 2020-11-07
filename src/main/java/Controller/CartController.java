package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.ICartService;
import Service.impl.CartService;
import Service.impl.CategoryService;
import Service.impl.ProductService;


public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ICartService cart;
    public CartController() {
      	cart = new CartService();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("cart", cart.getCartAll());

		RequestDispatcher rd = request.getRequestDispatcher("views/user/Cart/index.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
