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
 * WeeklySummaryRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class WeeklySummaryRequest   {
  @SerializedName("chapterId")
  private Long chapterId = null;

  @SerializedName("dateInWeek")
  private DateTime dateInWeek = null;

  @SerializedName("ifCustomChapter")
  private Boolean ifCustomChapter = null;

  @SerializedName("ifCustomSyllabus")
  private Boolean ifCustomSyllabus = null;

  @SerializedName("syllabusId")
  private Long syllabusId = null;

  public WeeklySummaryRequest chapterId(Long chapterId) {
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

  public WeeklySummaryRequest dateInWeek(DateTime dateInWeek) {
    this.dateInWeek = dateInWeek;
    return this;
  }

   /**
   * Get dateInWeek
   * @return dateInWeek
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDateInWeek() {
    return dateInWeek;
  }

  public void setDateInWeek(DateTime dateInWeek) {
    this.dateInWeek = dateInWeek;
  }

  public WeeklySummaryRequest ifCustomChapter(Boolean ifCustomChapter) {
    this.ifCustomChapter = ifCustomChapter;
    return this;
  }

   /**
   * Get ifCustomChapter
   * @return ifCustomChapter
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIfCustomChapter() {
    return ifCustomChapter;
  }

  public void setIfCustomChapter(Boolean ifCustomChapter) {
    this.ifCustomChapter = ifCustomChapter;
  }

  public WeeklySummaryRequest ifCustomSyllabus(Boolean ifCustomSyllabus) {
    this.ifCustomSyllabus = ifCustomSyllabus;
    return this;
  }

   /**
   * Get ifCustomSyllabus
   * @return ifCustomSyllabus
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIfCustomSyllabus() {
    return ifCustomSyllabus;
  }

  public void setIfCustomSyllabus(Boolean ifCustomSyllabus) {
    this.ifCustomSyllabus = ifCustomSyllabus;
  }

  public WeeklySummaryRequest syllabusId(Long syllabusId) {
    this.syllabusId = syllabusId;
    return this;
  }

   /**
   * Get syllabusId
   * @return syllabusId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSyllabusId() {
    return syllabusId;
  }

  public void setSyllabusId(Long syllabusId) {
    this.syllabusId = syllabusId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeeklySummaryRequest weeklySummaryRequest = (WeeklySummaryRequest) o;
    return Objects.equals(this.chapterId, weeklySummaryRequest.chapterId) &&
        Objects.equals(this.dateInWeek, weeklySummaryRequest.dateInWeek) &&
        Objects.equals(this.ifCustomChapter, weeklySummaryRequest.ifCustomChapter) &&
        Objects.equals(this.ifCustomSyllabus, weeklySummaryRequest.ifCustomSyllabus) &&
        Objects.equals(this.syllabusId, weeklySummaryRequest.syllabusId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapterId, dateInWeek, ifCustomChapter, ifCustomSyllabus, syllabusId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeeklySummaryRequest {\n");
    
    sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
    sb.append("    dateInWeek: ").append(toIndentedString(dateInWeek)).append("\n");
    sb.append("    ifCustomChapter: ").append(toIndentedString(ifCustomChapter)).append("\n");
    sb.append("    ifCustomSyllabus: ").append(toIndentedString(ifCustomSyllabus)).append("\n");
    sb.append("    syllabusId: ").append(toIndentedString(syllabusId)).append("\n");
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

