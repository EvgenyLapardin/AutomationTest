package in.reqres.users._support.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import in.reqres.users._support.Entity.UsersIn.UserData;
import in.reqres.users._support.Entity.UsersIn.UserSupport;
import lombok.Data;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public final class Users {
    @NotNull
    @Min(1)
    private int page;

    @NotNull
    @Min(1)
    @JsonProperty("per_page")
    private int perPage;

    @NotNull
    @Min(1)
    private int total;

    @NotNull
    @Min(1)
    @JsonProperty("total_pages")
    private int totalPages;

    @NotNull
    @Valid
    private List<UserData> data;

    @NotNull
    @Valid
    private UserSupport support;
}
