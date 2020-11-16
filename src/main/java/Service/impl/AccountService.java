package Service.impl;

import DAO.IAccountDAO;
import DAO.impl.AccountDAO;
import Model.AccountModel;
import Service.IAccountService;

public class AccountService implements IAccountService{
    
	
	private IAccountDAO accountDao;
	public AccountService() {
		accountDao = new AccountDAO();
		
	}
	
	@Override
	public AccountModel findByAccountStatus(String username, String password, String status) {
		return accountDao.findByAccountStatus(username, password, status);
	}
    
}
