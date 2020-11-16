package DAO.impl;

import java.util.List;

import DAO.IAccountDAO;
import Mapper.AccountMapper;
import Model.AccountModel;

public class AccountDAO extends AbstractDAO<AccountModel> implements IAccountDAO {

	@Override
	public AccountModel findByAccountStatus(String username, String password, String status) {
	   StringBuilder sql = new StringBuilder( "Select * from account as a");
	   sql.append("inner join role as r on r.id_role=a.id_account");
	   sql.append("where username = ? and password = ? and status = ?");
	  
	   List<AccountModel> accounts  = query(sql.toString(),new AccountMapper(), username, password, status);
		return accounts.isEmpty() ? null : accounts.get(0) ;
	}
	
	

}
