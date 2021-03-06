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
import com.nexteducation.swagger.nextsws.model.NoteResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * NoteReminderResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class NoteReminderResponse   {
  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private DateTime createdOn = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("modifiedOn")
  private DateTime modifiedOn = null;

  @SerializedName("noteResponse")
  private NoteResponse noteResponse = null;

  @SerializedName("reminded")
  private Boolean reminded = null;

  @SerializedName("reminderuuid")
  private String reminderuuid = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),
    
    @SerializedName("INACTIVE")
    INACTIVE("INACTIVE");

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

  @SerializedName("when")
  private DateTime when = null;

  public NoteReminderResponse createdBy(Long createdBy) {
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

  public NoteReminderResponse createdOn(DateTime createdOn) {
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

  public NoteReminderResponse id(Long id) {
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

  public NoteReminderResponse modifiedBy(Long modifiedBy) {
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

  public NoteReminderResponse modifiedOn(DateTime modifiedOn) {
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

  public NoteReminderResponse noteResponse(NoteResponse noteResponse) {
    this.noteResponse = noteResponse;
    return this;
  }

   /**
   * Get noteResponse
   * @return noteResponse
  **/
  @ApiModelProperty(example = "null", value = "")
  public NoteResponse getNoteResponse() {
    return noteResponse;
  }

  public void setNoteResponse(NoteResponse noteResponse) {
    this.noteResponse = noteResponse;
  }

  public NoteReminderResponse reminded(Boolean reminded) {
    this.reminded = reminded;
    return this;
  }

   /**
   * Get reminded
   * @return reminded
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReminded() {
    return reminded;
  }

  public void setReminded(Boolean reminded) {
    this.reminded = reminded;
  }

  public NoteReminderResponse reminderuuid(String reminderuuid) {
    this.reminderuuid = reminderuuid;
    return this;
  }

   /**
   * Get reminderuuid
   * @return reminderuuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReminderuuid() {
    return reminderuuid;
  }

  public void setReminderuuid(String reminderuuid) {
    this.reminderuuid = reminderuuid;
  }

  public NoteReminderResponse status(StatusEnum status) {
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

  public NoteReminderResponse when(DateTime when) {
    this.when = when;
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getWhen() {
    return when;
  }

  public void setWhen(DateTime when) {
    this.when = when;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteReminderResponse noteReminderResponse = (NoteReminderResponse) o;
    return Objects.equals(this.createdBy, noteReminderResponse.createdBy) &&
        Objects.equals(this.createdOn, noteReminderResponse.createdOn) &&
        Objects.equals(this.id, noteReminderResponse.id) &&
        Objects.equals(this.modifiedBy, noteReminderResponse.modifiedBy) &&
        Objects.equals(this.modifiedOn, noteReminderResponse.modifiedOn) &&
        Objects.equals(this.noteResponse, noteReminderResponse.noteResponse) &&
        Objects.equals(this.reminded, noteReminderResponse.reminded) &&
        Objects.equals(this.reminderuuid, noteReminderResponse.reminderuuid) &&
        Objects.equals(this.status, noteReminderResponse.status) &&
        Objects.equals(this.when, noteReminderResponse.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, id, modifiedBy, modifiedOn, noteResponse, reminded, reminderuuid, status, when);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteReminderResponse {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    noteResponse: ").append(toIndentedString(noteResponse)).append("\n");
    sb.append("    reminded: ").append(toIndentedString(reminded)).append("\n");
    sb.append("    reminderuuid: ").append(toIndentedString(reminderuuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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

