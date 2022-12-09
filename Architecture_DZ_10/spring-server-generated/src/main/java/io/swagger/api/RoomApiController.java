package io.swagger.api;

import io.swagger.model.Room;
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
public class RoomApiController implements RoomApi {

    private static final Logger log = LoggerFactory.getLogger(RoomApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RoomApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Room> addRoom(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new room", required=true, schema=@Schema()) @Valid @RequestBody Room body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Room>(objectMapper.readValue("{\n  \"roomname\" : \"roomname\",\n  \"id\" : 7,\n  \"roomsquare\" : \"roomsquare\"\n}", Room.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Room>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Room>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Room> deleteRoom(@Parameter(in = ParameterIn.PATH, description = "The room id that needs to be deleted", required=true, schema=@Schema()) @PathVariable("roomID") Long roomID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Room>(objectMapper.readValue("{\n  \"roomname\" : \"roomname\",\n  \"id\" : 7,\n  \"roomsquare\" : \"roomsquare\"\n}", Room.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Room>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Room>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Room> getRoom(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be fetched. Use user1 for testing. ", required=true, schema=@Schema()) @PathVariable("roomID") Long roomID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Room>(objectMapper.readValue("{\n  \"roomname\" : \"roomname\",\n  \"id\" : 7,\n  \"roomsquare\" : \"roomsquare\"\n}", Room.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Room>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Room>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Room> updateRoom(@Parameter(in = ParameterIn.PATH, description = "room ID that need to be updated", required=true, schema=@Schema()) @PathVariable("roomID") Long roomID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Room>(objectMapper.readValue("{\n  \"roomname\" : \"roomname\",\n  \"id\" : 7,\n  \"roomsquare\" : \"roomsquare\"\n}", Room.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Room>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Room>(HttpStatus.NOT_IMPLEMENTED);
    }

}
