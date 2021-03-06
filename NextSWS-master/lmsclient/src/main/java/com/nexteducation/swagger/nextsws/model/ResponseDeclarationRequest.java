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
import com.nexteducation.swagger.nextsws.model.DefaultValueRequest;
import com.nexteducation.swagger.nextsws.model.MappingRequest;
import com.nexteducation.swagger.nextsws.model.ResponseDeclarationAreaMappingRequest;
import com.nexteducation.swagger.nextsws.model.ResponseDeclarationCorrectAnswerRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ResponseDeclarationRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class ResponseDeclarationRequest   {
  @SerializedName("areaMapping")
  private ResponseDeclarationAreaMappingRequest areaMapping = null;

  @SerializedName("baseType")
  private String baseType = null;

  @SerializedName("cardinality")
  private String cardinality = null;

  @SerializedName("correctAnswers")
  private List<ResponseDeclarationCorrectAnswerRequest> correctAnswers = new ArrayList<ResponseDeclarationCorrectAnswerRequest>();

  @SerializedName("defaultRequest")
  private DefaultValueRequest defaultRequest = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("mapping")
  private MappingRequest mapping = null;

  public ResponseDeclarationRequest areaMapping(ResponseDeclarationAreaMappingRequest areaMapping) {
    this.areaMapping = areaMapping;
    return this;
  }

   /**
   * Get areaMapping
   * @return areaMapping
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResponseDeclarationAreaMappingRequest getAreaMapping() {
    return areaMapping;
  }

  public void setAreaMapping(ResponseDeclarationAreaMappingRequest areaMapping) {
    this.areaMapping = areaMapping;
  }

  public ResponseDeclarationRequest baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

   /**
   * Get baseType
   * @return baseType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ResponseDeclarationRequest cardinality(String cardinality) {
    this.cardinality = cardinality;
    return this;
  }

   /**
   * Get cardinality
   * @return cardinality
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCardinality() {
    return cardinality;
  }

  public void setCardinality(String cardinality) {
    this.cardinality = cardinality;
  }

  public ResponseDeclarationRequest correctAnswers(List<ResponseDeclarationCorrectAnswerRequest> correctAnswers) {
    this.correctAnswers = correctAnswers;
    return this;
  }

  public ResponseDeclarationRequest addCorrectAnswersItem(ResponseDeclarationCorrectAnswerRequest correctAnswersItem) {
    this.correctAnswers.add(correctAnswersItem);
    return this;
  }

   /**
   * Get correctAnswers
   * @return correctAnswers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ResponseDeclarationCorrectAnswerRequest> getCorrectAnswers() {
    return correctAnswers;
  }

  public void setCorrectAnswers(List<ResponseDeclarationCorrectAnswerRequest> correctAnswers) {
    this.correctAnswers = correctAnswers;
  }

  public ResponseDeclarationRequest defaultRequest(DefaultValueRequest defaultRequest) {
    this.defaultRequest = defaultRequest;
    return this;
  }

   /**
   * Get defaultRequest
   * @return defaultRequest
  **/
  @ApiModelProperty(example = "null", value = "")
  public DefaultValueRequest getDefaultRequest() {
    return defaultRequest;
  }

  public void setDefaultRequest(DefaultValueRequest defaultRequest) {
    this.defaultRequest = defaultRequest;
  }

  public ResponseDeclarationRequest id(Long id) {
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

  public ResponseDeclarationRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ResponseDeclarationRequest mapping(MappingRequest mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  @ApiModelProperty(example = "null", value = "")
  public MappingRequest getMapping() {
    return mapping;
  }

  public void setMapping(MappingRequest mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDeclarationRequest responseDeclarationRequest = (ResponseDeclarationRequest) o;
    return Objects.equals(this.areaMapping, responseDeclarationRequest.areaMapping) &&
        Objects.equals(this.baseType, responseDeclarationRequest.baseType) &&
        Objects.equals(this.cardinality, responseDeclarationRequest.cardinality) &&
        Objects.equals(this.correctAnswers, responseDeclarationRequest.correctAnswers) &&
        Objects.equals(this.defaultRequest, responseDeclarationRequest.defaultRequest) &&
        Objects.equals(this.id, responseDeclarationRequest.id) &&
        Objects.equals(this.identifier, responseDeclarationRequest.identifier) &&
        Objects.equals(this.mapping, responseDeclarationRequest.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaMapping, baseType, cardinality, correctAnswers, defaultRequest, id, identifier, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDeclarationRequest {\n");
    
    sb.append("    areaMapping: ").append(toIndentedString(areaMapping)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
    sb.append("    correctAnswers: ").append(toIndentedString(correctAnswers)).append("\n");
    sb.append("    defaultRequest: ").append(toIndentedString(defaultRequest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

