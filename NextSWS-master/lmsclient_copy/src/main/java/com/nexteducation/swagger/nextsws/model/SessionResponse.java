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
import org.joda.time.DateTime;


/**
 * SessionResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class SessionResponse   {
  @SerializedName("apiKey")
  private Integer apiKey = null;

  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  /**
   * Gets or Sets mediaMode
   */
  public enum MediaModeEnum {
    @SerializedName("Relayed")
    RELAYED("Relayed"),
    
    @SerializedName("Routed")
    ROUTED("Routed");

    private String value;

    MediaModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("mediaMode")
  private MediaModeEnum mediaMode = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("modifiedOn")
  private DateTime modifiedOn = null;

  @SerializedName("sessionAdmin")
  private Long sessionAdmin = null;

  @SerializedName("sessionDate")
  private DateTime sessionDate = null;

  @SerializedName("sessionDescription")
  private String sessionDescription = null;

  @SerializedName("sessionId")
  private String sessionId = null;

  @SerializedName("sessionName")
  private String sessionName = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("Active")
    ACTIVE("Active"),
    
    @SerializedName("Inactive")
    INACTIVE("Inactive"),
    
    @SerializedName("InProgress")
    INPROGRESS("InProgress");

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

  public SessionResponse apiKey(Integer apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getApiKey() {
    return apiKey;
  }

  public void setApiKey(Integer apiKey) {
    this.apiKey = apiKey;
  }

  public SessionResponse branchId(Long branchId) {
    this.branchId = branchId;
    return this;
  }

   /**
   * Get branchId
   * @return branchId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBranchId() {
    return branchId;
  }

  public void setBranchId(Long branchId) {
    this.branchId = branchId;
  }

  public SessionResponse createdBy(Long createdBy) {
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

  public SessionResponse createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public SessionResponse mediaMode(MediaModeEnum mediaMode) {
    this.mediaMode = mediaMode;
    return this;
  }

   /**
   * Get mediaMode
   * @return mediaMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public MediaModeEnum getMediaMode() {
    return mediaMode;
  }

  public void setMediaMode(MediaModeEnum mediaMode) {
    this.mediaMode = mediaMode;
  }

  public SessionResponse modifiedBy(Long modifiedBy) {
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

  public SessionResponse modifiedOn(DateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(DateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public SessionResponse sessionAdmin(Long sessionAdmin) {
    this.sessionAdmin = sessionAdmin;
    return this;
  }

   /**
   * Get sessionAdmin
   * @return sessionAdmin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSessionAdmin() {
    return sessionAdmin;
  }

  public void setSessionAdmin(Long sessionAdmin) {
    this.sessionAdmin = sessionAdmin;
  }

  public SessionResponse sessionDate(DateTime sessionDate) {
    this.sessionDate = sessionDate;
    return this;
  }

   /**
   * Get sessionDate
   * @return sessionDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getSessionDate() {
    return sessionDate;
  }

  public void setSessionDate(DateTime sessionDate) {
    this.sessionDate = sessionDate;
  }

  public SessionResponse sessionDescription(String sessionDescription) {
    this.sessionDescription = sessionDescription;
    return this;
  }

   /**
   * Get sessionDescription
   * @return sessionDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSessionDescription() {
    return sessionDescription;
  }

  public void setSessionDescription(String sessionDescription) {
    this.sessionDescription = sessionDescription;
  }

  public SessionResponse sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public SessionResponse sessionName(String sessionName) {
    this.sessionName = sessionName;
    return this;
  }

   /**
   * Get sessionName
   * @return sessionName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSessionName() {
    return sessionName;
  }

  public void setSessionName(String sessionName) {
    this.sessionName = sessionName;
  }

  public SessionResponse status(StatusEnum status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionResponse sessionResponse = (SessionResponse) o;
    return Objects.equals(this.apiKey, sessionResponse.apiKey) &&
        Objects.equals(this.branchId, sessionResponse.branchId) &&
        Objects.equals(this.createdBy, sessionResponse.createdBy) &&
        Objects.equals(this.createdOn, sessionResponse.createdOn) &&
        Objects.equals(this.mediaMode, sessionResponse.mediaMode) &&
        Objects.equals(this.modifiedBy, sessionResponse.modifiedBy) &&
        Objects.equals(this.modifiedOn, sessionResponse.modifiedOn) &&
        Objects.equals(this.sessionAdmin, sessionResponse.sessionAdmin) &&
        Objects.equals(this.sessionDate, sessionResponse.sessionDate) &&
        Objects.equals(this.sessionDescription, sessionResponse.sessionDescription) &&
        Objects.equals(this.sessionId, sessionResponse.sessionId) &&
        Objects.equals(this.sessionName, sessionResponse.sessionName) &&
        Objects.equals(this.status, sessionResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, branchId, createdBy, createdOn, mediaMode, modifiedBy, modifiedOn, sessionAdmin, sessionDate, sessionDescription, sessionId, sessionName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionResponse {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    mediaMode: ").append(toIndentedString(mediaMode)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    sessionAdmin: ").append(toIndentedString(sessionAdmin)).append("\n");
    sb.append("    sessionDate: ").append(toIndentedString(sessionDate)).append("\n");
    sb.append("    sessionDescription: ").append(toIndentedString(sessionDescription)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

