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
 * AreaMapEntryResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class AreaMapEntryResponse   {
  @SerializedName("coordinates")
  private String coordinates = null;

  @SerializedName("mappedValue")
  private Double mappedValue = null;

  @SerializedName("shape")
  private String shape = null;

  public AreaMapEntryResponse coordinates(String coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(String coordinates) {
    this.coordinates = coordinates;
  }

  public AreaMapEntryResponse mappedValue(Double mappedValue) {
    this.mappedValue = mappedValue;
    return this;
  }

   /**
   * Get mappedValue
   * @return mappedValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMappedValue() {
    return mappedValue;
  }

  public void setMappedValue(Double mappedValue) {
    this.mappedValue = mappedValue;
  }

  public AreaMapEntryResponse shape(String shape) {
    this.shape = shape;
    return this;
  }

   /**
   * Get shape
   * @return shape
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShape() {
    return shape;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaMapEntryResponse areaMapEntryResponse = (AreaMapEntryResponse) o;
    return Objects.equals(this.coordinates, areaMapEntryResponse.coordinates) &&
        Objects.equals(this.mappedValue, areaMapEntryResponse.mappedValue) &&
        Objects.equals(this.shape, areaMapEntryResponse.shape);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, mappedValue, shape);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaMapEntryResponse {\n");
    
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    mappedValue: ").append(toIndentedString(mappedValue)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
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

