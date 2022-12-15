package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Disk
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-15T15:11:33.384Z[GMT]")


public class Disk   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("GB")
  private Integer GB = null;

  @JsonProperty("price")
  private Integer price = null;

  public Disk id(Integer id) {
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

  public Disk type(String type) {
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

  public Disk GB(Integer GB) {
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

  public Disk price(Integer price) {
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
    Disk disk = (Disk) o;
    return Objects.equals(this.id, disk.id) &&
        Objects.equals(this.type, disk.type) &&
        Objects.equals(this.GB, disk.GB) &&
        Objects.equals(this.price, disk.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, GB, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disk {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
