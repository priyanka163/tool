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
import com.nexteducation.swagger.nextsws.model.AssessmentSectionQuestionRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentSectionWeightageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * AssessmentSectionRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class AssessmentSectionRequest   {
  @SerializedName("assessmentSectionWeightages")
  private List<AssessmentSectionWeightageRequest> assessmentSectionWeightages = new ArrayList<AssessmentSectionWeightageRequest>();

  @SerializedName("assessmentUUID")
  private String assessmentUUID = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("marks")
  private Integer marks = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("questions")
  private List<AssessmentSectionQuestionRequest> questions = new ArrayList<AssessmentSectionQuestionRequest>();

  @SerializedName("time")
  private Integer time = null;

  public AssessmentSectionRequest assessmentSectionWeightages(List<AssessmentSectionWeightageRequest> assessmentSectionWeightages) {
    this.assessmentSectionWeightages = assessmentSectionWeightages;
    return this;
  }

  public AssessmentSectionRequest addAssessmentSectionWeightagesItem(AssessmentSectionWeightageRequest assessmentSectionWeightagesItem) {
    this.assessmentSectionWeightages.add(assessmentSectionWeightagesItem);
    return this;
  }

   /**
   * Get assessmentSectionWeightages
   * @return assessmentSectionWeightages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AssessmentSectionWeightageRequest> getAssessmentSectionWeightages() {
    return assessmentSectionWeightages;
  }

  public void setAssessmentSectionWeightages(List<AssessmentSectionWeightageRequest> assessmentSectionWeightages) {
    this.assessmentSectionWeightages = assessmentSectionWeightages;
  }

  public AssessmentSectionRequest assessmentUUID(String assessmentUUID) {
    this.assessmentUUID = assessmentUUID;
    return this;
  }

   /**
   * Get assessmentUUID
   * @return assessmentUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssessmentUUID() {
    return assessmentUUID;
  }

  public void setAssessmentUUID(String assessmentUUID) {
    this.assessmentUUID = assessmentUUID;
  }

  public AssessmentSectionRequest id(Long id) {
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

  public AssessmentSectionRequest marks(Integer marks) {
    this.marks = marks;
    return this;
  }

   /**
   * Get marks
   * @return marks
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMarks() {
    return marks;
  }

  public void setMarks(Integer marks) {
    this.marks = marks;
  }

  public AssessmentSectionRequest name(String name) {
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

  public AssessmentSectionRequest questions(List<AssessmentSectionQuestionRequest> questions) {
    this.questions = questions;
    return this;
  }

  public AssessmentSectionRequest addQuestionsItem(AssessmentSectionQuestionRequest questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AssessmentSectionQuestionRequest> getQuestions() {
    return questions;
  }

  public void setQuestions(List<AssessmentSectionQuestionRequest> questions) {
    this.questions = questions;
  }

  public AssessmentSectionRequest time(Integer time) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssessmentSectionRequest assessmentSectionRequest = (AssessmentSectionRequest) o;
    return Objects.equals(this.assessmentSectionWeightages, assessmentSectionRequest.assessmentSectionWeightages) &&
        Objects.equals(this.assessmentUUID, assessmentSectionRequest.assessmentUUID) &&
        Objects.equals(this.id, assessmentSectionRequest.id) &&
        Objects.equals(this.marks, assessmentSectionRequest.marks) &&
        Objects.equals(this.name, assessmentSectionRequest.name) &&
        Objects.equals(this.questions, assessmentSectionRequest.questions) &&
        Objects.equals(this.time, assessmentSectionRequest.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentSectionWeightages, assessmentUUID, id, marks, name, questions, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentSectionRequest {\n");
    
    sb.append("    assessmentSectionWeightages: ").append(toIndentedString(assessmentSectionWeightages)).append("\n");
    sb.append("    assessmentUUID: ").append(toIndentedString(assessmentUUID)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    marks: ").append(toIndentedString(marks)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

