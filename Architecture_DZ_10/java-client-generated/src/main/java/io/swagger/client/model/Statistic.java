/*
 * Cloud service for robot-vacuum cleaner
 * This is a study project considering server based on the OpenAPI 3.0 specification.  You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.
 *
 * OpenAPI spec version: 0.0.2
 * Contact: kardan97@yandex.ru
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Timetable;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Statistic
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-12-09T12:21:03.478Z[GMT]")
public class Statistic {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("timetableID")
  private Timetable timetableID = null;

  @SerializedName("resultID")
  private String resultID = null;

  public Statistic id(Long id) {
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

  public Statistic timetableID(Timetable timetableID) {
    this.timetableID = timetableID;
    return this;
  }

   /**
   * Get timetableID
   * @return timetableID
  **/
  @Schema(description = "")
  public Timetable getTimetableID() {
    return timetableID;
  }

  public void setTimetableID(Timetable timetableID) {
    this.timetableID = timetableID;
  }

  public Statistic resultID(String resultID) {
    this.resultID = resultID;
    return this;
  }

   /**
   * Get resultID
   * @return resultID
  **/
  @Schema(description = "")
  public String getResultID() {
    return resultID;
  }

  public void setResultID(String resultID) {
    this.resultID = resultID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statistic statistic = (Statistic) o;
    return Objects.equals(this.id, statistic.id) &&
        Objects.equals(this.timetableID, statistic.timetableID) &&
        Objects.equals(this.resultID, statistic.resultID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timetableID, resultID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timetableID: ").append(toIndentedString(timetableID)).append("\n");
    sb.append("    resultID: ").append(toIndentedString(resultID)).append("\n");
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