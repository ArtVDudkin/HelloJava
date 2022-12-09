package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Timetable;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Statistic
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-09T12:22:10.559Z[GMT]")


public class Statistic   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("timetableID")
  private Timetable timetableID = null;

  @JsonProperty("resultID")
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
  
    @Valid
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
