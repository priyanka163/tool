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
import com.nexteducation.swagger.nextsws.model.LearningPlanResourceResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanScheduleResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * LearningPlanMemberResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class LearningPlanMemberResponse   {
  @SerializedName("academicSession")
  private Long academicSession = null;

  @SerializedName("branch")
  private Long branch = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  @SerializedName("group")
  private Long group = null;

  @SerializedName("learningPlan")
  private LearningPlanResponse learningPlan = null;

  @SerializedName("learningPlanResource")
  private List<LearningPlanResourceResponse> learningPlanResource = new ArrayList<LearningPlanResourceResponse>();

  @SerializedName("learningPlanSchedule")
  private LearningPlanScheduleResponse learningPlanSchedule = null;

  /**
   * Gets or Sets level
   */
  public enum LevelEnum {
    @SerializedName("Master")
    MASTER("Master"),
    
    @SerializedName("StudyClass")
    STUDYCLASS("StudyClass"),
    
    @SerializedName("Section")
    SECTION("Section");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("level")
  private LevelEnum level = null;

  @SerializedName("masterClass")
  private Long masterClass = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("modifiedOn")
  private DateTime modifiedOn = null;

  @SerializedName("section")
  private Long section = null;

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

  @SerializedName("studyPlanType")
  private String studyPlanType = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("StudyClass")
    STUDYCLASS("StudyClass"),
    
    @SerializedName("Section")
    SECTION("Section"),
    
    @SerializedName("User")
    USER("User"),
    
    @SerializedName("Group")
    GROUP("Group");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("user")
  private Long user = null;

  @SerializedName("uuid")
  private String uuid = null;

  public LearningPlanMemberResponse academicSession(Long academicSession) {
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

  public LearningPlanMemberResponse branch(Long branch) {
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

  public LearningPlanMemberResponse createdBy(Long createdBy) {
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

  public LearningPlanMemberResponse createdOn(DateTime createdOn) {
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

  public LearningPlanMemberResponse group(Long group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getGroup() {
    return group;
  }

  public void setGroup(Long group) {
    this.group = group;
  }

  public LearningPlanMemberResponse learningPlan(LearningPlanResponse learningPlan) {
    this.learningPlan = learningPlan;
    return this;
  }

   /**
   * Get learningPlan
   * @return learningPlan
  **/
  @ApiModelProperty(example = "null", value = "")
  public LearningPlanResponse getLearningPlan() {
    return learningPlan;
  }

  public void setLearningPlan(LearningPlanResponse learningPlan) {
    this.learningPlan = learningPlan;
  }

  public LearningPlanMemberResponse learningPlanResource(List<LearningPlanResourceResponse> learningPlanResource) {
    this.learningPlanResource = learningPlanResource;
    return this;
  }

  public LearningPlanMemberResponse addLearningPlanResourceItem(LearningPlanResourceResponse learningPlanResourceItem) {
    this.learningPlanResource.add(learningPlanResourceItem);
    return this;
  }

   /**
   * Get learningPlanResource
   * @return learningPlanResource
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LearningPlanResourceResponse> getLearningPlanResource() {
    return learningPlanResource;
  }

  public void setLearningPlanResource(List<LearningPlanResourceResponse> learningPlanResource) {
    this.learningPlanResource = learningPlanResource;
  }

  public LearningPlanMemberResponse learningPlanSchedule(LearningPlanScheduleResponse learningPlanSchedule) {
    this.learningPlanSchedule = learningPlanSchedule;
    return this;
  }

   /**
   * Get learningPlanSchedule
   * @return learningPlanSchedule
  **/
  @ApiModelProperty(example = "null", value = "")
  public LearningPlanScheduleResponse getLearningPlanSchedule() {
    return learningPlanSchedule;
  }

  public void setLearningPlanSchedule(LearningPlanScheduleResponse learningPlanSchedule) {
    this.learningPlanSchedule = learningPlanSchedule;
  }

  public LearningPlanMemberResponse level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(example = "null", value = "")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public LearningPlanMemberResponse masterClass(Long masterClass) {
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

  public LearningPlanMemberResponse modifiedBy(Long modifiedBy) {
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

  public LearningPlanMemberResponse modifiedOn(DateTime modifiedOn) {
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

  public LearningPlanMemberResponse section(Long section) {
    this.section = section;
    return this;
  }

   /**
   * Get section
   * @return section
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSection() {
    return section;
  }

  public void setSection(Long section) {
    this.section = section;
  }

  public LearningPlanMemberResponse status(StatusEnum status) {
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

  public LearningPlanMemberResponse studyPlanType(String studyPlanType) {
    this.studyPlanType = studyPlanType;
    return this;
  }

   /**
   * Get studyPlanType
   * @return studyPlanType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudyPlanType() {
    return studyPlanType;
  }

  public void setStudyPlanType(String studyPlanType) {
    this.studyPlanType = studyPlanType;
  }

  public LearningPlanMemberResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public LearningPlanMemberResponse user(Long user) {
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

  public LearningPlanMemberResponse uuid(String uuid) {
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
    LearningPlanMemberResponse learningPlanMemberResponse = (LearningPlanMemberResponse) o;
    return Objects.equals(this.academicSession, learningPlanMemberResponse.academicSession) &&
        Objects.equals(this.branch, learningPlanMemberResponse.branch) &&
        Objects.equals(this.createdBy, learningPlanMemberResponse.createdBy) &&
        Objects.equals(this.createdOn, learningPlanMemberResponse.createdOn) &&
        Objects.equals(this.group, learningPlanMemberResponse.group) &&
        Objects.equals(this.learningPlan, learningPlanMemberResponse.learningPlan) &&
        Objects.equals(this.learningPlanResource, learningPlanMemberResponse.learningPlanResource) &&
        Objects.equals(this.learningPlanSchedule, learningPlanMemberResponse.learningPlanSchedule) &&
        Objects.equals(this.level, learningPlanMemberResponse.level) &&
        Objects.equals(this.masterClass, learningPlanMemberResponse.masterClass) &&
        Objects.equals(this.modifiedBy, learningPlanMemberResponse.modifiedBy) &&
        Objects.equals(this.modifiedOn, learningPlanMemberResponse.modifiedOn) &&
        Objects.equals(this.section, learningPlanMemberResponse.section) &&
        Objects.equals(this.status, learningPlanMemberResponse.status) &&
        Objects.equals(this.studyPlanType, learningPlanMemberResponse.studyPlanType) &&
        Objects.equals(this.type, learningPlanMemberResponse.type) &&
        Objects.equals(this.user, learningPlanMemberResponse.user) &&
        Objects.equals(this.uuid, learningPlanMemberResponse.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicSession, branch, createdBy, createdOn, group, learningPlan, learningPlanResource, learningPlanSchedule, level, masterClass, modifiedBy, modifiedOn, section, status, studyPlanType, type, user, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningPlanMemberResponse {\n");
    
    sb.append("    academicSession: ").append(toIndentedString(academicSession)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    learningPlan: ").append(toIndentedString(learningPlan)).append("\n");
    sb.append("    learningPlanResource: ").append(toIndentedString(learningPlanResource)).append("\n");
    sb.append("    learningPlanSchedule: ").append(toIndentedString(learningPlanSchedule)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    masterClass: ").append(toIndentedString(masterClass)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    studyPlanType: ").append(toIndentedString(studyPlanType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

