package in.reqres.users._support.Entity;

import lombok.Data;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public final class RegisteredUser {
    @NotNull
    @Min(1)
    private int id;

    @NotNull
    private String token;
}
