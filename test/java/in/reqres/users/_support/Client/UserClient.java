package in.reqres.users._support.Client;

import in.reqres.users._support.AbstractRestClient;
import in.reqres.users._support.Contract.CreateUserContract;
import in.reqres.users._support.Contract.LoginUserContract;
import in.reqres.users._support.Contract.RegisterUserContract;
import in.reqres.users._support.Contract.UpdateUserContract;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient extends AbstractRestClient {
    @Override
    public String getBasePath() {
        return "/api";
    }

    public Response getUsers() {
        return given().spec(super.REQ_SPEC)
                .get("/users");
    }

    public Response createUser(CreateUserContract createUserContract) {
        return given().spec(super.REQ_SPEC)
                .body(createUserContract)
                .post("/users");
    }

    public Response getUserById(String userId) {
        return given().spec(super.REQ_SPEC)
                .get("/users/" + userId);
    }

    public Response registerUser(RegisterUserContract registerUserContract) {
        return given().spec(super.REQ_SPEC)
                .body(registerUserContract)
                .post("/register");
    }

    public Response loginUser(LoginUserContract loginUserContract) {
        return given().spec(super.REQ_SPEC)
                .body(loginUserContract)
                .post("/login");
    }

    public Response updateUserById(UpdateUserContract updateUserContract, String userId) {
        return given().spec(super.REQ_SPEC)
                .body(updateUserContract)
                .put("/users/" + userId);
    }

    public Response deleteUserById(String userId) {
        return given().spec(super.REQ_SPEC)
                .delete("/users/" + userId);
    }
}
