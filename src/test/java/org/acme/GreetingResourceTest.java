package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.HashMap;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testAlticciEndpoint() {
        var values = new HashMap<String, String>();

        values.put("0", "0");
        values.put("1", "1");
        values.put("2", "1");
        values.put("3", "1");
        values.put("4", "2");
        values.put("5", "2");
        values.put("6", "3");
        values.put("7", "4");
        values.put("8", "5");
        values.put("9", "7");
        values.put("10", "9");

        values.forEach((key, value)->
            given()
                .when().get("/alticci/".concat(key))
                .then()
                    .statusCode(200)
                    .body(is(value)));
    }
}