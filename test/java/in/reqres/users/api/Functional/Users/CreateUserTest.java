package in.reqres.users.api.Functional.Users;

import in.reqres.users._support.ValidatorHelper;
import in.reqres.users._support.Builder.CreateUserBuilder;
import in.reqres.users._support.Client.UserClient;
import in.reqres.users._support.Contract.CreateUserContract;
import in.reqres.users._support.Entity.CreatedUser;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserTest {
    UserClient userClient = new UserClient();
    ValidatorHelper validatorHelper = new ValidatorHelper();

    @Test
    @Description("Check create user")
    @Issue("https://yourCompany.atlassian.net/browse/AQA-301")
    @Feature("Functional test - Users API")
    @Epic("Users")
    public void createUser() {
        CreateUserContract newUser = new CreateUserBuilder().build();

        Response response = this.userClient.createUser(newUser);
        Assert.assertEquals(HttpStatus.SC_CREATED, response.getStatusCode());

        CreatedUser createdUser = response.as(CreatedUser.class);

        this.validatorHelper.validate(createdUser);

        Assert.assertEquals(newUser.getName(), createdUser.getName());
        Assert.assertEquals(newUser.getJob(), createdUser.getJob());
        Assert.assertNotEquals("evgeny", createdUser.getName());
    }
}
