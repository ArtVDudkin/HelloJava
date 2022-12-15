/*
 * VDS service
 * This is a study project considering server based on the OpenAPI 3.0 specification.  You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: kardan97@yandex.ru
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.User;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Create user account
     *
     * This create a new user account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws Exception {
        String username = null;
        String email = null;
        String phone = null;
        User body = null;
        User response = api.createUser(username, email, phone, body);

        // TODO: test validations
    }
    /**
     * Delete user by ID
     *
     * This delete user account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws Exception {
        Long userID = null;
        api.deleteUser(userID);

        // TODO: test validations
    }
    /**
     * Get user by ID
     *
     * Get user by ID
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws Exception {
        Long userID = null;
        User response = api.getUser(userID);

        // TODO: test validations
    }
    /**
     * Logs user into the system
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loginUserTest() throws Exception {
        String username = null;
        String password = null;
        String response = api.loginUser(username, password);

        // TODO: test validations
    }
    /**
     * Logs out current logged in user session
     *
     * Logs out current logged in user session
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void logoutUserTest() throws Exception {
        api.logoutUser();

        // TODO: test validations
    }
    /**
     * Update user by ID
     *
     * This update info in user account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws Exception {
        Long userID = null;
        User body = null;
        api.updateUser(userID, body);

        // TODO: test validations
    }
}