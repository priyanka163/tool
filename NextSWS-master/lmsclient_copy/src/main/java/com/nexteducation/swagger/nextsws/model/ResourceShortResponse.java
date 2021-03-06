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
import com.nexteducation.swagger.nextsws.model.ResourceEndUseTypeShortResponse;
import com.nexteducation.swagger.nextsws.model.ResourceSourceTypeShortResponse;
import com.nexteducation.swagger.nextsws.model.ResourceSubTypeShortResponse;
import com.nexteducation.swagger.nextsws.model.ResourceTypeShortResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ResourceShortResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class ResourceShortResponse   {
  @SerializedName("description")
  private String description = null;

  @SerializedName("duration")
  private Double duration = null;

  @SerializedName("endUseType")
  private ResourceEndUseTypeShortResponse endUseType = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sourceType")
  private ResourceSourceTypeShortResponse sourceType = null;

  @SerializedName("subType")
  private ResourceSubTypeShortResponse subType = null;

  @SerializedName("thumbnailUrl")
  private String thumbnailUrl = null;

  @SerializedName("type")
  private ResourceTypeShortResponse type = null;

  @SerializedName("uuid")
  private String uuid = null;

  public ResourceShortResponse description(String description) {
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

  public ResourceShortResponse duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public ResourceShortResponse endUseType(ResourceEndUseTypeShortResponse endUseType) {
    this.endUseType = endUseType;
    return this;
  }

   /**
   * Get endUseType
   * @return endUseType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResourceEndUseTypeShortResponse getEndUseType() {
    return endUseType;
  }

  public void setEndUseType(ResourceEndUseTypeShortResponse endUseType) {
    this.endUseType = endUseType;
  }

  public ResourceShortResponse label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ResourceShortResponse name(String name) {
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

  public ResourceShortResponse sourceType(ResourceSourceTypeShortResponse sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResourceSourceTypeShortResponse getSourceType() {
    return sourceType;
  }

  public void setSourceType(ResourceSourceTypeShortResponse sourceType) {
    this.sourceType = sourceType;
  }

  public ResourceShortResponse subType(ResourceSubTypeShortResponse subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResourceSubTypeShortResponse getSubType() {
    return subType;
  }

  public void setSubType(ResourceSubTypeShortResponse subType) {
    this.subType = subType;
  }

  public ResourceShortResponse thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * Get thumbnailUrl
   * @return thumbnailUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public ResourceShortResponse type(ResourceTypeShortResponse type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public ResourceTypeShortResponse getType() {
    return type;
  }

  public void setType(ResourceTypeShortResponse type) {
    this.type = type;
  }

  public ResourceShortResponse uuid(String uuid) {
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
    ResourceShortResponse resourceShortResponse = (ResourceShortResponse) o;
    return Objects.equals(this.description, resourceShortResponse.description) &&
        Objects.equals(this.duration, resourceShortResponse.duration) &&
        Objects.equals(this.endUseType, resourceShortResponse.endUseType) &&
        Objects.equals(this.label, resourceShortResponse.label) &&
        Objects.equals(this.name, resourceShortResponse.name) &&
        Objects.equals(this.sourceType, resourceShortResponse.sourceType) &&
        Objects.equals(this.subType, resourceShortResponse.subType) &&
        Objects.equals(this.thumbnailUrl, resourceShortResponse.thumbnailUrl) &&
        Objects.equals(this.type, resourceShortResponse.type) &&
        Objects.equals(this.uuid, resourceShortResponse.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, duration, endUseType, label, name, sourceType, subType, thumbnailUrl, type, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceShortResponse {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endUseType: ").append(toIndentedString(endUseType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

