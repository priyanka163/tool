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
 * MasterBoardRO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class MasterBoardRO   {
  @SerializedName("baseBoardId")
  private Long baseBoardId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  public MasterBoardRO baseBoardId(Long baseBoardId) {
    this.baseBoardId = baseBoardId;
    return this;
  }

   /**
   * Get baseBoardId
   * @return baseBoardId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBaseBoardId() {
    return baseBoardId;
  }

  public void setBaseBoardId(Long baseBoardId) {
    this.baseBoardId = baseBoardId;
  }

  public MasterBoardRO id(Long id) {
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

  public MasterBoardRO name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterBoardRO masterBoardRO = (MasterBoardRO) o;
    return Objects.equals(this.baseBoardId, masterBoardRO.baseBoardId) &&
        Objects.equals(this.id, masterBoardRO.id) &&
        Objects.equals(this.name, masterBoardRO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseBoardId, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterBoardRO {\n");
    
    sb.append("    baseBoardId: ").append(toIndentedString(baseBoardId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

