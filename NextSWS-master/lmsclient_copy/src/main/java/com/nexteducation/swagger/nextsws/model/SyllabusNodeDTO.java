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
 * SyllabusNodeDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class SyllabusNodeDTO   {
  @SerializedName("custom")
  private Boolean custom = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("isCopyOfId")
  private Long isCopyOfId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentId")
  private Long parentId = null;

  @SerializedName("peerId")
  private Long peerId = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("seq")
  private Long seq = null;

  @SerializedName("syllabusId")
  private Long syllabusId = null;

  @SerializedName("tlm")
  private Boolean tlm = null;

  @SerializedName("visibleClient")
  private Boolean visibleClient = null;

  public SyllabusNodeDTO custom(Boolean custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCustom() {
    return custom;
  }

  public void setCustom(Boolean custom) {
    this.custom = custom;
  }

  public SyllabusNodeDTO id(Long id) {
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

  public SyllabusNodeDTO isCopyOfId(Long isCopyOfId) {
    this.isCopyOfId = isCopyOfId;
    return this;
  }

   /**
   * Get isCopyOfId
   * @return isCopyOfId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getIsCopyOfId() {
    return isCopyOfId;
  }

  public void setIsCopyOfId(Long isCopyOfId) {
    this.isCopyOfId = isCopyOfId;
  }

  public SyllabusNodeDTO name(String name) {
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

  public SyllabusNodeDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public SyllabusNodeDTO peerId(Long peerId) {
    this.peerId = peerId;
    return this;
  }

   /**
   * Get peerId
   * @return peerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPeerId() {
    return peerId;
  }

  public void setPeerId(Long peerId) {
    this.peerId = peerId;
  }

  public SyllabusNodeDTO published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public SyllabusNodeDTO seq(Long seq) {
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

  public SyllabusNodeDTO syllabusId(Long syllabusId) {
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

  public SyllabusNodeDTO tlm(Boolean tlm) {
    this.tlm = tlm;
    return this;
  }

   /**
   * Get tlm
   * @return tlm
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTlm() {
    return tlm;
  }

  public void setTlm(Boolean tlm) {
    this.tlm = tlm;
  }

  public SyllabusNodeDTO visibleClient(Boolean visibleClient) {
    this.visibleClient = visibleClient;
    return this;
  }

   /**
   * Get visibleClient
   * @return visibleClient
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVisibleClient() {
    return visibleClient;
  }

  public void setVisibleClient(Boolean visibleClient) {
    this.visibleClient = visibleClient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyllabusNodeDTO syllabusNodeDTO = (SyllabusNodeDTO) o;
    return Objects.equals(this.custom, syllabusNodeDTO.custom) &&
        Objects.equals(this.id, syllabusNodeDTO.id) &&
        Objects.equals(this.isCopyOfId, syllabusNodeDTO.isCopyOfId) &&
        Objects.equals(this.name, syllabusNodeDTO.name) &&
        Objects.equals(this.parentId, syllabusNodeDTO.parentId) &&
        Objects.equals(this.peerId, syllabusNodeDTO.peerId) &&
        Objects.equals(this.published, syllabusNodeDTO.published) &&
        Objects.equals(this.seq, syllabusNodeDTO.seq) &&
        Objects.equals(this.syllabusId, syllabusNodeDTO.syllabusId) &&
        Objects.equals(this.tlm, syllabusNodeDTO.tlm) &&
        Objects.equals(this.visibleClient, syllabusNodeDTO.visibleClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom, id, isCopyOfId, name, parentId, peerId, published, seq, syllabusId, tlm, visibleClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyllabusNodeDTO {\n");
    
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCopyOfId: ").append(toIndentedString(isCopyOfId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    syllabusId: ").append(toIndentedString(syllabusId)).append("\n");
    sb.append("    tlm: ").append(toIndentedString(tlm)).append("\n");
    sb.append("    visibleClient: ").append(toIndentedString(visibleClient)).append("\n");
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
