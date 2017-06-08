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
 * AssociationRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class AssociationRequest   {
  @SerializedName("associationType")
  private String associationType = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("destinationObject")
  private String destinationObject = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("newAssociationType")
  private String newAssociationType = null;

  @SerializedName("sourceObject")
  private String sourceObject = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),
    
    @SerializedName("INACTIVE")
    INACTIVE("INACTIVE");

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

  @SerializedName("tenantId")
  private Long tenantId = null;

  @SerializedName("uuid")
  private String uuid = null;

  public AssociationRequest associationType(String associationType) {
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

  public AssociationRequest createdBy(Long createdBy) {
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

  public AssociationRequest destinationObject(String destinationObject) {
    this.destinationObject = destinationObject;
    return this;
  }

   /**
   * Get destinationObject
   * @return destinationObject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDestinationObject() {
    return destinationObject;
  }

  public void setDestinationObject(String destinationObject) {
    this.destinationObject = destinationObject;
  }

  public AssociationRequest id(Long id) {
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

  public AssociationRequest modifiedBy(Long modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Long modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public AssociationRequest newAssociationType(String newAssociationType) {
    this.newAssociationType = newAssociationType;
    return this;
  }

   /**
   * Get newAssociationType
   * @return newAssociationType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNewAssociationType() {
    return newAssociationType;
  }

  public void setNewAssociationType(String newAssociationType) {
    this.newAssociationType = newAssociationType;
  }

  public AssociationRequest sourceObject(String sourceObject) {
    this.sourceObject = sourceObject;
    return this;
  }

   /**
   * Get sourceObject
   * @return sourceObject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSourceObject() {
    return sourceObject;
  }

  public void setSourceObject(String sourceObject) {
    this.sourceObject = sourceObject;
  }

  public AssociationRequest status(StatusEnum status) {
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

  public AssociationRequest tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public AssociationRequest uuid(String uuid) {
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
    AssociationRequest associationRequest = (AssociationRequest) o;
    return Objects.equals(this.associationType, associationRequest.associationType) &&
        Objects.equals(this.createdBy, associationRequest.createdBy) &&
        Objects.equals(this.destinationObject, associationRequest.destinationObject) &&
        Objects.equals(this.id, associationRequest.id) &&
        Objects.equals(this.modifiedBy, associationRequest.modifiedBy) &&
        Objects.equals(this.newAssociationType, associationRequest.newAssociationType) &&
        Objects.equals(this.sourceObject, associationRequest.sourceObject) &&
        Objects.equals(this.status, associationRequest.status) &&
        Objects.equals(this.tenantId, associationRequest.tenantId) &&
        Objects.equals(this.uuid, associationRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationType, createdBy, destinationObject, id, modifiedBy, newAssociationType, sourceObject, status, tenantId, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociationRequest {\n");
    
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    destinationObject: ").append(toIndentedString(destinationObject)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    newAssociationType: ").append(toIndentedString(newAssociationType)).append("\n");
    sb.append("    sourceObject: ").append(toIndentedString(sourceObject)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

