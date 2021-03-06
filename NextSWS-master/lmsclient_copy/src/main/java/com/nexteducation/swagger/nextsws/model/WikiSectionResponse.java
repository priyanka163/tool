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
import com.nexteducation.swagger.nextsws.model.WikiLinksResponse;
import com.nexteducation.swagger.nextsws.model.WikiSectionResponse;
import com.nexteducation.swagger.nextsws.model.WikiSectionTextResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * WikiSectionResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class WikiSectionResponse   {
  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("childSections")
  private List<WikiSectionResponse> childSections = new ArrayList<WikiSectionResponse>();

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  @SerializedName("heading")
  private String heading = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("modifiedOn")
  private DateTime modifiedOn = null;

  @SerializedName("parentUuid")
  private String parentUuid = null;

  @SerializedName("sectionText")
  private WikiSectionTextResponse sectionText = null;

  @SerializedName("seq")
  private Long seq = null;

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

  @SerializedName("wikiLinks")
  private List<WikiLinksResponse> wikiLinks = new ArrayList<WikiLinksResponse>();

  @SerializedName("wikiUuid")
  private String wikiUuid = null;

  public WikiSectionResponse branchId(Long branchId) {
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

  public WikiSectionResponse childSections(List<WikiSectionResponse> childSections) {
    this.childSections = childSections;
    return this;
  }

  public WikiSectionResponse addChildSectionsItem(WikiSectionResponse childSectionsItem) {
    this.childSections.add(childSectionsItem);
    return this;
  }

   /**
   * Get childSections
   * @return childSections
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WikiSectionResponse> getChildSections() {
    return childSections;
  }

  public void setChildSections(List<WikiSectionResponse> childSections) {
    this.childSections = childSections;
  }

  public WikiSectionResponse createdBy(Long createdBy) {
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

  public WikiSectionResponse createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public WikiSectionResponse heading(String heading) {
    this.heading = heading;
    return this;
  }

   /**
   * Get heading
   * @return heading
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }

  public WikiSectionResponse id(Long id) {
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

  public WikiSectionResponse modifiedBy(Long modifiedBy) {
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

  public WikiSectionResponse modifiedOn(DateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(DateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public WikiSectionResponse parentUuid(String parentUuid) {
    this.parentUuid = parentUuid;
    return this;
  }

   /**
   * Get parentUuid
   * @return parentUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentUuid() {
    return parentUuid;
  }

  public void setParentUuid(String parentUuid) {
    this.parentUuid = parentUuid;
  }

  public WikiSectionResponse sectionText(WikiSectionTextResponse sectionText) {
    this.sectionText = sectionText;
    return this;
  }

   /**
   * Get sectionText
   * @return sectionText
  **/
  @ApiModelProperty(example = "null", value = "")
  public WikiSectionTextResponse getSectionText() {
    return sectionText;
  }

  public void setSectionText(WikiSectionTextResponse sectionText) {
    this.sectionText = sectionText;
  }

  public WikiSectionResponse seq(Long seq) {
    this.seq = seq;
    return this;
  }

   /**
   * Get seq
   * @return seq
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSeq() {
    return seq;
  }

  public void setSeq(Long seq) {
    this.seq = seq;
  }

  public WikiSectionResponse status(StatusEnum status) {
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

  public WikiSectionResponse uuid(String uuid) {
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

  public WikiSectionResponse wikiLinks(List<WikiLinksResponse> wikiLinks) {
    this.wikiLinks = wikiLinks;
    return this;
  }

  public WikiSectionResponse addWikiLinksItem(WikiLinksResponse wikiLinksItem) {
    this.wikiLinks.add(wikiLinksItem);
    return this;
  }

   /**
   * Get wikiLinks
   * @return wikiLinks
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WikiLinksResponse> getWikiLinks() {
    return wikiLinks;
  }

  public void setWikiLinks(List<WikiLinksResponse> wikiLinks) {
    this.wikiLinks = wikiLinks;
  }

  public WikiSectionResponse wikiUuid(String wikiUuid) {
    this.wikiUuid = wikiUuid;
    return this;
  }

   /**
   * Get wikiUuid
   * @return wikiUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWikiUuid() {
    return wikiUuid;
  }

  public void setWikiUuid(String wikiUuid) {
    this.wikiUuid = wikiUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiSectionResponse wikiSectionResponse = (WikiSectionResponse) o;
    return Objects.equals(this.branchId, wikiSectionResponse.branchId) &&
        Objects.equals(this.childSections, wikiSectionResponse.childSections) &&
        Objects.equals(this.createdBy, wikiSectionResponse.createdBy) &&
        Objects.equals(this.createdOn, wikiSectionResponse.createdOn) &&
        Objects.equals(this.heading, wikiSectionResponse.heading) &&
        Objects.equals(this.id, wikiSectionResponse.id) &&
        Objects.equals(this.modifiedBy, wikiSectionResponse.modifiedBy) &&
        Objects.equals(this.modifiedOn, wikiSectionResponse.modifiedOn) &&
        Objects.equals(this.parentUuid, wikiSectionResponse.parentUuid) &&
        Objects.equals(this.sectionText, wikiSectionResponse.sectionText) &&
        Objects.equals(this.seq, wikiSectionResponse.seq) &&
        Objects.equals(this.status, wikiSectionResponse.status) &&
        Objects.equals(this.uuid, wikiSectionResponse.uuid) &&
        Objects.equals(this.wikiLinks, wikiSectionResponse.wikiLinks) &&
        Objects.equals(this.wikiUuid, wikiSectionResponse.wikiUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, childSections, createdBy, createdOn, heading, id, modifiedBy, modifiedOn, parentUuid, sectionText, seq, status, uuid, wikiLinks, wikiUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiSectionResponse {\n");
    
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    childSections: ").append(toIndentedString(childSections)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    parentUuid: ").append(toIndentedString(parentUuid)).append("\n");
    sb.append("    sectionText: ").append(toIndentedString(sectionText)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    wikiLinks: ").append(toIndentedString(wikiLinks)).append("\n");
    sb.append("    wikiUuid: ").append(toIndentedString(wikiUuid)).append("\n");
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

