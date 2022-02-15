package in.reqres.users._support.Builder;

import in.reqres.users._data.Faker;
import in.reqres.users._support.Contract.RegisterUserContract;
import lombok.Setter;

import static in.reqres.users._data.Faker.emails;
import static in.reqres.users._data.Faker.passwords;

@Setter
public class RegisterUserBuilder {
    private String email;
    private String password;

    public RegisterUserBuilder() {
        this.email = Faker.getRandomString(emails);
        this.password = Faker.getRandomString(passwords);
    }

    public RegisterUserContract build() {
        return new RegisterUserContract(
                this.email,
                this.password
        );
    }
}
