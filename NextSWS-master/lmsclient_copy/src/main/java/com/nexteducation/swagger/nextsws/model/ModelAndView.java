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
import com.nexteducation.swagger.nextsws.model.View;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * ModelAndView
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class ModelAndView   {
  @SerializedName("empty")
  private Boolean empty = null;

  @SerializedName("model")
  private Object model = null;

  @SerializedName("modelMap")
  private Map<String, Object> modelMap = new HashMap<String, Object>();

  @SerializedName("reference")
  private Boolean reference = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("100")
    _100("100"),
    
    @SerializedName("101")
    _101("101"),
    
    @SerializedName("102")
    _102("102"),
    
    @SerializedName("103")
    _103("103"),
    
    @SerializedName("200")
    _200("200"),
    
    @SerializedName("201")
    _201("201"),
    
    @SerializedName("202")
    _202("202"),
    
    @SerializedName("203")
    _203("203"),
    
    @SerializedName("204")
    _204("204"),
    
    @SerializedName("205")
    _205("205"),
    
    @SerializedName("206")
    _206("206"),
    
    @SerializedName("207")
    _207("207"),
    
    @SerializedName("208")
    _208("208"),
    
    @SerializedName("226")
    _226("226"),
    
    @SerializedName("300")
    _300("300"),
    
    @SerializedName("301")
    _301("301"),
    
    @SerializedName("302")
    _302("302"),
    
    @SerializedName("303")
    _303("303"),
    
    @SerializedName("304")
    _304("304"),
    
    @SerializedName("305")
    _305("305"),
    
    @SerializedName("307")
    _307("307"),
    
    @SerializedName("308")
    _308("308"),
    
    @SerializedName("400")
    _400("400"),
    
    @SerializedName("401")
    _401("401"),
    
    @SerializedName("402")
    _402("402"),
    
    @SerializedName("403")
    _403("403"),
    
    @SerializedName("404")
    _404("404"),
    
    @SerializedName("405")
    _405("405"),
    
    @SerializedName("406")
    _406("406"),
    
    @SerializedName("407")
    _407("407"),
    
    @SerializedName("408")
    _408("408"),
    
    @SerializedName("409")
    _409("409"),
    
    @SerializedName("410")
    _410("410"),
    
    @SerializedName("411")
    _411("411"),
    
    @SerializedName("412")
    _412("412"),
    
    @SerializedName("413")
    _413("413"),
    
    @SerializedName("414")
    _414("414"),
    
    @SerializedName("415")
    _415("415"),
    
    @SerializedName("416")
    _416("416"),
    
    @SerializedName("417")
    _417("417"),
    
    @SerializedName("418")
    _418("418"),
    
    @SerializedName("419")
    _419("419"),
    
    @SerializedName("420")
    _420("420"),
    
    @SerializedName("421")
    _421("421"),
    
    @SerializedName("422")
    _422("422"),
    
    @SerializedName("423")
    _423("423"),
    
    @SerializedName("424")
    _424("424"),
    
    @SerializedName("426")
    _426("426"),
    
    @SerializedName("428")
    _428("428"),
    
    @SerializedName("429")
    _429("429"),
    
    @SerializedName("431")
    _431("431"),
    
    @SerializedName("451")
    _451("451"),
    
    @SerializedName("500")
    _500("500"),
    
    @SerializedName("501")
    _501("501"),
    
    @SerializedName("502")
    _502("502"),
    
    @SerializedName("503")
    _503("503"),
    
    @SerializedName("504")
    _504("504"),
    
    @SerializedName("505")
    _505("505"),
    
    @SerializedName("506")
    _506("506"),
    
    @SerializedName("507")
    _507("507"),
    
    @SerializedName("508")
    _508("508"),
    
    @SerializedName("509")
    _509("509"),
    
    @SerializedName("510")
    _510("510"),
    
    @SerializedName("511")
    _511("511");

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

  @SerializedName("view")
  private View view = null;

  @SerializedName("viewName")
  private String viewName = null;

  public ModelAndView empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public ModelAndView model(Object model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getModel() {
    return model;
  }

  public void setModel(Object model) {
    this.model = model;
  }

  public ModelAndView modelMap(Map<String, Object> modelMap) {
    this.modelMap = modelMap;
    return this;
  }

  public ModelAndView putModelMapItem(String key, Object modelMapItem) {
    this.modelMap.put(key, modelMapItem);
    return this;
  }

   /**
   * Get modelMap
   * @return modelMap
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getModelMap() {
    return modelMap;
  }

  public void setModelMap(Map<String, Object> modelMap) {
    this.modelMap = modelMap;
  }

  public ModelAndView reference(Boolean reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReference() {
    return reference;
  }

  public void setReference(Boolean reference) {
    this.reference = reference;
  }

  public ModelAndView status(StatusEnum status) {
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

  public ModelAndView view(View view) {
    this.view = view;
    return this;
  }

   /**
   * Get view
   * @return view
  **/
  @ApiModelProperty(example = "null", value = "")
  public View getView() {
    return view;
  }

  public void setView(View view) {
    this.view = view;
  }

  public ModelAndView viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

   /**
   * Get viewName
   * @return viewName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getViewName() {
    return viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAndView modelAndView = (ModelAndView) o;
    return Objects.equals(this.empty, modelAndView.empty) &&
        Objects.equals(this.model, modelAndView.model) &&
        Objects.equals(this.modelMap, modelAndView.modelMap) &&
        Objects.equals(this.reference, modelAndView.reference) &&
        Objects.equals(this.status, modelAndView.status) &&
        Objects.equals(this.view, modelAndView.view) &&
        Objects.equals(this.viewName, modelAndView.viewName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, model, modelMap, reference, status, view, viewName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAndView {\n");
    
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelMap: ").append(toIndentedString(modelMap)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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

