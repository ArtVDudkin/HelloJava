package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IP
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-15T15:11:33.384Z[GMT]")


public class IP   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("price")
  private Integer price = null;

  @JsonProperty("quantityIP")
  private Integer quantityIP = null;

  public IP id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public IP type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IP price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(description = "")
  
    public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public IP quantityIP(Integer quantityIP) {
    this.quantityIP = quantityIP;
    return this;
  }

  /**
   * Get quantityIP
   * @return quantityIP
   **/
  @Schema(description = "")
  
    public Integer getQuantityIP() {
    return quantityIP;
  }

  public void setQuantityIP(Integer quantityIP) {
    this.quantityIP = quantityIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IP IP = (IP) o;
    return Objects.equals(this.id, IP.id) &&
        Objects.equals(this.type, IP.type) &&
        Objects.equals(this.price, IP.price) &&
        Objects.equals(this.quantityIP, IP.quantityIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, price, quantityIP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IP {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantityIP: ").append(toIndentedString(quantityIP)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
