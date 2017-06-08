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
 * LearningPlanScheduleResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class LearningPlanScheduleResponse   {
  @SerializedName("calendarEvent")
  private String calendarEvent = null;

  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("dateStr")
  private String dateStr = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("endTime")
  private String endTime = null;

  @SerializedName("startTime")
  private String startTime = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("Active")
    ACTIVE("Active"),
    
    @SerializedName("Inactive")
    INACTIVE("Inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("uuid")
  private String uuid = null;

  public LearningPlanScheduleResponse calendarEvent(String calendarEvent) {
    this.calendarEvent = calendarEvent;
    return this;
  }

   /**
   * Get calendarEvent
   * @return calendarEvent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCalendarEvent() {
    return calendarEvent;
  }

  public void setCalendarEvent(String calendarEvent) {
    this.calendarEvent = calendarEvent;
  }

  public LearningPlanScheduleResponse date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public LearningPlanScheduleResponse dateStr(String dateStr) {
    this.dateStr = dateStr;
    return this;
  }

   /**
   * Get dateStr
   * @return dateStr
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDateStr() {
    return dateStr;
  }

  public void setDateStr(String dateStr) {
    this.dateStr = dateStr;
  }

  public LearningPlanScheduleResponse duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public LearningPlanScheduleResponse endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public LearningPlanScheduleResponse startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public LearningPlanScheduleResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public LearningPlanScheduleResponse uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningPlanScheduleResponse learningPlanScheduleResponse = (LearningPlanScheduleResponse) o;
    return Objects.equals(this.calendarEvent, learningPlanScheduleResponse.calendarEvent) &&
        Objects.equals(this.date, learningPlanScheduleResponse.date) &&
        Objects.equals(this.dateStr, learningPlanScheduleResponse.dateStr) &&
        Objects.equals(this.duration, learningPlanScheduleResponse.duration) &&
        Objects.equals(this.endTime, learningPlanScheduleResponse.endTime) &&
        Objects.equals(this.startTime, learningPlanScheduleResponse.startTime) &&
        Objects.equals(this.status, learningPlanScheduleResponse.status) &&
        Objects.equals(this.uuid, learningPlanScheduleResponse.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarEvent, date, dateStr, duration, endTime, startTime, status, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningPlanScheduleResponse {\n");
    
    sb.append("    calendarEvent: ").append(toIndentedString(calendarEvent)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateStr: ").append(toIndentedString(dateStr)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

