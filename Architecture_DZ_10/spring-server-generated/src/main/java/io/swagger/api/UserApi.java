/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Country;
import io.swagger.model.Robot;
import io.swagger.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-09T12:22:10.559Z[GMT]")
@Validated
public interface UserApi {

    @Operation(summary = "Create user account", description = "This create a new user account.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/user",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    ResponseEntity<User> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "Created user account", schema=@Schema()) @Valid @RequestBody User body);


    @Operation(summary = "Delete user", description = "This delete user account.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid user ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/user/{userID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@Parameter(in = ParameterIn.PATH, description = "user ID that needs to be deleted", required=true, schema=@Schema()) @PathVariable("userID") Long userID);


    @Operation(summary = "Get user by ID", description = "Get user by ID", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid user ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/user/{userID}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUser(@Parameter(in = ParameterIn.PATH, description = "The user ID that needs to be returned", required=true, schema=@Schema()) @PathVariable("userID") Long userID);


    @Operation(summary = "Logs user into the system", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid username/password supplied") })
    @RequestMapping(value = "/user/login",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> loginUser(@Parameter(in = ParameterIn.QUERY, description = "The user name for login" ,schema=@Schema()) @Valid @RequestParam(value = "username", required = false) String username, @Parameter(in = ParameterIn.QUERY, description = "The password for login in clear text" ,schema=@Schema()) @Valid @RequestParam(value = "password", required = false) String password);


    @Operation(summary = "Logs out current logged in user session", description = "Logs out current logged in user session", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/user/logout",
        method = RequestMethod.GET)
    ResponseEntity<Void> logoutUser();


    @Operation(summary = "Update user", description = "This update info in user account.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/user/{userID}",
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.PATH, description = "user id that need to be updated", required=true, schema=@Schema()) @PathVariable("userID") Long userID, @Parameter(in = ParameterIn.DEFAULT, description = "Update info in existing user account", schema=@Schema()) @Valid @RequestBody User body);

}

