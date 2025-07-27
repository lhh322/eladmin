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
 * Page
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-27T14:15:01.243014296Z[GMT]")


public class Page   {
  @JsonProperty("sort")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Sort sort = null;

  @JsonProperty("offset")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer offset = null;

  @JsonProperty("pageSize")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer pageSize = null;

  @JsonProperty("pageNumber")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer pageNumber = null;

  @JsonProperty("unpaged")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer unpaged = null;

  @JsonProperty("paged")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer paged = null;


  public Page sort(Sort sort) { 

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

  public Page offset(Integer offset) { 

    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   **/
  
  @Schema(description = "")
  
  public Integer getOffset() {  
    return offset;
  }



  public void setOffset(Integer offset) { 
    this.offset = offset;
  }

  public Page pageSize(Integer pageSize) { 

    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   **/
  
  @Schema(description = "")
  
  public Integer getPageSize() {  
    return pageSize;
  }



  public void setPageSize(Integer pageSize) { 
    this.pageSize = pageSize;
  }

  public Page pageNumber(Integer pageNumber) { 

    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
   **/
  
  @Schema(description = "")
  
  public Integer getPageNumber() {  
    return pageNumber;
  }



  public void setPageNumber(Integer pageNumber) { 
    this.pageNumber = pageNumber;
  }

  public Page unpaged(Integer unpaged) { 

    this.unpaged = unpaged;
    return this;
  }

  /**
   * Get unpaged
   * @return unpaged
   **/
  
  @Schema(description = "")
  
  public Integer getUnpaged() {  
    return unpaged;
  }



  public void setUnpaged(Integer unpaged) { 
    this.unpaged = unpaged;
  }

  public Page paged(Integer paged) { 

    this.paged = paged;
    return this;
  }

  /**
   * Get paged
   * @return paged
   **/
  
  @Schema(description = "")
  
  public Integer getPaged() {  
    return paged;
  }



  public void setPaged(Integer paged) { 
    this.paged = paged;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(this.sort, page.sort) &&
        Objects.equals(this.offset, page.offset) &&
        Objects.equals(this.pageSize, page.pageSize) &&
        Objects.equals(this.pageNumber, page.pageNumber) &&
        Objects.equals(this.unpaged, page.unpaged) &&
        Objects.equals(this.paged, page.paged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, offset, pageSize, pageNumber, unpaged, paged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    unpaged: ").append(toIndentedString(unpaged)).append("\n");
    sb.append("    paged: ").append(toIndentedString(paged)).append("\n");
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
