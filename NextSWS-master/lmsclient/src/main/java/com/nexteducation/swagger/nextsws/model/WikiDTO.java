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
import com.nexteducation.swagger.nextsws.model.WikiRequest;
import com.nexteducation.swagger.nextsws.model.WikiSectionRequest;
import com.nexteducation.swagger.nextsws.model.WikiSectionTextRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * WikiDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class WikiDTO   {
  @SerializedName("chapterId")
  private Long chapterId = null;

  @SerializedName("editMode")
  private Boolean editMode = null;

  @SerializedName("lessonId")
  private Long lessonId = null;

  @SerializedName("subjectId")
  private Long subjectId = null;

  @SerializedName("syllabusId")
  private Long syllabusId = null;

  @SerializedName("wiki")
  private WikiRequest wiki = null;

  @SerializedName("wikiCategoryLevel")
  private String wikiCategoryLevel = null;

  @SerializedName("wikiCategoryLevelId")
  private String wikiCategoryLevelId = null;

  @SerializedName("wikiNodeId")
  private Long wikiNodeId = null;

  @SerializedName("wikiSection")
  private WikiSectionRequest wikiSection = null;

  @SerializedName("wikiSectionText")
  private WikiSectionTextRequest wikiSectionText = null;

  @SerializedName("wikiUUID")
  private String wikiUUID = null;

  public WikiDTO chapterId(Long chapterId) {
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

  public WikiDTO editMode(Boolean editMode) {
    this.editMode = editMode;
    return this;
  }

   /**
   * Get editMode
   * @return editMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEditMode() {
    return editMode;
  }

  public void setEditMode(Boolean editMode) {
    this.editMode = editMode;
  }

  public WikiDTO lessonId(Long lessonId) {
    this.lessonId = lessonId;
    return this;
  }

   /**
   * Get lessonId
   * @return lessonId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLessonId() {
    return lessonId;
  }

  public void setLessonId(Long lessonId) {
    this.lessonId = lessonId;
  }

  public WikiDTO subjectId(Long subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Long subjectId) {
    this.subjectId = subjectId;
  }

  public WikiDTO syllabusId(Long syllabusId) {
    this.syllabusId = syllabusId;
    return this;
  }

   /**
   * Get syllabusId
   * @return syllabusId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSyllabusId() {
    return syllabusId;
  }

  public void setSyllabusId(Long syllabusId) {
    this.syllabusId = syllabusId;
  }

  public WikiDTO wiki(WikiRequest wiki) {
    this.wiki = wiki;
    return this;
  }

   /**
   * Get wiki
   * @return wiki
  **/
  @ApiModelProperty(example = "null", value = "")
  public WikiRequest getWiki() {
    return wiki;
  }

  public void setWiki(WikiRequest wiki) {
    this.wiki = wiki;
  }

  public WikiDTO wikiCategoryLevel(String wikiCategoryLevel) {
    this.wikiCategoryLevel = wikiCategoryLevel;
    return this;
  }

   /**
   * Get wikiCategoryLevel
   * @return wikiCategoryLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWikiCategoryLevel() {
    return wikiCategoryLevel;
  }

  public void setWikiCategoryLevel(String wikiCategoryLevel) {
    this.wikiCategoryLevel = wikiCategoryLevel;
  }

  public WikiDTO wikiCategoryLevelId(String wikiCategoryLevelId) {
    this.wikiCategoryLevelId = wikiCategoryLevelId;
    return this;
  }

   /**
   * Get wikiCategoryLevelId
   * @return wikiCategoryLevelId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWikiCategoryLevelId() {
    return wikiCategoryLevelId;
  }

  public void setWikiCategoryLevelId(String wikiCategoryLevelId) {
    this.wikiCategoryLevelId = wikiCategoryLevelId;
  }

  public WikiDTO wikiNodeId(Long wikiNodeId) {
    this.wikiNodeId = wikiNodeId;
    return this;
  }

   /**
   * Get wikiNodeId
   * @return wikiNodeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getWikiNodeId() {
    return wikiNodeId;
  }

  public void setWikiNodeId(Long wikiNodeId) {
    this.wikiNodeId = wikiNodeId;
  }

  public WikiDTO wikiSection(WikiSectionRequest wikiSection) {
    this.wikiSection = wikiSection;
    return this;
  }

   /**
   * Get wikiSection
   * @return wikiSection
  **/
  @ApiModelProperty(example = "null", value = "")
  public WikiSectionRequest getWikiSection() {
    return wikiSection;
  }

  public void setWikiSection(WikiSectionRequest wikiSection) {
    this.wikiSection = wikiSection;
  }

  public WikiDTO wikiSectionText(WikiSectionTextRequest wikiSectionText) {
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

  public WikiDTO wikiUUID(String wikiUUID) {
    this.wikiUUID = wikiUUID;
    return this;
  }

   /**
   * Get wikiUUID
   * @return wikiUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWikiUUID() {
    return wikiUUID;
  }

  public void setWikiUUID(String wikiUUID) {
    this.wikiUUID = wikiUUID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiDTO wikiDTO = (WikiDTO) o;
    return Objects.equals(this.chapterId, wikiDTO.chapterId) &&
        Objects.equals(this.editMode, wikiDTO.editMode) &&
        Objects.equals(this.lessonId, wikiDTO.lessonId) &&
        Objects.equals(this.subjectId, wikiDTO.subjectId) &&
        Objects.equals(this.syllabusId, wikiDTO.syllabusId) &&
        Objects.equals(this.wiki, wikiDTO.wiki) &&
        Objects.equals(this.wikiCategoryLevel, wikiDTO.wikiCategoryLevel) &&
        Objects.equals(this.wikiCategoryLevelId, wikiDTO.wikiCategoryLevelId) &&
        Objects.equals(this.wikiNodeId, wikiDTO.wikiNodeId) &&
        Objects.equals(this.wikiSection, wikiDTO.wikiSection) &&
        Objects.equals(this.wikiSectionText, wikiDTO.wikiSectionText) &&
        Objects.equals(this.wikiUUID, wikiDTO.wikiUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapterId, editMode, lessonId, subjectId, syllabusId, wiki, wikiCategoryLevel, wikiCategoryLevelId, wikiNodeId, wikiSection, wikiSectionText, wikiUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiDTO {\n");
    
    sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
    sb.append("    editMode: ").append(toIndentedString(editMode)).append("\n");
    sb.append("    lessonId: ").append(toIndentedString(lessonId)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    syllabusId: ").append(toIndentedString(syllabusId)).append("\n");
    sb.append("    wiki: ").append(toIndentedString(wiki)).append("\n");
    sb.append("    wikiCategoryLevel: ").append(toIndentedString(wikiCategoryLevel)).append("\n");
    sb.append("    wikiCategoryLevelId: ").append(toIndentedString(wikiCategoryLevelId)).append("\n");
    sb.append("    wikiNodeId: ").append(toIndentedString(wikiNodeId)).append("\n");
    sb.append("    wikiSection: ").append(toIndentedString(wikiSection)).append("\n");
    sb.append("    wikiSectionText: ").append(toIndentedString(wikiSectionText)).append("\n");
    sb.append("    wikiUUID: ").append(toIndentedString(wikiUUID)).append("\n");
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

