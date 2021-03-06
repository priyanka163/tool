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
 * LearningPlanChapterRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class LearningPlanChapterRequest   {
  @SerializedName("chapterId")
  private Long chapterId = null;

  @SerializedName("chapterName")
  private String chapterName = null;

  @SerializedName("chapterSeqNo")
  private Long chapterSeqNo = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("customChapter")
  private Boolean customChapter = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("Active")
    ACTIVE("Active"),
    
    @SerializedName("Inactive")
    INACTIVE("Inactive");

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

  @SerializedName("user")
  private Long user = null;

  @SerializedName("uuid")
  private String uuid = null;

  public LearningPlanChapterRequest chapterId(Long chapterId) {
    this.chapterId = chapterId;
    return this;
  }

   /**
   * Get chapterId
   * @return chapterId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChapterId() {
    return chapterId;
  }

  public void setChapterId(Long chapterId) {
    this.chapterId = chapterId;
  }

  public LearningPlanChapterRequest chapterName(String chapterName) {
    this.chapterName = chapterName;
    return this;
  }

   /**
   * Get chapterName
   * @return chapterName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChapterName() {
    return chapterName;
  }

  public void setChapterName(String chapterName) {
    this.chapterName = chapterName;
  }

  public LearningPlanChapterRequest chapterSeqNo(Long chapterSeqNo) {
    this.chapterSeqNo = chapterSeqNo;
    return this;
  }

   /**
   * Get chapterSeqNo
   * @return chapterSeqNo
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChapterSeqNo() {
    return chapterSeqNo;
  }

  public void setChapterSeqNo(Long chapterSeqNo) {
    this.chapterSeqNo = chapterSeqNo;
  }

  public LearningPlanChapterRequest createdBy(Long createdBy) {
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

  public LearningPlanChapterRequest customChapter(Boolean customChapter) {
    this.customChapter = customChapter;
    return this;
  }

   /**
   * Get customChapter
   * @return customChapter
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCustomChapter() {
    return customChapter;
  }

  public void setCustomChapter(Boolean customChapter) {
    this.customChapter = customChapter;
  }

  public LearningPlanChapterRequest modifiedBy(Long modifiedBy) {
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

  public LearningPlanChapterRequest status(StatusEnum status) {
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

  public LearningPlanChapterRequest user(Long user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUser() {
    return user;
  }

  public void setUser(Long user) {
    this.user = user;
  }

  public LearningPlanChapterRequest uuid(String uuid) {
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
    LearningPlanChapterRequest learningPlanChapterRequest = (LearningPlanChapterRequest) o;
    return Objects.equals(this.chapterId, learningPlanChapterRequest.chapterId) &&
        Objects.equals(this.chapterName, learningPlanChapterRequest.chapterName) &&
        Objects.equals(this.chapterSeqNo, learningPlanChapterRequest.chapterSeqNo) &&
        Objects.equals(this.createdBy, learningPlanChapterRequest.createdBy) &&
        Objects.equals(this.customChapter, learningPlanChapterRequest.customChapter) &&
        Objects.equals(this.modifiedBy, learningPlanChapterRequest.modifiedBy) &&
        Objects.equals(this.status, learningPlanChapterRequest.status) &&
        Objects.equals(this.user, learningPlanChapterRequest.user) &&
        Objects.equals(this.uuid, learningPlanChapterRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapterId, chapterName, chapterSeqNo, createdBy, customChapter, modifiedBy, status, user, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningPlanChapterRequest {\n");
    
    sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
    sb.append("    chapterName: ").append(toIndentedString(chapterName)).append("\n");
    sb.append("    chapterSeqNo: ").append(toIndentedString(chapterSeqNo)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    customChapter: ").append(toIndentedString(customChapter)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

