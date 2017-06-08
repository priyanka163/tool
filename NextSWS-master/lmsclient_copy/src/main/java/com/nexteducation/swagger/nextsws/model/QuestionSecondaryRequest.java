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
 * QuestionSecondaryRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class QuestionSecondaryRequest   {
  @SerializedName("adaptive")
  private Boolean adaptive = null;

  @SerializedName("correctlyAnsweredCount")
  private Long correctlyAnsweredCount = null;

  @SerializedName("examType")
  private String examType = null;

  @SerializedName("expectedLength")
  private Integer expectedLength = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("paymentType")
  private String paymentType = null;

  @SerializedName("totalAttemptCount")
  private Long totalAttemptCount = null;

  public QuestionSecondaryRequest adaptive(Boolean adaptive) {
    this.adaptive = adaptive;
    return this;
  }

   /**
   * Get adaptive
   * @return adaptive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAdaptive() {
    return adaptive;
  }

  public void setAdaptive(Boolean adaptive) {
    this.adaptive = adaptive;
  }

  public QuestionSecondaryRequest correctlyAnsweredCount(Long correctlyAnsweredCount) {
    this.correctlyAnsweredCount = correctlyAnsweredCount;
    return this;
  }

   /**
   * Get correctlyAnsweredCount
   * @return correctlyAnsweredCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCorrectlyAnsweredCount() {
    return correctlyAnsweredCount;
  }

  public void setCorrectlyAnsweredCount(Long correctlyAnsweredCount) {
    this.correctlyAnsweredCount = correctlyAnsweredCount;
  }

  public QuestionSecondaryRequest examType(String examType) {
    this.examType = examType;
    return this;
  }

   /**
   * Get examType
   * @return examType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExamType() {
    return examType;
  }

  public void setExamType(String examType) {
    this.examType = examType;
  }

  public QuestionSecondaryRequest expectedLength(Integer expectedLength) {
    this.expectedLength = expectedLength;
    return this;
  }

   /**
   * Get expectedLength
   * @return expectedLength
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getExpectedLength() {
    return expectedLength;
  }

  public void setExpectedLength(Integer expectedLength) {
    this.expectedLength = expectedLength;
  }

  public QuestionSecondaryRequest id(Long id) {
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

  public QuestionSecondaryRequest paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public QuestionSecondaryRequest totalAttemptCount(Long totalAttemptCount) {
    this.totalAttemptCount = totalAttemptCount;
    return this;
  }

   /**
   * Get totalAttemptCount
   * @return totalAttemptCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotalAttemptCount() {
    return totalAttemptCount;
  }

  public void setTotalAttemptCount(Long totalAttemptCount) {
    this.totalAttemptCount = totalAttemptCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionSecondaryRequest questionSecondaryRequest = (QuestionSecondaryRequest) o;
    return Objects.equals(this.adaptive, questionSecondaryRequest.adaptive) &&
        Objects.equals(this.correctlyAnsweredCount, questionSecondaryRequest.correctlyAnsweredCount) &&
        Objects.equals(this.examType, questionSecondaryRequest.examType) &&
        Objects.equals(this.expectedLength, questionSecondaryRequest.expectedLength) &&
        Objects.equals(this.id, questionSecondaryRequest.id) &&
        Objects.equals(this.paymentType, questionSecondaryRequest.paymentType) &&
        Objects.equals(this.totalAttemptCount, questionSecondaryRequest.totalAttemptCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptive, correctlyAnsweredCount, examType, expectedLength, id, paymentType, totalAttemptCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionSecondaryRequest {\n");
    
    sb.append("    adaptive: ").append(toIndentedString(adaptive)).append("\n");
    sb.append("    correctlyAnsweredCount: ").append(toIndentedString(correctlyAnsweredCount)).append("\n");
    sb.append("    examType: ").append(toIndentedString(examType)).append("\n");
    sb.append("    expectedLength: ").append(toIndentedString(expectedLength)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    totalAttemptCount: ").append(toIndentedString(totalAttemptCount)).append("\n");
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

