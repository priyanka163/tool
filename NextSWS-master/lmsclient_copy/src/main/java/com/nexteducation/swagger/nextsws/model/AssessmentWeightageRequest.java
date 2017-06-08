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
 * AssessmentWeightageRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class AssessmentWeightageRequest   {
  @SerializedName("assessmentUUID")
  private String assessmentUUID = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("objective")
  private String objective = null;

  @SerializedName("weightage")
  private Double weightage = null;

  public AssessmentWeightageRequest assessmentUUID(String assessmentUUID) {
    this.assessmentUUID = assessmentUUID;
    return this;
  }

   /**
   * Get assessmentUUID
   * @return assessmentUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssessmentUUID() {
    return assessmentUUID;
  }

  public void setAssessmentUUID(String assessmentUUID) {
    this.assessmentUUID = assessmentUUID;
  }

  public AssessmentWeightageRequest id(Long id) {
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

  public AssessmentWeightageRequest objective(String objective) {
    this.objective = objective;
    return this;
  }

   /**
   * Get objective
   * @return objective
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjective() {
    return objective;
  }

  public void setObjective(String objective) {
    this.objective = objective;
  }

  public AssessmentWeightageRequest weightage(Double weightage) {
    this.weightage = weightage;
    return this;
  }

   /**
   * Get weightage
   * @return weightage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getWeightage() {
    return weightage;
  }

  public void setWeightage(Double weightage) {
    this.weightage = weightage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssessmentWeightageRequest assessmentWeightageRequest = (AssessmentWeightageRequest) o;
    return Objects.equals(this.assessmentUUID, assessmentWeightageRequest.assessmentUUID) &&
        Objects.equals(this.id, assessmentWeightageRequest.id) &&
        Objects.equals(this.objective, assessmentWeightageRequest.objective) &&
        Objects.equals(this.weightage, assessmentWeightageRequest.weightage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentUUID, id, objective, weightage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentWeightageRequest {\n");
    
    sb.append("    assessmentUUID: ").append(toIndentedString(assessmentUUID)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    weightage: ").append(toIndentedString(weightage)).append("\n");
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

