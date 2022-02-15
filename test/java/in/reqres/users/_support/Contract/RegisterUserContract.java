package in.reqres.users._support.Contract;

import in.reqres.users._support.Contract.BaseContract.BaseUserLoginContract;

public class RegisterUserContract extends BaseUserLoginContract {
    public RegisterUserContract(
            String email,
            String password
    ) {
        super(email, password);
    }
}
