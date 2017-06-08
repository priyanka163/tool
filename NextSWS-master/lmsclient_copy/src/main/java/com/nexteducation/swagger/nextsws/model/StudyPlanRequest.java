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
import com.nexteducation.swagger.nextsws.model.LearningPlanRequest;
import com.nexteducation.swagger.nextsws.model.StudyPlanDateWiseResource;
import com.nexteducation.swagger.nextsws.model.StudyPlanRequest;
import com.nexteducation.swagger.nextsws.model.StudyPlanTypeRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * StudyPlanRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class StudyPlanRequest   {
  @SerializedName("academicSession")
  private Long academicSession = null;

  @SerializedName("branch")
  private Long branch = null;

  @SerializedName("breakDays")
  private List<DateTime> breakDays = new ArrayList<DateTime>();

  @SerializedName("calendarEvent")
  private Long calendarEvent = null;

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    @SerializedName("Own")
    OWN("Own"),
    
    @SerializedName("Followed")
    FOLLOWED("Followed"),
    
    @SerializedName("Adopted")
    ADOPTED("Adopted");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("chapterId")
  private Long chapterId = null;

  @SerializedName("chapterIds")
  private List<Long> chapterIds = new ArrayList<Long>();

  @SerializedName("chapterReferences")
  private List<String> chapterReferences = new ArrayList<String>();

  @SerializedName("color")
  private String color = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  @SerializedName("customChapter")
  private Boolean customChapter = null;

  @SerializedName("datWiseResources")
  private List<StudyPlanDateWiseResource> datWiseResources = new ArrayList<StudyPlanDateWiseResource>();

  @SerializedName("endDate")
  private DateTime endDate = null;

  @SerializedName("learningPlanRequest")
  private List<LearningPlanRequest> learningPlanRequest = new ArrayList<LearningPlanRequest>();

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

  @SerializedName("numberOfDays")
  private Long numberOfDays = null;

  @SerializedName("parentUuid")
  private String parentUuid = null;

  @SerializedName("referencePlanUuid")
  private String referencePlanUuid = null;

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

  @SerializedName("studentChoosenPlanUUIDs")
  private List<String> studentChoosenPlanUUIDs = new ArrayList<String>();

  @SerializedName("studentChoosenPlans")
  private List<StudyPlanRequest> studentChoosenPlans = new ArrayList<StudyPlanRequest>();

  @SerializedName("studyDays")
  private List<DateTime> studyDays = new ArrayList<DateTime>();

  @SerializedName("studyOption")
  private String studyOption = null;

  @SerializedName("studyPlanAndLearningPlanReferenceUuids")
  private List<String> studyPlanAndLearningPlanReferenceUuids = new ArrayList<String>();

  @SerializedName("studyPlanBreaks")
  private List<Long> studyPlanBreaks = new ArrayList<Long>();

  @SerializedName("studyPlanDayHours")
  private List<Long> studyPlanDayHours = new ArrayList<Long>();

  @SerializedName("studyPlanDetailsDate")
  private DateTime studyPlanDetailsDate = null;

  @SerializedName("studyWeekDays")
  private List<Long> studyWeekDays = new ArrayList<Long>();

  @SerializedName("subject")
  private Long subject = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("totalStudyHours")
  private Long totalStudyHours = null;

  @SerializedName("type")
  private StudyPlanTypeRequest type = null;

  @SerializedName("user")
  private Long user = null;

  @SerializedName("uuid")
  private String uuid = null;

  public StudyPlanRequest academicSession(Long academicSession) {
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

  public StudyPlanRequest branch(Long branch) {
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

  public StudyPlanRequest breakDays(List<DateTime> breakDays) {
    this.breakDays = breakDays;
    return this;
  }

  public StudyPlanRequest addBreakDaysItem(DateTime breakDaysItem) {
    this.breakDays.add(breakDaysItem);
    return this;
  }

   /**
   * Get breakDays
   * @return breakDays
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DateTime> getBreakDays() {
    return breakDays;
  }

  public void setBreakDays(List<DateTime> breakDays) {
    this.breakDays = breakDays;
  }

  public StudyPlanRequest calendarEvent(Long calendarEvent) {
    this.calendarEvent = calendarEvent;
    return this;
  }

   /**
   * Get calendarEvent
   * @return calendarEvent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCalendarEvent() {
    return calendarEvent;
  }

  public void setCalendarEvent(Long calendarEvent) {
    this.calendarEvent = calendarEvent;
  }

  public StudyPlanRequest category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public StudyPlanRequest chapterId(Long chapterId) {
    this.chapterId = chapterId;
    return this;
  }

   /**
   * Get chapterId
   * @return chapterId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChapterId() {
    return chapterId;
  }

  public void setChapterId(Long chapterId) {
    this.chapterId = chapterId;
  }

  public StudyPlanRequest chapterIds(List<Long> chapterIds) {
    this.chapterIds = chapterIds;
    return this;
  }

  public StudyPlanRequest addChapterIdsItem(Long chapterIdsItem) {
    this.chapterIds.add(chapterIdsItem);
    return this;
  }

   /**
   * Get chapterIds
   * @return chapterIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getChapterIds() {
    return chapterIds;
  }

  public void setChapterIds(List<Long> chapterIds) {
    this.chapterIds = chapterIds;
  }

  public StudyPlanRequest chapterReferences(List<String> chapterReferences) {
    this.chapterReferences = chapterReferences;
    return this;
  }

  public StudyPlanRequest addChapterReferencesItem(String chapterReferencesItem) {
    this.chapterReferences.add(chapterReferencesItem);
    return this;
  }

   /**
   * Get chapterReferences
   * @return chapterReferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getChapterReferences() {
    return chapterReferences;
  }

  public void setChapterReferences(List<String> chapterReferences) {
    this.chapterReferences = chapterReferences;
  }

  public StudyPlanRequest color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public StudyPlanRequest createdBy(Long createdBy) {
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

  public StudyPlanRequest createdOn(DateTime createdOn) {
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

  public StudyPlanRequest customChapter(Boolean customChapter) {
    this.customChapter = customChapter;
    return this;
  }

   /**
   * Get customChapter
   * @return customChapter
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCustomChapter() {
    return customChapter;
  }

  public void setCustomChapter(Boolean customChapter) {
    this.customChapter = customChapter;
  }

  public StudyPlanRequest datWiseResources(List<StudyPlanDateWiseResource> datWiseResources) {
    this.datWiseResources = datWiseResources;
    return this;
  }

  public StudyPlanRequest addDatWiseResourcesItem(StudyPlanDateWiseResource datWiseResourcesItem) {
    this.datWiseResources.add(datWiseResourcesItem);
    return this;
  }

   /**
   * Get datWiseResources
   * @return datWiseResources
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<StudyPlanDateWiseResource> getDatWiseResources() {
    return datWiseResources;
  }

  public void setDatWiseResources(List<StudyPlanDateWiseResource> datWiseResources) {
    this.datWiseResources = datWiseResources;
  }

  public StudyPlanRequest endDate(DateTime endDate) {
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

  public StudyPlanRequest learningPlanRequest(List<LearningPlanRequest> learningPlanRequest) {
    this.learningPlanRequest = learningPlanRequest;
    return this;
  }

  public StudyPlanRequest addLearningPlanRequestItem(LearningPlanRequest learningPlanRequestItem) {
    this.learningPlanRequest.add(learningPlanRequestItem);
    return this;
  }

   /**
   * Get learningPlanRequest
   * @return learningPlanRequest
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LearningPlanRequest> getLearningPlanRequest() {
    return learningPlanRequest;
  }

  public void setLearningPlanRequest(List<LearningPlanRequest> learningPlanRequest) {
    this.learningPlanRequest = learningPlanRequest;
  }

  public StudyPlanRequest level(LevelEnum level) {
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

  public StudyPlanRequest masterClass(Long masterClass) {
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

  public StudyPlanRequest modifiedBy(Long modifiedBy) {
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

  public StudyPlanRequest modifiedOn(DateTime modifiedOn) {
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

  public StudyPlanRequest numberOfDays(Long numberOfDays) {
    this.numberOfDays = numberOfDays;
    return this;
  }

   /**
   * Get numberOfDays
   * @return numberOfDays
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getNumberOfDays() {
    return numberOfDays;
  }

  public void setNumberOfDays(Long numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  public StudyPlanRequest parentUuid(String parentUuid) {
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

  public StudyPlanRequest referencePlanUuid(String referencePlanUuid) {
    this.referencePlanUuid = referencePlanUuid;
    return this;
  }

   /**
   * Get referencePlanUuid
   * @return referencePlanUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReferencePlanUuid() {
    return referencePlanUuid;
  }

  public void setReferencePlanUuid(String referencePlanUuid) {
    this.referencePlanUuid = referencePlanUuid;
  }

  public StudyPlanRequest section(Long section) {
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

  public StudyPlanRequest startDate(DateTime startDate) {
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

  public StudyPlanRequest status(StatusEnum status) {
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

  public StudyPlanRequest studentChoosenPlanUUIDs(List<String> studentChoosenPlanUUIDs) {
    this.studentChoosenPlanUUIDs = studentChoosenPlanUUIDs;
    return this;
  }

  public StudyPlanRequest addStudentChoosenPlanUUIDsItem(String studentChoosenPlanUUIDsItem) {
    this.studentChoosenPlanUUIDs.add(studentChoosenPlanUUIDsItem);
    return this;
  }

   /**
   * Get studentChoosenPlanUUIDs
   * @return studentChoosenPlanUUIDs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getStudentChoosenPlanUUIDs() {
    return studentChoosenPlanUUIDs;
  }

  public void setStudentChoosenPlanUUIDs(List<String> studentChoosenPlanUUIDs) {
    this.studentChoosenPlanUUIDs = studentChoosenPlanUUIDs;
  }

  public StudyPlanRequest studentChoosenPlans(List<StudyPlanRequest> studentChoosenPlans) {
    this.studentChoosenPlans = studentChoosenPlans;
    return this;
  }

  public StudyPlanRequest addStudentChoosenPlansItem(StudyPlanRequest studentChoosenPlansItem) {
    this.studentChoosenPlans.add(studentChoosenPlansItem);
    return this;
  }

   /**
   * Get studentChoosenPlans
   * @return studentChoosenPlans
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<StudyPlanRequest> getStudentChoosenPlans() {
    return studentChoosenPlans;
  }

  public void setStudentChoosenPlans(List<StudyPlanRequest> studentChoosenPlans) {
    this.studentChoosenPlans = studentChoosenPlans;
  }

  public StudyPlanRequest studyDays(List<DateTime> studyDays) {
    this.studyDays = studyDays;
    return this;
  }

  public StudyPlanRequest addStudyDaysItem(DateTime studyDaysItem) {
    this.studyDays.add(studyDaysItem);
    return this;
  }

   /**
   * Get studyDays
   * @return studyDays
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DateTime> getStudyDays() {
    return studyDays;
  }

  public void setStudyDays(List<DateTime> studyDays) {
    this.studyDays = studyDays;
  }

  public StudyPlanRequest studyOption(String studyOption) {
    this.studyOption = studyOption;
    return this;
  }

   /**
   * Get studyOption
   * @return studyOption
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudyOption() {
    return studyOption;
  }

  public void setStudyOption(String studyOption) {
    this.studyOption = studyOption;
  }

  public StudyPlanRequest studyPlanAndLearningPlanReferenceUuids(List<String> studyPlanAndLearningPlanReferenceUuids) {
    this.studyPlanAndLearningPlanReferenceUuids = studyPlanAndLearningPlanReferenceUuids;
    return this;
  }

  public StudyPlanRequest addStudyPlanAndLearningPlanReferenceUuidsItem(String studyPlanAndLearningPlanReferenceUuidsItem) {
    this.studyPlanAndLearningPlanReferenceUuids.add(studyPlanAndLearningPlanReferenceUuidsItem);
    return this;
  }

   /**
   * Get studyPlanAndLearningPlanReferenceUuids
   * @return studyPlanAndLearningPlanReferenceUuids
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getStudyPlanAndLearningPlanReferenceUuids() {
    return studyPlanAndLearningPlanReferenceUuids;
  }

  public void setStudyPlanAndLearningPlanReferenceUuids(List<String> studyPlanAndLearningPlanReferenceUuids) {
    this.studyPlanAndLearningPlanReferenceUuids = studyPlanAndLearningPlanReferenceUuids;
  }

  public StudyPlanRequest studyPlanBreaks(List<Long> studyPlanBreaks) {
    this.studyPlanBreaks = studyPlanBreaks;
    return this;
  }

  public StudyPlanRequest addStudyPlanBreaksItem(Long studyPlanBreaksItem) {
    this.studyPlanBreaks.add(studyPlanBreaksItem);
    return this;
  }

   /**
   * Get studyPlanBreaks
   * @return studyPlanBreaks
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getStudyPlanBreaks() {
    return studyPlanBreaks;
  }

  public void setStudyPlanBreaks(List<Long> studyPlanBreaks) {
    this.studyPlanBreaks = studyPlanBreaks;
  }

  public StudyPlanRequest studyPlanDayHours(List<Long> studyPlanDayHours) {
    this.studyPlanDayHours = studyPlanDayHours;
    return this;
  }

  public StudyPlanRequest addStudyPlanDayHoursItem(Long studyPlanDayHoursItem) {
    this.studyPlanDayHours.add(studyPlanDayHoursItem);
    return this;
  }

   /**
   * Get studyPlanDayHours
   * @return studyPlanDayHours
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getStudyPlanDayHours() {
    return studyPlanDayHours;
  }

  public void setStudyPlanDayHours(List<Long> studyPlanDayHours) {
    this.studyPlanDayHours = studyPlanDayHours;
  }

  public StudyPlanRequest studyPlanDetailsDate(DateTime studyPlanDetailsDate) {
    this.studyPlanDetailsDate = studyPlanDetailsDate;
    return this;
  }

   /**
   * Get studyPlanDetailsDate
   * @return studyPlanDetailsDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getStudyPlanDetailsDate() {
    return studyPlanDetailsDate;
  }

  public void setStudyPlanDetailsDate(DateTime studyPlanDetailsDate) {
    this.studyPlanDetailsDate = studyPlanDetailsDate;
  }

  public StudyPlanRequest studyWeekDays(List<Long> studyWeekDays) {
    this.studyWeekDays = studyWeekDays;
    return this;
  }

  public StudyPlanRequest addStudyWeekDaysItem(Long studyWeekDaysItem) {
    this.studyWeekDays.add(studyWeekDaysItem);
    return this;
  }

   /**
   * Get studyWeekDays
   * @return studyWeekDays
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getStudyWeekDays() {
    return studyWeekDays;
  }

  public void setStudyWeekDays(List<Long> studyWeekDays) {
    this.studyWeekDays = studyWeekDays;
  }

  public StudyPlanRequest subject(Long subject) {
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

  public StudyPlanRequest title(String title) {
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

  public StudyPlanRequest totalStudyHours(Long totalStudyHours) {
    this.totalStudyHours = totalStudyHours;
    return this;
  }

   /**
   * Get totalStudyHours
   * @return totalStudyHours
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotalStudyHours() {
    return totalStudyHours;
  }

  public void setTotalStudyHours(Long totalStudyHours) {
    this.totalStudyHours = totalStudyHours;
  }

  public StudyPlanRequest type(StudyPlanTypeRequest type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public StudyPlanTypeRequest getType() {
    return type;
  }

  public void setType(StudyPlanTypeRequest type) {
    this.type = type;
  }

  public StudyPlanRequest user(Long user) {
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

  public StudyPlanRequest uuid(String uuid) {
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
    StudyPlanRequest studyPlanRequest = (StudyPlanRequest) o;
    return Objects.equals(this.academicSession, studyPlanRequest.academicSession) &&
        Objects.equals(this.branch, studyPlanRequest.branch) &&
        Objects.equals(this.breakDays, studyPlanRequest.breakDays) &&
        Objects.equals(this.calendarEvent, studyPlanRequest.calendarEvent) &&
        Objects.equals(this.category, studyPlanRequest.category) &&
        Objects.equals(this.chapterId, studyPlanRequest.chapterId) &&
        Objects.equals(this.chapterIds, studyPlanRequest.chapterIds) &&
        Objects.equals(this.chapterReferences, studyPlanRequest.chapterReferences) &&
        Objects.equals(this.color, studyPlanRequest.color) &&
        Objects.equals(this.createdBy, studyPlanRequest.createdBy) &&
        Objects.equals(this.createdOn, studyPlanRequest.createdOn) &&
        Objects.equals(this.customChapter, studyPlanRequest.customChapter) &&
        Objects.equals(this.datWiseResources, studyPlanRequest.datWiseResources) &&
        Objects.equals(this.endDate, studyPlanRequest.endDate) &&
        Objects.equals(this.learningPlanRequest, studyPlanRequest.learningPlanRequest) &&
        Objects.equals(this.level, studyPlanRequest.level) &&
        Objects.equals(this.masterClass, studyPlanRequest.masterClass) &&
        Objects.equals(this.modifiedBy, studyPlanRequest.modifiedBy) &&
        Objects.equals(this.modifiedOn, studyPlanRequest.modifiedOn) &&
        Objects.equals(this.numberOfDays, studyPlanRequest.numberOfDays) &&
        Objects.equals(this.parentUuid, studyPlanRequest.parentUuid) &&
        Objects.equals(this.referencePlanUuid, studyPlanRequest.referencePlanUuid) &&
        Objects.equals(this.section, studyPlanRequest.section) &&
        Objects.equals(this.startDate, studyPlanRequest.startDate) &&
        Objects.equals(this.status, studyPlanRequest.status) &&
        Objects.equals(this.studentChoosenPlanUUIDs, studyPlanRequest.studentChoosenPlanUUIDs) &&
        Objects.equals(this.studentChoosenPlans, studyPlanRequest.studentChoosenPlans) &&
        Objects.equals(this.studyDays, studyPlanRequest.studyDays) &&
        Objects.equals(this.studyOption, studyPlanRequest.studyOption) &&
        Objects.equals(this.studyPlanAndLearningPlanReferenceUuids, studyPlanRequest.studyPlanAndLearningPlanReferenceUuids) &&
        Objects.equals(this.studyPlanBreaks, studyPlanRequest.studyPlanBreaks) &&
        Objects.equals(this.studyPlanDayHours, studyPlanRequest.studyPlanDayHours) &&
        Objects.equals(this.studyPlanDetailsDate, studyPlanRequest.studyPlanDetailsDate) &&
        Objects.equals(this.studyWeekDays, studyPlanRequest.studyWeekDays) &&
        Objects.equals(this.subject, studyPlanRequest.subject) &&
        Objects.equals(this.title, studyPlanRequest.title) &&
        Objects.equals(this.totalStudyHours, studyPlanRequest.totalStudyHours) &&
        Objects.equals(this.type, studyPlanRequest.type) &&
        Objects.equals(this.user, studyPlanRequest.user) &&
        Objects.equals(this.uuid, studyPlanRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicSession, branch, breakDays, calendarEvent, category, chapterId, chapterIds, chapterReferences, color, createdBy, createdOn, customChapter, datWiseResources, endDate, learningPlanRequest, level, masterClass, modifiedBy, modifiedOn, numberOfDays, parentUuid, referencePlanUuid, section, startDate, status, studentChoosenPlanUUIDs, studentChoosenPlans, studyDays, studyOption, studyPlanAndLearningPlanReferenceUuids, studyPlanBreaks, studyPlanDayHours, studyPlanDetailsDate, studyWeekDays, subject, title, totalStudyHours, type, user, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudyPlanRequest {\n");
    
    sb.append("    academicSession: ").append(toIndentedString(academicSession)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    breakDays: ").append(toIndentedString(breakDays)).append("\n");
    sb.append("    calendarEvent: ").append(toIndentedString(calendarEvent)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
    sb.append("    chapterIds: ").append(toIndentedString(chapterIds)).append("\n");
    sb.append("    chapterReferences: ").append(toIndentedString(chapterReferences)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customChapter: ").append(toIndentedString(customChapter)).append("\n");
    sb.append("    datWiseResources: ").append(toIndentedString(datWiseResources)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    learningPlanRequest: ").append(toIndentedString(learningPlanRequest)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    masterClass: ").append(toIndentedString(masterClass)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    numberOfDays: ").append(toIndentedString(numberOfDays)).append("\n");
    sb.append("    parentUuid: ").append(toIndentedString(parentUuid)).append("\n");
    sb.append("    referencePlanUuid: ").append(toIndentedString(referencePlanUuid)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    studentChoosenPlanUUIDs: ").append(toIndentedString(studentChoosenPlanUUIDs)).append("\n");
    sb.append("    studentChoosenPlans: ").append(toIndentedString(studentChoosenPlans)).append("\n");
    sb.append("    studyDays: ").append(toIndentedString(studyDays)).append("\n");
    sb.append("    studyOption: ").append(toIndentedString(studyOption)).append("\n");
    sb.append("    studyPlanAndLearningPlanReferenceUuids: ").append(toIndentedString(studyPlanAndLearningPlanReferenceUuids)).append("\n");
    sb.append("    studyPlanBreaks: ").append(toIndentedString(studyPlanBreaks)).append("\n");
    sb.append("    studyPlanDayHours: ").append(toIndentedString(studyPlanDayHours)).append("\n");
    sb.append("    studyPlanDetailsDate: ").append(toIndentedString(studyPlanDetailsDate)).append("\n");
    sb.append("    studyWeekDays: ").append(toIndentedString(studyWeekDays)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    totalStudyHours: ").append(toIndentedString(totalStudyHours)).append("\n");
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
