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
import com.nexteducation.swagger.nextsws.model.MasterBoardRO;
import com.nexteducation.swagger.nextsws.model.MasterStudyClassRO;
import com.nexteducation.swagger.nextsws.model.MasterSubjectRO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SyllabusRO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class SyllabusRO   {
  @SerializedName("chapterCount")
  private Long chapterCount = null;

  @SerializedName("custom")
  private Boolean custom = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("masterBoard")
  private MasterBoardRO masterBoard = null;

  @SerializedName("masterClass")
  private MasterStudyClassRO masterClass = null;

  @SerializedName("masterSubject")
  private MasterSubjectRO masterSubject = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rootNodeId")
  private Long rootNodeId = null;

  @SerializedName("tlm")
  private Boolean tlm = null;

  @SerializedName("tsp")
  private Boolean tsp = null;

  public SyllabusRO chapterCount(Long chapterCount) {
    this.chapterCount = chapterCount;
    return this;
  }

   /**
   * Get chapterCount
   * @return chapterCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChapterCount() {
    return chapterCount;
  }

  public void setChapterCount(Long chapterCount) {
    this.chapterCount = chapterCount;
  }

  public SyllabusRO custom(Boolean custom) {
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

  public SyllabusRO id(Long id) {
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

  public SyllabusRO masterBoard(MasterBoardRO masterBoard) {
    this.masterBoard = masterBoard;
    return this;
  }

   /**
   * Get masterBoard
   * @return masterBoard
  **/
  @ApiModelProperty(example = "null", value = "")
  public MasterBoardRO getMasterBoard() {
    return masterBoard;
  }

  public void setMasterBoard(MasterBoardRO masterBoard) {
    this.masterBoard = masterBoard;
  }

  public SyllabusRO masterClass(MasterStudyClassRO masterClass) {
    this.masterClass = masterClass;
    return this;
  }

   /**
   * Get masterClass
   * @return masterClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public MasterStudyClassRO getMasterClass() {
    return masterClass;
  }

  public void setMasterClass(MasterStudyClassRO masterClass) {
    this.masterClass = masterClass;
  }

  public SyllabusRO masterSubject(MasterSubjectRO masterSubject) {
    this.masterSubject = masterSubject;
    return this;
  }

   /**
   * Get masterSubject
   * @return masterSubject
  **/
  @ApiModelProperty(example = "null", value = "")
  public MasterSubjectRO getMasterSubject() {
    return masterSubject;
  }

  public void setMasterSubject(MasterSubjectRO masterSubject) {
    this.masterSubject = masterSubject;
  }

  public SyllabusRO name(String name) {
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

  public SyllabusRO rootNodeId(Long rootNodeId) {
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

  public SyllabusRO tlm(Boolean tlm) {
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

  public SyllabusRO tsp(Boolean tsp) {
    this.tsp = tsp;
    return this;
  }

   /**
   * Get tsp
   * @return tsp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTsp() {
    return tsp;
  }

  public void setTsp(Boolean tsp) {
    this.tsp = tsp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyllabusRO syllabusRO = (SyllabusRO) o;
    return Objects.equals(this.chapterCount, syllabusRO.chapterCount) &&
        Objects.equals(this.custom, syllabusRO.custom) &&
        Objects.equals(this.id, syllabusRO.id) &&
        Objects.equals(this.masterBoard, syllabusRO.masterBoard) &&
        Objects.equals(this.masterClass, syllabusRO.masterClass) &&
        Objects.equals(this.masterSubject, syllabusRO.masterSubject) &&
        Objects.equals(this.name, syllabusRO.name) &&
        Objects.equals(this.rootNodeId, syllabusRO.rootNodeId) &&
        Objects.equals(this.tlm, syllabusRO.tlm) &&
        Objects.equals(this.tsp, syllabusRO.tsp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapterCount, custom, id, masterBoard, masterClass, masterSubject, name, rootNodeId, tlm, tsp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyllabusRO {\n");
    
    sb.append("    chapterCount: ").append(toIndentedString(chapterCount)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    masterBoard: ").append(toIndentedString(masterBoard)).append("\n");
    sb.append("    masterClass: ").append(toIndentedString(masterClass)).append("\n");
    sb.append("    masterSubject: ").append(toIndentedString(masterSubject)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rootNodeId: ").append(toIndentedString(rootNodeId)).append("\n");
    sb.append("    tlm: ").append(toIndentedString(tlm)).append("\n");
    sb.append("    tsp: ").append(toIndentedString(tsp)).append("\n");
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
