package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RAM
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-15T15:11:33.384Z[GMT]")


public class RAM   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("GB")
  private Integer GB = null;

  @JsonProperty("price")
  private Integer price = null;

  public RAM id(Integer id) {
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

  public RAM GB(Integer GB) {
    this.GB = GB;
    return this;
  }

  /**
   * Get GB
   * @return GB
   **/
  @Schema(description = "")
  
    public Integer getGB() {
    return GB;
  }

  public void setGB(Integer GB) {
    this.GB = GB;
  }

  public RAM price(Integer price) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RAM RAM = (RAM) o;
    return Objects.equals(this.id, RAM.id) &&
        Objects.equals(this.GB, RAM.GB) &&
        Objects.equals(this.price, RAM.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, GB, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RAM {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    GB: ").append(toIndentedString(GB)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
