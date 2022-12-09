package io.swagger.api;

import io.swagger.model.Firmware;
import io.swagger.model.Model;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Robot;
import io.swagger.model.Statistic;
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
public class RobotApiController implements RobotApi {

    private static final Logger log = LoggerFactory.getLogger(RobotApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RobotApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Robot> addRobot(@Parameter(in = ParameterIn.DEFAULT, description = "Add a new robot to user account", required=true, schema=@Schema()) @Valid @RequestBody Robot body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Robot>(objectMapper.readValue("{\n  \"model\" : {\n    \"name\" : \"name\",\n    \"firmwareID\" : {\n      \"id\" : 1,\n      \"version\" : \"version\",\n      \"URL\" : \"URL\"\n    },\n    \"id\" : 6\n  },\n  \"id\" : 0,\n  \"historyClean\" : {\n    \"resultID\" : \"resultID\",\n    \"timetableID\" : {\n      \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"resultID\" : {\n        \"code\" : 3,\n        \"Details\" : \"Details\",\n        \"id\" : 9\n      },\n      \"id\" : 2,\n      \"roomID\" : {\n        \"roomname\" : \"roomname\",\n        \"id\" : 7,\n        \"roomsquare\" : \"roomsquare\"\n      }\n    },\n    \"id\" : 5\n  },\n  \"firmware\" : \"firmware\",\n  \"config\" : [ \"config\", \"config\" ],\n  \"diadnostic\" : [ 5, 5 ],\n  \"serialNo\" : \"serialNo\",\n  \"status\" : \"ready\"\n}", Robot.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Robot>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Robot>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Robot> checkStatus(@Parameter(in = ParameterIn.PATH, description = "Robot id to delete", required=true, schema=@Schema()) @PathVariable("robotId") Long robotId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Robot>(objectMapper.readValue("{\n  \"model\" : {\n    \"name\" : \"name\",\n    \"firmwareID\" : {\n      \"id\" : 1,\n      \"version\" : \"version\",\n      \"URL\" : \"URL\"\n    },\n    \"id\" : 6\n  },\n  \"id\" : 0,\n  \"historyClean\" : {\n    \"resultID\" : \"resultID\",\n    \"timetableID\" : {\n      \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"resultID\" : {\n        \"code\" : 3,\n        \"Details\" : \"Details\",\n        \"id\" : 9\n      },\n      \"id\" : 2,\n      \"roomID\" : {\n        \"roomname\" : \"roomname\",\n        \"id\" : 7,\n        \"roomsquare\" : \"roomsquare\"\n      }\n    },\n    \"id\" : 5\n  },\n  \"firmware\" : \"firmware\",\n  \"config\" : [ \"config\", \"config\" ],\n  \"diadnostic\" : [ 5, 5 ],\n  \"serialNo\" : \"serialNo\",\n  \"status\" : \"ready\"\n}", Robot.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Robot>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Robot>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Firmware> checkUpdate(@Parameter(in = ParameterIn.PATH, description = "Robot id to delete", required=true, schema=@Schema()) @PathVariable("robotId") Long robotId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Firmware>(objectMapper.readValue("{\n  \"id\" : 1,\n  \"version\" : \"version\",\n  \"URL\" : \"URL\"\n}", Firmware.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Firmware>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Firmware>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Robot> deleteRobot(@Parameter(in = ParameterIn.PATH, description = "Robot id to delete", required=true, schema=@Schema()) @PathVariable("robotId") Long robotId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Robot>(objectMapper.readValue("{\n  \"model\" : {\n    \"name\" : \"name\",\n    \"firmwareID\" : {\n      \"id\" : 1,\n      \"version\" : \"version\",\n      \"URL\" : \"URL\"\n    },\n    \"id\" : 6\n  },\n  \"id\" : 0,\n  \"historyClean\" : {\n    \"resultID\" : \"resultID\",\n    \"timetableID\" : {\n      \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"resultID\" : {\n        \"code\" : 3,\n        \"Details\" : \"Details\",\n        \"id\" : 9\n      },\n      \"id\" : 2,\n      \"roomID\" : {\n        \"roomname\" : \"roomname\",\n        \"id\" : 7,\n        \"roomsquare\" : \"roomsquare\"\n      }\n    },\n    \"id\" : 5\n  },\n  \"firmware\" : \"firmware\",\n  \"config\" : [ \"config\", \"config\" ],\n  \"diadnostic\" : [ 5, 5 ],\n  \"serialNo\" : \"serialNo\",\n  \"status\" : \"ready\"\n}", Robot.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Robot>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Robot>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> downloadFile(@Parameter(in = ParameterIn.PATH, description = "ID of pet to update", required=true, schema=@Schema()) @PathVariable("robotId") Long robotId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 0,\n  \"type\" : \"type\",\n  \"message\" : \"message\"\n}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Robot> getRobot(@Parameter(in = ParameterIn.PATH, description = "ID of robot to return", required=true, schema=@Schema()) @PathVariable("robotId") Long robotId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Robot>(objectMapper.readValue("{\n  \"model\" : {\n    \"name\" : \"name\",\n    \"firmwareID\" : {\n      \"id\" : 1,\n      \"version\" : \"version\",\n      \"URL\" : \"URL\"\n    },\n    \"id\" : 6\n  },\n  \"id\" : 0,\n  \"historyClean\" : {\n    \"resultID\" : \"resultID\",\n    \"timetableID\" : {\n      \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"resultID\" : {\n        \"code\" : 3,\n        \"Details\" : \"Details\",\n        \"id\" : 9\n      },\n      \"id\" : 2,\n      \"roomID\" : {\n        \"roomname\" : \"roomname\",\n        \"id\" : 7,\n        \"roomsquare\" : \"roomsquare\"\n      }\n    },\n    \"id\" : 5\n  },\n  \"firmware\" : \"firmware\",\n  \"config\" : [ \"config\", \"config\" ],\n  \"diadnostic\" : [ 5, 5 ],\n  \"serialNo\" : \"serialNo\",\n  \"status\" : \"ready\"\n}", Robot.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Robot>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Robot>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Robot> updateRobot(@Parameter(in = ParameterIn.PATH, description = "ID of robot to return", required=true, schema=@Schema()) @PathVariable("robotId") Long robotId,@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent robot in the store", required=true, schema=@Schema()) @Valid @RequestBody Robot body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Robot>(objectMapper.readValue("{\n  \"model\" : {\n    \"name\" : \"name\",\n    \"firmwareID\" : {\n      \"id\" : 1,\n      \"version\" : \"version\",\n      \"URL\" : \"URL\"\n    },\n    \"id\" : 6\n  },\n  \"id\" : 0,\n  \"historyClean\" : {\n    \"resultID\" : \"resultID\",\n    \"timetableID\" : {\n      \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"resultID\" : {\n        \"code\" : 3,\n        \"Details\" : \"Details\",\n        \"id\" : 9\n      },\n      \"id\" : 2,\n      \"roomID\" : {\n        \"roomname\" : \"roomname\",\n        \"id\" : 7,\n        \"roomsquare\" : \"roomsquare\"\n      }\n    },\n    \"id\" : 5\n  },\n  \"firmware\" : \"firmware\",\n  \"config\" : [ \"config\", \"config\" ],\n  \"diadnostic\" : [ 5, 5 ],\n  \"serialNo\" : \"serialNo\",\n  \"status\" : \"ready\"\n}", Robot.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Robot>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Robot>(HttpStatus.NOT_IMPLEMENTED);
    }

}
