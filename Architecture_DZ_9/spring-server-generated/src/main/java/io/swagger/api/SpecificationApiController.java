package io.swagger.api;

import io.swagger.model.Specification;
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
public class SpecificationApiController implements SpecificationApi {

    private static final Logger log = LoggerFactory.getLogger(SpecificationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SpecificationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Specification> deleteSpec(@Parameter(in = ParameterIn.PATH, description = "The specification ID that needs to be deleted", required=true, schema=@Schema()) @PathVariable("specID") Long specID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Specification>(objectMapper.readValue("{\n  \"Processor\" : {\n    \"cores\" : 3,\n    \"price\" : 2,\n    \"name\" : \"name\",\n    \"freq\" : \"freq\",\n    \"id\" : 9\n  },\n  \"OS\" : {\n    \"nameOS\" : \"nameOS\",\n    \"price\" : 7,\n    \"id\" : 2,\n    \"version\" : \"version\"\n  },\n  \"IP\" : {\n    \"quantityIP\" : 4,\n    \"price\" : 1,\n    \"id\" : 7,\n    \"type\" : \"type\"\n  },\n  \"id\" : 5,\n  \"Disk\" : {\n    \"price\" : 6,\n    \"id\" : 1,\n    \"GB\" : 1,\n    \"type\" : \"type\"\n  },\n  \"RAM\" : {\n    \"price\" : 1,\n    \"id\" : 4,\n    \"GB\" : 7\n  }\n}", Specification.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Specification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Specification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Specification>> getAllVDS() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Specification>>(objectMapper.readValue("[ {\n  \"Processor\" : {\n    \"cores\" : 3,\n    \"price\" : 2,\n    \"name\" : \"name\",\n    \"freq\" : \"freq\",\n    \"id\" : 9\n  },\n  \"OS\" : {\n    \"nameOS\" : \"nameOS\",\n    \"price\" : 7,\n    \"id\" : 2,\n    \"version\" : \"version\"\n  },\n  \"IP\" : {\n    \"quantityIP\" : 4,\n    \"price\" : 1,\n    \"id\" : 7,\n    \"type\" : \"type\"\n  },\n  \"id\" : 5,\n  \"Disk\" : {\n    \"price\" : 6,\n    \"id\" : 1,\n    \"GB\" : 1,\n    \"type\" : \"type\"\n  },\n  \"RAM\" : {\n    \"price\" : 1,\n    \"id\" : 4,\n    \"GB\" : 7\n  }\n}, {\n  \"Processor\" : {\n    \"cores\" : 3,\n    \"price\" : 2,\n    \"name\" : \"name\",\n    \"freq\" : \"freq\",\n    \"id\" : 9\n  },\n  \"OS\" : {\n    \"nameOS\" : \"nameOS\",\n    \"price\" : 7,\n    \"id\" : 2,\n    \"version\" : \"version\"\n  },\n  \"IP\" : {\n    \"quantityIP\" : 4,\n    \"price\" : 1,\n    \"id\" : 7,\n    \"type\" : \"type\"\n  },\n  \"id\" : 5,\n  \"Disk\" : {\n    \"price\" : 6,\n    \"id\" : 1,\n    \"GB\" : 1,\n    \"type\" : \"type\"\n  },\n  \"RAM\" : {\n    \"price\" : 1,\n    \"id\" : 4,\n    \"GB\" : 7\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Specification>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Specification>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Specification> getSpec(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("specID") Long specID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Specification>(objectMapper.readValue("{\n  \"Processor\" : {\n    \"cores\" : 3,\n    \"price\" : 2,\n    \"name\" : \"name\",\n    \"freq\" : \"freq\",\n    \"id\" : 9\n  },\n  \"OS\" : {\n    \"nameOS\" : \"nameOS\",\n    \"price\" : 7,\n    \"id\" : 2,\n    \"version\" : \"version\"\n  },\n  \"IP\" : {\n    \"quantityIP\" : 4,\n    \"price\" : 1,\n    \"id\" : 7,\n    \"type\" : \"type\"\n  },\n  \"id\" : 5,\n  \"Disk\" : {\n    \"price\" : 6,\n    \"id\" : 1,\n    \"GB\" : 1,\n    \"type\" : \"type\"\n  },\n  \"RAM\" : {\n    \"price\" : 1,\n    \"id\" : 4,\n    \"GB\" : 7\n  }\n}", Specification.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Specification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Specification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Specification> updateSpec(@Parameter(in = ParameterIn.PATH, description = "specification ID that need to be updated", required=true, schema=@Schema()) @PathVariable("specID") Long specID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Specification>(objectMapper.readValue("{\n  \"Processor\" : {\n    \"cores\" : 3,\n    \"price\" : 2,\n    \"name\" : \"name\",\n    \"freq\" : \"freq\",\n    \"id\" : 9\n  },\n  \"OS\" : {\n    \"nameOS\" : \"nameOS\",\n    \"price\" : 7,\n    \"id\" : 2,\n    \"version\" : \"version\"\n  },\n  \"IP\" : {\n    \"quantityIP\" : 4,\n    \"price\" : 1,\n    \"id\" : 7,\n    \"type\" : \"type\"\n  },\n  \"id\" : 5,\n  \"Disk\" : {\n    \"price\" : 6,\n    \"id\" : 1,\n    \"GB\" : 1,\n    \"type\" : \"type\"\n  },\n  \"RAM\" : {\n    \"price\" : 1,\n    \"id\" : 4,\n    \"GB\" : 7\n  }\n}", Specification.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Specification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Specification>(HttpStatus.NOT_IMPLEMENTED);
    }

}
