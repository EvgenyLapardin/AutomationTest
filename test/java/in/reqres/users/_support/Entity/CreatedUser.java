package in.reqres.users._support.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import in.reqres.users._support.DateDeserializer;
import in.reqres.users._support.Entity.BaseEntity.baseUserData;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public final class CreatedUser extends baseUserData {
    @NotNull
    private String id;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSZ")
    @JsonDeserialize(using = DateDeserializer.class)
    private LocalDateTime createdAt;
}
