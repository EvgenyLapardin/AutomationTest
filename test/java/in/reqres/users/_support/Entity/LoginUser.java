package in.reqres.users._support.Entity;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public final class LoginUser {
    @NotNull
    private String token;
}
