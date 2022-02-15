package in.reqres.users.api.Functional.Users;

import in.reqres.users._support.Client.UserClient;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteUserByIdTest {
    UserClient userClient = new UserClient();

    @Test
    @Description("Check get user by ID")
    @Issue("https://yourCompany.atlassian.net/browse/AQA-302")
    @Feature("Functional test - Users API")
    @Epic("Users")
    public void deleteUserById() {
        final String EXAMPLE_USER_ID = "2";

        Response response = this.userClient.deleteUserById(EXAMPLE_USER_ID);
        Assert.assertEquals(HttpStatus.SC_NO_CONTENT, response.getStatusCode());
    }
}
