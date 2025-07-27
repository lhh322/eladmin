package me.zhengjie.modules.system.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Sort;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PageableItem
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-27T14:15:01.243014296Z[GMT]")


public class PageableItem   {
  @JsonProperty("last")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean last = null;

  @JsonProperty("totalElements")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer totalElements = null;

  @JsonProperty("totalPages")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer totalPages = null;

  @JsonProperty("size")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer size = null;

  @JsonProperty("number")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer number = null;

  @JsonProperty("sort")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Sort sort = null;

  @JsonProperty("first")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean first = null;

  @JsonProperty("numberOfElements")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer numberOfElements = null;

  @JsonProperty("empty")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean empty = null;


  public PageableItem last(Boolean last) { 

    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
   **/
  
  @Schema(description = "")
  
  public Boolean isLast() {  
    return last;
  }



  public void setLast(Boolean last) { 
    this.last = last;
  }

  public PageableItem totalElements(Integer totalElements) { 

    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
   **/
  
  @Schema(description = "")
  
  public Integer getTotalElements() {  
    return totalElements;
  }



  public void setTotalElements(Integer totalElements) { 
    this.totalElements = totalElements;
  }

  public PageableItem totalPages(Integer totalPages) { 

    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
   **/
  
  @Schema(description = "")
  
  public Integer getTotalPages() {  
    return totalPages;
  }



  public void setTotalPages(Integer totalPages) { 
    this.totalPages = totalPages;
  }

  public PageableItem size(Integer size) { 

    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   **/
  
  @Schema(description = "")
  
  public Integer getSize() {  
    return size;
  }



  public void setSize(Integer size) { 
    this.size = size;
  }

  public PageableItem number(Integer number) { 

    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   **/
  
  @Schema(description = "")
  
  public Integer getNumber() {  
    return number;
  }



  public void setNumber(Integer number) { 
    this.number = number;
  }

  public PageableItem sort(Sort sort) { 

    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
   **/
  
  @Schema(description = "")
  
@Valid
  public Sort getSort() {  
    return sort;
  }



  public void setSort(Sort sort) { 
    this.sort = sort;
  }

  public PageableItem first(Boolean first) { 

    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
   **/
  
  @Schema(description = "")
  
  public Boolean isFirst() {  
    return first;
  }



  public void setFirst(Boolean first) { 
    this.first = first;
  }

  public PageableItem numberOfElements(Integer numberOfElements) { 

    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Get numberOfElements
   * @return numberOfElements
   **/
  
  @Schema(description = "")
  
  public Integer getNumberOfElements() {  
    return numberOfElements;
  }



  public void setNumberOfElements(Integer numberOfElements) { 
    this.numberOfElements = numberOfElements;
  }

  public PageableItem empty(Boolean empty) { 

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
    PageableItem pageableItem = (PageableItem) o;
    return Objects.equals(this.last, pageableItem.last) &&
        Objects.equals(this.totalElements, pageableItem.totalElements) &&
        Objects.equals(this.totalPages, pageableItem.totalPages) &&
        Objects.equals(this.size, pageableItem.size) &&
        Objects.equals(this.number, pageableItem.number) &&
        Objects.equals(this.sort, pageableItem.sort) &&
        Objects.equals(this.first, pageableItem.first) &&
        Objects.equals(this.numberOfElements, pageableItem.numberOfElements) &&
        Objects.equals(this.empty, pageableItem.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last, totalElements, totalPages, size, number, sort, first, numberOfElements, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableItem {\n");
    
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
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
