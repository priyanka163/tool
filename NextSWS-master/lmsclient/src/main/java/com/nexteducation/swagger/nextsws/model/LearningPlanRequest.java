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
import com.nexteducation.swagger.nextsws.model.LearningPlanChapterRequest;
import com.nexteducation.swagger.nextsws.model.LearningPlanMemberRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * LearningPlanRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class LearningPlanRequest   {
  @SerializedName("academicSession")
  private Long academicSession = null;

  @SerializedName("branch")
  private Long branch = null;

  @SerializedName("chapters")
  private List<LearningPlanChapterRequest> chapters = new ArrayList<LearningPlanChapterRequest>();

  @SerializedName("classId")
  private Long classId = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  @SerializedName("discussionTime")
  private Integer discussionTime = null;

  @SerializedName("dueDate")
  private DateTime dueDate = null;

  @SerializedName("endDate")
  private DateTime endDate = null;

  @SerializedName("explanationTime")
  private Integer explanationTime = null;

  @SerializedName("groups")
  private List<Long> groups = new ArrayList<Long>();

  /**
   * Gets or Sets learningPlanTypes
   */
  public enum LearningPlanTypesEnum {
    @SerializedName("Lecture")
    LECTURE("Lecture"),
    
    @SerializedName("LabSession")
    LABSESSION("LabSession"),
    
    @SerializedName("Homework")
    HOMEWORK("Homework"),
    
    @SerializedName("StudyPlan")
    STUDYPLAN("StudyPlan");

    private String value;

    LearningPlanTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("learningPlanTypes")
  private List<LearningPlanTypesEnum> learningPlanTypes = new ArrayList<LearningPlanTypesEnum>();

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

  @SerializedName("members")
  private List<LearningPlanMemberRequest> members = new ArrayList<LearningPlanMemberRequest>();

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("modifiedOn")
  private DateTime modifiedOn = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("objective")
  private String objective = null;

  @SerializedName("planNo")
  private Integer planNo = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("publishedOn")
  private DateTime publishedOn = null;

  @SerializedName("section")
  private Long section = null;

  @SerializedName("startDate")
  private DateTime startDate = null;

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

  @SerializedName("subject")
  private Long subject = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("Lecture")
    LECTURE("Lecture"),
    
    @SerializedName("LabSession")
    LABSESSION("LabSession"),
    
    @SerializedName("Homework")
    HOMEWORK("Homework"),
    
    @SerializedName("StudyPlan")
    STUDYPLAN("StudyPlan");

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

  @SerializedName("types")
  private List<String> types = new ArrayList<String>();

  @SerializedName("user")
  private Long user = null;

  @SerializedName("uuid")
  private String uuid = null;

  public LearningPlanRequest academicSession(Long academicSession) {
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

  public LearningPlanRequest branch(Long branch) {
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

  public LearningPlanRequest chapters(List<LearningPlanChapterRequest> chapters) {
    this.chapters = chapters;
    return this;
  }

  public LearningPlanRequest addChaptersItem(LearningPlanChapterRequest chaptersItem) {
    this.chapters.add(chaptersItem);
    return this;
  }

   /**
   * Get chapters
   * @return chapters
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LearningPlanChapterRequest> getChapters() {
    return chapters;
  }

  public void setChapters(List<LearningPlanChapterRequest> chapters) {
    this.chapters = chapters;
  }

  public LearningPlanRequest classId(Long classId) {
    this.classId = classId;
    return this;
  }

   /**
   * Get classId
   * @return classId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getClassId() {
    return classId;
  }

  public void setClassId(Long classId) {
    this.classId = classId;
  }

  public LearningPlanRequest createdBy(Long createdBy) {
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

  public LearningPlanRequest createdOn(DateTime createdOn) {
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

  public LearningPlanRequest discussionTime(Integer discussionTime) {
    this.discussionTime = discussionTime;
    return this;
  }

   /**
   * Get discussionTime
   * @return discussionTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDiscussionTime() {
    return discussionTime;
  }

  public void setDiscussionTime(Integer discussionTime) {
    this.discussionTime = discussionTime;
  }

  public LearningPlanRequest dueDate(DateTime dueDate) {
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

  public LearningPlanRequest endDate(DateTime endDate) {
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

  public LearningPlanRequest explanationTime(Integer explanationTime) {
    this.explanationTime = explanationTime;
    return this;
  }

   /**
   * Get explanationTime
   * @return explanationTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getExplanationTime() {
    return explanationTime;
  }

  public void setExplanationTime(Integer explanationTime) {
    this.explanationTime = explanationTime;
  }

  public LearningPlanRequest groups(List<Long> groups) {
    this.groups = groups;
    return this;
  }

  public LearningPlanRequest addGroupsItem(Long groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getGroups() {
    return groups;
  }

  public void setGroups(List<Long> groups) {
    this.groups = groups;
  }

  public LearningPlanRequest learningPlanTypes(List<LearningPlanTypesEnum> learningPlanTypes) {
    this.learningPlanTypes = learningPlanTypes;
    return this;
  }

  public LearningPlanRequest addLearningPlanTypesItem(LearningPlanTypesEnum learningPlanTypesItem) {
    this.learningPlanTypes.add(learningPlanTypesItem);
    return this;
  }

   /**
   * Get learningPlanTypes
   * @return learningPlanTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LearningPlanTypesEnum> getLearningPlanTypes() {
    return learningPlanTypes;
  }

  public void setLearningPlanTypes(List<LearningPlanTypesEnum> learningPlanTypes) {
    this.learningPlanTypes = learningPlanTypes;
  }

  public LearningPlanRequest learningType(LearningTypeEnum learningType) {
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

  public LearningPlanRequest level(LevelEnum level) {
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

  public LearningPlanRequest members(List<LearningPlanMemberRequest> members) {
    this.members = members;
    return this;
  }

  public LearningPlanRequest addMembersItem(LearningPlanMemberRequest membersItem) {
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LearningPlanMemberRequest> getMembers() {
    return members;
  }

  public void setMembers(List<LearningPlanMemberRequest> members) {
    this.members = members;
  }

  public LearningPlanRequest modifiedBy(Long modifiedBy) {
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

  public LearningPlanRequest modifiedOn(DateTime modifiedOn) {
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

  public LearningPlanRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LearningPlanRequest objective(String objective) {
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

  public LearningPlanRequest planNo(Integer planNo) {
    this.planNo = planNo;
    return this;
  }

   /**
   * Get planNo
   * @return planNo
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPlanNo() {
    return planNo;
  }

  public void setPlanNo(Integer planNo) {
    this.planNo = planNo;
  }

  public LearningPlanRequest published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public LearningPlanRequest publishedOn(DateTime publishedOn) {
    this.publishedOn = publishedOn;
    return this;
  }

   /**
   * Get publishedOn
   * @return publishedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getPublishedOn() {
    return publishedOn;
  }

  public void setPublishedOn(DateTime publishedOn) {
    this.publishedOn = publishedOn;
  }

  public LearningPlanRequest section(Long section) {
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

  public LearningPlanRequest startDate(DateTime startDate) {
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

  public LearningPlanRequest status(StatusEnum status) {
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

  public LearningPlanRequest subject(Long subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSubject() {
    return subject;
  }

  public void setSubject(Long subject) {
    this.subject = subject;
  }

  public LearningPlanRequest type(TypeEnum type) {
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

  public LearningPlanRequest types(List<String> types) {
    this.types = types;
    return this;
  }

  public LearningPlanRequest addTypesItem(String typesItem) {
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public LearningPlanRequest user(Long user) {
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

  public LearningPlanRequest uuid(String uuid) {
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
    LearningPlanRequest learningPlanRequest = (LearningPlanRequest) o;
    return Objects.equals(this.academicSession, learningPlanRequest.academicSession) &&
        Objects.equals(this.branch, learningPlanRequest.branch) &&
        Objects.equals(this.chapters, learningPlanRequest.chapters) &&
        Objects.equals(this.classId, learningPlanRequest.classId) &&
        Objects.equals(this.createdBy, learningPlanRequest.createdBy) &&
        Objects.equals(this.createdOn, learningPlanRequest.createdOn) &&
        Objects.equals(this.discussionTime, learningPlanRequest.discussionTime) &&
        Objects.equals(this.dueDate, learningPlanRequest.dueDate) &&
        Objects.equals(this.endDate, learningPlanRequest.endDate) &&
        Objects.equals(this.explanationTime, learningPlanRequest.explanationTime) &&
        Objects.equals(this.groups, learningPlanRequest.groups) &&
        Objects.equals(this.learningPlanTypes, learningPlanRequest.learningPlanTypes) &&
        Objects.equals(this.learningType, learningPlanRequest.learningType) &&
        Objects.equals(this.level, learningPlanRequest.level) &&
        Objects.equals(this.members, learningPlanRequest.members) &&
        Objects.equals(this.modifiedBy, learningPlanRequest.modifiedBy) &&
        Objects.equals(this.modifiedOn, learningPlanRequest.modifiedOn) &&
        Objects.equals(this.name, learningPlanRequest.name) &&
        Objects.equals(this.objective, learningPlanRequest.objective) &&
        Objects.equals(this.planNo, learningPlanRequest.planNo) &&
        Objects.equals(this.published, learningPlanRequest.published) &&
        Objects.equals(this.publishedOn, learningPlanRequest.publishedOn) &&
        Objects.equals(this.section, learningPlanRequest.section) &&
        Objects.equals(this.startDate, learningPlanRequest.startDate) &&
        Objects.equals(this.status, learningPlanRequest.status) &&
        Objects.equals(this.subject, learningPlanRequest.subject) &&
        Objects.equals(this.type, learningPlanRequest.type) &&
        Objects.equals(this.types, learningPlanRequest.types) &&
        Objects.equals(this.user, learningPlanRequest.user) &&
        Objects.equals(this.uuid, learningPlanRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicSession, branch, chapters, classId, createdBy, createdOn, discussionTime, dueDate, endDate, explanationTime, groups, learningPlanTypes, learningType, level, members, modifiedBy, modifiedOn, name, objective, planNo, published, publishedOn, section, startDate, status, subject, type, types, user, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningPlanRequest {\n");
    
    sb.append("    academicSession: ").append(toIndentedString(academicSession)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    chapters: ").append(toIndentedString(chapters)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    discussionTime: ").append(toIndentedString(discussionTime)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    explanationTime: ").append(toIndentedString(explanationTime)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    learningPlanTypes: ").append(toIndentedString(learningPlanTypes)).append("\n");
    sb.append("    learningType: ").append(toIndentedString(learningType)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    planNo: ").append(toIndentedString(planNo)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    publishedOn: ").append(toIndentedString(publishedOn)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

