package in.reqres.users._support.Entity;

import in.reqres.users._support.Entity.UsersIn.UserData;
import in.reqres.users._support.Entity.UsersIn.UserSupport;
import lombok.Data;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class SingleUser {
    @NotNull
    @Valid
    private UserData data;

    @NotNull
    @Valid
    private UserSupport support;
}
