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
 * TokenRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class TokenRequest   {
  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("expirationTime")
  private Long expirationTime = null;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    @SerializedName("Publisher")
    PUBLISHER("Publisher"),
    
    @SerializedName("Subscriber")
    SUBSCRIBER("Subscriber"),
    
    @SerializedName("Moderator")
    MODERATOR("Moderator");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  @SerializedName("sessionId")
  private String sessionId = null;

  @SerializedName("subscriber")
  private Long subscriber = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("userId")
  private Long userId = null;

  public TokenRequest branchId(Long branchId) {
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

  public TokenRequest expirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Get expirationTime
   * @return expirationTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
  }

  public TokenRequest role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(example = "null", value = "")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public TokenRequest sessionId(String sessionId) {
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

  public TokenRequest subscriber(Long subscriber) {
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Get subscriber
   * @return subscriber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSubscriber() {
    return subscriber;
  }

  public void setSubscriber(Long subscriber) {
    this.subscriber = subscriber;
  }

  public TokenRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public TokenRequest userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenRequest tokenRequest = (TokenRequest) o;
    return Objects.equals(this.branchId, tokenRequest.branchId) &&
        Objects.equals(this.expirationTime, tokenRequest.expirationTime) &&
        Objects.equals(this.role, tokenRequest.role) &&
        Objects.equals(this.sessionId, tokenRequest.sessionId) &&
        Objects.equals(this.subscriber, tokenRequest.subscriber) &&
        Objects.equals(this.token, tokenRequest.token) &&
        Objects.equals(this.userId, tokenRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, expirationTime, role, sessionId, subscriber, token, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenRequest {\n");
    
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

