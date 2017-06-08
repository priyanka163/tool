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
 * AttemptSummaryResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class AttemptSummaryResponse   {
  @SerializedName("application")
  private Integer application = null;

  @SerializedName("assessmentId")
  private Long assessmentId = null;

  @SerializedName("assessmentName")
  private String assessmentName = null;

  @SerializedName("attemptedOn")
  private String attemptedOn = null;

  @SerializedName("comprehension")
  private Integer comprehension = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isCompleted")
  private Boolean isCompleted = null;

  @SerializedName("knowledge")
  private Integer knowledge = null;

  @SerializedName("percentScored")
  private Double percentScored = null;

  @SerializedName("securedMarks")
  private Double securedMarks = null;

  @SerializedName("synthesis")
  private Integer synthesis = null;

  public AttemptSummaryResponse application(Integer application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getApplication() {
    return application;
  }

  public void setApplication(Integer application) {
    this.application = application;
  }

  public AttemptSummaryResponse assessmentId(Long assessmentId) {
    this.assessmentId = assessmentId;
    return this;
  }

   /**
   * Get assessmentId
   * @return assessmentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAssessmentId() {
    return assessmentId;
  }

  public void setAssessmentId(Long assessmentId) {
    this.assessmentId = assessmentId;
  }

  public AttemptSummaryResponse assessmentName(String assessmentName) {
    this.assessmentName = assessmentName;
    return this;
  }

   /**
   * Get assessmentName
   * @return assessmentName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssessmentName() {
    return assessmentName;
  }

  public void setAssessmentName(String assessmentName) {
    this.assessmentName = assessmentName;
  }

  public AttemptSummaryResponse attemptedOn(String attemptedOn) {
    this.attemptedOn = attemptedOn;
    return this;
  }

   /**
   * Get attemptedOn
   * @return attemptedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAttemptedOn() {
    return attemptedOn;
  }

  public void setAttemptedOn(String attemptedOn) {
    this.attemptedOn = attemptedOn;
  }

  public AttemptSummaryResponse comprehension(Integer comprehension) {
    this.comprehension = comprehension;
    return this;
  }

   /**
   * Get comprehension
   * @return comprehension
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getComprehension() {
    return comprehension;
  }

  public void setComprehension(Integer comprehension) {
    this.comprehension = comprehension;
  }

  public AttemptSummaryResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AttemptSummaryResponse isCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
    return this;
  }

   /**
   * Get isCompleted
   * @return isCompleted
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public AttemptSummaryResponse knowledge(Integer knowledge) {
    this.knowledge = knowledge;
    return this;
  }

   /**
   * Get knowledge
   * @return knowledge
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getKnowledge() {
    return knowledge;
  }

  public void setKnowledge(Integer knowledge) {
    this.knowledge = knowledge;
  }

  public AttemptSummaryResponse percentScored(Double percentScored) {
    this.percentScored = percentScored;
    return this;
  }

   /**
   * Get percentScored
   * @return percentScored
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getPercentScored() {
    return percentScored;
  }

  public void setPercentScored(Double percentScored) {
    this.percentScored = percentScored;
  }

  public AttemptSummaryResponse securedMarks(Double securedMarks) {
    this.securedMarks = securedMarks;
    return this;
  }

   /**
   * Get securedMarks
   * @return securedMarks
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSecuredMarks() {
    return securedMarks;
  }

  public void setSecuredMarks(Double securedMarks) {
    this.securedMarks = securedMarks;
  }

  public AttemptSummaryResponse synthesis(Integer synthesis) {
    this.synthesis = synthesis;
    return this;
  }

   /**
   * Get synthesis
   * @return synthesis
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSynthesis() {
    return synthesis;
  }

  public void setSynthesis(Integer synthesis) {
    this.synthesis = synthesis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttemptSummaryResponse attemptSummaryResponse = (AttemptSummaryResponse) o;
    return Objects.equals(this.application, attemptSummaryResponse.application) &&
        Objects.equals(this.assessmentId, attemptSummaryResponse.assessmentId) &&
        Objects.equals(this.assessmentName, attemptSummaryResponse.assessmentName) &&
        Objects.equals(this.attemptedOn, attemptSummaryResponse.attemptedOn) &&
        Objects.equals(this.comprehension, attemptSummaryResponse.comprehension) &&
        Objects.equals(this.id, attemptSummaryResponse.id) &&
        Objects.equals(this.isCompleted, attemptSummaryResponse.isCompleted) &&
        Objects.equals(this.knowledge, attemptSummaryResponse.knowledge) &&
        Objects.equals(this.percentScored, attemptSummaryResponse.percentScored) &&
        Objects.equals(this.securedMarks, attemptSummaryResponse.securedMarks) &&
        Objects.equals(this.synthesis, attemptSummaryResponse.synthesis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, assessmentId, assessmentName, attemptedOn, comprehension, id, isCompleted, knowledge, percentScored, securedMarks, synthesis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttemptSummaryResponse {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    assessmentId: ").append(toIndentedString(assessmentId)).append("\n");
    sb.append("    assessmentName: ").append(toIndentedString(assessmentName)).append("\n");
    sb.append("    attemptedOn: ").append(toIndentedString(attemptedOn)).append("\n");
    sb.append("    comprehension: ").append(toIndentedString(comprehension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    knowledge: ").append(toIndentedString(knowledge)).append("\n");
    sb.append("    percentScored: ").append(toIndentedString(percentScored)).append("\n");
    sb.append("    securedMarks: ").append(toIndentedString(securedMarks)).append("\n");
    sb.append("    synthesis: ").append(toIndentedString(synthesis)).append("\n");
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
