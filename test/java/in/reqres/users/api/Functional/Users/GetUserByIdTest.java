package in.reqres.users.api.Functional.Users;

import in.reqres.users._support.Client.UserClient;
import in.reqres.users._support.Entity.SingleUser;
import in.reqres.users._support.ValidatorHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetUserByIdTest {
    UserClient userClient = new UserClient();
    ValidatorHelper validatorHelper = new ValidatorHelper();

    @Test(dataProvider = "user-id-provider")
    @Description("Check get user by ID with data provider")
    @Issue("https://yourCompany.atlassian.net/browse/AQA-306")
    @Feature("Integration test - Users API")
    @Epic("Users")
    public void getUserByIdWithDataProvider(String userId) {
        Response response = this.userClient.getUserById(userId);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusCode());

        SingleUser user = response.as(SingleUser.class);

        this.validatorHelper.validate(user);
    }

    @DataProvider(name = "user-id-provider")
    public Object [][] getUserId() {

        return new Object[][] {
                { "1" },
                { "2" },
                { "3" },
                { "4" },
                { "5" }
        };
    }
}
