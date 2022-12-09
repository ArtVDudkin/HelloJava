package io.swagger.api;

import io.swagger.model.Country;
import io.swagger.model.Robot;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-09T12:22:10.559Z[GMT]")
@RestController
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<User> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "Created user account", schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"country\" : {\n    \"name\" : \"name\",\n    \"id\" : 6,\n    \"cityID\" : {\n      \"name\" : \"name\",\n      \"id\" : 1\n    }\n  },\n  \"password\" : \"password\",\n  \"city\" : \"city\",\n  \"phone\" : 89991234567,\n  \"robotID1\" : {\n    \"model\" : {\n      \"name\" : \"name\",\n      \"firmwareID\" : {\n        \"id\" : 1,\n        \"version\" : \"version\",\n        \"URL\" : \"URL\"\n      },\n      \"id\" : 6\n    },\n    \"id\" : 0,\n    \"historyClean\" : {\n      \"resultID\" : \"resultID\",\n      \"timetableID\" : {\n        \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"resultID\" : {\n          \"code\" : 3,\n          \"Details\" : \"Details\",\n          \"id\" : 9\n        },\n        \"id\" : 2,\n        \"roomID\" : {\n          \"roomname\" : \"roomname\",\n          \"id\" : 7,\n          \"roomsquare\" : \"roomsquare\"\n        }\n      },\n      \"id\" : 5\n    },\n    \"firmware\" : \"firmware\",\n    \"config\" : [ \"config\", \"config\" ],\n    \"diadnostic\" : [ 5, 5 ],\n    \"serialNo\" : \"serialNo\",\n    \"status\" : \"ready\"\n  },\n  \"id\" : 0,\n  \"email\" : \"john@email.com\",\n  \"username\" : \"username\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUser(@Parameter(in = ParameterIn.PATH, description = "user ID that needs to be deleted", required=true, schema=@Schema()) @PathVariable("userID") Long userID) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> getUser(@Parameter(in = ParameterIn.PATH, description = "The user ID that needs to be returned", required=true, schema=@Schema()) @PathVariable("userID") Long userID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"country\" : {\n    \"name\" : \"name\",\n    \"id\" : 6,\n    \"cityID\" : {\n      \"name\" : \"name\",\n      \"id\" : 1\n    }\n  },\n  \"password\" : \"password\",\n  \"city\" : \"city\",\n  \"phone\" : 89991234567,\n  \"robotID1\" : {\n    \"model\" : {\n      \"name\" : \"name\",\n      \"firmwareID\" : {\n        \"id\" : 1,\n        \"version\" : \"version\",\n        \"URL\" : \"URL\"\n      },\n      \"id\" : 6\n    },\n    \"id\" : 0,\n    \"historyClean\" : {\n      \"resultID\" : \"resultID\",\n      \"timetableID\" : {\n        \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"resultID\" : {\n          \"code\" : 3,\n          \"Details\" : \"Details\",\n          \"id\" : 9\n        },\n        \"id\" : 2,\n        \"roomID\" : {\n          \"roomname\" : \"roomname\",\n          \"id\" : 7,\n          \"roomsquare\" : \"roomsquare\"\n        }\n      },\n      \"id\" : 5\n    },\n    \"firmware\" : \"firmware\",\n    \"config\" : [ \"config\", \"config\" ],\n    \"diadnostic\" : [ 5, 5 ],\n    \"serialNo\" : \"serialNo\",\n    \"status\" : \"ready\"\n  },\n  \"id\" : 0,\n  \"email\" : \"john@email.com\",\n  \"username\" : \"username\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> loginUser(@Parameter(in = ParameterIn.QUERY, description = "The user name for login" ,schema=@Schema()) @Valid @RequestParam(value = "username", required = false) String username,@Parameter(in = ParameterIn.QUERY, description = "The password for login in clear text" ,schema=@Schema()) @Valid @RequestParam(value = "password", required = false) String password) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> logoutUser() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.PATH, description = "user id that need to be updated", required=true, schema=@Schema()) @PathVariable("userID") Long userID,@Parameter(in = ParameterIn.DEFAULT, description = "Update info in existing user account", schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
