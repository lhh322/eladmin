package me.zhengjie.modules.system.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchArticleResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-27T14:15:01.243014296Z[GMT]")


public class SearchArticleResponse extends BaseResponse  {
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

  @JsonProperty("articleList")
  @Valid
  private List<ArticleListTableItem> articleList = null;

  public SearchArticleResponse last(Boolean last) { 

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

  public SearchArticleResponse totalElements(Integer totalElements) { 

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

  public SearchArticleResponse totalPages(Integer totalPages) { 

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

  public SearchArticleResponse size(Integer size) { 

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

  public SearchArticleResponse number(Integer number) { 

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

  public SearchArticleResponse sort(Sort sort) { 

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

  public SearchArticleResponse first(Boolean first) { 

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

  public SearchArticleResponse numberOfElements(Integer numberOfElements) { 

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

  public SearchArticleResponse empty(Boolean empty) { 

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

  public SearchArticleResponse articleList(List<ArticleListTableItem> articleList) { 

    this.articleList = articleList;
    return this;
  }

  public SearchArticleResponse addArticleListItem(ArticleListTableItem articleListItem) {
    if (this.articleList == null) {
      this.articleList = new ArrayList<ArticleListTableItem>();
    }
    this.articleList.add(articleListItem);
    return this;
  }

  /**
   * Get articleList
   * @return articleList
   **/
  
  @Schema(description = "")
  @Valid
  public List<ArticleListTableItem> getArticleList() {  
    return articleList;
  }



  public void setArticleList(List<ArticleListTableItem> articleList) { 
    this.articleList = articleList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchArticleResponse searchArticleResponse = (SearchArticleResponse) o;
    return Objects.equals(this.last, searchArticleResponse.last) &&
        Objects.equals(this.totalElements, searchArticleResponse.totalElements) &&
        Objects.equals(this.totalPages, searchArticleResponse.totalPages) &&
        Objects.equals(this.size, searchArticleResponse.size) &&
        Objects.equals(this.number, searchArticleResponse.number) &&
        Objects.equals(this.sort, searchArticleResponse.sort) &&
        Objects.equals(this.first, searchArticleResponse.first) &&
        Objects.equals(this.numberOfElements, searchArticleResponse.numberOfElements) &&
        Objects.equals(this.empty, searchArticleResponse.empty) &&
        Objects.equals(this.articleList, searchArticleResponse.articleList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last, totalElements, totalPages, size, number, sort, first, numberOfElements, empty, articleList, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchArticleResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    articleList: ").append(toIndentedString(articleList)).append("\n");
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
