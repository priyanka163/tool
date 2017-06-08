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
import java.util.ArrayList;
import java.util.List;


/**
 * PostRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class PostRequest   {
  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("categoryReference")
  private String categoryReference = null;

  /**
   * Gets or Sets categoryType
   */
  public enum CategoryTypeEnum {
    @SerializedName("CHAPTER")
    CHAPTER("CHAPTER"),
    
    @SerializedName("LESSON")
    LESSON("LESSON"),
    
    @SerializedName("CONCEPT")
    CONCEPT("CONCEPT"),
    
    @SerializedName("TOPIC")
    TOPIC("TOPIC");

    private String value;

    CategoryTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("categoryType")
  private CategoryTypeEnum categoryType = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  /**
   * Gets or Sets forumStatus
   */
  public enum ForumStatusEnum {
    @SerializedName("PENDING")
    PENDING("PENDING"),
    
    @SerializedName("APPROVED")
    APPROVED("APPROVED"),
    
    @SerializedName("REPORTED_AS_SPAM")
    REPORTED_AS_SPAM("REPORTED_AS_SPAM"),
    
    @SerializedName("REPORTED_AS_ABUSE")
    REPORTED_AS_ABUSE("REPORTED_AS_ABUSE"),
    
    @SerializedName("BLOCKED")
    BLOCKED("BLOCKED");

    private String value;

    ForumStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("forumStatus")
  private ForumStatusEnum forumStatus = null;

  @SerializedName("forumUUID")
  private String forumUUID = null;

  @SerializedName("forumUUIDs")
  private List<String> forumUUIDs = new ArrayList<String>();

  @SerializedName("groupReference")
  private String groupReference = null;

  /**
   * Gets or Sets groupType
   */
  public enum GroupTypeEnum {
    @SerializedName("SOCIAL_GROUP")
    SOCIAL_GROUP("SOCIAL_GROUP"),
    
    @SerializedName("MEMBER")
    MEMBER("MEMBER"),
    
    @SerializedName("GROUP")
    GROUP("GROUP");

    private String value;

    GroupTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("groupType")
  private GroupTypeEnum groupType = null;

  @SerializedName("groupUUID")
  private String groupUUID = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("topicReferences")
  private List<String> topicReferences = new ArrayList<String>();

  @SerializedName("topicUUID")
  private String topicUUID = null;

  @SerializedName("uuid")
  private String uuid = null;

  public PostRequest branchId(Long branchId) {
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

  public PostRequest categoryReference(String categoryReference) {
    this.categoryReference = categoryReference;
    return this;
  }

   /**
   * Get categoryReference
   * @return categoryReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryReference() {
    return categoryReference;
  }

  public void setCategoryReference(String categoryReference) {
    this.categoryReference = categoryReference;
  }

  public PostRequest categoryType(CategoryTypeEnum categoryType) {
    this.categoryType = categoryType;
    return this;
  }

   /**
   * Get categoryType
   * @return categoryType
  **/
  @ApiModelProperty(example = "null", value = "")
  public CategoryTypeEnum getCategoryType() {
    return categoryType;
  }

  public void setCategoryType(CategoryTypeEnum categoryType) {
    this.categoryType = categoryType;
  }

  public PostRequest content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public PostRequest createdBy(Long createdBy) {
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

  public PostRequest forumStatus(ForumStatusEnum forumStatus) {
    this.forumStatus = forumStatus;
    return this;
  }

   /**
   * Get forumStatus
   * @return forumStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public ForumStatusEnum getForumStatus() {
    return forumStatus;
  }

  public void setForumStatus(ForumStatusEnum forumStatus) {
    this.forumStatus = forumStatus;
  }

  public PostRequest forumUUID(String forumUUID) {
    this.forumUUID = forumUUID;
    return this;
  }

   /**
   * Get forumUUID
   * @return forumUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getForumUUID() {
    return forumUUID;
  }

  public void setForumUUID(String forumUUID) {
    this.forumUUID = forumUUID;
  }

  public PostRequest forumUUIDs(List<String> forumUUIDs) {
    this.forumUUIDs = forumUUIDs;
    return this;
  }

  public PostRequest addForumUUIDsItem(String forumUUIDsItem) {
    this.forumUUIDs.add(forumUUIDsItem);
    return this;
  }

   /**
   * Get forumUUIDs
   * @return forumUUIDs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getForumUUIDs() {
    return forumUUIDs;
  }

  public void setForumUUIDs(List<String> forumUUIDs) {
    this.forumUUIDs = forumUUIDs;
  }

  public PostRequest groupReference(String groupReference) {
    this.groupReference = groupReference;
    return this;
  }

   /**
   * Get groupReference
   * @return groupReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupReference() {
    return groupReference;
  }

  public void setGroupReference(String groupReference) {
    this.groupReference = groupReference;
  }

  public PostRequest groupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * Get groupType
   * @return groupType
  **/
  @ApiModelProperty(example = "null", value = "")
  public GroupTypeEnum getGroupType() {
    return groupType;
  }

  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  public PostRequest groupUUID(String groupUUID) {
    this.groupUUID = groupUUID;
    return this;
  }

   /**
   * Get groupUUID
   * @return groupUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupUUID() {
    return groupUUID;
  }

  public void setGroupUUID(String groupUUID) {
    this.groupUUID = groupUUID;
  }

  public PostRequest id(Long id) {
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

  public PostRequest modifiedBy(Long modifiedBy) {
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

  public PostRequest page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public PostRequest size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PostRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PostRequest topicReferences(List<String> topicReferences) {
    this.topicReferences = topicReferences;
    return this;
  }

  public PostRequest addTopicReferencesItem(String topicReferencesItem) {
    this.topicReferences.add(topicReferencesItem);
    return this;
  }

   /**
   * Get topicReferences
   * @return topicReferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getTopicReferences() {
    return topicReferences;
  }

  public void setTopicReferences(List<String> topicReferences) {
    this.topicReferences = topicReferences;
  }

  public PostRequest topicUUID(String topicUUID) {
    this.topicUUID = topicUUID;
    return this;
  }

   /**
   * Get topicUUID
   * @return topicUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTopicUUID() {
    return topicUUID;
  }

  public void setTopicUUID(String topicUUID) {
    this.topicUUID = topicUUID;
  }

  public PostRequest uuid(String uuid) {
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
    PostRequest postRequest = (PostRequest) o;
    return Objects.equals(this.branchId, postRequest.branchId) &&
        Objects.equals(this.categoryReference, postRequest.categoryReference) &&
        Objects.equals(this.categoryType, postRequest.categoryType) &&
        Objects.equals(this.content, postRequest.content) &&
        Objects.equals(this.createdBy, postRequest.createdBy) &&
        Objects.equals(this.forumStatus, postRequest.forumStatus) &&
        Objects.equals(this.forumUUID, postRequest.forumUUID) &&
        Objects.equals(this.forumUUIDs, postRequest.forumUUIDs) &&
        Objects.equals(this.groupReference, postRequest.groupReference) &&
        Objects.equals(this.groupType, postRequest.groupType) &&
        Objects.equals(this.groupUUID, postRequest.groupUUID) &&
        Objects.equals(this.id, postRequest.id) &&
        Objects.equals(this.modifiedBy, postRequest.modifiedBy) &&
        Objects.equals(this.page, postRequest.page) &&
        Objects.equals(this.size, postRequest.size) &&
        Objects.equals(this.title, postRequest.title) &&
        Objects.equals(this.topicReferences, postRequest.topicReferences) &&
        Objects.equals(this.topicUUID, postRequest.topicUUID) &&
        Objects.equals(this.uuid, postRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, categoryReference, categoryType, content, createdBy, forumStatus, forumUUID, forumUUIDs, groupReference, groupType, groupUUID, id, modifiedBy, page, size, title, topicReferences, topicUUID, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRequest {\n");
    
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    categoryReference: ").append(toIndentedString(categoryReference)).append("\n");
    sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    forumStatus: ").append(toIndentedString(forumStatus)).append("\n");
    sb.append("    forumUUID: ").append(toIndentedString(forumUUID)).append("\n");
    sb.append("    forumUUIDs: ").append(toIndentedString(forumUUIDs)).append("\n");
    sb.append("    groupReference: ").append(toIndentedString(groupReference)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    groupUUID: ").append(toIndentedString(groupUUID)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    topicReferences: ").append(toIndentedString(topicReferences)).append("\n");
    sb.append("    topicUUID: ").append(toIndentedString(topicUUID)).append("\n");
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

