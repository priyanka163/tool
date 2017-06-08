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
import com.nexteducation.swagger.nextsws.model.MasterClassResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * SubjectTeacherResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class SubjectTeacherResponse   {
  @SerializedName("studyClasses")
  private List<MasterClassResponse> studyClasses = new ArrayList<MasterClassResponse>();

  public SubjectTeacherResponse studyClasses(List<MasterClassResponse> studyClasses) {
    this.studyClasses = studyClasses;
    return this;
  }

  public SubjectTeacherResponse addStudyClassesItem(MasterClassResponse studyClassesItem) {
    this.studyClasses.add(studyClassesItem);
    return this;
  }

   /**
   * Get studyClasses
   * @return studyClasses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MasterClassResponse> getStudyClasses() {
    return studyClasses;
  }

  public void setStudyClasses(List<MasterClassResponse> studyClasses) {
    this.studyClasses = studyClasses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectTeacherResponse subjectTeacherResponse = (SubjectTeacherResponse) o;
    return Objects.equals(this.studyClasses, subjectTeacherResponse.studyClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studyClasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectTeacherResponse {\n");
    
    sb.append("    studyClasses: ").append(toIndentedString(studyClasses)).append("\n");
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

