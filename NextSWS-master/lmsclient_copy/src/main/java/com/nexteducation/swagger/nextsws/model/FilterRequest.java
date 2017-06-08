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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * FilterRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class FilterRequest   {
  @SerializedName("customSyllabusNode")
  private Boolean customSyllabusNode = null;

  @SerializedName("level")
  private Integer level = null;

  /**
   * Gets or Sets locations
   */
  public enum LocationsEnum {
    @SerializedName("Classroom")
    CLASSROOM("Classroom"),
    
    @SerializedName("Lab")
    LAB("Lab"),
    
    @SerializedName("Homework")
    HOMEWORK("Homework");

    private String value;

    LocationsEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("locations")
  private List<LocationsEnum> locations = new ArrayList<LocationsEnum>();

  @SerializedName("nodeUuid")
  private String nodeUuid = null;

  @SerializedName("resourceTypes")
  private List<Long> resourceTypes = new ArrayList<Long>();

  /**
   * Gets or Sets sectionTypes
   */
  public enum SectionTypesEnum {
    @SerializedName("Explanation")
    EXPLANATION("Explanation"),
    
    @SerializedName("Simulation")
    SIMULATION("Simulation"),
    
    @SerializedName("Solved_Problems")
    SOLVED_PROBLEMS("Solved_Problems"),
    
    @SerializedName("Flash_Card")
    FLASH_CARD("Flash_Card"),
    
    @SerializedName("Exercise")
    EXERCISE("Exercise"),
    
    @SerializedName("TSP")
    TSP("TSP"),
    
    @SerializedName("Library")
    LIBRARY("Library"),
    
    @SerializedName("CYU")
    CYU("CYU"),
    
    @SerializedName("Formative_Assessments")
    FORMATIVE_ASSESSMENTS("Formative_Assessments"),
    
    @SerializedName("Summative_Assessments")
    SUMMATIVE_ASSESSMENTS("Summative_Assessments"),
    
    @SerializedName("HOTS")
    HOTS("HOTS"),
    
    @SerializedName("Quiz")
    QUIZ("Quiz"),
    
    @SerializedName("Lesson_Plan")
    LESSON_PLAN("Lesson_Plan"),
    
    @SerializedName("Paper_Cutting")
    PAPER_CUTTING("Paper_Cutting"),
    
    @SerializedName("Hands_On_Activity")
    HANDS_ON_ACTIVITY("Hands_On_Activity"),
    
    @SerializedName("Practical_Geometry")
    PRACTICAL_GEOMETRY("Practical_Geometry"),
    
    @SerializedName("Activity")
    ACTIVITY("Activity"),
    
    @SerializedName("Experiment")
    EXPERIMENT("Experiment"),
    
    @SerializedName("Story")
    STORY("Story"),
    
    @SerializedName("QuestAns")
    QUESTANS("QuestAns"),
    
    @SerializedName("Wiki")
    WIKI("Wiki"),
    
    @SerializedName("MindMap")
    MINDMAP("MindMap"),
    
    @SerializedName("TSP_VIDEO")
    TSP_VIDEO("TSP_VIDEO"),
    
    @SerializedName("Textbook_Activity")
    TEXTBOOK_ACTIVITY("Textbook_Activity"),
    
    @SerializedName("Companion_Activity")
    COMPANION_ACTIVITY("Companion_Activity"),
    
    @SerializedName("Teacher_Manual_Activity")
    TEACHER_MANUAL_ACTIVITY("Teacher_Manual_Activity"),
    
    @SerializedName("PPVideo")
    PPVIDEO("PPVideo"),
    
    @SerializedName("ASL")
    ASL("ASL"),
    
    @SerializedName("CBT")
    CBT("CBT"),
    
    @SerializedName("Test_Paper")
    TEST_PAPER("Test_Paper"),
    
    @SerializedName("EBooks")
    EBOOKS("EBooks"),
    
    @SerializedName("Other")
    OTHER("Other"),
    
    @SerializedName("NoteBook")
    NOTEBOOK("NoteBook"),
    
    @SerializedName("Assessment")
    ASSESSMENT("Assessment"),
    
    @SerializedName("Post")
    POST("Post"),
    
    @SerializedName("Question")
    QUESTION("Question"),
    
    @SerializedName("WhiteBoard")
    WHITEBOARD("WhiteBoard");

    private String value;

    SectionTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("sectionTypes")
  private List<SectionTypesEnum> sectionTypes = new ArrayList<SectionTypesEnum>();

  public FilterRequest customSyllabusNode(Boolean customSyllabusNode) {
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

  public FilterRequest level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public FilterRequest locations(List<LocationsEnum> locations) {
    this.locations = locations;
    return this;
  }

  public FilterRequest addLocationsItem(LocationsEnum locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocationsEnum> getLocations() {
    return locations;
  }

  public void setLocations(List<LocationsEnum> locations) {
    this.locations = locations;
  }

  public FilterRequest nodeUuid(String nodeUuid) {
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

  public FilterRequest resourceTypes(List<Long> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public FilterRequest addResourceTypesItem(Long resourceTypesItem) {
    this.resourceTypes.add(resourceTypesItem);
    return this;
  }

   /**
   * Get resourceTypes
   * @return resourceTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getResourceTypes() {
    return resourceTypes;
  }

  public void setResourceTypes(List<Long> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }

  public FilterRequest sectionTypes(List<SectionTypesEnum> sectionTypes) {
    this.sectionTypes = sectionTypes;
    return this;
  }

  public FilterRequest addSectionTypesItem(SectionTypesEnum sectionTypesItem) {
    this.sectionTypes.add(sectionTypesItem);
    return this;
  }

   /**
   * Get sectionTypes
   * @return sectionTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SectionTypesEnum> getSectionTypes() {
    return sectionTypes;
  }

  public void setSectionTypes(List<SectionTypesEnum> sectionTypes) {
    this.sectionTypes = sectionTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterRequest filterRequest = (FilterRequest) o;
    return Objects.equals(this.customSyllabusNode, filterRequest.customSyllabusNode) &&
        Objects.equals(this.level, filterRequest.level) &&
        Objects.equals(this.locations, filterRequest.locations) &&
        Objects.equals(this.nodeUuid, filterRequest.nodeUuid) &&
        Objects.equals(this.resourceTypes, filterRequest.resourceTypes) &&
        Objects.equals(this.sectionTypes, filterRequest.sectionTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customSyllabusNode, level, locations, nodeUuid, resourceTypes, sectionTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterRequest {\n");
    
    sb.append("    customSyllabusNode: ").append(toIndentedString(customSyllabusNode)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
    sb.append("    sectionTypes: ").append(toIndentedString(sectionTypes)).append("\n");
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

