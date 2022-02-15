package in.reqres.users._support;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.*;
import io.restassured.specification.*;

public abstract class AbstractRestClient {
    public abstract String getBasePath();

    private final String BASE_URI = "https://reqres.in";

    public RequestSpecification REQ_SPEC = new RequestSpecBuilder()
            .addFilter(new AllureRestAssured())
            .setBaseUri(BASE_URI)
            .setBasePath(getBasePath())
            .setContentType(ContentType.JSON)
            .build();
}
