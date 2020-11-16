package Controller.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.AccountModel;
import Service.IAccountService;
import Service.impl.AccountService;
import utils.FormUtil;
import utils.SessionUtil;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	private IAccountService accountService;
    public LoginController() {
    	accountService = new AccountService();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
