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
import com.nexteducation.swagger.nextsws.model.ContentResponse;
import com.nexteducation.swagger.nextsws.model.MGSContentSectionResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeNameResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * SyllabusNodeResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class SyllabusNodeResponse   {
  @SerializedName("board")
  private String board = null;

  @SerializedName("chapterName")
  private String chapterName = null;

  @SerializedName("contentResponses")
  private List<ContentResponse> contentResponses = new ArrayList<ContentResponse>();

  @SerializedName("contentSections")
  private List<MGSContentSectionResponse> contentSections = new ArrayList<MGSContentSectionResponse>();

  @SerializedName("copyOfId")
  private Long copyOfId = null;

  @SerializedName("copyOfIdName")
  private String copyOfIdName = null;

  @SerializedName("customNode")
  private Boolean customNode = null;

  @SerializedName("customReference")
  private Boolean customReference = null;

  @SerializedName("depth")
  private Integer depth = null;

  @SerializedName("descendents")
  private List<SyllabusNodeResponse> descendents = new ArrayList<SyllabusNodeResponse>();

  @SerializedName("hasLessonPlan")
  private Boolean hasLessonPlan = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("lessonResponses")
  private List<SyllabusNodeResponse> lessonResponses = new ArrayList<SyllabusNodeResponse>();

  @SerializedName("mappedNodes")
  private String mappedNodes = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ncert")
  private Boolean ncert = null;

  @SerializedName("nodeHierarchy")
  private List<String> nodeHierarchy = new ArrayList<String>();

  @SerializedName("parentId")
  private Long parentId = null;

  @SerializedName("pathElementsSize")
  private Integer pathElementsSize = null;

  @SerializedName("referenceId")
  private Long referenceId = null;

  @SerializedName("seq")
  private Long seq = null;

  @SerializedName("studyClass")
  private String studyClass = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("syllabusId")
  private Long syllabusId = null;

  @SerializedName("syllabusNodeNames")
  private List<SyllabusNodeNameResponse> syllabusNodeNames = new ArrayList<SyllabusNodeNameResponse>();

  @SerializedName("thumbnailUrl")
  private String thumbnailUrl = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("tlm")
  private Boolean tlm = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("visibleInClient")
  private Boolean visibleInClient = null;

  public SyllabusNodeResponse board(String board) {
    this.board = board;
    return this;
  }

   /**
   * Get board
   * @return board
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBoard() {
    return board;
  }

  public void setBoard(String board) {
    this.board = board;
  }

  public SyllabusNodeResponse chapterName(String chapterName) {
    this.chapterName = chapterName;
    return this;
  }

   /**
   * Get chapterName
   * @return chapterName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChapterName() {
    return chapterName;
  }

  public void setChapterName(String chapterName) {
    this.chapterName = chapterName;
  }

  public SyllabusNodeResponse contentResponses(List<ContentResponse> contentResponses) {
    this.contentResponses = contentResponses;
    return this;
  }

  public SyllabusNodeResponse addContentResponsesItem(ContentResponse contentResponsesItem) {
    this.contentResponses.add(contentResponsesItem);
    return this;
  }

   /**
   * Get contentResponses
   * @return contentResponses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ContentResponse> getContentResponses() {
    return contentResponses;
  }

  public void setContentResponses(List<ContentResponse> contentResponses) {
    this.contentResponses = contentResponses;
  }

  public SyllabusNodeResponse contentSections(List<MGSContentSectionResponse> contentSections) {
    this.contentSections = contentSections;
    return this;
  }

  public SyllabusNodeResponse addContentSectionsItem(MGSContentSectionResponse contentSectionsItem) {
    this.contentSections.add(contentSectionsItem);
    return this;
  }

   /**
   * Get contentSections
   * @return contentSections
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MGSContentSectionResponse> getContentSections() {
    return contentSections;
  }

  public void setContentSections(List<MGSContentSectionResponse> contentSections) {
    this.contentSections = contentSections;
  }

  public SyllabusNodeResponse copyOfId(Long copyOfId) {
    this.copyOfId = copyOfId;
    return this;
  }

   /**
   * Get copyOfId
   * @return copyOfId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCopyOfId() {
    return copyOfId;
  }

  public void setCopyOfId(Long copyOfId) {
    this.copyOfId = copyOfId;
  }

  public SyllabusNodeResponse copyOfIdName(String copyOfIdName) {
    this.copyOfIdName = copyOfIdName;
    return this;
  }

   /**
   * Get copyOfIdName
   * @return copyOfIdName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCopyOfIdName() {
    return copyOfIdName;
  }

  public void setCopyOfIdName(String copyOfIdName) {
    this.copyOfIdName = copyOfIdName;
  }

  public SyllabusNodeResponse customNode(Boolean customNode) {
    this.customNode = customNode;
    return this;
  }

   /**
   * Get customNode
   * @return customNode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCustomNode() {
    return customNode;
  }

  public void setCustomNode(Boolean customNode) {
    this.customNode = customNode;
  }

  public SyllabusNodeResponse customReference(Boolean customReference) {
    this.customReference = customReference;
    return this;
  }

   /**
   * Get customReference
   * @return customReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCustomReference() {
    return customReference;
  }

  public void setCustomReference(Boolean customReference) {
    this.customReference = customReference;
  }

  public SyllabusNodeResponse depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public SyllabusNodeResponse descendents(List<SyllabusNodeResponse> descendents) {
    this.descendents = descendents;
    return this;
  }

  public SyllabusNodeResponse addDescendentsItem(SyllabusNodeResponse descendentsItem) {
    this.descendents.add(descendentsItem);
    return this;
  }

   /**
   * Get descendents
   * @return descendents
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SyllabusNodeResponse> getDescendents() {
    return descendents;
  }

  public void setDescendents(List<SyllabusNodeResponse> descendents) {
    this.descendents = descendents;
  }

  public SyllabusNodeResponse hasLessonPlan(Boolean hasLessonPlan) {
    this.hasLessonPlan = hasLessonPlan;
    return this;
  }

   /**
   * Get hasLessonPlan
   * @return hasLessonPlan
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHasLessonPlan() {
    return hasLessonPlan;
  }

  public void setHasLessonPlan(Boolean hasLessonPlan) {
    this.hasLessonPlan = hasLessonPlan;
  }

  public SyllabusNodeResponse id(Long id) {
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

  public SyllabusNodeResponse label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public SyllabusNodeResponse lessonResponses(List<SyllabusNodeResponse> lessonResponses) {
    this.lessonResponses = lessonResponses;
    return this;
  }

  public SyllabusNodeResponse addLessonResponsesItem(SyllabusNodeResponse lessonResponsesItem) {
    this.lessonResponses.add(lessonResponsesItem);
    return this;
  }

   /**
   * Get lessonResponses
   * @return lessonResponses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SyllabusNodeResponse> getLessonResponses() {
    return lessonResponses;
  }

  public void setLessonResponses(List<SyllabusNodeResponse> lessonResponses) {
    this.lessonResponses = lessonResponses;
  }

  public SyllabusNodeResponse mappedNodes(String mappedNodes) {
    this.mappedNodes = mappedNodes;
    return this;
  }

   /**
   * Get mappedNodes
   * @return mappedNodes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMappedNodes() {
    return mappedNodes;
  }

  public void setMappedNodes(String mappedNodes) {
    this.mappedNodes = mappedNodes;
  }

  public SyllabusNodeResponse name(String name) {
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

  public SyllabusNodeResponse ncert(Boolean ncert) {
    this.ncert = ncert;
    return this;
  }

   /**
   * Get ncert
   * @return ncert
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getNcert() {
    return ncert;
  }

  public void setNcert(Boolean ncert) {
    this.ncert = ncert;
  }

  public SyllabusNodeResponse nodeHierarchy(List<String> nodeHierarchy) {
    this.nodeHierarchy = nodeHierarchy;
    return this;
  }

  public SyllabusNodeResponse addNodeHierarchyItem(String nodeHierarchyItem) {
    this.nodeHierarchy.add(nodeHierarchyItem);
    return this;
  }

   /**
   * Get nodeHierarchy
   * @return nodeHierarchy
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getNodeHierarchy() {
    return nodeHierarchy;
  }

  public void setNodeHierarchy(List<String> nodeHierarchy) {
    this.nodeHierarchy = nodeHierarchy;
  }

  public SyllabusNodeResponse parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public SyllabusNodeResponse pathElementsSize(Integer pathElementsSize) {
    this.pathElementsSize = pathElementsSize;
    return this;
  }

   /**
   * Get pathElementsSize
   * @return pathElementsSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPathElementsSize() {
    return pathElementsSize;
  }

  public void setPathElementsSize(Integer pathElementsSize) {
    this.pathElementsSize = pathElementsSize;
  }

  public SyllabusNodeResponse referenceId(Long referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }

  public SyllabusNodeResponse seq(Long seq) {
    this.seq = seq;
    return this;
  }

   /**
   * Get seq
   * @return seq
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSeq() {
    return seq;
  }

  public void setSeq(Long seq) {
    this.seq = seq;
  }

  public SyllabusNodeResponse studyClass(String studyClass) {
    this.studyClass = studyClass;
    return this;
  }

   /**
   * Get studyClass
   * @return studyClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudyClass() {
    return studyClass;
  }

  public void setStudyClass(String studyClass) {
    this.studyClass = studyClass;
  }

  public SyllabusNodeResponse subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public SyllabusNodeResponse syllabusId(Long syllabusId) {
    this.syllabusId = syllabusId;
    return this;
  }

   /**
   * Get syllabusId
   * @return syllabusId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSyllabusId() {
    return syllabusId;
  }

  public void setSyllabusId(Long syllabusId) {
    this.syllabusId = syllabusId;
  }

  public SyllabusNodeResponse syllabusNodeNames(List<SyllabusNodeNameResponse> syllabusNodeNames) {
    this.syllabusNodeNames = syllabusNodeNames;
    return this;
  }

  public SyllabusNodeResponse addSyllabusNodeNamesItem(SyllabusNodeNameResponse syllabusNodeNamesItem) {
    this.syllabusNodeNames.add(syllabusNodeNamesItem);
    return this;
  }

   /**
   * Get syllabusNodeNames
   * @return syllabusNodeNames
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SyllabusNodeNameResponse> getSyllabusNodeNames() {
    return syllabusNodeNames;
  }

  public void setSyllabusNodeNames(List<SyllabusNodeNameResponse> syllabusNodeNames) {
    this.syllabusNodeNames = syllabusNodeNames;
  }

  public SyllabusNodeResponse thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * Get thumbnailUrl
   * @return thumbnailUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public SyllabusNodeResponse time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public SyllabusNodeResponse tlm(Boolean tlm) {
    this.tlm = tlm;
    return this;
  }

   /**
   * Get tlm
   * @return tlm
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTlm() {
    return tlm;
  }

  public void setTlm(Boolean tlm) {
    this.tlm = tlm;
  }

  public SyllabusNodeResponse type(String type) {
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

  public SyllabusNodeResponse visibleInClient(Boolean visibleInClient) {
    this.visibleInClient = visibleInClient;
    return this;
  }

   /**
   * Get visibleInClient
   * @return visibleInClient
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVisibleInClient() {
    return visibleInClient;
  }

  public void setVisibleInClient(Boolean visibleInClient) {
    this.visibleInClient = visibleInClient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyllabusNodeResponse syllabusNodeResponse = (SyllabusNodeResponse) o;
    return Objects.equals(this.board, syllabusNodeResponse.board) &&
        Objects.equals(this.chapterName, syllabusNodeResponse.chapterName) &&
        Objects.equals(this.contentResponses, syllabusNodeResponse.contentResponses) &&
        Objects.equals(this.contentSections, syllabusNodeResponse.contentSections) &&
        Objects.equals(this.copyOfId, syllabusNodeResponse.copyOfId) &&
        Objects.equals(this.copyOfIdName, syllabusNodeResponse.copyOfIdName) &&
        Objects.equals(this.customNode, syllabusNodeResponse.customNode) &&
        Objects.equals(this.customReference, syllabusNodeResponse.customReference) &&
        Objects.equals(this.depth, syllabusNodeResponse.depth) &&
        Objects.equals(this.descendents, syllabusNodeResponse.descendents) &&
        Objects.equals(this.hasLessonPlan, syllabusNodeResponse.hasLessonPlan) &&
        Objects.equals(this.id, syllabusNodeResponse.id) &&
        Objects.equals(this.label, syllabusNodeResponse.label) &&
        Objects.equals(this.lessonResponses, syllabusNodeResponse.lessonResponses) &&
        Objects.equals(this.mappedNodes, syllabusNodeResponse.mappedNodes) &&
        Objects.equals(this.name, syllabusNodeResponse.name) &&
        Objects.equals(this.ncert, syllabusNodeResponse.ncert) &&
        Objects.equals(this.nodeHierarchy, syllabusNodeResponse.nodeHierarchy) &&
        Objects.equals(this.parentId, syllabusNodeResponse.parentId) &&
        Objects.equals(this.pathElementsSize, syllabusNodeResponse.pathElementsSize) &&
        Objects.equals(this.referenceId, syllabusNodeResponse.referenceId) &&
        Objects.equals(this.seq, syllabusNodeResponse.seq) &&
        Objects.equals(this.studyClass, syllabusNodeResponse.studyClass) &&
        Objects.equals(this.subject, syllabusNodeResponse.subject) &&
        Objects.equals(this.syllabusId, syllabusNodeResponse.syllabusId) &&
        Objects.equals(this.syllabusNodeNames, syllabusNodeResponse.syllabusNodeNames) &&
        Objects.equals(this.thumbnailUrl, syllabusNodeResponse.thumbnailUrl) &&
        Objects.equals(this.time, syllabusNodeResponse.time) &&
        Objects.equals(this.tlm, syllabusNodeResponse.tlm) &&
        Objects.equals(this.type, syllabusNodeResponse.type) &&
        Objects.equals(this.visibleInClient, syllabusNodeResponse.visibleInClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(board, chapterName, contentResponses, contentSections, copyOfId, copyOfIdName, customNode, customReference, depth, descendents, hasLessonPlan, id, label, lessonResponses, mappedNodes, name, ncert, nodeHierarchy, parentId, pathElementsSize, referenceId, seq, studyClass, subject, syllabusId, syllabusNodeNames, thumbnailUrl, time, tlm, type, visibleInClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyllabusNodeResponse {\n");
    
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("    chapterName: ").append(toIndentedString(chapterName)).append("\n");
    sb.append("    contentResponses: ").append(toIndentedString(contentResponses)).append("\n");
    sb.append("    contentSections: ").append(toIndentedString(contentSections)).append("\n");
    sb.append("    copyOfId: ").append(toIndentedString(copyOfId)).append("\n");
    sb.append("    copyOfIdName: ").append(toIndentedString(copyOfIdName)).append("\n");
    sb.append("    customNode: ").append(toIndentedString(customNode)).append("\n");
    sb.append("    customReference: ").append(toIndentedString(customReference)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    descendents: ").append(toIndentedString(descendents)).append("\n");
    sb.append("    hasLessonPlan: ").append(toIndentedString(hasLessonPlan)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lessonResponses: ").append(toIndentedString(lessonResponses)).append("\n");
    sb.append("    mappedNodes: ").append(toIndentedString(mappedNodes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ncert: ").append(toIndentedString(ncert)).append("\n");
    sb.append("    nodeHierarchy: ").append(toIndentedString(nodeHierarchy)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    pathElementsSize: ").append(toIndentedString(pathElementsSize)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    studyClass: ").append(toIndentedString(studyClass)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    syllabusId: ").append(toIndentedString(syllabusId)).append("\n");
    sb.append("    syllabusNodeNames: ").append(toIndentedString(syllabusNodeNames)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    tlm: ").append(toIndentedString(tlm)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visibleInClient: ").append(toIndentedString(visibleInClient)).append("\n");
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

