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
import com.nexteducation.swagger.nextsws.model.LDRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * LOLDRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class LOLDRequest   {
  /**
   * Gets or Sets bloomsTaxonomy
   */
  public enum BloomsTaxonomyEnum {
    @SerializedName("KNOWLEDGE")
    KNOWLEDGE("KNOWLEDGE"),
    
    @SerializedName("COMPREHENSION")
    COMPREHENSION("COMPREHENSION"),
    
    @SerializedName("APPLICATION")
    APPLICATION("APPLICATION"),
    
    @SerializedName("SYNTHESIS")
    SYNTHESIS("SYNTHESIS"),
    
    @SerializedName("PROCEDURAL_MANIPULATIVE")
    PROCEDURAL_MANIPULATIVE("PROCEDURAL_MANIPULATIVE"),
    
    @SerializedName("OBSERVATIONAL")
    OBSERVATIONAL("OBSERVATIONAL"),
    
    @SerializedName("DRAWING")
    DRAWING("DRAWING"),
    
    @SerializedName("REPORTING_INTERPRETATIVE")
    REPORTING_INTERPRETATIVE("REPORTING_INTERPRETATIVE"),
    
    @SerializedName("UNDERSTANDING")
    UNDERSTANDING("UNDERSTANDING"),
    
    @SerializedName("ANALYSIS")
    ANALYSIS("ANALYSIS"),
    
    @SerializedName("EVALUATION")
    EVALUATION("EVALUATION");

    private String value;

    BloomsTaxonomyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("bloomsTaxonomy")
  private List<BloomsTaxonomyEnum> bloomsTaxonomy = new ArrayList<BloomsTaxonomyEnum>();

  @SerializedName("lDs")
  private List<LDRequest> lDs = new ArrayList<LDRequest>();

  @SerializedName("lOUUID")
  private String lOUUID = null;

  public LOLDRequest bloomsTaxonomy(List<BloomsTaxonomyEnum> bloomsTaxonomy) {
    this.bloomsTaxonomy = bloomsTaxonomy;
    return this;
  }

  public LOLDRequest addBloomsTaxonomyItem(BloomsTaxonomyEnum bloomsTaxonomyItem) {
    this.bloomsTaxonomy.add(bloomsTaxonomyItem);
    return this;
  }

   /**
   * Get bloomsTaxonomy
   * @return bloomsTaxonomy
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BloomsTaxonomyEnum> getBloomsTaxonomy() {
    return bloomsTaxonomy;
  }

  public void setBloomsTaxonomy(List<BloomsTaxonomyEnum> bloomsTaxonomy) {
    this.bloomsTaxonomy = bloomsTaxonomy;
  }

  public LOLDRequest lDs(List<LDRequest> lDs) {
    this.lDs = lDs;
    return this;
  }

  public LOLDRequest addLDsItem(LDRequest lDsItem) {
    this.lDs.add(lDsItem);
    return this;
  }

   /**
   * Get lDs
   * @return lDs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LDRequest> getLDs() {
    return lDs;
  }

  public void setLDs(List<LDRequest> lDs) {
    this.lDs = lDs;
  }

  public LOLDRequest lOUUID(String lOUUID) {
    this.lOUUID = lOUUID;
    return this;
  }

   /**
   * Get lOUUID
   * @return lOUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLOUUID() {
    return lOUUID;
  }

  public void setLOUUID(String lOUUID) {
    this.lOUUID = lOUUID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LOLDRequest lOLDRequest = (LOLDRequest) o;
    return Objects.equals(this.bloomsTaxonomy, lOLDRequest.bloomsTaxonomy) &&
        Objects.equals(this.lDs, lOLDRequest.lDs) &&
        Objects.equals(this.lOUUID, lOLDRequest.lOUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bloomsTaxonomy, lDs, lOUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LOLDRequest {\n");
    
    sb.append("    bloomsTaxonomy: ").append(toIndentedString(bloomsTaxonomy)).append("\n");
    sb.append("    lDs: ").append(toIndentedString(lDs)).append("\n");
    sb.append("    lOUUID: ").append(toIndentedString(lOUUID)).append("\n");
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
