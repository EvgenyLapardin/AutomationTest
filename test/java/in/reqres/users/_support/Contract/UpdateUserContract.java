package in.reqres.users._support.Contract;

import in.reqres.users._support.Contract.BaseContract.BaseUserDataContract;

public class UpdateUserContract extends BaseUserDataContract {
    public UpdateUserContract(
            String name,
            String job
    ) {
        super(name, job);
    }
}
