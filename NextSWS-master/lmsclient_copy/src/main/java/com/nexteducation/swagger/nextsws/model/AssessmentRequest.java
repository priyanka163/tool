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
import com.nexteducation.swagger.nextsws.model.AssessmentSectionRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentTemplateConfigurationRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentTemplateRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentWeightageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;


/**
 * AssessmentRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class AssessmentRequest   {
  @SerializedName("assessmentWeightages")
  private List<AssessmentWeightageRequest> assessmentWeightages = new ArrayList<AssessmentWeightageRequest>();

  @SerializedName("classId")
  private Long classId = null;

  @SerializedName("classfication")
  private String classfication = null;

  @SerializedName("classification")
  private String classification = null;

  @SerializedName("customSyllabusNode")
  private Boolean customSyllabusNode = null;

  @SerializedName("cutOffDate")
  private LocalDate cutOffDate = null;

  @SerializedName("difficultyLevel")
  private String difficultyLevel = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("instructions")
  private String instructions = null;

  @SerializedName("lastAttemptTimeStamp")
  private LocalDate lastAttemptTimeStamp = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("marks")
  private Double marks = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nodeUuid")
  private String nodeUuid = null;

  @SerializedName("nodes")
  private List<Long> nodes = new ArrayList<Long>();

  @SerializedName("pageBreaks")
  private String pageBreaks = null;

  @SerializedName("peer")
  private String peer = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("resourceUuid")
  private String resourceUuid = null;

  @SerializedName("sectionId")
  private Long sectionId = null;

  @SerializedName("sections")
  private List<AssessmentSectionRequest> sections = new ArrayList<AssessmentSectionRequest>();

  @SerializedName("showReport")
  private Boolean showReport = null;

  @SerializedName("sizeInBytes")
  private Integer sizeInBytes = null;

  @SerializedName("startdate")
  private LocalDate startdate = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("subType")
  private String subType = null;

  @SerializedName("subscribed")
  private Boolean subscribed = null;

  @SerializedName("syllabusId")
  private String syllabusId = null;

  @SerializedName("syllabusNode")
  private Long syllabusNode = null;

  @SerializedName("systemEvaluated")
  private Boolean systemEvaluated = null;

  @SerializedName("template")
  private AssessmentTemplateRequest template = null;

  @SerializedName("templateConfiguration")
  private List<AssessmentTemplateConfigurationRequest> templateConfiguration = new ArrayList<AssessmentTemplateConfigurationRequest>();

  @SerializedName("tenantId")
  private Long tenantId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("year")
  private String year = null;

  public AssessmentRequest assessmentWeightages(List<AssessmentWeightageRequest> assessmentWeightages) {
    this.assessmentWeightages = assessmentWeightages;
    return this;
  }

  public AssessmentRequest addAssessmentWeightagesItem(AssessmentWeightageRequest assessmentWeightagesItem) {
    this.assessmentWeightages.add(assessmentWeightagesItem);
    return this;
  }

   /**
   * Get assessmentWeightages
   * @return assessmentWeightages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AssessmentWeightageRequest> getAssessmentWeightages() {
    return assessmentWeightages;
  }

  public void setAssessmentWeightages(List<AssessmentWeightageRequest> assessmentWeightages) {
    this.assessmentWeightages = assessmentWeightages;
  }

  public AssessmentRequest classId(Long classId) {
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

  public AssessmentRequest classfication(String classfication) {
    this.classfication = classfication;
    return this;
  }

   /**
   * Get classfication
   * @return classfication
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClassfication() {
    return classfication;
  }

  public void setClassfication(String classfication) {
    this.classfication = classfication;
  }

  public AssessmentRequest classification(String classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Get classification
   * @return classification
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public AssessmentRequest customSyllabusNode(Boolean customSyllabusNode) {
    this.customSyllabusNode = customSyllabusNode;
    return this;
  }

   /**
   * Get customSyllabusNode
   * @return customSyllabusNode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCustomSyllabusNode() {
    return customSyllabusNode;
  }

  public void setCustomSyllabusNode(Boolean customSyllabusNode) {
    this.customSyllabusNode = customSyllabusNode;
  }

  public AssessmentRequest cutOffDate(LocalDate cutOffDate) {
    this.cutOffDate = cutOffDate;
    return this;
  }

   /**
   * Get cutOffDate
   * @return cutOffDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getCutOffDate() {
    return cutOffDate;
  }

  public void setCutOffDate(LocalDate cutOffDate) {
    this.cutOffDate = cutOffDate;
  }

  public AssessmentRequest difficultyLevel(String difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
    return this;
  }

   /**
   * Get difficultyLevel
   * @return difficultyLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDifficultyLevel() {
    return difficultyLevel;
  }

  public void setDifficultyLevel(String difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
  }

  public AssessmentRequest duration(Integer duration) {
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

  public AssessmentRequest id(Long id) {
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

  public AssessmentRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public AssessmentRequest lastAttemptTimeStamp(LocalDate lastAttemptTimeStamp) {
    this.lastAttemptTimeStamp = lastAttemptTimeStamp;
    return this;
  }

   /**
   * Get lastAttemptTimeStamp
   * @return lastAttemptTimeStamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getLastAttemptTimeStamp() {
    return lastAttemptTimeStamp;
  }

  public void setLastAttemptTimeStamp(LocalDate lastAttemptTimeStamp) {
    this.lastAttemptTimeStamp = lastAttemptTimeStamp;
  }

  public AssessmentRequest location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public AssessmentRequest marks(Double marks) {
    this.marks = marks;
    return this;
  }

   /**
   * Get marks
   * @return marks
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMarks() {
    return marks;
  }

  public void setMarks(Double marks) {
    this.marks = marks;
  }

  public AssessmentRequest name(String name) {
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

  public AssessmentRequest nodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
    return this;
  }

   /**
   * Get nodeUuid
   * @return nodeUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNodeUuid() {
    return nodeUuid;
  }

  public void setNodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
  }

  public AssessmentRequest nodes(List<Long> nodes) {
    this.nodes = nodes;
    return this;
  }

  public AssessmentRequest addNodesItem(Long nodesItem) {
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getNodes() {
    return nodes;
  }

  public void setNodes(List<Long> nodes) {
    this.nodes = nodes;
  }

  public AssessmentRequest pageBreaks(String pageBreaks) {
    this.pageBreaks = pageBreaks;
    return this;
  }

   /**
   * Get pageBreaks
   * @return pageBreaks
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPageBreaks() {
    return pageBreaks;
  }

  public void setPageBreaks(String pageBreaks) {
    this.pageBreaks = pageBreaks;
  }

  public AssessmentRequest peer(String peer) {
    this.peer = peer;
    return this;
  }

   /**
   * Get peer
   * @return peer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPeer() {
    return peer;
  }

  public void setPeer(String peer) {
    this.peer = peer;
  }

  public AssessmentRequest published(Boolean published) {
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

  public AssessmentRequest resourceUuid(String resourceUuid) {
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

  public AssessmentRequest sectionId(Long sectionId) {
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

  public AssessmentRequest sections(List<AssessmentSectionRequest> sections) {
    this.sections = sections;
    return this;
  }

  public AssessmentRequest addSectionsItem(AssessmentSectionRequest sectionsItem) {
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AssessmentSectionRequest> getSections() {
    return sections;
  }

  public void setSections(List<AssessmentSectionRequest> sections) {
    this.sections = sections;
  }

  public AssessmentRequest showReport(Boolean showReport) {
    this.showReport = showReport;
    return this;
  }

   /**
   * Get showReport
   * @return showReport
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getShowReport() {
    return showReport;
  }

  public void setShowReport(Boolean showReport) {
    this.showReport = showReport;
  }

  public AssessmentRequest sizeInBytes(Integer sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
    return this;
  }

   /**
   * Get sizeInBytes
   * @return sizeInBytes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSizeInBytes() {
    return sizeInBytes;
  }

  public void setSizeInBytes(Integer sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
  }

  public AssessmentRequest startdate(LocalDate startdate) {
    this.startdate = startdate;
    return this;
  }

   /**
   * Get startdate
   * @return startdate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getStartdate() {
    return startdate;
  }

  public void setStartdate(LocalDate startdate) {
    this.startdate = startdate;
  }

  public AssessmentRequest status(String status) {
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

  public AssessmentRequest subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public AssessmentRequest subscribed(Boolean subscribed) {
    this.subscribed = subscribed;
    return this;
  }

   /**
   * Get subscribed
   * @return subscribed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSubscribed() {
    return subscribed;
  }

  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }

  public AssessmentRequest syllabusId(String syllabusId) {
    this.syllabusId = syllabusId;
    return this;
  }

   /**
   * Get syllabusId
   * @return syllabusId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSyllabusId() {
    return syllabusId;
  }

  public void setSyllabusId(String syllabusId) {
    this.syllabusId = syllabusId;
  }

  public AssessmentRequest syllabusNode(Long syllabusNode) {
    this.syllabusNode = syllabusNode;
    return this;
  }

   /**
   * Get syllabusNode
   * @return syllabusNode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSyllabusNode() {
    return syllabusNode;
  }

  public void setSyllabusNode(Long syllabusNode) {
    this.syllabusNode = syllabusNode;
  }

  public AssessmentRequest systemEvaluated(Boolean systemEvaluated) {
    this.systemEvaluated = systemEvaluated;
    return this;
  }

   /**
   * Get systemEvaluated
   * @return systemEvaluated
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSystemEvaluated() {
    return systemEvaluated;
  }

  public void setSystemEvaluated(Boolean systemEvaluated) {
    this.systemEvaluated = systemEvaluated;
  }

  public AssessmentRequest template(AssessmentTemplateRequest template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "")
  public AssessmentTemplateRequest getTemplate() {
    return template;
  }

  public void setTemplate(AssessmentTemplateRequest template) {
    this.template = template;
  }

  public AssessmentRequest templateConfiguration(List<AssessmentTemplateConfigurationRequest> templateConfiguration) {
    this.templateConfiguration = templateConfiguration;
    return this;
  }

  public AssessmentRequest addTemplateConfigurationItem(AssessmentTemplateConfigurationRequest templateConfigurationItem) {
    this.templateConfiguration.add(templateConfigurationItem);
    return this;
  }

   /**
   * Get templateConfiguration
   * @return templateConfiguration
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AssessmentTemplateConfigurationRequest> getTemplateConfiguration() {
    return templateConfiguration;
  }

  public void setTemplateConfiguration(List<AssessmentTemplateConfigurationRequest> templateConfiguration) {
    this.templateConfiguration = templateConfiguration;
  }

  public AssessmentRequest tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public AssessmentRequest type(String type) {
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

  public AssessmentRequest userId(String userId) {
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

  public AssessmentRequest uuid(String uuid) {
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

  public AssessmentRequest year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssessmentRequest assessmentRequest = (AssessmentRequest) o;
    return Objects.equals(this.assessmentWeightages, assessmentRequest.assessmentWeightages) &&
        Objects.equals(this.classId, assessmentRequest.classId) &&
        Objects.equals(this.classfication, assessmentRequest.classfication) &&
        Objects.equals(this.classification, assessmentRequest.classification) &&
        Objects.equals(this.customSyllabusNode, assessmentRequest.customSyllabusNode) &&
        Objects.equals(this.cutOffDate, assessmentRequest.cutOffDate) &&
        Objects.equals(this.difficultyLevel, assessmentRequest.difficultyLevel) &&
        Objects.equals(this.duration, assessmentRequest.duration) &&
        Objects.equals(this.id, assessmentRequest.id) &&
        Objects.equals(this.instructions, assessmentRequest.instructions) &&
        Objects.equals(this.lastAttemptTimeStamp, assessmentRequest.lastAttemptTimeStamp) &&
        Objects.equals(this.location, assessmentRequest.location) &&
        Objects.equals(this.marks, assessmentRequest.marks) &&
        Objects.equals(this.name, assessmentRequest.name) &&
        Objects.equals(this.nodeUuid, assessmentRequest.nodeUuid) &&
        Objects.equals(this.nodes, assessmentRequest.nodes) &&
        Objects.equals(this.pageBreaks, assessmentRequest.pageBreaks) &&
        Objects.equals(this.peer, assessmentRequest.peer) &&
        Objects.equals(this.published, assessmentRequest.published) &&
        Objects.equals(this.resourceUuid, assessmentRequest.resourceUuid) &&
        Objects.equals(this.sectionId, assessmentRequest.sectionId) &&
        Objects.equals(this.sections, assessmentRequest.sections) &&
        Objects.equals(this.showReport, assessmentRequest.showReport) &&
        Objects.equals(this.sizeInBytes, assessmentRequest.sizeInBytes) &&
        Objects.equals(this.startdate, assessmentRequest.startdate) &&
        Objects.equals(this.status, assessmentRequest.status) &&
        Objects.equals(this.subType, assessmentRequest.subType) &&
        Objects.equals(this.subscribed, assessmentRequest.subscribed) &&
        Objects.equals(this.syllabusId, assessmentRequest.syllabusId) &&
        Objects.equals(this.syllabusNode, assessmentRequest.syllabusNode) &&
        Objects.equals(this.systemEvaluated, assessmentRequest.systemEvaluated) &&
        Objects.equals(this.template, assessmentRequest.template) &&
        Objects.equals(this.templateConfiguration, assessmentRequest.templateConfiguration) &&
        Objects.equals(this.tenantId, assessmentRequest.tenantId) &&
        Objects.equals(this.type, assessmentRequest.type) &&
        Objects.equals(this.userId, assessmentRequest.userId) &&
        Objects.equals(this.uuid, assessmentRequest.uuid) &&
        Objects.equals(this.year, assessmentRequest.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentWeightages, classId, classfication, classification, customSyllabusNode, cutOffDate, difficultyLevel, duration, id, instructions, lastAttemptTimeStamp, location, marks, name, nodeUuid, nodes, pageBreaks, peer, published, resourceUuid, sectionId, sections, showReport, sizeInBytes, startdate, status, subType, subscribed, syllabusId, syllabusNode, systemEvaluated, template, templateConfiguration, tenantId, type, userId, uuid, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentRequest {\n");
    
    sb.append("    assessmentWeightages: ").append(toIndentedString(assessmentWeightages)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    classfication: ").append(toIndentedString(classfication)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    customSyllabusNode: ").append(toIndentedString(customSyllabusNode)).append("\n");
    sb.append("    cutOffDate: ").append(toIndentedString(cutOffDate)).append("\n");
    sb.append("    difficultyLevel: ").append(toIndentedString(difficultyLevel)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    lastAttemptTimeStamp: ").append(toIndentedString(lastAttemptTimeStamp)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    marks: ").append(toIndentedString(marks)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    pageBreaks: ").append(toIndentedString(pageBreaks)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    resourceUuid: ").append(toIndentedString(resourceUuid)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    showReport: ").append(toIndentedString(showReport)).append("\n");
    sb.append("    sizeInBytes: ").append(toIndentedString(sizeInBytes)).append("\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    syllabusId: ").append(toIndentedString(syllabusId)).append("\n");
    sb.append("    syllabusNode: ").append(toIndentedString(syllabusNode)).append("\n");
    sb.append("    systemEvaluated: ").append(toIndentedString(systemEvaluated)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateConfiguration: ").append(toIndentedString(templateConfiguration)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
