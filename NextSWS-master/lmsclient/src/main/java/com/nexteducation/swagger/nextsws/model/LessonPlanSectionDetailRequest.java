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
import com.nexteducation.swagger.nextsws.model.LessonPlanRequest;
import com.nexteducation.swagger.nextsws.model.LessonPlanSectionRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * LessonPlanSectionDetailRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class LessonPlanSectionDetailRequest   {
  @SerializedName("branch")
  private Long branch = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  @SerializedName("lessonPlan")
  private LessonPlanRequest lessonPlan = null;

  @SerializedName("lessonPlanSectionUuid")
  private String lessonPlanSectionUuid = null;

  @SerializedName("lessonPlanUuid")
  private String lessonPlanUuid = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("modifiedOn")
  private DateTime modifiedOn = null;

  @SerializedName("section")
  private LessonPlanSectionRequest section = null;

  @SerializedName("sectionData")
  private String sectionData = null;

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

  @SerializedName("uuid")
  private String uuid = null;

  public LessonPlanSectionDetailRequest branch(Long branch) {
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

  public LessonPlanSectionDetailRequest createdBy(Long createdBy) {
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

  public LessonPlanSectionDetailRequest createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public LessonPlanSectionDetailRequest lessonPlan(LessonPlanRequest lessonPlan) {
    this.lessonPlan = lessonPlan;
    return this;
  }

   /**
   * Get lessonPlan
   * @return lessonPlan
  **/
  @ApiModelProperty(example = "null", value = "")
  public LessonPlanRequest getLessonPlan() {
    return lessonPlan;
  }

  public void setLessonPlan(LessonPlanRequest lessonPlan) {
    this.lessonPlan = lessonPlan;
  }

  public LessonPlanSectionDetailRequest lessonPlanSectionUuid(String lessonPlanSectionUuid) {
    this.lessonPlanSectionUuid = lessonPlanSectionUuid;
    return this;
  }

   /**
   * Get lessonPlanSectionUuid
   * @return lessonPlanSectionUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLessonPlanSectionUuid() {
    return lessonPlanSectionUuid;
  }

  public void setLessonPlanSectionUuid(String lessonPlanSectionUuid) {
    this.lessonPlanSectionUuid = lessonPlanSectionUuid;
  }

  public LessonPlanSectionDetailRequest lessonPlanUuid(String lessonPlanUuid) {
    this.lessonPlanUuid = lessonPlanUuid;
    return this;
  }

   /**
   * Get lessonPlanUuid
   * @return lessonPlanUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLessonPlanUuid() {
    return lessonPlanUuid;
  }

  public void setLessonPlanUuid(String lessonPlanUuid) {
    this.lessonPlanUuid = lessonPlanUuid;
  }

  public LessonPlanSectionDetailRequest modifiedBy(Long modifiedBy) {
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

  public LessonPlanSectionDetailRequest modifiedOn(DateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(DateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public LessonPlanSectionDetailRequest section(LessonPlanSectionRequest section) {
    this.section = section;
    return this;
  }

   /**
   * Get section
   * @return section
  **/
  @ApiModelProperty(example = "null", value = "")
  public LessonPlanSectionRequest getSection() {
    return section;
  }

  public void setSection(LessonPlanSectionRequest section) {
    this.section = section;
  }

  public LessonPlanSectionDetailRequest sectionData(String sectionData) {
    this.sectionData = sectionData;
    return this;
  }

   /**
   * Get sectionData
   * @return sectionData
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSectionData() {
    return sectionData;
  }

  public void setSectionData(String sectionData) {
    this.sectionData = sectionData;
  }

  public LessonPlanSectionDetailRequest status(StatusEnum status) {
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

  public LessonPlanSectionDetailRequest uuid(String uuid) {
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
    LessonPlanSectionDetailRequest lessonPlanSectionDetailRequest = (LessonPlanSectionDetailRequest) o;
    return Objects.equals(this.branch, lessonPlanSectionDetailRequest.branch) &&
        Objects.equals(this.createdBy, lessonPlanSectionDetailRequest.createdBy) &&
        Objects.equals(this.createdOn, lessonPlanSectionDetailRequest.createdOn) &&
        Objects.equals(this.lessonPlan, lessonPlanSectionDetailRequest.lessonPlan) &&
        Objects.equals(this.lessonPlanSectionUuid, lessonPlanSectionDetailRequest.lessonPlanSectionUuid) &&
        Objects.equals(this.lessonPlanUuid, lessonPlanSectionDetailRequest.lessonPlanUuid) &&
        Objects.equals(this.modifiedBy, lessonPlanSectionDetailRequest.modifiedBy) &&
        Objects.equals(this.modifiedOn, lessonPlanSectionDetailRequest.modifiedOn) &&
        Objects.equals(this.section, lessonPlanSectionDetailRequest.section) &&
        Objects.equals(this.sectionData, lessonPlanSectionDetailRequest.sectionData) &&
        Objects.equals(this.status, lessonPlanSectionDetailRequest.status) &&
        Objects.equals(this.uuid, lessonPlanSectionDetailRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, createdBy, createdOn, lessonPlan, lessonPlanSectionUuid, lessonPlanUuid, modifiedBy, modifiedOn, section, sectionData, status, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LessonPlanSectionDetailRequest {\n");
    
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    lessonPlan: ").append(toIndentedString(lessonPlan)).append("\n");
    sb.append("    lessonPlanSectionUuid: ").append(toIndentedString(lessonPlanSectionUuid)).append("\n");
    sb.append("    lessonPlanUuid: ").append(toIndentedString(lessonPlanUuid)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    sectionData: ").append(toIndentedString(sectionData)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

