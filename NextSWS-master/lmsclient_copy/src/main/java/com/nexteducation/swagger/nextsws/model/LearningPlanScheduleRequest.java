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
 * LearningPlanScheduleRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class LearningPlanScheduleRequest   {
  @SerializedName("academicSession")
  private Long academicSession = null;

  @SerializedName("branch")
  private Long branch = null;

  @SerializedName("calendarEvent")
  private String calendarEvent = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  /**
   * Gets or Sets currentUserLevel
   */
  public enum CurrentUserLevelEnum {
    @SerializedName("Master")
    MASTER("Master"),
    
    @SerializedName("StudyClass")
    STUDYCLASS("StudyClass"),
    
    @SerializedName("Section")
    SECTION("Section");

    private String value;

    CurrentUserLevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("currentUserLevel")
  private CurrentUserLevelEnum currentUserLevel = null;

  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("learningPlanMemberUuid")
  private String learningPlanMemberUuid = null;

  @SerializedName("masterClass")
  private Long masterClass = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("sectionId")
  private Long sectionId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("Active")
    ACTIVE("Active"),
    
    @SerializedName("Inactive")
    INACTIVE("Inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("subjectId")
  private Long subjectId = null;

  @SerializedName("user")
  private Long user = null;

  @SerializedName("uuid")
  private String uuid = null;

  public LearningPlanScheduleRequest academicSession(Long academicSession) {
    this.academicSession = academicSession;
    return this;
  }

   /**
   * Get academicSession
   * @return academicSession
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAcademicSession() {
    return academicSession;
  }

  public void setAcademicSession(Long academicSession) {
    this.academicSession = academicSession;
  }

  public LearningPlanScheduleRequest branch(Long branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBranch() {
    return branch;
  }

  public void setBranch(Long branch) {
    this.branch = branch;
  }

  public LearningPlanScheduleRequest calendarEvent(String calendarEvent) {
    this.calendarEvent = calendarEvent;
    return this;
  }

   /**
   * Get calendarEvent
   * @return calendarEvent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCalendarEvent() {
    return calendarEvent;
  }

  public void setCalendarEvent(String calendarEvent) {
    this.calendarEvent = calendarEvent;
  }

  public LearningPlanScheduleRequest createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public LearningPlanScheduleRequest currentUserLevel(CurrentUserLevelEnum currentUserLevel) {
    this.currentUserLevel = currentUserLevel;
    return this;
  }

   /**
   * Get currentUserLevel
   * @return currentUserLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentUserLevelEnum getCurrentUserLevel() {
    return currentUserLevel;
  }

  public void setCurrentUserLevel(CurrentUserLevelEnum currentUserLevel) {
    this.currentUserLevel = currentUserLevel;
  }

  public LearningPlanScheduleRequest date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public LearningPlanScheduleRequest learningPlanMemberUuid(String learningPlanMemberUuid) {
    this.learningPlanMemberUuid = learningPlanMemberUuid;
    return this;
  }

   /**
   * Get learningPlanMemberUuid
   * @return learningPlanMemberUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLearningPlanMemberUuid() {
    return learningPlanMemberUuid;
  }

  public void setLearningPlanMemberUuid(String learningPlanMemberUuid) {
    this.learningPlanMemberUuid = learningPlanMemberUuid;
  }

  public LearningPlanScheduleRequest masterClass(Long masterClass) {
    this.masterClass = masterClass;
    return this;
  }

   /**
   * Get masterClass
   * @return masterClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMasterClass() {
    return masterClass;
  }

  public void setMasterClass(Long masterClass) {
    this.masterClass = masterClass;
  }

  public LearningPlanScheduleRequest modifiedBy(Long modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Long modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public LearningPlanScheduleRequest sectionId(Long sectionId) {
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Get sectionId
   * @return sectionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSectionId() {
    return sectionId;
  }

  public void setSectionId(Long sectionId) {
    this.sectionId = sectionId;
  }

  public LearningPlanScheduleRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public LearningPlanScheduleRequest subjectId(Long subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Long subjectId) {
    this.subjectId = subjectId;
  }

  public LearningPlanScheduleRequest user(Long user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUser() {
    return user;
  }

  public void setUser(Long user) {
    this.user = user;
  }

  public LearningPlanScheduleRequest uuid(String uuid) {
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
    LearningPlanScheduleRequest learningPlanScheduleRequest = (LearningPlanScheduleRequest) o;
    return Objects.equals(this.academicSession, learningPlanScheduleRequest.academicSession) &&
        Objects.equals(this.branch, learningPlanScheduleRequest.branch) &&
        Objects.equals(this.calendarEvent, learningPlanScheduleRequest.calendarEvent) &&
        Objects.equals(this.createdBy, learningPlanScheduleRequest.createdBy) &&
        Objects.equals(this.currentUserLevel, learningPlanScheduleRequest.currentUserLevel) &&
        Objects.equals(this.date, learningPlanScheduleRequest.date) &&
        Objects.equals(this.learningPlanMemberUuid, learningPlanScheduleRequest.learningPlanMemberUuid) &&
        Objects.equals(this.masterClass, learningPlanScheduleRequest.masterClass) &&
        Objects.equals(this.modifiedBy, learningPlanScheduleRequest.modifiedBy) &&
        Objects.equals(this.sectionId, learningPlanScheduleRequest.sectionId) &&
        Objects.equals(this.status, learningPlanScheduleRequest.status) &&
        Objects.equals(this.subjectId, learningPlanScheduleRequest.subjectId) &&
        Objects.equals(this.user, learningPlanScheduleRequest.user) &&
        Objects.equals(this.uuid, learningPlanScheduleRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicSession, branch, calendarEvent, createdBy, currentUserLevel, date, learningPlanMemberUuid, masterClass, modifiedBy, sectionId, status, subjectId, user, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningPlanScheduleRequest {\n");
    
    sb.append("    academicSession: ").append(toIndentedString(academicSession)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    calendarEvent: ").append(toIndentedString(calendarEvent)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    currentUserLevel: ").append(toIndentedString(currentUserLevel)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    learningPlanMemberUuid: ").append(toIndentedString(learningPlanMemberUuid)).append("\n");
    sb.append("    masterClass: ").append(toIndentedString(masterClass)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

