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
import com.nexteducation.swagger.nextsws.model.WorksheetRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * WorksheetDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class WorksheetDTO   {
  @SerializedName("classId")
  private Long classId = null;

  @SerializedName("customSyllabusNode")
  private Boolean customSyllabusNode = null;

  /**
   * Gets or Sets location
   */
  public enum LocationEnum {
    @SerializedName("Classroom")
    CLASSROOM("Classroom"),
    
    @SerializedName("Lab")
    LAB("Lab"),
    
    @SerializedName("Homework")
    HOMEWORK("Homework");

    private String value;

    LocationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("location")
  private LocationEnum location = null;

  @SerializedName("resourceUuid")
  private String resourceUuid = null;

  @SerializedName("sectionId")
  private Long sectionId = null;

  @SerializedName("syllabusNode")
  private Long syllabusNode = null;

  @SerializedName("worksheetRequest")
  private WorksheetRequest worksheetRequest = null;

  public WorksheetDTO classId(Long classId) {
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

  public WorksheetDTO customSyllabusNode(Boolean customSyllabusNode) {
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

  public WorksheetDTO location(LocationEnum location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocationEnum getLocation() {
    return location;
  }

  public void setLocation(LocationEnum location) {
    this.location = location;
  }

  public WorksheetDTO resourceUuid(String resourceUuid) {
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

  public WorksheetDTO sectionId(Long sectionId) {
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

  public WorksheetDTO syllabusNode(Long syllabusNode) {
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

  public WorksheetDTO worksheetRequest(WorksheetRequest worksheetRequest) {
    this.worksheetRequest = worksheetRequest;
    return this;
  }

   /**
   * Get worksheetRequest
   * @return worksheetRequest
  **/
  @ApiModelProperty(example = "null", value = "")
  public WorksheetRequest getWorksheetRequest() {
    return worksheetRequest;
  }

  public void setWorksheetRequest(WorksheetRequest worksheetRequest) {
    this.worksheetRequest = worksheetRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorksheetDTO worksheetDTO = (WorksheetDTO) o;
    return Objects.equals(this.classId, worksheetDTO.classId) &&
        Objects.equals(this.customSyllabusNode, worksheetDTO.customSyllabusNode) &&
        Objects.equals(this.location, worksheetDTO.location) &&
        Objects.equals(this.resourceUuid, worksheetDTO.resourceUuid) &&
        Objects.equals(this.sectionId, worksheetDTO.sectionId) &&
        Objects.equals(this.syllabusNode, worksheetDTO.syllabusNode) &&
        Objects.equals(this.worksheetRequest, worksheetDTO.worksheetRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classId, customSyllabusNode, location, resourceUuid, sectionId, syllabusNode, worksheetRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorksheetDTO {\n");
    
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    customSyllabusNode: ").append(toIndentedString(customSyllabusNode)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceUuid: ").append(toIndentedString(resourceUuid)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    syllabusNode: ").append(toIndentedString(syllabusNode)).append("\n");
    sb.append("    worksheetRequest: ").append(toIndentedString(worksheetRequest)).append("\n");
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
