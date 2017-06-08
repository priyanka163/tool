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
 * QuestionAssetResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class QuestionAssetResponse   {
  @SerializedName("assetId")
  private String assetId = null;

  @SerializedName("questionAssetId")
  private Long questionAssetId = null;

  @SerializedName("questionId")
  private Long questionId = null;

  @SerializedName("sequenceNumber")
  private Integer sequenceNumber = null;

  public QuestionAssetResponse assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public QuestionAssetResponse questionAssetId(Long questionAssetId) {
    this.questionAssetId = questionAssetId;
    return this;
  }

   /**
   * Get questionAssetId
   * @return questionAssetId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getQuestionAssetId() {
    return questionAssetId;
  }

  public void setQuestionAssetId(Long questionAssetId) {
    this.questionAssetId = questionAssetId;
  }

  public QuestionAssetResponse questionId(Long questionId) {
    this.questionId = questionId;
    return this;
  }

   /**
   * Get questionId
   * @return questionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }

  public QuestionAssetResponse sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Get sequenceNumber
   * @return sequenceNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionAssetResponse questionAssetResponse = (QuestionAssetResponse) o;
    return Objects.equals(this.assetId, questionAssetResponse.assetId) &&
        Objects.equals(this.questionAssetId, questionAssetResponse.questionAssetId) &&
        Objects.equals(this.questionId, questionAssetResponse.questionId) &&
        Objects.equals(this.sequenceNumber, questionAssetResponse.sequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, questionAssetId, questionId, sequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionAssetResponse {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    questionAssetId: ").append(toIndentedString(questionAssetId)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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
