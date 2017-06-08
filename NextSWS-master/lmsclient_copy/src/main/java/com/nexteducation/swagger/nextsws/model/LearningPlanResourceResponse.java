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
import com.nexteducation.swagger.nextsws.model.LPRProgressLogResponse;
import com.nexteducation.swagger.nextsws.model.LPRProgressResponse;
import com.nexteducation.swagger.nextsws.model.ResourceResponse;
import com.nexteducation.swagger.nextsws.model.ResourceShortResponse;
import com.nexteducation.swagger.nextsws.model.TopicResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * LearningPlanResourceResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class LearningPlanResourceResponse   {
  @SerializedName("branch")
  private Long branch = null;

  @SerializedName("completed")
  private Boolean completed = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  @SerializedName("dueDate")
  private DateTime dueDate = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("instruction")
  private String instruction = null;

  @SerializedName("lPRProgress")
  private List<LPRProgressResponse> lPRProgress = new ArrayList<LPRProgressResponse>();

  @SerializedName("lPRProgressLog")
  private List<LPRProgressLogResponse> lPRProgressLog = new ArrayList<LPRProgressLogResponse>();

  @SerializedName("learnerTask")
  private String learnerTask = null;

  @SerializedName("learningPlanMemberUuid")
  private String learningPlanMemberUuid = null;

  /**
   * Gets or Sets learningType
   */
  public enum LearningTypeEnum {
    @SerializedName("Mandatory")
    MANDATORY("Mandatory"),
    
    @SerializedName("Optional")
    OPTIONAL("Optional");

    private String value;

    LearningTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("learningType")
  private LearningTypeEnum learningType = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("modifiedOn")
  private DateTime modifiedOn = null;

  @SerializedName("objective")
  private String objective = null;

  @SerializedName("progressLastModifiedOn")
  private DateTime progressLastModifiedOn = null;

  @SerializedName("progressPercentage")
  private Integer progressPercentage = null;

  @SerializedName("progressStatus")
  private String progressStatus = null;

  /**
   * Gets or Sets resourceCategory
   */
  public enum ResourceCategoryEnum {
    @SerializedName("PRE_READ")
    PRE_READ("PRE_READ"),
    
    @SerializedName("MANDATORY")
    MANDATORY("MANDATORY"),
    
    @SerializedName("RECOMMENDED")
    RECOMMENDED("RECOMMENDED");

    private String value;

    ResourceCategoryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("resourceCategory")
  private ResourceCategoryEnum resourceCategory = null;

  @SerializedName("resourceResponse")
  private ResourceResponse resourceResponse = null;

  @SerializedName("resourceShortResponse")
  private ResourceShortResponse resourceShortResponse = null;

  @SerializedName("resourceTopics")
  private List<TopicResponse> resourceTopics = new ArrayList<TopicResponse>();

  @SerializedName("resourceUuid")
  private String resourceUuid = null;

  @SerializedName("seq")
  private Integer seq = null;

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

  @SerializedName("teacherTask")
  private String teacherTask = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("TWS")
    TWS("TWS"),
    
    @SerializedName("CLASS_ROOM")
    CLASS_ROOM("CLASS_ROOM");

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

  @SerializedName("uuid")
  private String uuid = null;

  public LearningPlanResourceResponse branch(Long branch) {
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

  public LearningPlanResourceResponse completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public LearningPlanResourceResponse createdBy(Long createdBy) {
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

  public LearningPlanResourceResponse createdOn(DateTime createdOn) {
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

  public LearningPlanResourceResponse dueDate(DateTime dueDate) {
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

  public LearningPlanResourceResponse duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public LearningPlanResourceResponse instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

   /**
   * Get instruction
   * @return instruction
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public LearningPlanResourceResponse lPRProgress(List<LPRProgressResponse> lPRProgress) {
    this.lPRProgress = lPRProgress;
    return this;
  }

  public LearningPlanResourceResponse addLPRProgressItem(LPRProgressResponse lPRProgressItem) {
    this.lPRProgress.add(lPRProgressItem);
    return this;
  }

   /**
   * Get lPRProgress
   * @return lPRProgress
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LPRProgressResponse> getLPRProgress() {
    return lPRProgress;
  }

  public void setLPRProgress(List<LPRProgressResponse> lPRProgress) {
    this.lPRProgress = lPRProgress;
  }

  public LearningPlanResourceResponse lPRProgressLog(List<LPRProgressLogResponse> lPRProgressLog) {
    this.lPRProgressLog = lPRProgressLog;
    return this;
  }

  public LearningPlanResourceResponse addLPRProgressLogItem(LPRProgressLogResponse lPRProgressLogItem) {
    this.lPRProgressLog.add(lPRProgressLogItem);
    return this;
  }

   /**
   * Get lPRProgressLog
   * @return lPRProgressLog
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LPRProgressLogResponse> getLPRProgressLog() {
    return lPRProgressLog;
  }

  public void setLPRProgressLog(List<LPRProgressLogResponse> lPRProgressLog) {
    this.lPRProgressLog = lPRProgressLog;
  }

  public LearningPlanResourceResponse learnerTask(String learnerTask) {
    this.learnerTask = learnerTask;
    return this;
  }

   /**
   * Get learnerTask
   * @return learnerTask
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLearnerTask() {
    return learnerTask;
  }

  public void setLearnerTask(String learnerTask) {
    this.learnerTask = learnerTask;
  }

  public LearningPlanResourceResponse learningPlanMemberUuid(String learningPlanMemberUuid) {
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

  public LearningPlanResourceResponse learningType(LearningTypeEnum learningType) {
    this.learningType = learningType;
    return this;
  }

   /**
   * Get learningType
   * @return learningType
  **/
  @ApiModelProperty(example = "null", value = "")
  public LearningTypeEnum getLearningType() {
    return learningType;
  }

  public void setLearningType(LearningTypeEnum learningType) {
    this.learningType = learningType;
  }

  public LearningPlanResourceResponse modifiedBy(Long modifiedBy) {
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

  public LearningPlanResourceResponse modifiedOn(DateTime modifiedOn) {
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

  public LearningPlanResourceResponse objective(String objective) {
    this.objective = objective;
    return this;
  }

   /**
   * Get objective
   * @return objective
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjective() {
    return objective;
  }

  public void setObjective(String objective) {
    this.objective = objective;
  }

  public LearningPlanResourceResponse progressLastModifiedOn(DateTime progressLastModifiedOn) {
    this.progressLastModifiedOn = progressLastModifiedOn;
    return this;
  }

   /**
   * Get progressLastModifiedOn
   * @return progressLastModifiedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getProgressLastModifiedOn() {
    return progressLastModifiedOn;
  }

  public void setProgressLastModifiedOn(DateTime progressLastModifiedOn) {
    this.progressLastModifiedOn = progressLastModifiedOn;
  }

  public LearningPlanResourceResponse progressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
    return this;
  }

   /**
   * Get progressPercentage
   * @return progressPercentage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getProgressPercentage() {
    return progressPercentage;
  }

  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  public LearningPlanResourceResponse progressStatus(String progressStatus) {
    this.progressStatus = progressStatus;
    return this;
  }

   /**
   * Get progressStatus
   * @return progressStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProgressStatus() {
    return progressStatus;
  }

  public void setProgressStatus(String progressStatus) {
    this.progressStatus = progressStatus;
  }

  public LearningPlanResourceResponse resourceCategory(ResourceCategoryEnum resourceCategory) {
    this.resourceCategory = resourceCategory;
    return this;
  }

   /**
   * Get resourceCategory
   * @return resourceCategory
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResourceCategoryEnum getResourceCategory() {
    return resourceCategory;
  }

  public void setResourceCategory(ResourceCategoryEnum resourceCategory) {
    this.resourceCategory = resourceCategory;
  }

  public LearningPlanResourceResponse resourceResponse(ResourceResponse resourceResponse) {
    this.resourceResponse = resourceResponse;
    return this;
  }

   /**
   * Get resourceResponse
   * @return resourceResponse
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResourceResponse getResourceResponse() {
    return resourceResponse;
  }

  public void setResourceResponse(ResourceResponse resourceResponse) {
    this.resourceResponse = resourceResponse;
  }

  public LearningPlanResourceResponse resourceShortResponse(ResourceShortResponse resourceShortResponse) {
    this.resourceShortResponse = resourceShortResponse;
    return this;
  }

   /**
   * Get resourceShortResponse
   * @return resourceShortResponse
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResourceShortResponse getResourceShortResponse() {
    return resourceShortResponse;
  }

  public void setResourceShortResponse(ResourceShortResponse resourceShortResponse) {
    this.resourceShortResponse = resourceShortResponse;
  }

  public LearningPlanResourceResponse resourceTopics(List<TopicResponse> resourceTopics) {
    this.resourceTopics = resourceTopics;
    return this;
  }

  public LearningPlanResourceResponse addResourceTopicsItem(TopicResponse resourceTopicsItem) {
    this.resourceTopics.add(resourceTopicsItem);
    return this;
  }

   /**
   * Get resourceTopics
   * @return resourceTopics
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TopicResponse> getResourceTopics() {
    return resourceTopics;
  }

  public void setResourceTopics(List<TopicResponse> resourceTopics) {
    this.resourceTopics = resourceTopics;
  }

  public LearningPlanResourceResponse resourceUuid(String resourceUuid) {
    this.resourceUuid = resourceUuid;
    return this;
  }

   /**
   * Get resourceUuid
   * @return resourceUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResourceUuid() {
    return resourceUuid;
  }

  public void setResourceUuid(String resourceUuid) {
    this.resourceUuid = resourceUuid;
  }

  public LearningPlanResourceResponse seq(Integer seq) {
    this.seq = seq;
    return this;
  }

   /**
   * Get seq
   * @return seq
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSeq() {
    return seq;
  }

  public void setSeq(Integer seq) {
    this.seq = seq;
  }

  public LearningPlanResourceResponse status(StatusEnum status) {
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

  public LearningPlanResourceResponse teacherTask(String teacherTask) {
    this.teacherTask = teacherTask;
    return this;
  }

   /**
   * Get teacherTask
   * @return teacherTask
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTeacherTask() {
    return teacherTask;
  }

  public void setTeacherTask(String teacherTask) {
    this.teacherTask = teacherTask;
  }

  public LearningPlanResourceResponse type(TypeEnum type) {
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

  public LearningPlanResourceResponse uuid(String uuid) {
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
    LearningPlanResourceResponse learningPlanResourceResponse = (LearningPlanResourceResponse) o;
    return Objects.equals(this.branch, learningPlanResourceResponse.branch) &&
        Objects.equals(this.completed, learningPlanResourceResponse.completed) &&
        Objects.equals(this.createdBy, learningPlanResourceResponse.createdBy) &&
        Objects.equals(this.createdOn, learningPlanResourceResponse.createdOn) &&
        Objects.equals(this.dueDate, learningPlanResourceResponse.dueDate) &&
        Objects.equals(this.duration, learningPlanResourceResponse.duration) &&
        Objects.equals(this.instruction, learningPlanResourceResponse.instruction) &&
        Objects.equals(this.lPRProgress, learningPlanResourceResponse.lPRProgress) &&
        Objects.equals(this.lPRProgressLog, learningPlanResourceResponse.lPRProgressLog) &&
        Objects.equals(this.learnerTask, learningPlanResourceResponse.learnerTask) &&
        Objects.equals(this.learningPlanMemberUuid, learningPlanResourceResponse.learningPlanMemberUuid) &&
        Objects.equals(this.learningType, learningPlanResourceResponse.learningType) &&
        Objects.equals(this.modifiedBy, learningPlanResourceResponse.modifiedBy) &&
        Objects.equals(this.modifiedOn, learningPlanResourceResponse.modifiedOn) &&
        Objects.equals(this.objective, learningPlanResourceResponse.objective) &&
        Objects.equals(this.progressLastModifiedOn, learningPlanResourceResponse.progressLastModifiedOn) &&
        Objects.equals(this.progressPercentage, learningPlanResourceResponse.progressPercentage) &&
        Objects.equals(this.progressStatus, learningPlanResourceResponse.progressStatus) &&
        Objects.equals(this.resourceCategory, learningPlanResourceResponse.resourceCategory) &&
        Objects.equals(this.resourceResponse, learningPlanResourceResponse.resourceResponse) &&
        Objects.equals(this.resourceShortResponse, learningPlanResourceResponse.resourceShortResponse) &&
        Objects.equals(this.resourceTopics, learningPlanResourceResponse.resourceTopics) &&
        Objects.equals(this.resourceUuid, learningPlanResourceResponse.resourceUuid) &&
        Objects.equals(this.seq, learningPlanResourceResponse.seq) &&
        Objects.equals(this.status, learningPlanResourceResponse.status) &&
        Objects.equals(this.teacherTask, learningPlanResourceResponse.teacherTask) &&
        Objects.equals(this.type, learningPlanResourceResponse.type) &&
        Objects.equals(this.uuid, learningPlanResourceResponse.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, completed, createdBy, createdOn, dueDate, duration, instruction, lPRProgress, lPRProgressLog, learnerTask, learningPlanMemberUuid, learningType, modifiedBy, modifiedOn, objective, progressLastModifiedOn, progressPercentage, progressStatus, resourceCategory, resourceResponse, resourceShortResponse, resourceTopics, resourceUuid, seq, status, teacherTask, type, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningPlanResourceResponse {\n");
    
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    lPRProgress: ").append(toIndentedString(lPRProgress)).append("\n");
    sb.append("    lPRProgressLog: ").append(toIndentedString(lPRProgressLog)).append("\n");
    sb.append("    learnerTask: ").append(toIndentedString(learnerTask)).append("\n");
    sb.append("    learningPlanMemberUuid: ").append(toIndentedString(learningPlanMemberUuid)).append("\n");
    sb.append("    learningType: ").append(toIndentedString(learningType)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    progressLastModifiedOn: ").append(toIndentedString(progressLastModifiedOn)).append("\n");
    sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
    sb.append("    progressStatus: ").append(toIndentedString(progressStatus)).append("\n");
    sb.append("    resourceCategory: ").append(toIndentedString(resourceCategory)).append("\n");
    sb.append("    resourceResponse: ").append(toIndentedString(resourceResponse)).append("\n");
    sb.append("    resourceShortResponse: ").append(toIndentedString(resourceShortResponse)).append("\n");
    sb.append("    resourceTopics: ").append(toIndentedString(resourceTopics)).append("\n");
    sb.append("    resourceUuid: ").append(toIndentedString(resourceUuid)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    teacherTask: ").append(toIndentedString(teacherTask)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

