package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Disk;
import io.swagger.model.IP;
import io.swagger.model.OS;
import io.swagger.model.Processor;
import io.swagger.model.RAM;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-15T15:11:33.384Z[GMT]")


public class Specification   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("OS")
  private OS OS = null;

  @JsonProperty("Processor")
  private Processor processor = null;

  @JsonProperty("RAM")
  private RAM RAM = null;

  @JsonProperty("Disk")
  private Disk disk = null;

  @JsonProperty("IP")
  private IP IP = null;

  public Specification id(Integer id) {
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

  public Specification OS(OS OS) {
    this.OS = OS;
    return this;
  }

  /**
   * Get OS
   * @return OS
   **/
  @Schema(description = "")
  
    @Valid
    public OS getOS() {
    return OS;
  }

  public void setOS(OS OS) {
    this.OS = OS;
  }

  public Specification processor(Processor processor) {
    this.processor = processor;
    return this;
  }

  /**
   * Get processor
   * @return processor
   **/
  @Schema(description = "")
  
    @Valid
    public Processor getProcessor() {
    return processor;
  }

  public void setProcessor(Processor processor) {
    this.processor = processor;
  }

  public Specification RAM(RAM RAM) {
    this.RAM = RAM;
    return this;
  }

  /**
   * Get RAM
   * @return RAM
   **/
  @Schema(description = "")
  
    @Valid
    public RAM getRAM() {
    return RAM;
  }

  public void setRAM(RAM RAM) {
    this.RAM = RAM;
  }

  public Specification disk(Disk disk) {
    this.disk = disk;
    return this;
  }

  /**
   * Get disk
   * @return disk
   **/
  @Schema(description = "")
  
    @Valid
    public Disk getDisk() {
    return disk;
  }

  public void setDisk(Disk disk) {
    this.disk = disk;
  }

  public Specification IP(IP IP) {
    this.IP = IP;
    return this;
  }

  /**
   * Get IP
   * @return IP
   **/
  @Schema(description = "")
  
    @Valid
    public IP getIP() {
    return IP;
  }

  public void setIP(IP IP) {
    this.IP = IP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Specification specification = (Specification) o;
    return Objects.equals(this.id, specification.id) &&
        Objects.equals(this.OS, specification.OS) &&
        Objects.equals(this.processor, specification.processor) &&
        Objects.equals(this.RAM, specification.RAM) &&
        Objects.equals(this.disk, specification.disk) &&
        Objects.equals(this.IP, specification.IP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, OS, processor, RAM, disk, IP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Specification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    RAM: ").append(toIndentedString(RAM)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
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
