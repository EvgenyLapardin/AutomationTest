package in.reqres.users.api.Functional.Users;

import in.reqres.users._support.ValidatorHelper;
import in.reqres.users._support.Client.UserClient;
import in.reqres.users._support.Contract.UpdateUserContract;
import in.reqres.users._support.Entity.UpdatedUser;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateUserByIdTest {
    UserClient userClient = new UserClient();
    ValidatorHelper validatorHelper = new ValidatorHelper();

    @Test
    @Description("Check update user by ID")
    @Issue("https://yourCompany.atlassian.net/browse/AQA-305")
    @Feature("Functional test - Users API")
    @Epic("Users")
    public void updateUserById() {
        Response response = this.userClient.updateUserById(new UpdateUserContract("Evgeny", "Java AQA"), "2");
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusCode());

        UpdatedUser updatedUser = response.as(UpdatedUser.class);

        this.validatorHelper.validate(updatedUser);

        Assert.assertEquals("Evgeny", updatedUser.getName());
        Assert.assertEquals("Java AQA", updatedUser.getJob());
    }
}
