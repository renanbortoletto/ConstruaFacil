package apiTests;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;




public class Store {
    String uri = "https://petstore.swagger.io/v2/store/order";
    int petId = 1103;

    public Store() throws IOException {
    }


    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }

    @Test
    public void incluirOrder() throws IOException {
        String jsonBody = lerJson("src/test/resources/data/store.json");

        given()
                .contentType("application/json")
                .log().all()
                .body(jsonBody)
        .when()
                .post(uri)
        .then()
                .log().all()
                .statusCode(200)
                .body("id", is(1403))
                .body("petId", is(1103))
                .body("status", is("placed"))
        ;


    }
}
