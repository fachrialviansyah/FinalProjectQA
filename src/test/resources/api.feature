Feature: Automation Testing REST API User & Tag Controller

  @get-user-api
  Scenario: Get User by ID
    Given prepare url for "specific_user"
    When hit api get specific user
    Then validation status code is equals 200
    And validation response body get specific user
    And validation response json with JsonSchema "profile_user.json"

  @get-all-api
  Scenario: Get List of Tags
    Given prepare url for "tag_data"
    When hit api get list tag
    Then validation status code is equals 200
    And validation response body get list tag

  @post-api
  Scenario: Create User
    Given prepare url for "modif_user"
    When hit api post create new user
    Then validation status code is equals 200
    And validation response body post create new user
    And validation response json with JsonSchema "profile_user.json"

  @put-api
  Scenario: Update User
    Given prepare url for "modif_user"
    When hit api post create new user
    Then validation status code is equals 200
    And validation response body post create new user
    And hit api update data
    And validation status code is equals 200
    And validation response body update user

  @delete-api
  Scenario: Delete User
    Given prepare url for "modif_user"
    When hit api post create new user
    Then validation status code is equals 200
    And validation response body post create new user
    And hit api delete new user
    And validation status code is equals 200
    And validation response body delete user
