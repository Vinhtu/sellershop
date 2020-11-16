package DAO;

import Model.AccountModel;

public interface IAccountDAO extends GenericDAO<AccountModel> {
	AccountModel findByAccountStatus(String username, String password, String status);

}
