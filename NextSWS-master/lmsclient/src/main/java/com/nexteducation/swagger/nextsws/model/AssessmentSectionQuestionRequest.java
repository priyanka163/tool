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


/**
 * AssessmentSectionQuestionRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class AssessmentSectionQuestionRequest   {
  @SerializedName("assessmentSectionId")
  private String assessmentSectionId = null;

  @SerializedName("assessmentSectionQuestionId")
  private Long assessmentSectionQuestionId = null;

  @SerializedName("marks")
  private Double marks = null;

  @SerializedName("questionUUID")
  private String questionUUID = null;

  @SerializedName("srno")
  private Integer srno = null;

  public AssessmentSectionQuestionRequest assessmentSectionId(String assessmentSectionId) {
    this.assessmentSectionId = assessmentSectionId;
    return this;
  }

   /**
   * Get assessmentSectionId
   * @return assessmentSectionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssessmentSectionId() {
    return assessmentSectionId;
  }

  public void setAssessmentSectionId(String assessmentSectionId) {
    this.assessmentSectionId = assessmentSectionId;
  }

  public AssessmentSectionQuestionRequest assessmentSectionQuestionId(Long assessmentSectionQuestionId) {
    this.assessmentSectionQuestionId = assessmentSectionQuestionId;
    return this;
  }

   /**
   * Get assessmentSectionQuestionId
   * @return assessmentSectionQuestionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAssessmentSectionQuestionId() {
    return assessmentSectionQuestionId;
  }

  public void setAssessmentSectionQuestionId(Long assessmentSectionQuestionId) {
    this.assessmentSectionQuestionId = assessmentSectionQuestionId;
  }

  public AssessmentSectionQuestionRequest marks(Double marks) {
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

  public AssessmentSectionQuestionRequest questionUUID(String questionUUID) {
    this.questionUUID = questionUUID;
    return this;
  }

   /**
   * Get questionUUID
   * @return questionUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getQuestionUUID() {
    return questionUUID;
  }

  public void setQuestionUUID(String questionUUID) {
    this.questionUUID = questionUUID;
  }

  public AssessmentSectionQuestionRequest srno(Integer srno) {
    this.srno = srno;
    return this;
  }

   /**
   * Get srno
   * @return srno
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSrno() {
    return srno;
  }

  public void setSrno(Integer srno) {
    this.srno = srno;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssessmentSectionQuestionRequest assessmentSectionQuestionRequest = (AssessmentSectionQuestionRequest) o;
    return Objects.equals(this.assessmentSectionId, assessmentSectionQuestionRequest.assessmentSectionId) &&
        Objects.equals(this.assessmentSectionQuestionId, assessmentSectionQuestionRequest.assessmentSectionQuestionId) &&
        Objects.equals(this.marks, assessmentSectionQuestionRequest.marks) &&
        Objects.equals(this.questionUUID, assessmentSectionQuestionRequest.questionUUID) &&
        Objects.equals(this.srno, assessmentSectionQuestionRequest.srno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentSectionId, assessmentSectionQuestionId, marks, questionUUID, srno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentSectionQuestionRequest {\n");
    
    sb.append("    assessmentSectionId: ").append(toIndentedString(assessmentSectionId)).append("\n");
    sb.append("    assessmentSectionQuestionId: ").append(toIndentedString(assessmentSectionQuestionId)).append("\n");
    sb.append("    marks: ").append(toIndentedString(marks)).append("\n");
    sb.append("    questionUUID: ").append(toIndentedString(questionUUID)).append("\n");
    sb.append("    srno: ").append(toIndentedString(srno)).append("\n");
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

