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
 * ResponseDeclarationCorrectAnswerRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class ResponseDeclarationCorrectAnswerRequest   {
  @SerializedName("answer")
  private String answer = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("mark")
  private Double mark = null;

  @SerializedName("responseDeclarationId")
  private Long responseDeclarationId = null;

  @SerializedName("sequenceNumber")
  private Integer sequenceNumber = null;

  public ResponseDeclarationCorrectAnswerRequest answer(String answer) {
    this.answer = answer;
    return this;
  }

   /**
   * Get answer
   * @return answer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public ResponseDeclarationCorrectAnswerRequest id(Long id) {
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

  public ResponseDeclarationCorrectAnswerRequest mark(Double mark) {
    this.mark = mark;
    return this;
  }

   /**
   * Get mark
   * @return mark
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMark() {
    return mark;
  }

  public void setMark(Double mark) {
    this.mark = mark;
  }

  public ResponseDeclarationCorrectAnswerRequest responseDeclarationId(Long responseDeclarationId) {
    this.responseDeclarationId = responseDeclarationId;
    return this;
  }

   /**
   * Get responseDeclarationId
   * @return responseDeclarationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getResponseDeclarationId() {
    return responseDeclarationId;
  }

  public void setResponseDeclarationId(Long responseDeclarationId) {
    this.responseDeclarationId = responseDeclarationId;
  }

  public ResponseDeclarationCorrectAnswerRequest sequenceNumber(Integer sequenceNumber) {
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
    ResponseDeclarationCorrectAnswerRequest responseDeclarationCorrectAnswerRequest = (ResponseDeclarationCorrectAnswerRequest) o;
    return Objects.equals(this.answer, responseDeclarationCorrectAnswerRequest.answer) &&
        Objects.equals(this.id, responseDeclarationCorrectAnswerRequest.id) &&
        Objects.equals(this.mark, responseDeclarationCorrectAnswerRequest.mark) &&
        Objects.equals(this.responseDeclarationId, responseDeclarationCorrectAnswerRequest.responseDeclarationId) &&
        Objects.equals(this.sequenceNumber, responseDeclarationCorrectAnswerRequest.sequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, id, mark, responseDeclarationId, sequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDeclarationCorrectAnswerRequest {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    responseDeclarationId: ").append(toIndentedString(responseDeclarationId)).append("\n");
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

