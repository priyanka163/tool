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
import com.nexteducation.swagger.nextsws.model.Videodto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VideoSearchResponseDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class VideoSearchResponseDTO   {
  @SerializedName("list")
  private List<Videodto> list = new ArrayList<Videodto>();

  @SerializedName("nextpageToken")
  private String nextpageToken = null;

  @SerializedName("prevpageToken")
  private String prevpageToken = null;

  public VideoSearchResponseDTO list(List<Videodto> list) {
    this.list = list;
    return this;
  }

  public VideoSearchResponseDTO addListItem(Videodto listItem) {
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Videodto> getList() {
    return list;
  }

  public void setList(List<Videodto> list) {
    this.list = list;
  }

  public VideoSearchResponseDTO nextpageToken(String nextpageToken) {
    this.nextpageToken = nextpageToken;
    return this;
  }

   /**
   * Get nextpageToken
   * @return nextpageToken
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNextpageToken() {
    return nextpageToken;
  }

  public void setNextpageToken(String nextpageToken) {
    this.nextpageToken = nextpageToken;
  }

  public VideoSearchResponseDTO prevpageToken(String prevpageToken) {
    this.prevpageToken = prevpageToken;
    return this;
  }

   /**
   * Get prevpageToken
   * @return prevpageToken
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrevpageToken() {
    return prevpageToken;
  }

  public void setPrevpageToken(String prevpageToken) {
    this.prevpageToken = prevpageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoSearchResponseDTO videoSearchResponseDTO = (VideoSearchResponseDTO) o;
    return Objects.equals(this.list, videoSearchResponseDTO.list) &&
        Objects.equals(this.nextpageToken, videoSearchResponseDTO.nextpageToken) &&
        Objects.equals(this.prevpageToken, videoSearchResponseDTO.prevpageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, nextpageToken, prevpageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoSearchResponseDTO {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    nextpageToken: ").append(toIndentedString(nextpageToken)).append("\n");
    sb.append("    prevpageToken: ").append(toIndentedString(prevpageToken)).append("\n");
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

