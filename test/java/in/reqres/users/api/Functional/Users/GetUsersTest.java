package in.reqres.users.api.Functional.Users;

import in.reqres.users._support.ValidatorHelper;
import in.reqres.users._support.Client.UserClient;
import in.reqres.users._support.Entity.Users;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUsersTest {
    UserClient userClient = new UserClient();
    ValidatorHelper validatorHelper = new ValidatorHelper();

    @Test
    @Description("Check get user's collection")
    @Issue("https://yourCompany.atlassian.net/browse/AQA-303")
    @Feature("Functional test - Users API")
    @Epic("Users")
    public void getUsersCollection() {
        Response response = this.userClient.getUsers();
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusCode());

        Users users = response.as(Users.class);

        this.validatorHelper.validate(users);
    }
}
