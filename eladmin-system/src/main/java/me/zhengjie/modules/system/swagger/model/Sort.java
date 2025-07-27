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
 * Sort
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-27T14:15:01.243014296Z[GMT]")


public class Sort   {
  @JsonProperty("sorted")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean sorted = null;

  @JsonProperty("unsorted")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean unsorted = null;

  @JsonProperty("empty")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean empty = null;


  public Sort sorted(Boolean sorted) { 

    this.sorted = sorted;
    return this;
  }

  /**
   * Get sorted
   * @return sorted
   **/
  
  @Schema(description = "")
  
  public Boolean isSorted() {  
    return sorted;
  }



  public void setSorted(Boolean sorted) { 
    this.sorted = sorted;
  }

  public Sort unsorted(Boolean unsorted) { 

    this.unsorted = unsorted;
    return this;
  }

  /**
   * Get unsorted
   * @return unsorted
   **/
  
  @Schema(description = "")
  
  public Boolean isUnsorted() {  
    return unsorted;
  }



  public void setUnsorted(Boolean unsorted) { 
    this.unsorted = unsorted;
  }

  public Sort empty(Boolean empty) { 

    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
   **/
  
  @Schema(description = "")
  
  public Boolean isEmpty() {  
    return empty;
  }



  public void setEmpty(Boolean empty) { 
    this.empty = empty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sort sort = (Sort) o;
    return Objects.equals(this.sorted, sort.sorted) &&
        Objects.equals(this.unsorted, sort.unsorted) &&
        Objects.equals(this.empty, sort.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorted, unsorted, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sort {\n");
    
    sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
    sb.append("    unsorted: ").append(toIndentedString(unsorted)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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
