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
import com.nexteducation.swagger.nextsws.model.WikiLinksRequest;
import com.nexteducation.swagger.nextsws.model.WikiSectionRequest;
import com.nexteducation.swagger.nextsws.model.WikiSectionTextRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * WikiSectionRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class WikiSectionRequest   {
  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("childSectionRequests")
  private List<WikiSectionRequest> childSectionRequests = new ArrayList<WikiSectionRequest>();

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("heading")
  private String heading = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("parentUuid")
  private String parentUuid = null;

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

  @SerializedName("wikiLinkRequests")
  private List<WikiLinksRequest> wikiLinkRequests = new ArrayList<WikiLinksRequest>();

  @SerializedName("wikiSectionText")
  private WikiSectionTextRequest wikiSectionText = null;

  @SerializedName("wikiUuid")
  private String wikiUuid = null;

  public WikiSectionRequest branchId(Long branchId) {
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

  public WikiSectionRequest childSectionRequests(List<WikiSectionRequest> childSectionRequests) {
    this.childSectionRequests = childSectionRequests;
    return this;
  }

  public WikiSectionRequest addChildSectionRequestsItem(WikiSectionRequest childSectionRequestsItem) {
    this.childSectionRequests.add(childSectionRequestsItem);
    return this;
  }

   /**
   * Get childSectionRequests
   * @return childSectionRequests
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WikiSectionRequest> getChildSectionRequests() {
    return childSectionRequests;
  }

  public void setChildSectionRequests(List<WikiSectionRequest> childSectionRequests) {
    this.childSectionRequests = childSectionRequests;
  }

  public WikiSectionRequest createdBy(Long createdBy) {
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

  public WikiSectionRequest heading(String heading) {
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

  public WikiSectionRequest modifiedBy(Long modifiedBy) {
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

  public WikiSectionRequest parentUuid(String parentUuid) {
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

  public WikiSectionRequest seq(Long seq) {
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

  public WikiSectionRequest status(StatusEnum status) {
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

  public WikiSectionRequest uuid(String uuid) {
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

  public WikiSectionRequest wikiLinkRequests(List<WikiLinksRequest> wikiLinkRequests) {
    this.wikiLinkRequests = wikiLinkRequests;
    return this;
  }

  public WikiSectionRequest addWikiLinkRequestsItem(WikiLinksRequest wikiLinkRequestsItem) {
    this.wikiLinkRequests.add(wikiLinkRequestsItem);
    return this;
  }

   /**
   * Get wikiLinkRequests
   * @return wikiLinkRequests
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WikiLinksRequest> getWikiLinkRequests() {
    return wikiLinkRequests;
  }

  public void setWikiLinkRequests(List<WikiLinksRequest> wikiLinkRequests) {
    this.wikiLinkRequests = wikiLinkRequests;
  }

  public WikiSectionRequest wikiSectionText(WikiSectionTextRequest wikiSectionText) {
    this.wikiSectionText = wikiSectionText;
    return this;
  }

   /**
   * Get wikiSectionText
   * @return wikiSectionText
  **/
  @ApiModelProperty(example = "null", value = "")
  public WikiSectionTextRequest getWikiSectionText() {
    return wikiSectionText;
  }

  public void setWikiSectionText(WikiSectionTextRequest wikiSectionText) {
    this.wikiSectionText = wikiSectionText;
  }

  public WikiSectionRequest wikiUuid(String wikiUuid) {
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
    WikiSectionRequest wikiSectionRequest = (WikiSectionRequest) o;
    return Objects.equals(this.branchId, wikiSectionRequest.branchId) &&
        Objects.equals(this.childSectionRequests, wikiSectionRequest.childSectionRequests) &&
        Objects.equals(this.createdBy, wikiSectionRequest.createdBy) &&
        Objects.equals(this.heading, wikiSectionRequest.heading) &&
        Objects.equals(this.modifiedBy, wikiSectionRequest.modifiedBy) &&
        Objects.equals(this.parentUuid, wikiSectionRequest.parentUuid) &&
        Objects.equals(this.seq, wikiSectionRequest.seq) &&
        Objects.equals(this.status, wikiSectionRequest.status) &&
        Objects.equals(this.uuid, wikiSectionRequest.uuid) &&
        Objects.equals(this.wikiLinkRequests, wikiSectionRequest.wikiLinkRequests) &&
        Objects.equals(this.wikiSectionText, wikiSectionRequest.wikiSectionText) &&
        Objects.equals(this.wikiUuid, wikiSectionRequest.wikiUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, childSectionRequests, createdBy, heading, modifiedBy, parentUuid, seq, status, uuid, wikiLinkRequests, wikiSectionText, wikiUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiSectionRequest {\n");
    
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    childSectionRequests: ").append(toIndentedString(childSectionRequests)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    parentUuid: ").append(toIndentedString(parentUuid)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    wikiLinkRequests: ").append(toIndentedString(wikiLinkRequests)).append("\n");
    sb.append("    wikiSectionText: ").append(toIndentedString(wikiSectionText)).append("\n");
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

