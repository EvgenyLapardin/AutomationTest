package in.reqres.users._support.Entity.UsersIn;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public final class UserSupport {
    @NotNull
    private String url;

    @NotNull
    private String text;
}
