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
import com.nexteducation.swagger.nextsws.model.LectureBreakupResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * AdoptLecturePlanResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class AdoptLecturePlanResponse   {
  @SerializedName("academicEndDate")
  private String academicEndDate = null;

  @SerializedName("academicStartDate")
  private String academicStartDate = null;

  @SerializedName("breakupList")
  private List<LectureBreakupResponse> breakupList = new ArrayList<LectureBreakupResponse>();

  @SerializedName("resourceAdopted")
  private Boolean resourceAdopted = null;

  @SerializedName("totalClassLectures")
  private Integer totalClassLectures = null;

  @SerializedName("totalLabLectures")
  private Integer totalLabLectures = null;

  public AdoptLecturePlanResponse academicEndDate(String academicEndDate) {
    this.academicEndDate = academicEndDate;
    return this;
  }

   /**
   * Get academicEndDate
   * @return academicEndDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAcademicEndDate() {
    return academicEndDate;
  }

  public void setAcademicEndDate(String academicEndDate) {
    this.academicEndDate = academicEndDate;
  }

  public AdoptLecturePlanResponse academicStartDate(String academicStartDate) {
    this.academicStartDate = academicStartDate;
    return this;
  }

   /**
   * Get academicStartDate
   * @return academicStartDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAcademicStartDate() {
    return academicStartDate;
  }

  public void setAcademicStartDate(String academicStartDate) {
    this.academicStartDate = academicStartDate;
  }

  public AdoptLecturePlanResponse breakupList(List<LectureBreakupResponse> breakupList) {
    this.breakupList = breakupList;
    return this;
  }

  public AdoptLecturePlanResponse addBreakupListItem(LectureBreakupResponse breakupListItem) {
    this.breakupList.add(breakupListItem);
    return this;
  }

   /**
   * Get breakupList
   * @return breakupList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LectureBreakupResponse> getBreakupList() {
    return breakupList;
  }

  public void setBreakupList(List<LectureBreakupResponse> breakupList) {
    this.breakupList = breakupList;
  }

  public AdoptLecturePlanResponse resourceAdopted(Boolean resourceAdopted) {
    this.resourceAdopted = resourceAdopted;
    return this;
  }

   /**
   * Get resourceAdopted
   * @return resourceAdopted
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getResourceAdopted() {
    return resourceAdopted;
  }

  public void setResourceAdopted(Boolean resourceAdopted) {
    this.resourceAdopted = resourceAdopted;
  }

  public AdoptLecturePlanResponse totalClassLectures(Integer totalClassLectures) {
    this.totalClassLectures = totalClassLectures;
    return this;
  }

   /**
   * Get totalClassLectures
   * @return totalClassLectures
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalClassLectures() {
    return totalClassLectures;
  }

  public void setTotalClassLectures(Integer totalClassLectures) {
    this.totalClassLectures = totalClassLectures;
  }

  public AdoptLecturePlanResponse totalLabLectures(Integer totalLabLectures) {
    this.totalLabLectures = totalLabLectures;
    return this;
  }

   /**
   * Get totalLabLectures
   * @return totalLabLectures
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalLabLectures() {
    return totalLabLectures;
  }

  public void setTotalLabLectures(Integer totalLabLectures) {
    this.totalLabLectures = totalLabLectures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdoptLecturePlanResponse adoptLecturePlanResponse = (AdoptLecturePlanResponse) o;
    return Objects.equals(this.academicEndDate, adoptLecturePlanResponse.academicEndDate) &&
        Objects.equals(this.academicStartDate, adoptLecturePlanResponse.academicStartDate) &&
        Objects.equals(this.breakupList, adoptLecturePlanResponse.breakupList) &&
        Objects.equals(this.resourceAdopted, adoptLecturePlanResponse.resourceAdopted) &&
        Objects.equals(this.totalClassLectures, adoptLecturePlanResponse.totalClassLectures) &&
        Objects.equals(this.totalLabLectures, adoptLecturePlanResponse.totalLabLectures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicEndDate, academicStartDate, breakupList, resourceAdopted, totalClassLectures, totalLabLectures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdoptLecturePlanResponse {\n");
    
    sb.append("    academicEndDate: ").append(toIndentedString(academicEndDate)).append("\n");
    sb.append("    academicStartDate: ").append(toIndentedString(academicStartDate)).append("\n");
    sb.append("    breakupList: ").append(toIndentedString(breakupList)).append("\n");
    sb.append("    resourceAdopted: ").append(toIndentedString(resourceAdopted)).append("\n");
    sb.append("    totalClassLectures: ").append(toIndentedString(totalClassLectures)).append("\n");
    sb.append("    totalLabLectures: ").append(toIndentedString(totalLabLectures)).append("\n");
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

