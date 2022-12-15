package io.swagger.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.model.Order;
import io.swagger.model.Specification;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-15T15:11:33.384Z[GMT]")
@RestController
public class OrderApiController implements OrderApi {

    private static final Logger log = LoggerFactory.getLogger(OrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Order> createOrder(@NotNull @Parameter(in = ParameterIn.QUERY, description = "user ID account" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "userID", required = true) String userID,@NotNull @Parameter(in = ParameterIn.QUERY, description = "OS preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "OS name", required = true) String osName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "OS version preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "OS version", required = true) String osVersion,@NotNull @Parameter(in = ParameterIn.QUERY, description = "processor preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "procName", required = true) String procName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "processor cores preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "procCores", required = true) Integer procCores,@NotNull @Parameter(in = ParameterIn.QUERY, description = "processor frequency preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "procFreq", required = true) Integer procFreq,@NotNull @Parameter(in = ParameterIn.QUERY, description = "RAM volume preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ram", required = true) Integer ram,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Disk type preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "disk type", required = true) String diskType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Disk volume preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "disk volume", required = true) Integer diskVolume,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IP type preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ip type", required = true) String ipType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IP quantity preffered" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ip quantity", required = true) Integer ipQuantity,@NotNull @Parameter(in = ParameterIn.QUERY, description = "months payed" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "months", required = true) Integer months,@Parameter(in = ParameterIn.DEFAULT, description = "create a new order", required=true, schema=@Schema()) @Valid @RequestBody Order body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"orderDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"specVDS\" : {\n    \"Processor\" : {\n      \"cores\" : 3,\n      \"price\" : 2,\n      \"name\" : \"name\",\n      \"freq\" : \"freq\",\n      \"id\" : 9\n    },\n    \"OS\" : {\n      \"nameOS\" : \"nameOS\",\n      \"price\" : 7,\n      \"id\" : 2,\n      \"version\" : \"version\"\n    },\n    \"IP\" : {\n      \"quantityIP\" : 4,\n      \"price\" : 1,\n      \"id\" : 7,\n      \"type\" : \"type\"\n    },\n    \"id\" : 5,\n    \"Disk\" : {\n      \"price\" : 6,\n      \"id\" : 1,\n      \"GB\" : 1,\n      \"type\" : \"type\"\n    },\n    \"RAM\" : {\n      \"price\" : 1,\n      \"id\" : 4,\n      \"GB\" : 7\n    }\n  },\n  \"orderNo\" : 6,\n  \"monthsPayed\" : 5,\n  \"orderExpiration\" : \"orderExpiration\",\n  \"id\" : 0,\n  \"userID\" : {\n    \"money\" : 5,\n    \"phone\" : 89991234567,\n    \"id\" : 1,\n    \"email\" : \"john@email.com\",\n    \"username\" : \"username\"\n  }\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> deleteOrder(@Parameter(in = ParameterIn.PATH, description = "Order ID to delete", required=true, schema=@Schema()) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"orderDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"specVDS\" : {\n    \"Processor\" : {\n      \"cores\" : 3,\n      \"price\" : 2,\n      \"name\" : \"name\",\n      \"freq\" : \"freq\",\n      \"id\" : 9\n    },\n    \"OS\" : {\n      \"nameOS\" : \"nameOS\",\n      \"price\" : 7,\n      \"id\" : 2,\n      \"version\" : \"version\"\n    },\n    \"IP\" : {\n      \"quantityIP\" : 4,\n      \"price\" : 1,\n      \"id\" : 7,\n      \"type\" : \"type\"\n    },\n    \"id\" : 5,\n    \"Disk\" : {\n      \"price\" : 6,\n      \"id\" : 1,\n      \"GB\" : 1,\n      \"type\" : \"type\"\n    },\n    \"RAM\" : {\n      \"price\" : 1,\n      \"id\" : 4,\n      \"GB\" : 7\n    }\n  },\n  \"orderNo\" : 6,\n  \"monthsPayed\" : 5,\n  \"orderExpiration\" : \"orderExpiration\",\n  \"id\" : 0,\n  \"userID\" : {\n    \"money\" : 5,\n    \"phone\" : 89991234567,\n    \"id\" : 1,\n    \"email\" : \"john@email.com\",\n    \"username\" : \"username\"\n  }\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> getOrder(@Parameter(in = ParameterIn.PATH, description = "ID of order to return", required=true, schema=@Schema()) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"orderDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"specVDS\" : {\n    \"Processor\" : {\n      \"cores\" : 3,\n      \"price\" : 2,\n      \"name\" : \"name\",\n      \"freq\" : \"freq\",\n      \"id\" : 9\n    },\n    \"OS\" : {\n      \"nameOS\" : \"nameOS\",\n      \"price\" : 7,\n      \"id\" : 2,\n      \"version\" : \"version\"\n    },\n    \"IP\" : {\n      \"quantityIP\" : 4,\n      \"price\" : 1,\n      \"id\" : 7,\n      \"type\" : \"type\"\n    },\n    \"id\" : 5,\n    \"Disk\" : {\n      \"price\" : 6,\n      \"id\" : 1,\n      \"GB\" : 1,\n      \"type\" : \"type\"\n    },\n    \"RAM\" : {\n      \"price\" : 1,\n      \"id\" : 4,\n      \"GB\" : 7\n    }\n  },\n  \"orderNo\" : 6,\n  \"monthsPayed\" : 5,\n  \"orderExpiration\" : \"orderExpiration\",\n  \"id\" : 0,\n  \"userID\" : {\n    \"money\" : 5,\n    \"phone\" : 89991234567,\n    \"id\" : 1,\n    \"email\" : \"john@email.com\",\n    \"username\" : \"username\"\n  }\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> updateOrder(@Parameter(in = ParameterIn.PATH, description = "ID of order to return", required=true, schema=@Schema()) @PathVariable("orderId") Long orderId,@Parameter(in = ParameterIn.DEFAULT, description = "Update an existing order in the store", required=true, schema=@Schema()) @Valid @RequestBody Order body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"orderDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"specVDS\" : {\n    \"Processor\" : {\n      \"cores\" : 3,\n      \"price\" : 2,\n      \"name\" : \"name\",\n      \"freq\" : \"freq\",\n      \"id\" : 9\n    },\n    \"OS\" : {\n      \"nameOS\" : \"nameOS\",\n      \"price\" : 7,\n      \"id\" : 2,\n      \"version\" : \"version\"\n    },\n    \"IP\" : {\n      \"quantityIP\" : 4,\n      \"price\" : 1,\n      \"id\" : 7,\n      \"type\" : \"type\"\n    },\n    \"id\" : 5,\n    \"Disk\" : {\n      \"price\" : 6,\n      \"id\" : 1,\n      \"GB\" : 1,\n      \"type\" : \"type\"\n    },\n    \"RAM\" : {\n      \"price\" : 1,\n      \"id\" : 4,\n      \"GB\" : 7\n    }\n  },\n  \"orderNo\" : 6,\n  \"monthsPayed\" : 5,\n  \"orderExpiration\" : \"orderExpiration\",\n  \"id\" : 0,\n  \"userID\" : {\n    \"money\" : 5,\n    \"phone\" : 89991234567,\n    \"id\" : 1,\n    \"email\" : \"john@email.com\",\n    \"username\" : \"username\"\n  }\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

}
