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
 * AssociationObjectResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class AssociationObjectResponse   {
  @SerializedName("associationId")
  private String associationId = null;

  @SerializedName("associationType")
  private String associationType = null;

  @SerializedName("destinationObjectId")
  private String destinationObjectId = null;

  @SerializedName("destinationObjectType")
  private String destinationObjectType = null;

  @SerializedName("sourceObjectId")
  private String sourceObjectId = null;

  @SerializedName("sourceObjectType")
  private String sourceObjectType = null;

  public AssociationObjectResponse associationId(String associationId) {
    this.associationId = associationId;
    return this;
  }

   /**
   * Get associationId
   * @return associationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssociationId() {
    return associationId;
  }

  public void setAssociationId(String associationId) {
    this.associationId = associationId;
  }

  public AssociationObjectResponse associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

   /**
   * Get associationType
   * @return associationType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public AssociationObjectResponse destinationObjectId(String destinationObjectId) {
    this.destinationObjectId = destinationObjectId;
    return this;
  }

   /**
   * Get destinationObjectId
   * @return destinationObjectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDestinationObjectId() {
    return destinationObjectId;
  }

  public void setDestinationObjectId(String destinationObjectId) {
    this.destinationObjectId = destinationObjectId;
  }

  public AssociationObjectResponse destinationObjectType(String destinationObjectType) {
    this.destinationObjectType = destinationObjectType;
    return this;
  }

   /**
   * Get destinationObjectType
   * @return destinationObjectType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDestinationObjectType() {
    return destinationObjectType;
  }

  public void setDestinationObjectType(String destinationObjectType) {
    this.destinationObjectType = destinationObjectType;
  }

  public AssociationObjectResponse sourceObjectId(String sourceObjectId) {
    this.sourceObjectId = sourceObjectId;
    return this;
  }

   /**
   * Get sourceObjectId
   * @return sourceObjectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSourceObjectId() {
    return sourceObjectId;
  }

  public void setSourceObjectId(String sourceObjectId) {
    this.sourceObjectId = sourceObjectId;
  }

  public AssociationObjectResponse sourceObjectType(String sourceObjectType) {
    this.sourceObjectType = sourceObjectType;
    return this;
  }

   /**
   * Get sourceObjectType
   * @return sourceObjectType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSourceObjectType() {
    return sourceObjectType;
  }

  public void setSourceObjectType(String sourceObjectType) {
    this.sourceObjectType = sourceObjectType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociationObjectResponse associationObjectResponse = (AssociationObjectResponse) o;
    return Objects.equals(this.associationId, associationObjectResponse.associationId) &&
        Objects.equals(this.associationType, associationObjectResponse.associationType) &&
        Objects.equals(this.destinationObjectId, associationObjectResponse.destinationObjectId) &&
        Objects.equals(this.destinationObjectType, associationObjectResponse.destinationObjectType) &&
        Objects.equals(this.sourceObjectId, associationObjectResponse.sourceObjectId) &&
        Objects.equals(this.sourceObjectType, associationObjectResponse.sourceObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationId, associationType, destinationObjectId, destinationObjectType, sourceObjectId, sourceObjectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociationObjectResponse {\n");
    
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    destinationObjectId: ").append(toIndentedString(destinationObjectId)).append("\n");
    sb.append("    destinationObjectType: ").append(toIndentedString(destinationObjectType)).append("\n");
    sb.append("    sourceObjectId: ").append(toIndentedString(sourceObjectId)).append("\n");
    sb.append("    sourceObjectType: ").append(toIndentedString(sourceObjectType)).append("\n");
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
