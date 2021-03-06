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
 * TaskResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class TaskResponse   {
  @SerializedName("description")
  private String description = null;

  @SerializedName("dueDate")
  private DateTime dueDate = null;

  @SerializedName("parentUuid")
  private String parentUuid = null;

  @SerializedName("refId")
  private String refId = null;

  @SerializedName("refType")
  private String refType = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("taskStatus")
  private String taskStatus = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("uuid")
  private String uuid = null;

  public TaskResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskResponse dueDate(DateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(DateTime dueDate) {
    this.dueDate = dueDate;
  }

  public TaskResponse parentUuid(String parentUuid) {
    this.parentUuid = parentUuid;
    return this;
  }

   /**
   * Get parentUuid
   * @return parentUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentUuid() {
    return parentUuid;
  }

  public void setParentUuid(String parentUuid) {
    this.parentUuid = parentUuid;
  }

  public TaskResponse refId(String refId) {
    this.refId = refId;
    return this;
  }

   /**
   * Get refId
   * @return refId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public TaskResponse refType(String refType) {
    this.refType = refType;
    return this;
  }

   /**
   * Get refType
   * @return refType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRefType() {
    return refType;
  }

  public void setRefType(String refType) {
    this.refType = refType;
  }

  public TaskResponse status(String status) {
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

  public TaskResponse taskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

   /**
   * Get taskStatus
   * @return taskStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }

  public TaskResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TaskResponse type(String type) {
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

  public TaskResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public TaskResponse uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskResponse taskResponse = (TaskResponse) o;
    return Objects.equals(this.description, taskResponse.description) &&
        Objects.equals(this.dueDate, taskResponse.dueDate) &&
        Objects.equals(this.parentUuid, taskResponse.parentUuid) &&
        Objects.equals(this.refId, taskResponse.refId) &&
        Objects.equals(this.refType, taskResponse.refType) &&
        Objects.equals(this.status, taskResponse.status) &&
        Objects.equals(this.taskStatus, taskResponse.taskStatus) &&
        Objects.equals(this.title, taskResponse.title) &&
        Objects.equals(this.type, taskResponse.type) &&
        Objects.equals(this.userId, taskResponse.userId) &&
        Objects.equals(this.uuid, taskResponse.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dueDate, parentUuid, refId, refType, status, taskStatus, title, type, userId, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskResponse {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    parentUuid: ").append(toIndentedString(parentUuid)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

