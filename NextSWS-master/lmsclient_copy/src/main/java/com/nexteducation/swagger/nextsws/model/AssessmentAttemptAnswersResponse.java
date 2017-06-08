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
 * AssessmentAttemptAnswersResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class AssessmentAttemptAnswersResponse   {
  @SerializedName("index")
  private Integer index = null;

  @SerializedName("qId")
  private String qId = null;

  @SerializedName("timeSpent")
  private Integer timeSpent = null;

  public AssessmentAttemptAnswersResponse index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public AssessmentAttemptAnswersResponse qId(String qId) {
    this.qId = qId;
    return this;
  }

   /**
   * Get qId
   * @return qId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getQId() {
    return qId;
  }

  public void setQId(String qId) {
    this.qId = qId;
  }

  public AssessmentAttemptAnswersResponse timeSpent(Integer timeSpent) {
    this.timeSpent = timeSpent;
    return this;
  }

   /**
   * Get timeSpent
   * @return timeSpent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(Integer timeSpent) {
    this.timeSpent = timeSpent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssessmentAttemptAnswersResponse assessmentAttemptAnswersResponse = (AssessmentAttemptAnswersResponse) o;
    return Objects.equals(this.index, assessmentAttemptAnswersResponse.index) &&
        Objects.equals(this.qId, assessmentAttemptAnswersResponse.qId) &&
        Objects.equals(this.timeSpent, assessmentAttemptAnswersResponse.timeSpent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, qId, timeSpent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentAttemptAnswersResponse {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    qId: ").append(toIndentedString(qId)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
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
