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
import com.nexteducation.swagger.nextsws.model.AssessmentQuestionShortResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentSectionWeightageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * AssessmentSectionWOAnswerResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class AssessmentSectionWOAnswerResponse   {
  @SerializedName("assessmentSectionWeightages")
  private List<AssessmentSectionWeightageResponse> assessmentSectionWeightages = new ArrayList<AssessmentSectionWeightageResponse>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("marks")
  private Integer marks = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("questions")
  private List<AssessmentQuestionShortResponse> questions = new ArrayList<AssessmentQuestionShortResponse>();

  @SerializedName("time")
  private Integer time = null;

  public AssessmentSectionWOAnswerResponse assessmentSectionWeightages(List<AssessmentSectionWeightageResponse> assessmentSectionWeightages) {
    this.assessmentSectionWeightages = assessmentSectionWeightages;
    return this;
  }

  public AssessmentSectionWOAnswerResponse addAssessmentSectionWeightagesItem(AssessmentSectionWeightageResponse assessmentSectionWeightagesItem) {
    this.assessmentSectionWeightages.add(assessmentSectionWeightagesItem);
    return this;
  }

   /**
   * Get assessmentSectionWeightages
   * @return assessmentSectionWeightages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AssessmentSectionWeightageResponse> getAssessmentSectionWeightages() {
    return assessmentSectionWeightages;
  }

  public void setAssessmentSectionWeightages(List<AssessmentSectionWeightageResponse> assessmentSectionWeightages) {
    this.assessmentSectionWeightages = assessmentSectionWeightages;
  }

  public AssessmentSectionWOAnswerResponse id(Long id) {
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

  public AssessmentSectionWOAnswerResponse marks(Integer marks) {
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

  public AssessmentSectionWOAnswerResponse name(String name) {
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

  public AssessmentSectionWOAnswerResponse questions(List<AssessmentQuestionShortResponse> questions) {
    this.questions = questions;
    return this;
  }

  public AssessmentSectionWOAnswerResponse addQuestionsItem(AssessmentQuestionShortResponse questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AssessmentQuestionShortResponse> getQuestions() {
    return questions;
  }

  public void setQuestions(List<AssessmentQuestionShortResponse> questions) {
    this.questions = questions;
  }

  public AssessmentSectionWOAnswerResponse time(Integer time) {
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
    AssessmentSectionWOAnswerResponse assessmentSectionWOAnswerResponse = (AssessmentSectionWOAnswerResponse) o;
    return Objects.equals(this.assessmentSectionWeightages, assessmentSectionWOAnswerResponse.assessmentSectionWeightages) &&
        Objects.equals(this.id, assessmentSectionWOAnswerResponse.id) &&
        Objects.equals(this.marks, assessmentSectionWOAnswerResponse.marks) &&
        Objects.equals(this.name, assessmentSectionWOAnswerResponse.name) &&
        Objects.equals(this.questions, assessmentSectionWOAnswerResponse.questions) &&
        Objects.equals(this.time, assessmentSectionWOAnswerResponse.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentSectionWeightages, id, marks, name, questions, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentSectionWOAnswerResponse {\n");
    
    sb.append("    assessmentSectionWeightages: ").append(toIndentedString(assessmentSectionWeightages)).append("\n");
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

