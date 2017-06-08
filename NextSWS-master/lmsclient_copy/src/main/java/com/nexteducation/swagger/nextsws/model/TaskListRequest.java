/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.nexteducation.swagger.nextsws.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * TaskListRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class TaskListRequest   {
  @SerializedName("endDate")
  private DateTime endDate = null;

  @SerializedName("memberId")
  private Long memberId = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("resourceHelperId")
  private Long resourceHelperId = null;

  /**
   * Gets or Sets resourceType
   */
  public enum ResourceTypeEnum {
    @SerializedName("INSTITUTION")
    INSTITUTION("INSTITUTION"),
    
    @SerializedName("BRANCH")
    BRANCH("BRANCH"),
    
    @SerializedName("BUILDING")
    BUILDING("BUILDING"),
    
    @SerializedName("ROOM")
    ROOM("ROOM"),
    
    @SerializedName("DEPARTMENT")
    DEPARTMENT("DEPARTMENT"),
    
    @SerializedName("CLASS")
    CLASS("CLASS"),
    
    @SerializedName("SECTION")
    SECTION("SECTION"),
    
    @SerializedName("STAFF")
    STAFF("STAFF"),
    
    @SerializedName("STUDENT")
    STUDENT("STUDENT"),
    
    @SerializedName("PARENT")
    PARENT("PARENT"),
    
    @SerializedName("SUBJECT")
    SUBJECT("SUBJECT");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("resourceType")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("startDate")
  private DateTime startDate = null;

  public TaskListRequest endDate(DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(DateTime endDate) {
    this.endDate = endDate;
  }

  public TaskListRequest memberId(Long memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMemberId() {
    return memberId;
  }

  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }

  public TaskListRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public TaskListRequest resourceHelperId(Long resourceHelperId) {
    this.resourceHelperId = resourceHelperId;
    return this;
  }

   /**
   * Get resourceHelperId
   * @return resourceHelperId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getResourceHelperId() {
    return resourceHelperId;
  }

  public void setResourceHelperId(Long resourceHelperId) {
    this.resourceHelperId = resourceHelperId;
  }

  public TaskListRequest resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public TaskListRequest startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskListRequest taskListRequest = (TaskListRequest) o;
    return Objects.equals(this.endDate, taskListRequest.endDate) &&
        Objects.equals(this.memberId, taskListRequest.memberId) &&
        Objects.equals(this.pageNumber, taskListRequest.pageNumber) &&
        Objects.equals(this.resourceHelperId, taskListRequest.resourceHelperId) &&
        Objects.equals(this.resourceType, taskListRequest.resourceType) &&
        Objects.equals(this.startDate, taskListRequest.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, memberId, pageNumber, resourceHelperId, resourceType, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListRequest {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    resourceHelperId: ").append(toIndentedString(resourceHelperId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

