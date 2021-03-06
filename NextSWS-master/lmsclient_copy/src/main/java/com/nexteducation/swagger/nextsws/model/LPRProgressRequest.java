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
import com.nexteducation.swagger.nextsws.model.LearningPlanResourceRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * LPRProgressRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class LPRProgressRequest   {
  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  @SerializedName("learningPlanMemberUuid")
  private String learningPlanMemberUuid = null;

  @SerializedName("learningPlanResource")
  private LearningPlanResourceRequest learningPlanResource = null;

  @SerializedName("learningPlanResourceUuid")
  private String learningPlanResourceUuid = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("modifiedOn")
  private DateTime modifiedOn = null;

  @SerializedName("percentage")
  private Integer percentage = null;

  @SerializedName("sectionId")
  private Long sectionId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("Pending")
    PENDING("Pending"),
    
    @SerializedName("InProgess")
    INPROGESS("InProgess"),
    
    @SerializedName("Completed")
    COMPLETED("Completed");

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

  @SerializedName("user")
  private Long user = null;

  @SerializedName("uuid")
  private String uuid = null;

  public LPRProgressRequest createdBy(Long createdBy) {
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

  public LPRProgressRequest createdOn(DateTime createdOn) {
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

  public LPRProgressRequest learningPlanMemberUuid(String learningPlanMemberUuid) {
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

  public LPRProgressRequest learningPlanResource(LearningPlanResourceRequest learningPlanResource) {
    this.learningPlanResource = learningPlanResource;
    return this;
  }

   /**
   * Get learningPlanResource
   * @return learningPlanResource
  **/
  @ApiModelProperty(example = "null", value = "")
  public LearningPlanResourceRequest getLearningPlanResource() {
    return learningPlanResource;
  }

  public void setLearningPlanResource(LearningPlanResourceRequest learningPlanResource) {
    this.learningPlanResource = learningPlanResource;
  }

  public LPRProgressRequest learningPlanResourceUuid(String learningPlanResourceUuid) {
    this.learningPlanResourceUuid = learningPlanResourceUuid;
    return this;
  }

   /**
   * Get learningPlanResourceUuid
   * @return learningPlanResourceUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLearningPlanResourceUuid() {
    return learningPlanResourceUuid;
  }

  public void setLearningPlanResourceUuid(String learningPlanResourceUuid) {
    this.learningPlanResourceUuid = learningPlanResourceUuid;
  }

  public LPRProgressRequest modifiedBy(Long modifiedBy) {
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

  public LPRProgressRequest modifiedOn(DateTime modifiedOn) {
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

  public LPRProgressRequest percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  public LPRProgressRequest sectionId(Long sectionId) {
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

  public LPRProgressRequest status(StatusEnum status) {
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

  public LPRProgressRequest user(Long user) {
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

  public LPRProgressRequest uuid(String uuid) {
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
    LPRProgressRequest lPRProgressRequest = (LPRProgressRequest) o;
    return Objects.equals(this.createdBy, lPRProgressRequest.createdBy) &&
        Objects.equals(this.createdOn, lPRProgressRequest.createdOn) &&
        Objects.equals(this.learningPlanMemberUuid, lPRProgressRequest.learningPlanMemberUuid) &&
        Objects.equals(this.learningPlanResource, lPRProgressRequest.learningPlanResource) &&
        Objects.equals(this.learningPlanResourceUuid, lPRProgressRequest.learningPlanResourceUuid) &&
        Objects.equals(this.modifiedBy, lPRProgressRequest.modifiedBy) &&
        Objects.equals(this.modifiedOn, lPRProgressRequest.modifiedOn) &&
        Objects.equals(this.percentage, lPRProgressRequest.percentage) &&
        Objects.equals(this.sectionId, lPRProgressRequest.sectionId) &&
        Objects.equals(this.status, lPRProgressRequest.status) &&
        Objects.equals(this.user, lPRProgressRequest.user) &&
        Objects.equals(this.uuid, lPRProgressRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, learningPlanMemberUuid, learningPlanResource, learningPlanResourceUuid, modifiedBy, modifiedOn, percentage, sectionId, status, user, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LPRProgressRequest {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    learningPlanMemberUuid: ").append(toIndentedString(learningPlanMemberUuid)).append("\n");
    sb.append("    learningPlanResource: ").append(toIndentedString(learningPlanResource)).append("\n");
    sb.append("    learningPlanResourceUuid: ").append(toIndentedString(learningPlanResourceUuid)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

