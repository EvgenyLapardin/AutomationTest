package in.reqres.users._support.Contract.BaseContract;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseUserLoginContract {
    private String email;
    private String password;
}
