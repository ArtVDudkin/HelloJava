package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Specification;
import io.swagger.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-15T15:11:33.384Z[GMT]")


public class Order   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderNo")
  private Long orderNo = null;

  @JsonProperty("orderDateTime")
  private OffsetDateTime orderDateTime = null;

  @JsonProperty("userID")
  private User userID = null;

  @JsonProperty("specVDS")
  private Specification specVDS = null;

  @JsonProperty("monthsPayed")
  private Integer monthsPayed = null;

  @JsonProperty("orderExpiration")
  private String orderExpiration = null;

  public Order id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order orderNo(Long orderNo) {
    this.orderNo = orderNo;
    return this;
  }

  /**
   * Get orderNo
   * @return orderNo
   **/
  @Schema(description = "")
  
    public Long getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(Long orderNo) {
    this.orderNo = orderNo;
  }

  public Order orderDateTime(OffsetDateTime orderDateTime) {
    this.orderDateTime = orderDateTime;
    return this;
  }

  /**
   * Get orderDateTime
   * @return orderDateTime
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getOrderDateTime() {
    return orderDateTime;
  }

  public void setOrderDateTime(OffsetDateTime orderDateTime) {
    this.orderDateTime = orderDateTime;
  }

  public Order userID(User userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID
   * @return userID
   **/
  @Schema(description = "")
  
    @Valid
    public User getUserID() {
    return userID;
  }

  public void setUserID(User userID) {
    this.userID = userID;
  }

  public Order specVDS(Specification specVDS) {
    this.specVDS = specVDS;
    return this;
  }

  /**
   * Get specVDS
   * @return specVDS
   **/
  @Schema(description = "")
  
    @Valid
    public Specification getSpecVDS() {
    return specVDS;
  }

  public void setSpecVDS(Specification specVDS) {
    this.specVDS = specVDS;
  }

  public Order monthsPayed(Integer monthsPayed) {
    this.monthsPayed = monthsPayed;
    return this;
  }

  /**
   * Get monthsPayed
   * @return monthsPayed
   **/
  @Schema(description = "")
  
    public Integer getMonthsPayed() {
    return monthsPayed;
  }

  public void setMonthsPayed(Integer monthsPayed) {
    this.monthsPayed = monthsPayed;
  }

  public Order orderExpiration(String orderExpiration) {
    this.orderExpiration = orderExpiration;
    return this;
  }

  /**
   * Get orderExpiration
   * @return orderExpiration
   **/
  @Schema(description = "")
  
    public String getOrderExpiration() {
    return orderExpiration;
  }

  public void setOrderExpiration(String orderExpiration) {
    this.orderExpiration = orderExpiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.orderNo, order.orderNo) &&
        Objects.equals(this.orderDateTime, order.orderDateTime) &&
        Objects.equals(this.userID, order.userID) &&
        Objects.equals(this.specVDS, order.specVDS) &&
        Objects.equals(this.monthsPayed, order.monthsPayed) &&
        Objects.equals(this.orderExpiration, order.orderExpiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderNo, orderDateTime, userID, specVDS, monthsPayed, orderExpiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    orderDateTime: ").append(toIndentedString(orderDateTime)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    specVDS: ").append(toIndentedString(specVDS)).append("\n");
    sb.append("    monthsPayed: ").append(toIndentedString(monthsPayed)).append("\n");
    sb.append("    orderExpiration: ").append(toIndentedString(orderExpiration)).append("\n");
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
