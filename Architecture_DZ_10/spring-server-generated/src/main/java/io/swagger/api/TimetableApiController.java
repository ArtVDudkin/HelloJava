package io.swagger.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.model.Result;
import io.swagger.model.Room;
import io.swagger.model.Timetable;
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
public class TimetableApiController implements TimetableApi {

    private static final Logger log = LoggerFactory.getLogger(TimetableApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TimetableApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Timetable> clearTimetable() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Timetable>(objectMapper.readValue("{\n  \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"resultID\" : {\n    \"code\" : 3,\n    \"Details\" : \"Details\",\n    \"id\" : 9\n  },\n  \"id\" : 2,\n  \"roomID\" : {\n    \"roomname\" : \"roomname\",\n    \"id\" : 7,\n    \"roomsquare\" : \"roomsquare\"\n  }\n}", Timetable.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Timetable>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Timetable>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteRecord(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("recordId") Long recordId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Timetable> editRecord(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("recordId") Long recordId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Timetable>(objectMapper.readValue("{\n  \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"resultID\" : {\n    \"code\" : 3,\n    \"Details\" : \"Details\",\n    \"id\" : 9\n  },\n  \"id\" : 2,\n  \"roomID\" : {\n    \"roomname\" : \"roomname\",\n    \"id\" : 7,\n    \"roomsquare\" : \"roomsquare\"\n  }\n}", Timetable.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Timetable>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Timetable>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Timetable> getRecord(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("recordId") Long recordId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Timetable>(objectMapper.readValue("{\n  \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"resultID\" : {\n    \"code\" : 3,\n    \"Details\" : \"Details\",\n    \"id\" : 9\n  },\n  \"id\" : 2,\n  \"roomID\" : {\n    \"roomname\" : \"roomname\",\n    \"id\" : 7,\n    \"roomsquare\" : \"roomsquare\"\n  }\n}", Timetable.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Timetable>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Timetable>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Timetable> getTimetable() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Timetable>(objectMapper.readValue("{\n  \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"resultID\" : {\n    \"code\" : 3,\n    \"Details\" : \"Details\",\n    \"id\" : 9\n  },\n  \"id\" : 2,\n  \"roomID\" : {\n    \"roomname\" : \"roomname\",\n    \"id\" : 7,\n    \"roomsquare\" : \"roomsquare\"\n  }\n}", Timetable.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Timetable>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Timetable>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Timetable> newRecord(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Timetable body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Timetable>(objectMapper.readValue("{\n  \"datetime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"resultID\" : {\n    \"code\" : 3,\n    \"Details\" : \"Details\",\n    \"id\" : 9\n  },\n  \"id\" : 2,\n  \"roomID\" : {\n    \"roomname\" : \"roomname\",\n    \"id\" : 7,\n    \"roomsquare\" : \"roomsquare\"\n  }\n}", Timetable.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Timetable>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Timetable>(HttpStatus.NOT_IMPLEMENTED);
    }

}
