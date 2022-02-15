package in.reqres.users.api.Integration.Users;

import in.reqres.users._support.ValidatorHelper;
import in.reqres.users._support.Contract.CreateUserContract;
import in.reqres.users._support.Entity.CreatedUser;
import in.reqres.users._support.Entity.SingleUser;
import in.reqres.users._support.Entity.Users;
import in.reqres.users._support.Entity.UsersIn.UserData;
import in.reqres.users._support.Tester.UserTester;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.List;

@Test
public class GetUserByIdTest {
    UserTester userTester = new UserTester();
    ValidatorHelper validatorHelper = new ValidatorHelper();

    @Test
    @Description("Check get user by ID from existing list users")
    @Issue("https://yourCompany.atlassian.net/browse/AQA-306")
    @Feature("Integration test - Users API")
    @Epic("Users")
    public void getUserByIdFromExistingListUsers() {
        Users users = this.userTester.getUsers();

        List<UserData> usersList = users.getData();

        this.validatorHelper.validate(usersList);

        int i = 0;

        for (UserData user : usersList) {
            int ids = user.getId();

            SingleUser gottenUser = this.userTester.getUserById("" + ids);

            this.validatorHelper.validate(gottenUser);

            Assert.assertEquals(usersList.get(i).getId(), gottenUser.getData().getId());
            Assert.assertEquals(usersList.get(i).getEmail(), gottenUser.getData().getEmail());
            Assert.assertEquals(usersList.get(i).getFirstName(), gottenUser.getData().getFirstName());
            Assert.assertEquals(usersList.get(i).getLastName(), gottenUser.getData().getLastName());
            Assert.assertEquals(usersList.get(i).getAvatar(), gottenUser.getData().getAvatar());

            i++;
        }
    }

    /*
    * https://yourCompany.atlassian.net/browse/BUG-15690
    *
    * For example, I create fake BUG-15690:
    * Title - We can't get created user, endpoint /api/users/{id}
    * Description - Steps:
    * * 1) Create new user: send POST on endpoint /api/users with parameters: {"name": "Evgeny", "job": "Java AQA"}
    * * 2) Get created user ID: send GET on endpoint /api/users/{id} with gotten ID
    * * Expected behaviour: Return HTTP CODE 200 (OK)
    * * Actual behaviour: Return HTTP CODE 404 (NOT_FOUND)
    * Include attachment with screenshot or link with steps on Allure report
    * */
    @Test
    @Description("Check get created user by ID")
    @Issue("https://yourCompany.atlassian.net/browse/AQA-306")
    @Feature("Integration test - Users API")
    @Epic("Users")
    public void getCreatedUserById() {
        CreatedUser newUser = this.userTester.createUser(new CreateUserContract("Evgeny", "Java AQA"));
        String userId = newUser.getId();

        this.validatorHelper.validate(newUser);

        SingleUser createdUser = this.userTester.getUserById(userId);

        this.validatorHelper.validate(createdUser);
    }

    @AfterTest
    public void justMessageAtTheEnd() {
        System.out.println("Thx 4 your attention :)");
    }
}
