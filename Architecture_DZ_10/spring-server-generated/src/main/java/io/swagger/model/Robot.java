package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Model;
import io.swagger.model.Statistic;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Robot
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-09T12:22:10.559Z[GMT]")


public class Robot   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("serialNo")
  private String serialNo = null;

  @JsonProperty("model")
  private Model model = null;

  @JsonProperty("firmware")
  private String firmware = null;

  @JsonProperty("config")
  @Valid
  private List<String> config = null;

  @JsonProperty("diadnostic")
  @Valid
  private List<Integer> diadnostic = null;

  @JsonProperty("historyClean")
  private Statistic historyClean = null;

  /**
   * robot status in the store
   */
  public enum StatusEnum {
    READY("ready"),
    
    CHARGING("charging"),
    
    WORKING("working");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  public Robot id(Long id) {
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

  public Robot serialNo(String serialNo) {
    this.serialNo = serialNo;
    return this;
  }

  /**
   * Get serialNo
   * @return serialNo
   **/
  @Schema(description = "")
  
    public String getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }

  public Robot model(Model model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
  @Schema(description = "")
  
    @Valid
    public Model getModel() {
    return model;
  }

  public void setModel(Model model) {
    this.model = model;
  }

  public Robot firmware(String firmware) {
    this.firmware = firmware;
    return this;
  }

  /**
   * Get firmware
   * @return firmware
   **/
  @Schema(description = "")
  
    public String getFirmware() {
    return firmware;
  }

  public void setFirmware(String firmware) {
    this.firmware = firmware;
  }

  public Robot config(List<String> config) {
    this.config = config;
    return this;
  }

  public Robot addConfigItem(String configItem) {
    if (this.config == null) {
      this.config = new ArrayList<String>();
    }
    this.config.add(configItem);
    return this;
  }

  /**
   * Get config
   * @return config
   **/
  @Schema(description = "")
  
    public List<String> getConfig() {
    return config;
  }

  public void setConfig(List<String> config) {
    this.config = config;
  }

  public Robot diadnostic(List<Integer> diadnostic) {
    this.diadnostic = diadnostic;
    return this;
  }

  public Robot addDiadnosticItem(Integer diadnosticItem) {
    if (this.diadnostic == null) {
      this.diadnostic = new ArrayList<Integer>();
    }
    this.diadnostic.add(diadnosticItem);
    return this;
  }

  /**
   * Get diadnostic
   * @return diadnostic
   **/
  @Schema(description = "")
  
    public List<Integer> getDiadnostic() {
    return diadnostic;
  }

  public void setDiadnostic(List<Integer> diadnostic) {
    this.diadnostic = diadnostic;
  }

  public Robot historyClean(Statistic historyClean) {
    this.historyClean = historyClean;
    return this;
  }

  /**
   * Get historyClean
   * @return historyClean
   **/
  @Schema(description = "")
  
    @Valid
    public Statistic getHistoryClean() {
    return historyClean;
  }

  public void setHistoryClean(Statistic historyClean) {
    this.historyClean = historyClean;
  }

  public Robot status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * robot status in the store
   * @return status
   **/
  @Schema(description = "robot status in the store")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Robot robot = (Robot) o;
    return Objects.equals(this.id, robot.id) &&
        Objects.equals(this.serialNo, robot.serialNo) &&
        Objects.equals(this.model, robot.model) &&
        Objects.equals(this.firmware, robot.firmware) &&
        Objects.equals(this.config, robot.config) &&
        Objects.equals(this.diadnostic, robot.diadnostic) &&
        Objects.equals(this.historyClean, robot.historyClean) &&
        Objects.equals(this.status, robot.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serialNo, model, firmware, config, diadnostic, historyClean, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Robot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    diadnostic: ").append(toIndentedString(diadnostic)).append("\n");
    sb.append("    historyClean: ").append(toIndentedString(historyClean)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
