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
import com.nexteducation.swagger.nextsws.model.ResourceResponse;
import com.nexteducation.swagger.nextsws.model.StudentDetailResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * LearningPlanHomeworkTaskResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class LearningPlanHomeworkTaskResponse   {
  @SerializedName("learningPlanResourceUuidToResourceResponseMap")
  private Map<String, ResourceResponse> learningPlanResourceUuidToResourceResponseMap = new HashMap<String, ResourceResponse>();

  @SerializedName("learningPlanResourceUuidToTasks")
  private Map<String, List> learningPlanResourceUuidToTasks = new HashMap<String, List>();

  @SerializedName("students")
  private Map<String, StudentDetailResponse> students = new HashMap<String, StudentDetailResponse>();

  public LearningPlanHomeworkTaskResponse learningPlanResourceUuidToResourceResponseMap(Map<String, ResourceResponse> learningPlanResourceUuidToResourceResponseMap) {
    this.learningPlanResourceUuidToResourceResponseMap = learningPlanResourceUuidToResourceResponseMap;
    return this;
  }

  public LearningPlanHomeworkTaskResponse putLearningPlanResourceUuidToResourceResponseMapItem(String key, ResourceResponse learningPlanResourceUuidToResourceResponseMapItem) {
    this.learningPlanResourceUuidToResourceResponseMap.put(key, learningPlanResourceUuidToResourceResponseMapItem);
    return this;
  }

   /**
   * Get learningPlanResourceUuidToResourceResponseMap
   * @return learningPlanResourceUuidToResourceResponseMap
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, ResourceResponse> getLearningPlanResourceUuidToResourceResponseMap() {
    return learningPlanResourceUuidToResourceResponseMap;
  }

  public void setLearningPlanResourceUuidToResourceResponseMap(Map<String, ResourceResponse> learningPlanResourceUuidToResourceResponseMap) {
    this.learningPlanResourceUuidToResourceResponseMap = learningPlanResourceUuidToResourceResponseMap;
  }

  public LearningPlanHomeworkTaskResponse learningPlanResourceUuidToTasks(Map<String, List> learningPlanResourceUuidToTasks) {
    this.learningPlanResourceUuidToTasks = learningPlanResourceUuidToTasks;
    return this;
  }

  public LearningPlanHomeworkTaskResponse putLearningPlanResourceUuidToTasksItem(String key, List learningPlanResourceUuidToTasksItem) {
    this.learningPlanResourceUuidToTasks.put(key, learningPlanResourceUuidToTasksItem);
    return this;
  }

   /**
   * Get learningPlanResourceUuidToTasks
   * @return learningPlanResourceUuidToTasks
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, List> getLearningPlanResourceUuidToTasks() {
    return learningPlanResourceUuidToTasks;
  }

  public void setLearningPlanResourceUuidToTasks(Map<String, List> learningPlanResourceUuidToTasks) {
    this.learningPlanResourceUuidToTasks = learningPlanResourceUuidToTasks;
  }

  public LearningPlanHomeworkTaskResponse students(Map<String, StudentDetailResponse> students) {
    this.students = students;
    return this;
  }

  public LearningPlanHomeworkTaskResponse putStudentsItem(String key, StudentDetailResponse studentsItem) {
    this.students.put(key, studentsItem);
    return this;
  }

   /**
   * Get students
   * @return students
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, StudentDetailResponse> getStudents() {
    return students;
  }

  public void setStudents(Map<String, StudentDetailResponse> students) {
    this.students = students;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningPlanHomeworkTaskResponse learningPlanHomeworkTaskResponse = (LearningPlanHomeworkTaskResponse) o;
    return Objects.equals(this.learningPlanResourceUuidToResourceResponseMap, learningPlanHomeworkTaskResponse.learningPlanResourceUuidToResourceResponseMap) &&
        Objects.equals(this.learningPlanResourceUuidToTasks, learningPlanHomeworkTaskResponse.learningPlanResourceUuidToTasks) &&
        Objects.equals(this.students, learningPlanHomeworkTaskResponse.students);
  }

  @Override
  public int hashCode() {
    return Objects.hash(learningPlanResourceUuidToResourceResponseMap, learningPlanResourceUuidToTasks, students);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningPlanHomeworkTaskResponse {\n");
    
    sb.append("    learningPlanResourceUuidToResourceResponseMap: ").append(toIndentedString(learningPlanResourceUuidToResourceResponseMap)).append("\n");
    sb.append("    learningPlanResourceUuidToTasks: ").append(toIndentedString(learningPlanResourceUuidToTasks)).append("\n");
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
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

