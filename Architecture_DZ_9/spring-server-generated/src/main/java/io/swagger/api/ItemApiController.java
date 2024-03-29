package io.swagger.api;

import io.swagger.model.Disk;
import io.swagger.model.IP;
import io.swagger.model.OS;
import io.swagger.model.Processor;
import io.swagger.model.RAM;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-15T15:11:33.384Z[GMT]")
@RestController
public class ItemApiController implements ItemApi {

    private static final Logger log = LoggerFactory.getLogger(ItemApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ItemApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Disk>> getDisk() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Disk>>(objectMapper.readValue("[ {\n  \"price\" : 6,\n  \"id\" : 1,\n  \"GB\" : 1,\n  \"type\" : \"type\"\n}, {\n  \"price\" : 6,\n  \"id\" : 1,\n  \"GB\" : 1,\n  \"type\" : \"type\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Disk>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Disk>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<IP>> getIP() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<IP>>(objectMapper.readValue("[ {\n  \"quantityIP\" : 4,\n  \"price\" : 1,\n  \"id\" : 7,\n  \"type\" : \"type\"\n}, {\n  \"quantityIP\" : 4,\n  \"price\" : 1,\n  \"id\" : 7,\n  \"type\" : \"type\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<IP>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<IP>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OS>> getOS() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OS>>(objectMapper.readValue("[ {\n  \"nameOS\" : \"nameOS\",\n  \"price\" : 7,\n  \"id\" : 2,\n  \"version\" : \"version\"\n}, {\n  \"nameOS\" : \"nameOS\",\n  \"price\" : 7,\n  \"id\" : 2,\n  \"version\" : \"version\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OS>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OS>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Processor>> getProc() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Processor>>(objectMapper.readValue("[ {\n  \"cores\" : 3,\n  \"price\" : 2,\n  \"name\" : \"name\",\n  \"freq\" : \"freq\",\n  \"id\" : 9\n}, {\n  \"cores\" : 3,\n  \"price\" : 2,\n  \"name\" : \"name\",\n  \"freq\" : \"freq\",\n  \"id\" : 9\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Processor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Processor>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<RAM>> getRAM() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<RAM>>(objectMapper.readValue("[ {\n  \"price\" : 1,\n  \"id\" : 4,\n  \"GB\" : 7\n}, {\n  \"price\" : 1,\n  \"id\" : 4,\n  \"GB\" : 7\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<RAM>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<RAM>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
