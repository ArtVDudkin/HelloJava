package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Result;
import io.swagger.model.Room;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Timetable
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-09T12:22:10.559Z[GMT]")


public class Timetable   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("datetime")
  private OffsetDateTime datetime = null;

  @JsonProperty("roomID")
  private Room roomID = null;

  @JsonProperty("resultID")
  private Result resultID = null;

  public Timetable id(Long id) {
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

  public Timetable datetime(OffsetDateTime datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Get datetime
   * @return datetime
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getDatetime() {
    return datetime;
  }

  public void setDatetime(OffsetDateTime datetime) {
    this.datetime = datetime;
  }

  public Timetable roomID(Room roomID) {
    this.roomID = roomID;
    return this;
  }

  /**
   * Get roomID
   * @return roomID
   **/
  @Schema(description = "")
  
    @Valid
    public Room getRoomID() {
    return roomID;
  }

  public void setRoomID(Room roomID) {
    this.roomID = roomID;
  }

  public Timetable resultID(Result resultID) {
    this.resultID = resultID;
    return this;
  }

  /**
   * Get resultID
   * @return resultID
   **/
  @Schema(description = "")
  
    @Valid
    public Result getResultID() {
    return resultID;
  }

  public void setResultID(Result resultID) {
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
    Timetable timetable = (Timetable) o;
    return Objects.equals(this.id, timetable.id) &&
        Objects.equals(this.datetime, timetable.datetime) &&
        Objects.equals(this.roomID, timetable.roomID) &&
        Objects.equals(this.resultID, timetable.resultID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, datetime, roomID, resultID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timetable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    roomID: ").append(toIndentedString(roomID)).append("\n");
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
