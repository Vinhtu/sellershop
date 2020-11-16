package Service;

import Model.AccountModel;

public interface IAccountService {
    AccountModel findByAccountStatus(String username, String password, String status);
    
}
