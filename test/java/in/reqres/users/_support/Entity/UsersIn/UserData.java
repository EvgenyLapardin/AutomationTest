package in.reqres.users._support.Entity.UsersIn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public final class UserData {
    @NotNull
    @Min(1)
    private int id;

    @NotNull
    private String email;

    @NotNull
    @JsonProperty("first_name")
    private String firstName;

    @NotNull
    @JsonProperty("last_name")
    private String lastName;

    @NotNull
    private String avatar;
}
