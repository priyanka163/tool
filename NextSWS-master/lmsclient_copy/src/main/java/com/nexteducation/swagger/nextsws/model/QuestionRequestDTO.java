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
import com.nexteducation.swagger.nextsws.model.QuestionRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * QuestionRequestDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class QuestionRequestDTO   {
  @SerializedName("customSyllabusNode")
  private Boolean customSyllabusNode = null;

  @SerializedName("question")
  private QuestionRequest question = null;

  public QuestionRequestDTO customSyllabusNode(Boolean customSyllabusNode) {
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

  public QuestionRequestDTO question(QuestionRequest question) {
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @ApiModelProperty(example = "null", value = "")
  public QuestionRequest getQuestion() {
    return question;
  }

  public void setQuestion(QuestionRequest question) {
    this.question = question;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionRequestDTO questionRequestDTO = (QuestionRequestDTO) o;
    return Objects.equals(this.customSyllabusNode, questionRequestDTO.customSyllabusNode) &&
        Objects.equals(this.question, questionRequestDTO.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customSyllabusNode, question);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionRequestDTO {\n");
    
    sb.append("    customSyllabusNode: ").append(toIndentedString(customSyllabusNode)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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

