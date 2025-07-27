package me.zhengjie.modules.system.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-27T14:15:01.243014296Z[GMT]")


public class ErrorResponse   {
  @JsonProperty("timestamp")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String timestamp = null;

  @JsonProperty("httpStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer httpStatus = null;

  @JsonProperty("error")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String error = null;

  @JsonProperty("code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String code = null;

  @JsonProperty("message")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String message = null;

  @JsonProperty("path")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String path = null;


  public ErrorResponse timestamp(String timestamp) { 

    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  
  @Schema(example = "2017-07-21 17:32:28", description = "")
  
  public String getTimestamp() {  
    return timestamp;
  }



  public void setTimestamp(String timestamp) { 
    this.timestamp = timestamp;
  }

  public ErrorResponse httpStatus(Integer httpStatus) { 

    this.httpStatus = httpStatus;
    return this;
  }

  /**
   * HTTP status code
   * @return httpStatus
   **/
  
  @Schema(example = "400", description = "HTTP status code")
  
  public Integer getHttpStatus() {  
    return httpStatus;
  }



  public void setHttpStatus(Integer httpStatus) { 
    this.httpStatus = httpStatus;
  }

  public ErrorResponse error(String error) { 

    this.error = error;
    return this;
  }

  /**
   * Error type
   * @return error
   **/
  
  @Schema(example = "Application Exception", description = "Error type")
  
  public String getError() {  
    return error;
  }



  public void setError(String error) { 
    this.error = error;
  }

  public ErrorResponse code(String code) { 

    this.code = code;
    return this;
  }

  /**
   * Error code (Defined by backend)
   * @return code
   **/
  
  @Schema(example = "APP0001", description = "Error code (Defined by backend)")
  
  public String getCode() {  
    return code;
  }



  public void setCode(String code) { 
    this.code = code;
  }

  public ErrorResponse message(String message) { 

    this.message = message;
    return this;
  }

  /**
   * Human readable error message
   * @return message
   **/
  
  @Schema(example = "User not logged in", description = "Human readable error message")
  
  public String getMessage() {  
    return message;
  }



  public void setMessage(String message) { 
    this.message = message;
  }

  public ErrorResponse path(String path) { 

    this.path = path;
    return this;
  }

  /**
   * API path name
   * @return path
   **/
  
  @Schema(example = "/training/courses", description = "API path name")
  
  public String getPath() {  
    return path;
  }



  public void setPath(String path) { 
    this.path = path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.timestamp, errorResponse.timestamp) &&
        Objects.equals(this.httpStatus, errorResponse.httpStatus) &&
        Objects.equals(this.error, errorResponse.error) &&
        Objects.equals(this.code, errorResponse.code) &&
        Objects.equals(this.message, errorResponse.message) &&
        Objects.equals(this.path, errorResponse.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, httpStatus, error, code, message, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
