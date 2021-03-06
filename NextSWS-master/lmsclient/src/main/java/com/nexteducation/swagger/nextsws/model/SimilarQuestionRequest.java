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
 * SimilarQuestionRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class SimilarQuestionRequest   {
  @SerializedName("bloomsTaxonomy")
  private String bloomsTaxonomy = null;

  @SerializedName("chapterId")
  private Long chapterId = null;

  @SerializedName("difficultyLevel")
  private String difficultyLevel = null;

  @SerializedName("marks")
  private Double marks = null;

  @SerializedName("questionType")
  private String questionType = null;

  public SimilarQuestionRequest bloomsTaxonomy(String bloomsTaxonomy) {
    this.bloomsTaxonomy = bloomsTaxonomy;
    return this;
  }

   /**
   * Get bloomsTaxonomy
   * @return bloomsTaxonomy
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBloomsTaxonomy() {
    return bloomsTaxonomy;
  }

  public void setBloomsTaxonomy(String bloomsTaxonomy) {
    this.bloomsTaxonomy = bloomsTaxonomy;
  }

  public SimilarQuestionRequest chapterId(Long chapterId) {
    this.chapterId = chapterId;
    return this;
  }

   /**
   * Get chapterId
   * @return chapterId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChapterId() {
    return chapterId;
  }

  public void setChapterId(Long chapterId) {
    this.chapterId = chapterId;
  }

  public SimilarQuestionRequest difficultyLevel(String difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
    return this;
  }

   /**
   * Get difficultyLevel
   * @return difficultyLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDifficultyLevel() {
    return difficultyLevel;
  }

  public void setDifficultyLevel(String difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
  }

  public SimilarQuestionRequest marks(Double marks) {
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

  public SimilarQuestionRequest questionType(String questionType) {
    this.questionType = questionType;
    return this;
  }

   /**
   * Get questionType
   * @return questionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getQuestionType() {
    return questionType;
  }

  public void setQuestionType(String questionType) {
    this.questionType = questionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarQuestionRequest similarQuestionRequest = (SimilarQuestionRequest) o;
    return Objects.equals(this.bloomsTaxonomy, similarQuestionRequest.bloomsTaxonomy) &&
        Objects.equals(this.chapterId, similarQuestionRequest.chapterId) &&
        Objects.equals(this.difficultyLevel, similarQuestionRequest.difficultyLevel) &&
        Objects.equals(this.marks, similarQuestionRequest.marks) &&
        Objects.equals(this.questionType, similarQuestionRequest.questionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bloomsTaxonomy, chapterId, difficultyLevel, marks, questionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarQuestionRequest {\n");
    
    sb.append("    bloomsTaxonomy: ").append(toIndentedString(bloomsTaxonomy)).append("\n");
    sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
    sb.append("    difficultyLevel: ").append(toIndentedString(difficultyLevel)).append("\n");
    sb.append("    marks: ").append(toIndentedString(marks)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
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

