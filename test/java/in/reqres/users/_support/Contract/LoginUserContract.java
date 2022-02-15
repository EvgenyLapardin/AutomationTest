package in.reqres.users._support.Contract;

import in.reqres.users._support.Contract.BaseContract.BaseUserLoginContract;

public class LoginUserContract extends BaseUserLoginContract {
    public LoginUserContract(
            String email,
            String password
    ) {
        super(email, password);
    }
}
