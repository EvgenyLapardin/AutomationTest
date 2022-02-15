package in.reqres.users._support.Contract;

import in.reqres.users._support.Contract.BaseContract.BaseUserDataContract;

public class CreateUserContract extends BaseUserDataContract {
    public CreateUserContract(
            String name,
            String job
    ) {
        super(name, job);
    }
}
