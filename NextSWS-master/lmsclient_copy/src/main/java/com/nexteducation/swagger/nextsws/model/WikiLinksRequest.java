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
 * WikiLinksRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class WikiLinksRequest   {
  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("link")
  private String link = null;

  /**
   * Gets or Sets linkType
   */
  public enum LinkTypeEnum {
    @SerializedName("INTERWIKI")
    INTERWIKI("INTERWIKI"),
    
    @SerializedName("EXTERNAL")
    EXTERNAL("EXTERNAL"),
    
    @SerializedName("NE_RESOURCE")
    NE_RESOURCE("NE_RESOURCE"),
    
    @SerializedName("EXTERNAL_RESOURCE")
    EXTERNAL_RESOURCE("EXTERNAL_RESOURCE");

    private String value;

    LinkTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("linkType")
  private LinkTypeEnum linkType = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("sectionUuid")
  private String sectionUuid = null;

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

  @SerializedName("uuid")
  private String uuid = null;

  public WikiLinksRequest branchId(Long branchId) {
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

  public WikiLinksRequest createdBy(Long createdBy) {
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

  public WikiLinksRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WikiLinksRequest link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public WikiLinksRequest linkType(LinkTypeEnum linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * Get linkType
   * @return linkType
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinkTypeEnum getLinkType() {
    return linkType;
  }

  public void setLinkType(LinkTypeEnum linkType) {
    this.linkType = linkType;
  }

  public WikiLinksRequest modifiedBy(Long modifiedBy) {
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

  public WikiLinksRequest sectionUuid(String sectionUuid) {
    this.sectionUuid = sectionUuid;
    return this;
  }

   /**
   * Get sectionUuid
   * @return sectionUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSectionUuid() {
    return sectionUuid;
  }

  public void setSectionUuid(String sectionUuid) {
    this.sectionUuid = sectionUuid;
  }

  public WikiLinksRequest status(StatusEnum status) {
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

  public WikiLinksRequest uuid(String uuid) {
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
    WikiLinksRequest wikiLinksRequest = (WikiLinksRequest) o;
    return Objects.equals(this.branchId, wikiLinksRequest.branchId) &&
        Objects.equals(this.createdBy, wikiLinksRequest.createdBy) &&
        Objects.equals(this.description, wikiLinksRequest.description) &&
        Objects.equals(this.link, wikiLinksRequest.link) &&
        Objects.equals(this.linkType, wikiLinksRequest.linkType) &&
        Objects.equals(this.modifiedBy, wikiLinksRequest.modifiedBy) &&
        Objects.equals(this.sectionUuid, wikiLinksRequest.sectionUuid) &&
        Objects.equals(this.status, wikiLinksRequest.status) &&
        Objects.equals(this.uuid, wikiLinksRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, createdBy, description, link, linkType, modifiedBy, sectionUuid, status, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiLinksRequest {\n");
    
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    sectionUuid: ").append(toIndentedString(sectionUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

