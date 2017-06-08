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
 * LPRProgressLogResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class LPRProgressLogResponse   {
  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  @SerializedName("fromDate")
  private DateTime fromDate = null;

  @SerializedName("percentage")
  private Integer percentage = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("Pending")
    PENDING("Pending"),
    
    @SerializedName("InProgess")
    INPROGESS("InProgess"),
    
    @SerializedName("Completed")
    COMPLETED("Completed");

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

  @SerializedName("toDate")
  private DateTime toDate = null;

  @SerializedName("uuid")
  private String uuid = null;

  public LPRProgressLogResponse createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public LPRProgressLogResponse createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public LPRProgressLogResponse fromDate(DateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(DateTime fromDate) {
    this.fromDate = fromDate;
  }

  public LPRProgressLogResponse percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  public LPRProgressLogResponse status(StatusEnum status) {
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

  public LPRProgressLogResponse toDate(DateTime toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Get toDate
   * @return toDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getToDate() {
    return toDate;
  }

  public void setToDate(DateTime toDate) {
    this.toDate = toDate;
  }

  public LPRProgressLogResponse uuid(String uuid) {
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
    LPRProgressLogResponse lPRProgressLogResponse = (LPRProgressLogResponse) o;
    return Objects.equals(this.createdBy, lPRProgressLogResponse.createdBy) &&
        Objects.equals(this.createdOn, lPRProgressLogResponse.createdOn) &&
        Objects.equals(this.fromDate, lPRProgressLogResponse.fromDate) &&
        Objects.equals(this.percentage, lPRProgressLogResponse.percentage) &&
        Objects.equals(this.status, lPRProgressLogResponse.status) &&
        Objects.equals(this.toDate, lPRProgressLogResponse.toDate) &&
        Objects.equals(this.uuid, lPRProgressLogResponse.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, fromDate, percentage, status, toDate, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LPRProgressLogResponse {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
