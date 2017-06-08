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
import com.nexteducation.swagger.nextsws.model.LectureResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * DayPlanResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class DayPlanResponse   {
  @SerializedName("lectures")
  private List<LectureResponse> lectures = new ArrayList<LectureResponse>();

  @SerializedName("planDate")
  private DateTime planDate = null;

  @SerializedName("scheduled")
  private Boolean scheduled = null;

  public DayPlanResponse lectures(List<LectureResponse> lectures) {
    this.lectures = lectures;
    return this;
  }

  public DayPlanResponse addLecturesItem(LectureResponse lecturesItem) {
    this.lectures.add(lecturesItem);
    return this;
  }

   /**
   * Get lectures
   * @return lectures
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LectureResponse> getLectures() {
    return lectures;
  }

  public void setLectures(List<LectureResponse> lectures) {
    this.lectures = lectures;
  }

  public DayPlanResponse planDate(DateTime planDate) {
    this.planDate = planDate;
    return this;
  }

   /**
   * Get planDate
   * @return planDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getPlanDate() {
    return planDate;
  }

  public void setPlanDate(DateTime planDate) {
    this.planDate = planDate;
  }

  public DayPlanResponse scheduled(Boolean scheduled) {
    this.scheduled = scheduled;
    return this;
  }

   /**
   * Get scheduled
   * @return scheduled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getScheduled() {
    return scheduled;
  }

  public void setScheduled(Boolean scheduled) {
    this.scheduled = scheduled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayPlanResponse dayPlanResponse = (DayPlanResponse) o;
    return Objects.equals(this.lectures, dayPlanResponse.lectures) &&
        Objects.equals(this.planDate, dayPlanResponse.planDate) &&
        Objects.equals(this.scheduled, dayPlanResponse.scheduled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lectures, planDate, scheduled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayPlanResponse {\n");
    
    sb.append("    lectures: ").append(toIndentedString(lectures)).append("\n");
    sb.append("    planDate: ").append(toIndentedString(planDate)).append("\n");
    sb.append("    scheduled: ").append(toIndentedString(scheduled)).append("\n");
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
