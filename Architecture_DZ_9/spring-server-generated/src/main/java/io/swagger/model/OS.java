package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OS
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-15T15:11:33.384Z[GMT]")


public class OS   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("nameOS")
  private String nameOS = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("price")
  private Integer price = null;

  public OS id(Integer id) {
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

  public OS nameOS(String nameOS) {
    this.nameOS = nameOS;
    return this;
  }

  /**
   * Get nameOS
   * @return nameOS
   **/
  @Schema(description = "")
  
    public String getNameOS() {
    return nameOS;
  }

  public void setNameOS(String nameOS) {
    this.nameOS = nameOS;
  }

  public OS version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(description = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public OS price(Integer price) {
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
    OS OS = (OS) o;
    return Objects.equals(this.id, OS.id) &&
        Objects.equals(this.nameOS, OS.nameOS) &&
        Objects.equals(this.version, OS.version) &&
        Objects.equals(this.price, OS.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nameOS, version, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OS {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nameOS: ").append(toIndentedString(nameOS)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
