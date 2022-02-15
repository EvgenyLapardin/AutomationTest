package in.reqres.users._support.Entity.BaseEntity;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class baseUserData {
    @NotNull
    private String name;

    @NotNull
    private String job;
}
