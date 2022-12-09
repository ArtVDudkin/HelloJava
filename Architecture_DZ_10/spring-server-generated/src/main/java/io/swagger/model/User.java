package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Country;
import io.swagger.model.Robot;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-09T12:22:10.559Z[GMT]")


public class User   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("country")
  private Country country = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("phone")
  private Integer phone = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("robotID1")
  private Robot robotID1 = null;

  @JsonProperty("robotID2")
  private Robot robotID2 = null;

  @JsonProperty("robotID3")
  private Robot robotID3 = null;

  public User id(Long id) {
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

  public User username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(description = "")
  
    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @Schema(description = "")
  
    @Valid
    public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public User city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @Schema(description = "")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public User phone(Integer phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  @Schema(example = "89991234567", description = "")
  
    public Integer getPhone() {
    return phone;
  }

  public void setPhone(Integer phone) {
    this.phone = phone;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(example = "john@email.com", description = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @Schema(description = "")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User robotID1(Robot robotID1) {
    this.robotID1 = robotID1;
    return this;
  }

  /**
   * Get robotID1
   * @return robotID1
   **/
  @Schema(description = "")
  
    @Valid
    public Robot getRobotID1() {
    return robotID1;
  }

  public void setRobotID1(Robot robotID1) {
    this.robotID1 = robotID1;
  }

  public User robotID2(Robot robotID2) {
    this.robotID2 = robotID2;
    return this;
  }

  /**
   * Get robotID2
   * @return robotID2
   **/
  @Schema(description = "")
  
    @Valid
    public Robot getRobotID2() {
    return robotID2;
  }

  public void setRobotID2(Robot robotID2) {
    this.robotID2 = robotID2;
  }

  public User robotID3(Robot robotID3) {
    this.robotID3 = robotID3;
    return this;
  }

  /**
   * Get robotID3
   * @return robotID3
   **/
  @Schema(description = "")
  
    @Valid
    public Robot getRobotID3() {
    return robotID3;
  }

  public void setRobotID3(Robot robotID3) {
    this.robotID3 = robotID3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.city, user.city) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.robotID1, user.robotID1) &&
        Objects.equals(this.robotID2, user.robotID2) &&
        Objects.equals(this.robotID3, user.robotID3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, country, city, phone, email, password, robotID1, robotID2, robotID3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    robotID1: ").append(toIndentedString(robotID1)).append("\n");
    sb.append("    robotID2: ").append(toIndentedString(robotID2)).append("\n");
    sb.append("    robotID3: ").append(toIndentedString(robotID3)).append("\n");
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
