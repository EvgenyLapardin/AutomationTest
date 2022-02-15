package in.reqres.users.api.Functional.Users;

import in.reqres.users._support.Builder.RegisterUserBuilder;
import in.reqres.users._support.Client.UserClient;
import in.reqres.users._support.Contract.RegisterUserContract;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterUserTest {
    UserClient userClient = new UserClient();

    @BeforeTest
    public void justMessageAtTheBeginning() {
        System.out.println("It's BUG");
    }

    /*
     * https://yourCompany.atlassian.net/browse/BUG-15691
     * This not BUG for reqres.in, but in other companies it is BUG
     *
     * For example, I create fake BUG-15691:
     * Title - We can't register new user, endpoint /api/register
     * Description - Steps:
     * * 1) Create new user:
     * * 2) Register created user: send POST on endpoint /api/register with parameters:
     * * * { "email": {email}, "password": {password} }
     * * Expected behaviour: Return HTTP CODE 201 (CREATED) with successful message
     * * Actual behaviour: Return HTTP CODE 400 (BAD_REQUEST) with error message
     * Include attachment with screenshot or link with steps on Allure report
     * */
    @Test
    @Description("Check register user, endpoint { api/register }")
    @Issue("https://yourCompany.atlassian.net/browse/AQA-304")
    @Feature("Functional test - Users API")
    @Epic("Users")
    public void registerUser() {
        RegisterUserContract newRegisterUser = new RegisterUserBuilder().build();

        Response response = this.userClient.registerUser(newRegisterUser);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_BAD_REQUEST);
    }
}
