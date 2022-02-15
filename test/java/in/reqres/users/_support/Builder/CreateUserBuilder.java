package in.reqres.users._support.Builder;

import in.reqres.users._data.Faker;
import in.reqres.users._support.Contract.CreateUserContract;
import lombok.Setter;

import static in.reqres.users._data.Faker.jobs;
import static in.reqres.users._data.Faker.names;

@Setter
public class CreateUserBuilder {
    private String name;
    private String job;

    public CreateUserBuilder() {
        this.name = Faker.getRandomString(names);
        this.job = Faker.getRandomString(jobs);
    }

    public CreateUserContract build() {
        return new CreateUserContract(
                this.name,
                this.job
        );
    }
}
