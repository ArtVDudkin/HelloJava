package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Room
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-09T12:22:10.559Z[GMT]")


public class Room   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("roomname")
  private String roomname = null;

  @JsonProperty("roomsquare")
  private String roomsquare = null;

  public Room id(Long id) {
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

  public Room roomname(String roomname) {
    this.roomname = roomname;
    return this;
  }

  /**
   * Get roomname
   * @return roomname
   **/
  @Schema(description = "")
  
    public String getRoomname() {
    return roomname;
  }

  public void setRoomname(String roomname) {
    this.roomname = roomname;
  }

  public Room roomsquare(String roomsquare) {
    this.roomsquare = roomsquare;
    return this;
  }

  /**
   * Get roomsquare
   * @return roomsquare
   **/
  @Schema(description = "")
  
    public String getRoomsquare() {
    return roomsquare;
  }

  public void setRoomsquare(String roomsquare) {
    this.roomsquare = roomsquare;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return Objects.equals(this.id, room.id) &&
        Objects.equals(this.roomname, room.roomname) &&
        Objects.equals(this.roomsquare, room.roomsquare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roomname, roomsquare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Room {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roomname: ").append(toIndentedString(roomname)).append("\n");
    sb.append("    roomsquare: ").append(toIndentedString(roomsquare)).append("\n");
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
