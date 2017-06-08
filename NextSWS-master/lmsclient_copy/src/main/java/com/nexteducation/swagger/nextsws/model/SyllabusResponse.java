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
import com.nexteducation.swagger.nextsws.model.SyllabusNodeNameResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * SyllabusResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class SyllabusResponse   {
  @SerializedName("baseBoardId")
  private Long baseBoardId = null;

  @SerializedName("board")
  private String board = null;

  @SerializedName("boardId")
  private Long boardId = null;

  @SerializedName("comingSoon")
  private Boolean comingSoon = null;

  @SerializedName("custom")
  private Boolean custom = null;

  @SerializedName("hideUnAvailableSections")
  private Boolean hideUnAvailableSections = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("indexSignature")
  private String indexSignature = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ncert")
  private Boolean ncert = null;

  @SerializedName("publishedRootNode")
  private SyllabusNodeResponse publishedRootNode = null;

  @SerializedName("publishedRootNodeId")
  private Long publishedRootNodeId = null;

  @SerializedName("rootNodeId")
  private Long rootNodeId = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("studyClass")
  private String studyClass = null;

  @SerializedName("studyClassId")
  private Long studyClassId = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("subjectId")
  private Long subjectId = null;

  @SerializedName("syllabusNodeNames")
  private List<SyllabusNodeNameResponse> syllabusNodeNames = new ArrayList<SyllabusNodeNameResponse>();

  @SerializedName("syllabusNodeResponses")
  private List<SyllabusNodeResponse> syllabusNodeResponses = new ArrayList<SyllabusNodeResponse>();

  @SerializedName("tlm")
  private Boolean tlm = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uuid")
  private String uuid = null;

  public SyllabusResponse baseBoardId(Long baseBoardId) {
    this.baseBoardId = baseBoardId;
    return this;
  }

   /**
   * Get baseBoardId
   * @return baseBoardId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBaseBoardId() {
    return baseBoardId;
  }

  public void setBaseBoardId(Long baseBoardId) {
    this.baseBoardId = baseBoardId;
  }

  public SyllabusResponse board(String board) {
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

  public SyllabusResponse boardId(Long boardId) {
    this.boardId = boardId;
    return this;
  }

   /**
   * Get boardId
   * @return boardId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBoardId() {
    return boardId;
  }

  public void setBoardId(Long boardId) {
    this.boardId = boardId;
  }

  public SyllabusResponse comingSoon(Boolean comingSoon) {
    this.comingSoon = comingSoon;
    return this;
  }

   /**
   * Get comingSoon
   * @return comingSoon
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getComingSoon() {
    return comingSoon;
  }

  public void setComingSoon(Boolean comingSoon) {
    this.comingSoon = comingSoon;
  }

  public SyllabusResponse custom(Boolean custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCustom() {
    return custom;
  }

  public void setCustom(Boolean custom) {
    this.custom = custom;
  }

  public SyllabusResponse hideUnAvailableSections(Boolean hideUnAvailableSections) {
    this.hideUnAvailableSections = hideUnAvailableSections;
    return this;
  }

   /**
   * Get hideUnAvailableSections
   * @return hideUnAvailableSections
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHideUnAvailableSections() {
    return hideUnAvailableSections;
  }

  public void setHideUnAvailableSections(Boolean hideUnAvailableSections) {
    this.hideUnAvailableSections = hideUnAvailableSections;
  }

  public SyllabusResponse id(Long id) {
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

  public SyllabusResponse indexSignature(String indexSignature) {
    this.indexSignature = indexSignature;
    return this;
  }

   /**
   * Get indexSignature
   * @return indexSignature
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIndexSignature() {
    return indexSignature;
  }

  public void setIndexSignature(String indexSignature) {
    this.indexSignature = indexSignature;
  }

  public SyllabusResponse label(String label) {
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

  public SyllabusResponse name(String name) {
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

  public SyllabusResponse ncert(Boolean ncert) {
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

  public SyllabusResponse publishedRootNode(SyllabusNodeResponse publishedRootNode) {
    this.publishedRootNode = publishedRootNode;
    return this;
  }

   /**
   * Get publishedRootNode
   * @return publishedRootNode
  **/
  @ApiModelProperty(example = "null", value = "")
  public SyllabusNodeResponse getPublishedRootNode() {
    return publishedRootNode;
  }

  public void setPublishedRootNode(SyllabusNodeResponse publishedRootNode) {
    this.publishedRootNode = publishedRootNode;
  }

  public SyllabusResponse publishedRootNodeId(Long publishedRootNodeId) {
    this.publishedRootNodeId = publishedRootNodeId;
    return this;
  }

   /**
   * Get publishedRootNodeId
   * @return publishedRootNodeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPublishedRootNodeId() {
    return publishedRootNodeId;
  }

  public void setPublishedRootNodeId(Long publishedRootNodeId) {
    this.publishedRootNodeId = publishedRootNodeId;
  }

  public SyllabusResponse rootNodeId(Long rootNodeId) {
    this.rootNodeId = rootNodeId;
    return this;
  }

   /**
   * Get rootNodeId
   * @return rootNodeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getRootNodeId() {
    return rootNodeId;
  }

  public void setRootNodeId(Long rootNodeId) {
    this.rootNodeId = rootNodeId;
  }

  public SyllabusResponse signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public SyllabusResponse studyClass(String studyClass) {
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

  public SyllabusResponse studyClassId(Long studyClassId) {
    this.studyClassId = studyClassId;
    return this;
  }

   /**
   * Get studyClassId
   * @return studyClassId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStudyClassId() {
    return studyClassId;
  }

  public void setStudyClassId(Long studyClassId) {
    this.studyClassId = studyClassId;
  }

  public SyllabusResponse subject(String subject) {
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

  public SyllabusResponse subjectId(Long subjectId) {
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

  public SyllabusResponse syllabusNodeNames(List<SyllabusNodeNameResponse> syllabusNodeNames) {
    this.syllabusNodeNames = syllabusNodeNames;
    return this;
  }

  public SyllabusResponse addSyllabusNodeNamesItem(SyllabusNodeNameResponse syllabusNodeNamesItem) {
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

  public SyllabusResponse syllabusNodeResponses(List<SyllabusNodeResponse> syllabusNodeResponses) {
    this.syllabusNodeResponses = syllabusNodeResponses;
    return this;
  }

  public SyllabusResponse addSyllabusNodeResponsesItem(SyllabusNodeResponse syllabusNodeResponsesItem) {
    this.syllabusNodeResponses.add(syllabusNodeResponsesItem);
    return this;
  }

   /**
   * Get syllabusNodeResponses
   * @return syllabusNodeResponses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SyllabusNodeResponse> getSyllabusNodeResponses() {
    return syllabusNodeResponses;
  }

  public void setSyllabusNodeResponses(List<SyllabusNodeResponse> syllabusNodeResponses) {
    this.syllabusNodeResponses = syllabusNodeResponses;
  }

  public SyllabusResponse tlm(Boolean tlm) {
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

  public SyllabusResponse type(String type) {
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

  public SyllabusResponse uuid(String uuid) {
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
    SyllabusResponse syllabusResponse = (SyllabusResponse) o;
    return Objects.equals(this.baseBoardId, syllabusResponse.baseBoardId) &&
        Objects.equals(this.board, syllabusResponse.board) &&
        Objects.equals(this.boardId, syllabusResponse.boardId) &&
        Objects.equals(this.comingSoon, syllabusResponse.comingSoon) &&
        Objects.equals(this.custom, syllabusResponse.custom) &&
        Objects.equals(this.hideUnAvailableSections, syllabusResponse.hideUnAvailableSections) &&
        Objects.equals(this.id, syllabusResponse.id) &&
        Objects.equals(this.indexSignature, syllabusResponse.indexSignature) &&
        Objects.equals(this.label, syllabusResponse.label) &&
        Objects.equals(this.name, syllabusResponse.name) &&
        Objects.equals(this.ncert, syllabusResponse.ncert) &&
        Objects.equals(this.publishedRootNode, syllabusResponse.publishedRootNode) &&
        Objects.equals(this.publishedRootNodeId, syllabusResponse.publishedRootNodeId) &&
        Objects.equals(this.rootNodeId, syllabusResponse.rootNodeId) &&
        Objects.equals(this.signature, syllabusResponse.signature) &&
        Objects.equals(this.studyClass, syllabusResponse.studyClass) &&
        Objects.equals(this.studyClassId, syllabusResponse.studyClassId) &&
        Objects.equals(this.subject, syllabusResponse.subject) &&
        Objects.equals(this.subjectId, syllabusResponse.subjectId) &&
        Objects.equals(this.syllabusNodeNames, syllabusResponse.syllabusNodeNames) &&
        Objects.equals(this.syllabusNodeResponses, syllabusResponse.syllabusNodeResponses) &&
        Objects.equals(this.tlm, syllabusResponse.tlm) &&
        Objects.equals(this.type, syllabusResponse.type) &&
        Objects.equals(this.uuid, syllabusResponse.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseBoardId, board, boardId, comingSoon, custom, hideUnAvailableSections, id, indexSignature, label, name, ncert, publishedRootNode, publishedRootNodeId, rootNodeId, signature, studyClass, studyClassId, subject, subjectId, syllabusNodeNames, syllabusNodeResponses, tlm, type, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyllabusResponse {\n");
    
    sb.append("    baseBoardId: ").append(toIndentedString(baseBoardId)).append("\n");
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    comingSoon: ").append(toIndentedString(comingSoon)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    hideUnAvailableSections: ").append(toIndentedString(hideUnAvailableSections)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indexSignature: ").append(toIndentedString(indexSignature)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ncert: ").append(toIndentedString(ncert)).append("\n");
    sb.append("    publishedRootNode: ").append(toIndentedString(publishedRootNode)).append("\n");
    sb.append("    publishedRootNodeId: ").append(toIndentedString(publishedRootNodeId)).append("\n");
    sb.append("    rootNodeId: ").append(toIndentedString(rootNodeId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    studyClass: ").append(toIndentedString(studyClass)).append("\n");
    sb.append("    studyClassId: ").append(toIndentedString(studyClassId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    syllabusNodeNames: ").append(toIndentedString(syllabusNodeNames)).append("\n");
    sb.append("    syllabusNodeResponses: ").append(toIndentedString(syllabusNodeResponses)).append("\n");
    sb.append("    tlm: ").append(toIndentedString(tlm)).append("\n");
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

