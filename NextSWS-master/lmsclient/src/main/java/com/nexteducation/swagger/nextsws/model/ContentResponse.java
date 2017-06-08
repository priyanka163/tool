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
import com.nexteducation.swagger.nextsws.model.ExerciseQuestionResponse;
import com.nexteducation.swagger.nextsws.model.FileResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ContentResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class ContentResponse   {
  @SerializedName("contentId")
  private Long contentId = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("exerciseQuestionResponses")
  private List<ExerciseQuestionResponse> exerciseQuestionResponses = new ArrayList<ExerciseQuestionResponse>();

  @SerializedName("fileResponses")
  private List<FileResponse> fileResponses = new ArrayList<FileResponse>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("isVisibleInClient")
  private Boolean isVisibleInClient = null;

  @SerializedName("type")
  private String type = null;

  public ContentResponse contentId(Long contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * Get contentId
   * @return contentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getContentId() {
    return contentId;
  }

  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }

  public ContentResponse contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ContentResponse exerciseQuestionResponses(List<ExerciseQuestionResponse> exerciseQuestionResponses) {
    this.exerciseQuestionResponses = exerciseQuestionResponses;
    return this;
  }

  public ContentResponse addExerciseQuestionResponsesItem(ExerciseQuestionResponse exerciseQuestionResponsesItem) {
    this.exerciseQuestionResponses.add(exerciseQuestionResponsesItem);
    return this;
  }

   /**
   * Get exerciseQuestionResponses
   * @return exerciseQuestionResponses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ExerciseQuestionResponse> getExerciseQuestionResponses() {
    return exerciseQuestionResponses;
  }

  public void setExerciseQuestionResponses(List<ExerciseQuestionResponse> exerciseQuestionResponses) {
    this.exerciseQuestionResponses = exerciseQuestionResponses;
  }

  public ContentResponse fileResponses(List<FileResponse> fileResponses) {
    this.fileResponses = fileResponses;
    return this;
  }

  public ContentResponse addFileResponsesItem(FileResponse fileResponsesItem) {
    this.fileResponses.add(fileResponsesItem);
    return this;
  }

   /**
   * Get fileResponses
   * @return fileResponses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FileResponse> getFileResponses() {
    return fileResponses;
  }

  public void setFileResponses(List<FileResponse> fileResponses) {
    this.fileResponses = fileResponses;
  }

  public ContentResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ContentResponse isVisibleInClient(Boolean isVisibleInClient) {
    this.isVisibleInClient = isVisibleInClient;
    return this;
  }

   /**
   * Get isVisibleInClient
   * @return isVisibleInClient
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsVisibleInClient() {
    return isVisibleInClient;
  }

  public void setIsVisibleInClient(Boolean isVisibleInClient) {
    this.isVisibleInClient = isVisibleInClient;
  }

  public ContentResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentResponse contentResponse = (ContentResponse) o;
    return Objects.equals(this.contentId, contentResponse.contentId) &&
        Objects.equals(this.contentType, contentResponse.contentType) &&
        Objects.equals(this.exerciseQuestionResponses, contentResponse.exerciseQuestionResponses) &&
        Objects.equals(this.fileResponses, contentResponse.fileResponses) &&
        Objects.equals(this.id, contentResponse.id) &&
        Objects.equals(this.isVisibleInClient, contentResponse.isVisibleInClient) &&
        Objects.equals(this.type, contentResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, contentType, exerciseQuestionResponses, fileResponses, id, isVisibleInClient, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentResponse {\n");
    
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    exerciseQuestionResponses: ").append(toIndentedString(exerciseQuestionResponses)).append("\n");
    sb.append("    fileResponses: ").append(toIndentedString(fileResponses)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isVisibleInClient: ").append(toIndentedString(isVisibleInClient)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

