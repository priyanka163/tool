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
 * ForumMemberRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class ForumMemberRequest   {
  @SerializedName("createdBy")
  private Long createdBy = null;

  /**
   * Gets or Sets forumLevel
   */
  public enum ForumLevelEnum {
    @SerializedName("PUBLIC")
    PUBLIC("PUBLIC"),
    
    @SerializedName("CLASS")
    CLASS("CLASS"),
    
    @SerializedName("SECTION")
    SECTION("SECTION"),
    
    @SerializedName("INSTITUTION")
    INSTITUTION("INSTITUTION"),
    
    @SerializedName("BRANCH")
    BRANCH("BRANCH"),
    
    @SerializedName("GROUP")
    GROUP("GROUP");

    private String value;

    ForumLevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("forumLevel")
  private ForumLevelEnum forumLevel = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("memberReference")
  private String memberReference = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("tenantId")
  private Long tenantId = null;

  @SerializedName("uuid")
  private String uuid = null;

  public ForumMemberRequest createdBy(Long createdBy) {
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

  public ForumMemberRequest forumLevel(ForumLevelEnum forumLevel) {
    this.forumLevel = forumLevel;
    return this;
  }

   /**
   * Get forumLevel
   * @return forumLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public ForumLevelEnum getForumLevel() {
    return forumLevel;
  }

  public void setForumLevel(ForumLevelEnum forumLevel) {
    this.forumLevel = forumLevel;
  }

  public ForumMemberRequest id(Long id) {
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

  public ForumMemberRequest memberReference(String memberReference) {
    this.memberReference = memberReference;
    return this;
  }

   /**
   * Get memberReference
   * @return memberReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMemberReference() {
    return memberReference;
  }

  public void setMemberReference(String memberReference) {
    this.memberReference = memberReference;
  }

  public ForumMemberRequest modifiedBy(Long modifiedBy) {
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

  public ForumMemberRequest tenantId(Long tenantId) {
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

  public ForumMemberRequest uuid(String uuid) {
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
    ForumMemberRequest forumMemberRequest = (ForumMemberRequest) o;
    return Objects.equals(this.createdBy, forumMemberRequest.createdBy) &&
        Objects.equals(this.forumLevel, forumMemberRequest.forumLevel) &&
        Objects.equals(this.id, forumMemberRequest.id) &&
        Objects.equals(this.memberReference, forumMemberRequest.memberReference) &&
        Objects.equals(this.modifiedBy, forumMemberRequest.modifiedBy) &&
        Objects.equals(this.tenantId, forumMemberRequest.tenantId) &&
        Objects.equals(this.uuid, forumMemberRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, forumLevel, id, memberReference, modifiedBy, tenantId, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForumMemberRequest {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    forumLevel: ").append(toIndentedString(forumLevel)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    memberReference: ").append(toIndentedString(memberReference)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

