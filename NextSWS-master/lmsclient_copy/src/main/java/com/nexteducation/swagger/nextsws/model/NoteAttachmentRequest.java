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
 * NoteAttachmentRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class NoteAttachmentRequest   {
  @SerializedName("assetUUID")
  private String assetUUID = null;

  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("noteUUID")
  private String noteUUID = null;

  @SerializedName("uuid")
  private String uuid = null;

  public NoteAttachmentRequest assetUUID(String assetUUID) {
    this.assetUUID = assetUUID;
    return this;
  }

   /**
   * Get assetUUID
   * @return assetUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssetUUID() {
    return assetUUID;
  }

  public void setAssetUUID(String assetUUID) {
    this.assetUUID = assetUUID;
  }

  public NoteAttachmentRequest branchId(Long branchId) {
    this.branchId = branchId;
    return this;
  }

   /**
   * Get branchId
   * @return branchId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBranchId() {
    return branchId;
  }

  public void setBranchId(Long branchId) {
    this.branchId = branchId;
  }

  public NoteAttachmentRequest createdBy(Long createdBy) {
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

  public NoteAttachmentRequest modifiedBy(Long modifiedBy) {
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

  public NoteAttachmentRequest noteUUID(String noteUUID) {
    this.noteUUID = noteUUID;
    return this;
  }

   /**
   * Get noteUUID
   * @return noteUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNoteUUID() {
    return noteUUID;
  }

  public void setNoteUUID(String noteUUID) {
    this.noteUUID = noteUUID;
  }

  public NoteAttachmentRequest uuid(String uuid) {
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
    NoteAttachmentRequest noteAttachmentRequest = (NoteAttachmentRequest) o;
    return Objects.equals(this.assetUUID, noteAttachmentRequest.assetUUID) &&
        Objects.equals(this.branchId, noteAttachmentRequest.branchId) &&
        Objects.equals(this.createdBy, noteAttachmentRequest.createdBy) &&
        Objects.equals(this.modifiedBy, noteAttachmentRequest.modifiedBy) &&
        Objects.equals(this.noteUUID, noteAttachmentRequest.noteUUID) &&
        Objects.equals(this.uuid, noteAttachmentRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUUID, branchId, createdBy, modifiedBy, noteUUID, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteAttachmentRequest {\n");
    
    sb.append("    assetUUID: ").append(toIndentedString(assetUUID)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    noteUUID: ").append(toIndentedString(noteUUID)).append("\n");
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

