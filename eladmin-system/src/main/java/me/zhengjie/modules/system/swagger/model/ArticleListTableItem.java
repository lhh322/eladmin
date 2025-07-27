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
 * ArticleListTableItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-27T14:15:01.243014296Z[GMT]")


public class ArticleListTableItem   {
  @JsonProperty("title")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String title = null;

  @JsonProperty("author")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String author = null;

  @JsonProperty("category")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String category = null;

  @JsonProperty("label")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String label = null;

  @JsonProperty("recommend")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String recommend = null;

  @JsonProperty("sticky")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String sticky = null;

  @JsonProperty("reading")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer reading = null;

  @JsonProperty("createTime")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String createTime = null;


  public ArticleListTableItem title(String title) { 

    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  
  @Schema(description = "")
  
  public String getTitle() {  
    return title;
  }



  public void setTitle(String title) { 
    this.title = title;
  }

  public ArticleListTableItem author(String author) { 

    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   **/
  
  @Schema(description = "")
  
  public String getAuthor() {  
    return author;
  }



  public void setAuthor(String author) { 
    this.author = author;
  }

  public ArticleListTableItem category(String category) { 

    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  
  @Schema(description = "")
  
  public String getCategory() {  
    return category;
  }



  public void setCategory(String category) { 
    this.category = category;
  }

  public ArticleListTableItem label(String label) { 

    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   **/
  
  @Schema(description = "")
  
  public String getLabel() {  
    return label;
  }



  public void setLabel(String label) { 
    this.label = label;
  }

  public ArticleListTableItem recommend(String recommend) { 

    this.recommend = recommend;
    return this;
  }

  /**
   * Get recommend
   * @return recommend
   **/
  
  @Schema(description = "")
  
  public String getRecommend() {  
    return recommend;
  }



  public void setRecommend(String recommend) { 
    this.recommend = recommend;
  }

  public ArticleListTableItem sticky(String sticky) { 

    this.sticky = sticky;
    return this;
  }

  /**
   * Get sticky
   * @return sticky
   **/
  
  @Schema(description = "")
  
  public String getSticky() {  
    return sticky;
  }



  public void setSticky(String sticky) { 
    this.sticky = sticky;
  }

  public ArticleListTableItem reading(Integer reading) { 

    this.reading = reading;
    return this;
  }

  /**
   * Get reading
   * @return reading
   **/
  
  @Schema(description = "")
  
  public Integer getReading() {  
    return reading;
  }



  public void setReading(Integer reading) { 
    this.reading = reading;
  }

  public ArticleListTableItem createTime(String createTime) { 

    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
   **/
  
  @Schema(description = "")
  
  public String getCreateTime() {  
    return createTime;
  }



  public void setCreateTime(String createTime) { 
    this.createTime = createTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleListTableItem articleListTableItem = (ArticleListTableItem) o;
    return Objects.equals(this.title, articleListTableItem.title) &&
        Objects.equals(this.author, articleListTableItem.author) &&
        Objects.equals(this.category, articleListTableItem.category) &&
        Objects.equals(this.label, articleListTableItem.label) &&
        Objects.equals(this.recommend, articleListTableItem.recommend) &&
        Objects.equals(this.sticky, articleListTableItem.sticky) &&
        Objects.equals(this.reading, articleListTableItem.reading) &&
        Objects.equals(this.createTime, articleListTableItem.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, author, category, label, recommend, sticky, reading, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleListTableItem {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
    sb.append("    sticky: ").append(toIndentedString(sticky)).append("\n");
    sb.append("    reading: ").append(toIndentedString(reading)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
