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
import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * LearningPlanChapterResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class LearningPlanChapterResponse   {
  @SerializedName("board")
  private String board = null;

  @SerializedName("boardId")
  private Long boardId = null;

  @SerializedName("chapterId")
  private Long chapterId = null;

  @SerializedName("classId")
  private Long classId = null;

  @SerializedName("className")
  private String className = null;

  @SerializedName("customChapter")
  private Boolean customChapter = null;

  @SerializedName("ifCustomSyllabus")
  private Boolean ifCustomSyllabus = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ncert")
  private Boolean ncert = null;

  @SerializedName("planned")
  private Long planned = null;

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

  @SerializedName("subjectName")
  private String subjectName = null;

  @SerializedName("syllabusId")
  private Long syllabusId = null;

  @SerializedName("syllabusName")
  private String syllabusName = null;

  @SerializedName("syllabusNodeResponse")
  private SyllabusNodeResponse syllabusNodeResponse = null;

  @SerializedName("syllabusType")
  private String syllabusType = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uuid")
  private String uuid = null;

  public LearningPlanChapterResponse board(String board) {
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

  public LearningPlanChapterResponse boardId(Long boardId) {
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

  public LearningPlanChapterResponse chapterId(Long chapterId) {
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

  public LearningPlanChapterResponse classId(Long classId) {
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

  public LearningPlanChapterResponse className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public LearningPlanChapterResponse customChapter(Boolean customChapter) {
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

  public LearningPlanChapterResponse ifCustomSyllabus(Boolean ifCustomSyllabus) {
    this.ifCustomSyllabus = ifCustomSyllabus;
    return this;
  }

   /**
   * Get ifCustomSyllabus
   * @return ifCustomSyllabus
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIfCustomSyllabus() {
    return ifCustomSyllabus;
  }

  public void setIfCustomSyllabus(Boolean ifCustomSyllabus) {
    this.ifCustomSyllabus = ifCustomSyllabus;
  }

  public LearningPlanChapterResponse name(String name) {
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

  public LearningPlanChapterResponse ncert(Boolean ncert) {
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

  public LearningPlanChapterResponse planned(Long planned) {
    this.planned = planned;
    return this;
  }

   /**
   * Get planned
   * @return planned
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPlanned() {
    return planned;
  }

  public void setPlanned(Long planned) {
    this.planned = planned;
  }

  public LearningPlanChapterResponse status(StatusEnum status) {
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

  public LearningPlanChapterResponse subjectId(Long subjectId) {
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

  public LearningPlanChapterResponse subjectName(String subjectName) {
    this.subjectName = subjectName;
    return this;
  }

   /**
   * Get subjectName
   * @return subjectName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public LearningPlanChapterResponse syllabusId(Long syllabusId) {
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

  public LearningPlanChapterResponse syllabusName(String syllabusName) {
    this.syllabusName = syllabusName;
    return this;
  }

   /**
   * Get syllabusName
   * @return syllabusName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSyllabusName() {
    return syllabusName;
  }

  public void setSyllabusName(String syllabusName) {
    this.syllabusName = syllabusName;
  }

  public LearningPlanChapterResponse syllabusNodeResponse(SyllabusNodeResponse syllabusNodeResponse) {
    this.syllabusNodeResponse = syllabusNodeResponse;
    return this;
  }

   /**
   * Get syllabusNodeResponse
   * @return syllabusNodeResponse
  **/
  @ApiModelProperty(example = "null", value = "")
  public SyllabusNodeResponse getSyllabusNodeResponse() {
    return syllabusNodeResponse;
  }

  public void setSyllabusNodeResponse(SyllabusNodeResponse syllabusNodeResponse) {
    this.syllabusNodeResponse = syllabusNodeResponse;
  }

  public LearningPlanChapterResponse syllabusType(String syllabusType) {
    this.syllabusType = syllabusType;
    return this;
  }

   /**
   * Get syllabusType
   * @return syllabusType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSyllabusType() {
    return syllabusType;
  }

  public void setSyllabusType(String syllabusType) {
    this.syllabusType = syllabusType;
  }

  public LearningPlanChapterResponse total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public LearningPlanChapterResponse type(String type) {
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

  public LearningPlanChapterResponse uuid(String uuid) {
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
    LearningPlanChapterResponse learningPlanChapterResponse = (LearningPlanChapterResponse) o;
    return Objects.equals(this.board, learningPlanChapterResponse.board) &&
        Objects.equals(this.boardId, learningPlanChapterResponse.boardId) &&
        Objects.equals(this.chapterId, learningPlanChapterResponse.chapterId) &&
        Objects.equals(this.classId, learningPlanChapterResponse.classId) &&
        Objects.equals(this.className, learningPlanChapterResponse.className) &&
        Objects.equals(this.customChapter, learningPlanChapterResponse.customChapter) &&
        Objects.equals(this.ifCustomSyllabus, learningPlanChapterResponse.ifCustomSyllabus) &&
        Objects.equals(this.name, learningPlanChapterResponse.name) &&
        Objects.equals(this.ncert, learningPlanChapterResponse.ncert) &&
        Objects.equals(this.planned, learningPlanChapterResponse.planned) &&
        Objects.equals(this.status, learningPlanChapterResponse.status) &&
        Objects.equals(this.subjectId, learningPlanChapterResponse.subjectId) &&
        Objects.equals(this.subjectName, learningPlanChapterResponse.subjectName) &&
        Objects.equals(this.syllabusId, learningPlanChapterResponse.syllabusId) &&
        Objects.equals(this.syllabusName, learningPlanChapterResponse.syllabusName) &&
        Objects.equals(this.syllabusNodeResponse, learningPlanChapterResponse.syllabusNodeResponse) &&
        Objects.equals(this.syllabusType, learningPlanChapterResponse.syllabusType) &&
        Objects.equals(this.total, learningPlanChapterResponse.total) &&
        Objects.equals(this.type, learningPlanChapterResponse.type) &&
        Objects.equals(this.uuid, learningPlanChapterResponse.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(board, boardId, chapterId, classId, className, customChapter, ifCustomSyllabus, name, ncert, planned, status, subjectId, subjectName, syllabusId, syllabusName, syllabusNodeResponse, syllabusType, total, type, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningPlanChapterResponse {\n");
    
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    customChapter: ").append(toIndentedString(customChapter)).append("\n");
    sb.append("    ifCustomSyllabus: ").append(toIndentedString(ifCustomSyllabus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ncert: ").append(toIndentedString(ncert)).append("\n");
    sb.append("    planned: ").append(toIndentedString(planned)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    syllabusId: ").append(toIndentedString(syllabusId)).append("\n");
    sb.append("    syllabusName: ").append(toIndentedString(syllabusName)).append("\n");
    sb.append("    syllabusNodeResponse: ").append(toIndentedString(syllabusNodeResponse)).append("\n");
    sb.append("    syllabusType: ").append(toIndentedString(syllabusType)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

