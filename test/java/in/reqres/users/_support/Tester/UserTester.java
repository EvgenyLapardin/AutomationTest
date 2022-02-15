package in.reqres.users._support.Tester;

import in.reqres.users._support.Client.UserClient;
import in.reqres.users._support.Contract.CreateUserContract;
import in.reqres.users._support.Contract.LoginUserContract;
import in.reqres.users._support.Contract.RegisterUserContract;
import in.reqres.users._support.Contract.UpdateUserContract;
import in.reqres.users._support.Entity.*;
import in.reqres.users._support.Entity.UsersIn.UserData;
import io.restassured.response.Response;

public class UserTester {
    private static final UserClient userClient = new UserClient();

    public Users getUsers() {
        Response response = userClient.getUsers();

        return response.as(Users.class);
    }

    public CreatedUser createUser(CreateUserContract createUserContract) {
        Response response = userClient.createUser(createUserContract);

        return response.as(CreatedUser.class);
    }

    public SingleUser getUserById(String userId) {
        Response response = userClient.getUserById(userId);

        return response.as(SingleUser.class);
    }

    public RegisteredUser registerUser(RegisterUserContract registerUserContract) {
        Response response = userClient.registerUser(registerUserContract);

        return response.as(RegisteredUser.class);
    }

    public LoginUser loginUser(LoginUserContract loginUserContract) {
        Response response = userClient.loginUser(loginUserContract);

        return response.as(LoginUser.class);
    }

    public UserData updateUserById(UpdateUserContract updateUserContract, String userId) {
        Response response = userClient.updateUserById(updateUserContract, userId);

        return response.as(UserData.class);
    }
}
