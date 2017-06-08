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
 * MasterSubjectRO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class MasterSubjectRO   {
  @SerializedName("baseSubjectId")
  private Long baseSubjectId = null;

  @SerializedName("error")
  private Boolean error = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("seqNo")
  private Integer seqNo = null;

  @SerializedName("standard")
  private Boolean standard = null;

  public MasterSubjectRO baseSubjectId(Long baseSubjectId) {
    this.baseSubjectId = baseSubjectId;
    return this;
  }

   /**
   * Get baseSubjectId
   * @return baseSubjectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBaseSubjectId() {
    return baseSubjectId;
  }

  public void setBaseSubjectId(Long baseSubjectId) {
    this.baseSubjectId = baseSubjectId;
  }

  public MasterSubjectRO error(Boolean error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public MasterSubjectRO id(Long id) {
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

  public MasterSubjectRO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MasterSubjectRO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MasterSubjectRO seqNo(Integer seqNo) {
    this.seqNo = seqNo;
    return this;
  }

   /**
   * Get seqNo
   * @return seqNo
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSeqNo() {
    return seqNo;
  }

  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }

  public MasterSubjectRO standard(Boolean standard) {
    this.standard = standard;
    return this;
  }

   /**
   * Get standard
   * @return standard
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getStandard() {
    return standard;
  }

  public void setStandard(Boolean standard) {
    this.standard = standard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterSubjectRO masterSubjectRO = (MasterSubjectRO) o;
    return Objects.equals(this.baseSubjectId, masterSubjectRO.baseSubjectId) &&
        Objects.equals(this.error, masterSubjectRO.error) &&
        Objects.equals(this.id, masterSubjectRO.id) &&
        Objects.equals(this.message, masterSubjectRO.message) &&
        Objects.equals(this.name, masterSubjectRO.name) &&
        Objects.equals(this.seqNo, masterSubjectRO.seqNo) &&
        Objects.equals(this.standard, masterSubjectRO.standard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseSubjectId, error, id, message, name, seqNo, standard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterSubjectRO {\n");
    
    sb.append("    baseSubjectId: ").append(toIndentedString(baseSubjectId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
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
