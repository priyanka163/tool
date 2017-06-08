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
import org.joda.time.DateTime;


/**
 * LearningPlanShortResponseV2
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class LearningPlanShortResponseV2   {
  @SerializedName("chapterId")
  private Long chapterId = null;

  @SerializedName("chapterPlanNumber")
  private Long chapterPlanNumber = null;

  @SerializedName("learningPlanUuid")
  private String learningPlanUuid = null;

  @SerializedName("learningplanMemberUuid")
  private String learningplanMemberUuid = null;

  @SerializedName("lpDate")
  private DateTime lpDate = null;

  @SerializedName("subjectPlanNumber")
  private Long subjectPlanNumber = null;

  @SerializedName("type")
  private String type = null;

  public LearningPlanShortResponseV2 chapterId(Long chapterId) {
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

  public LearningPlanShortResponseV2 chapterPlanNumber(Long chapterPlanNumber) {
    this.chapterPlanNumber = chapterPlanNumber;
    return this;
  }

   /**
   * Get chapterPlanNumber
   * @return chapterPlanNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChapterPlanNumber() {
    return chapterPlanNumber;
  }

  public void setChapterPlanNumber(Long chapterPlanNumber) {
    this.chapterPlanNumber = chapterPlanNumber;
  }

  public LearningPlanShortResponseV2 learningPlanUuid(String learningPlanUuid) {
    this.learningPlanUuid = learningPlanUuid;
    return this;
  }

   /**
   * Get learningPlanUuid
   * @return learningPlanUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLearningPlanUuid() {
    return learningPlanUuid;
  }

  public void setLearningPlanUuid(String learningPlanUuid) {
    this.learningPlanUuid = learningPlanUuid;
  }

  public LearningPlanShortResponseV2 learningplanMemberUuid(String learningplanMemberUuid) {
    this.learningplanMemberUuid = learningplanMemberUuid;
    return this;
  }

   /**
   * Get learningplanMemberUuid
   * @return learningplanMemberUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLearningplanMemberUuid() {
    return learningplanMemberUuid;
  }

  public void setLearningplanMemberUuid(String learningplanMemberUuid) {
    this.learningplanMemberUuid = learningplanMemberUuid;
  }

  public LearningPlanShortResponseV2 lpDate(DateTime lpDate) {
    this.lpDate = lpDate;
    return this;
  }

   /**
   * Get lpDate
   * @return lpDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getLpDate() {
    return lpDate;
  }

  public void setLpDate(DateTime lpDate) {
    this.lpDate = lpDate;
  }

  public LearningPlanShortResponseV2 subjectPlanNumber(Long subjectPlanNumber) {
    this.subjectPlanNumber = subjectPlanNumber;
    return this;
  }

   /**
   * Get subjectPlanNumber
   * @return subjectPlanNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSubjectPlanNumber() {
    return subjectPlanNumber;
  }

  public void setSubjectPlanNumber(Long subjectPlanNumber) {
    this.subjectPlanNumber = subjectPlanNumber;
  }

  public LearningPlanShortResponseV2 type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningPlanShortResponseV2 learningPlanShortResponseV2 = (LearningPlanShortResponseV2) o;
    return Objects.equals(this.chapterId, learningPlanShortResponseV2.chapterId) &&
        Objects.equals(this.chapterPlanNumber, learningPlanShortResponseV2.chapterPlanNumber) &&
        Objects.equals(this.learningPlanUuid, learningPlanShortResponseV2.learningPlanUuid) &&
        Objects.equals(this.learningplanMemberUuid, learningPlanShortResponseV2.learningplanMemberUuid) &&
        Objects.equals(this.lpDate, learningPlanShortResponseV2.lpDate) &&
        Objects.equals(this.subjectPlanNumber, learningPlanShortResponseV2.subjectPlanNumber) &&
        Objects.equals(this.type, learningPlanShortResponseV2.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapterId, chapterPlanNumber, learningPlanUuid, learningplanMemberUuid, lpDate, subjectPlanNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningPlanShortResponseV2 {\n");
    
    sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
    sb.append("    chapterPlanNumber: ").append(toIndentedString(chapterPlanNumber)).append("\n");
    sb.append("    learningPlanUuid: ").append(toIndentedString(learningPlanUuid)).append("\n");
    sb.append("    learningplanMemberUuid: ").append(toIndentedString(learningplanMemberUuid)).append("\n");
    sb.append("    lpDate: ").append(toIndentedString(lpDate)).append("\n");
    sb.append("    subjectPlanNumber: ").append(toIndentedString(subjectPlanNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

