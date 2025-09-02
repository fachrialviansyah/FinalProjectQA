package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "62e1a2cc275dc21b56032db4");
    }
    public static Response getSpecificUser(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }
    public static Response postCreateUser(String endpoint) {
        String title = "mr";
        String fname = "Fachri";
        String lname = "Alvi";
        String gender = "male";
        String email = generateRandomEmail();
        String dateOfBirth = "1/1/1997";
        String phone = "081200011122";
        String picture = "https://scontent.fcgk42-1.fna.fbcdn.net/v/t39.30808-6/335414480_728681378984543_4476281742815654319_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=6ee11a&_nc_eui2=AeH0LrjLuOPxPuZ52_S8AhNLyS2jAzJV5mPJLaMDMlXmY2k6ZTBjHRN0kEgGrtRbQx4GqO1XzjTPAvGg0_Ka7JCI&_nc_ohc=ihD8Ddj-HgEQ7kNvwHFdFug&_nc_oc=AdktwgV17_QEhLvkYrbGpbsiv6ojy56J4Ug-uQOeAEC2WOQmLEIKW9C-hweB9n6HswE&_nc_zt=23&_nc_ht=scontent.fcgk42-1.fna&_nc_gid=qJroEVY8exl_uqNaJ3lhqg&oh=00_AfV2tVyAOZ2W4TJc02wkdeGx8sEvuZ4tdGB3B8-_rrI9mA&oe=68BA00FD";
        String location_street = "Jl Mawar";
        String location_city = "Jakarta Utara";
        String location_state = "DKI Jakarta";
        String location_country = "Indonesia";
        String location_timezone = "+7:00";

        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", fname);
        payload.put("lastName", lname);
        payload.put("picture", picture);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("dateOfBirth", dateOfBirth);
        payload.put("phone", phone);
        JSONObject location = payload.put("location", new JSONObject()
                .put("street", location_street)
                .put("city", location_city)
                .put("state", location_state)
                .put("country", location_country)
                .put("timezone", location_timezone));

        setupHeaders();
        String finalEndpoint = endpoint + "/create";
        return request.body(payload.toString()).when().post(finalEndpoint);
    }

    public static Response updateUser(String endpoint, String userId) {
        setupHeaders();

        String title = "mr";
        String fname = "Fachri Edit";
        String lname = "Alvi Edit";
        String gender = "male";
        String email = generateRandomEmail();
        String dateOfBirth = "1/1/1997";
        String phone = "081200011122";
        String picture = "https://scontent.fcgk42-1.fna.fbcdn.net/v/t39.30808-6/335414480_728681378984543_4476281742815654319_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=6ee11a&_nc_eui2=AeH0LrjLuOPxPuZ52_S8AhNLyS2jAzJV5mPJLaMDMlXmY2k6ZTBjHRN0kEgGrtRbQx4GqO1XzjTPAvGg0_Ka7JCI&_nc_ohc=ihD8Ddj-HgEQ7kNvwHFdFug&_nc_oc=AdktwgV17_QEhLvkYrbGpbsiv6ojy56J4Ug-uQOeAEC2WOQmLEIKW9C-hweB9n6HswE&_nc_zt=23&_nc_ht=scontent.fcgk42-1.fna&_nc_gid=qJroEVY8exl_uqNaJ3lhqg&oh=00_AfV2tVyAOZ2W4TJc02wkdeGx8sEvuZ4tdGB3B8-_rrI9mA&oe=68BA00FD";
        String location_street = "Jl Mawar";
        String location_city = "Jakarta Utara";
        String location_state = "DKI Jakarta";
        String location_country = "Indonesia";
        String location_timezone = "+7:00";

        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", fname);
        payload.put("lastName", lname);
        payload.put("picture", picture);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("dateOfBirth", dateOfBirth);
        payload.put("phone", phone);
        JSONObject location = payload.put("location", new JSONObject()
                .put("street", location_street)
                .put("city", location_city)
                .put("state", location_state)
                .put("country", location_country)
                .put("timezone", location_timezone));

        String hasilupdate = endpoint + "/" + userId;
        return request.body(payload.toString()).when().put(hasilupdate);
    }

    public static Response deleteUser(String endpoint, String userId) {
        setupHeaders();
        String finalEndpoint = endpoint + "/" + userId;

        return request.when().delete(finalEndpoint);
    }

    public static Response getListTag(String endpoint){
        setupHeaders();
        return request.when().get(endpoint);
    }
}
