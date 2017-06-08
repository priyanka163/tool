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
import com.nexteducation.swagger.nextsws.model.NoteRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * PageRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class PageRequest   {
  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("noteBookUuid")
  private String noteBookUuid = null;

  @SerializedName("noteList")
  private List<NoteRequest> noteList = new ArrayList<NoteRequest>();

  /**
   * Gets or Sets pageType
   */
  public enum PageTypeEnum {
    @SerializedName("Chapter")
    CHAPTER("Chapter"),
    
    @SerializedName("Topic")
    TOPIC("Topic"),
    
    @SerializedName("Other")
    OTHER("Other");

    private String value;

    PageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("pageType")
  private PageTypeEnum pageType = null;

  @SerializedName("pageUuid")
  private String pageUuid = null;

  @SerializedName("reference")
  private String reference = null;

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

  @SerializedName("userId")
  private Long userId = null;

  public PageRequest createdBy(Long createdBy) {
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

  public PageRequest id(Long id) {
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

  public PageRequest modifiedBy(Long modifiedBy) {
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

  public PageRequest name(String name) {
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

  public PageRequest noteBookUuid(String noteBookUuid) {
    this.noteBookUuid = noteBookUuid;
    return this;
  }

   /**
   * Get noteBookUuid
   * @return noteBookUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNoteBookUuid() {
    return noteBookUuid;
  }

  public void setNoteBookUuid(String noteBookUuid) {
    this.noteBookUuid = noteBookUuid;
  }

  public PageRequest noteList(List<NoteRequest> noteList) {
    this.noteList = noteList;
    return this;
  }

  public PageRequest addNoteListItem(NoteRequest noteListItem) {
    this.noteList.add(noteListItem);
    return this;
  }

   /**
   * Get noteList
   * @return noteList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<NoteRequest> getNoteList() {
    return noteList;
  }

  public void setNoteList(List<NoteRequest> noteList) {
    this.noteList = noteList;
  }

  public PageRequest pageType(PageTypeEnum pageType) {
    this.pageType = pageType;
    return this;
  }

   /**
   * Get pageType
   * @return pageType
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageTypeEnum getPageType() {
    return pageType;
  }

  public void setPageType(PageTypeEnum pageType) {
    this.pageType = pageType;
  }

  public PageRequest pageUuid(String pageUuid) {
    this.pageUuid = pageUuid;
    return this;
  }

   /**
   * Get pageUuid
   * @return pageUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPageUuid() {
    return pageUuid;
  }

  public void setPageUuid(String pageUuid) {
    this.pageUuid = pageUuid;
  }

  public PageRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public PageRequest status(StatusEnum status) {
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

  public PageRequest tenantId(Long tenantId) {
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

  public PageRequest userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageRequest pageRequest = (PageRequest) o;
    return Objects.equals(this.createdBy, pageRequest.createdBy) &&
        Objects.equals(this.id, pageRequest.id) &&
        Objects.equals(this.modifiedBy, pageRequest.modifiedBy) &&
        Objects.equals(this.name, pageRequest.name) &&
        Objects.equals(this.noteBookUuid, pageRequest.noteBookUuid) &&
        Objects.equals(this.noteList, pageRequest.noteList) &&
        Objects.equals(this.pageType, pageRequest.pageType) &&
        Objects.equals(this.pageUuid, pageRequest.pageUuid) &&
        Objects.equals(this.reference, pageRequest.reference) &&
        Objects.equals(this.status, pageRequest.status) &&
        Objects.equals(this.tenantId, pageRequest.tenantId) &&
        Objects.equals(this.userId, pageRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, id, modifiedBy, name, noteBookUuid, noteList, pageType, pageUuid, reference, status, tenantId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageRequest {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noteBookUuid: ").append(toIndentedString(noteBookUuid)).append("\n");
    sb.append("    noteList: ").append(toIndentedString(noteList)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    pageUuid: ").append(toIndentedString(pageUuid)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
