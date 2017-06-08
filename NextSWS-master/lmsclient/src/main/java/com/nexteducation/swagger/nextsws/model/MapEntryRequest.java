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
 * MapEntryRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class MapEntryRequest   {
  @SerializedName("caseSensitive")
  private Boolean caseSensitive = null;

  @SerializedName("mapKey")
  private String mapKey = null;

  @SerializedName("mapValue")
  private Double mapValue = null;

  public MapEntryRequest caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Get caseSensitive
   * @return caseSensitive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public MapEntryRequest mapKey(String mapKey) {
    this.mapKey = mapKey;
    return this;
  }

   /**
   * Get mapKey
   * @return mapKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMapKey() {
    return mapKey;
  }

  public void setMapKey(String mapKey) {
    this.mapKey = mapKey;
  }

  public MapEntryRequest mapValue(Double mapValue) {
    this.mapValue = mapValue;
    return this;
  }

   /**
   * Get mapValue
   * @return mapValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMapValue() {
    return mapValue;
  }

  public void setMapValue(Double mapValue) {
    this.mapValue = mapValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapEntryRequest mapEntryRequest = (MapEntryRequest) o;
    return Objects.equals(this.caseSensitive, mapEntryRequest.caseSensitive) &&
        Objects.equals(this.mapKey, mapEntryRequest.mapKey) &&
        Objects.equals(this.mapValue, mapEntryRequest.mapValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseSensitive, mapKey, mapValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapEntryRequest {\n");
    
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    mapKey: ").append(toIndentedString(mapKey)).append("\n");
    sb.append("    mapValue: ").append(toIndentedString(mapValue)).append("\n");
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

