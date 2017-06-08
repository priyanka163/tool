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
import com.nexteducation.swagger.nextsws.model.MGSContentResponse;
import com.nexteducation.swagger.nextsws.model.MGSSlideResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * MGSContentSectionResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class MGSContentSectionResponse   {
  @SerializedName("contentResponses")
  private List<MGSContentResponse> contentResponses = new ArrayList<MGSContentResponse>();

  @SerializedName("contentSectionId")
  private Long contentSectionId = null;

  @SerializedName("questionCount")
  private Long questionCount = null;

  @SerializedName("sectionType")
  private String sectionType = null;

  @SerializedName("sectionTypeOrdinal")
  private Integer sectionTypeOrdinal = null;

  @SerializedName("slideResponses")
  private List<MGSSlideResponse> slideResponses = new ArrayList<MGSSlideResponse>();

  @SerializedName("status")
  private String status = null;

  @SerializedName("statusOrdinal")
  private Integer statusOrdinal = null;

  @SerializedName("visibleInClient")
  private Boolean visibleInClient = null;

  public MGSContentSectionResponse contentResponses(List<MGSContentResponse> contentResponses) {
    this.contentResponses = contentResponses;
    return this;
  }

  public MGSContentSectionResponse addContentResponsesItem(MGSContentResponse contentResponsesItem) {
    this.contentResponses.add(contentResponsesItem);
    return this;
  }

   /**
   * Get contentResponses
   * @return contentResponses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MGSContentResponse> getContentResponses() {
    return contentResponses;
  }

  public void setContentResponses(List<MGSContentResponse> contentResponses) {
    this.contentResponses = contentResponses;
  }

  public MGSContentSectionResponse contentSectionId(Long contentSectionId) {
    this.contentSectionId = contentSectionId;
    return this;
  }

   /**
   * Get contentSectionId
   * @return contentSectionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getContentSectionId() {
    return contentSectionId;
  }

  public void setContentSectionId(Long contentSectionId) {
    this.contentSectionId = contentSectionId;
  }

  public MGSContentSectionResponse questionCount(Long questionCount) {
    this.questionCount = questionCount;
    return this;
  }

   /**
   * Get questionCount
   * @return questionCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getQuestionCount() {
    return questionCount;
  }

  public void setQuestionCount(Long questionCount) {
    this.questionCount = questionCount;
  }

  public MGSContentSectionResponse sectionType(String sectionType) {
    this.sectionType = sectionType;
    return this;
  }

   /**
   * Get sectionType
   * @return sectionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSectionType() {
    return sectionType;
  }

  public void setSectionType(String sectionType) {
    this.sectionType = sectionType;
  }

  public MGSContentSectionResponse sectionTypeOrdinal(Integer sectionTypeOrdinal) {
    this.sectionTypeOrdinal = sectionTypeOrdinal;
    return this;
  }

   /**
   * Get sectionTypeOrdinal
   * @return sectionTypeOrdinal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSectionTypeOrdinal() {
    return sectionTypeOrdinal;
  }

  public void setSectionTypeOrdinal(Integer sectionTypeOrdinal) {
    this.sectionTypeOrdinal = sectionTypeOrdinal;
  }

  public MGSContentSectionResponse slideResponses(List<MGSSlideResponse> slideResponses) {
    this.slideResponses = slideResponses;
    return this;
  }

  public MGSContentSectionResponse addSlideResponsesItem(MGSSlideResponse slideResponsesItem) {
    this.slideResponses.add(slideResponsesItem);
    return this;
  }

   /**
   * Get slideResponses
   * @return slideResponses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MGSSlideResponse> getSlideResponses() {
    return slideResponses;
  }

  public void setSlideResponses(List<MGSSlideResponse> slideResponses) {
    this.slideResponses = slideResponses;
  }

  public MGSContentSectionResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MGSContentSectionResponse statusOrdinal(Integer statusOrdinal) {
    this.statusOrdinal = statusOrdinal;
    return this;
  }

   /**
   * Get statusOrdinal
   * @return statusOrdinal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStatusOrdinal() {
    return statusOrdinal;
  }

  public void setStatusOrdinal(Integer statusOrdinal) {
    this.statusOrdinal = statusOrdinal;
  }

  public MGSContentSectionResponse visibleInClient(Boolean visibleInClient) {
    this.visibleInClient = visibleInClient;
    return this;
  }

   /**
   * Get visibleInClient
   * @return visibleInClient
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVisibleInClient() {
    return visibleInClient;
  }

  public void setVisibleInClient(Boolean visibleInClient) {
    this.visibleInClient = visibleInClient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MGSContentSectionResponse mGSContentSectionResponse = (MGSContentSectionResponse) o;
    return Objects.equals(this.contentResponses, mGSContentSectionResponse.contentResponses) &&
        Objects.equals(this.contentSectionId, mGSContentSectionResponse.contentSectionId) &&
        Objects.equals(this.questionCount, mGSContentSectionResponse.questionCount) &&
        Objects.equals(this.sectionType, mGSContentSectionResponse.sectionType) &&
        Objects.equals(this.sectionTypeOrdinal, mGSContentSectionResponse.sectionTypeOrdinal) &&
        Objects.equals(this.slideResponses, mGSContentSectionResponse.slideResponses) &&
        Objects.equals(this.status, mGSContentSectionResponse.status) &&
        Objects.equals(this.statusOrdinal, mGSContentSectionResponse.statusOrdinal) &&
        Objects.equals(this.visibleInClient, mGSContentSectionResponse.visibleInClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentResponses, contentSectionId, questionCount, sectionType, sectionTypeOrdinal, slideResponses, status, statusOrdinal, visibleInClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MGSContentSectionResponse {\n");
    
    sb.append("    contentResponses: ").append(toIndentedString(contentResponses)).append("\n");
    sb.append("    contentSectionId: ").append(toIndentedString(contentSectionId)).append("\n");
    sb.append("    questionCount: ").append(toIndentedString(questionCount)).append("\n");
    sb.append("    sectionType: ").append(toIndentedString(sectionType)).append("\n");
    sb.append("    sectionTypeOrdinal: ").append(toIndentedString(sectionTypeOrdinal)).append("\n");
    sb.append("    slideResponses: ").append(toIndentedString(slideResponses)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusOrdinal: ").append(toIndentedString(statusOrdinal)).append("\n");
    sb.append("    visibleInClient: ").append(toIndentedString(visibleInClient)).append("\n");
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

