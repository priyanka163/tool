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
import com.nexteducation.swagger.nextsws.model.RuleCriteriaRequest;
import com.nexteducation.swagger.nextsws.model.RuleQuestionsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * RuleCriteriaRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T11:28:33.033+05:30")
public class RuleCriteriaRequest   {
  @SerializedName("btInvolved")
  private Boolean btInvolved = null;

  @SerializedName("chapterId")
  private Long chapterId = null;

  @SerializedName("noOfQuestionsInChapter")
  private Long noOfQuestionsInChapter = null;

  @SerializedName("paramsInRules")
  private List<String> paramsInRules = new ArrayList<String>();

  /**
   * Gets or Sets questionLevel
   */
  public enum QuestionLevelEnum {
    @SerializedName("Chapter")
    CHAPTER("Chapter"),
    
    @SerializedName("Concept")
    CONCEPT("Concept"),
    
    @SerializedName("LO")
    LO("LO");

    private String value;

    QuestionLevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("questionLevel")
  private QuestionLevelEnum questionLevel = null;

  @SerializedName("ruleName")
  private String ruleName = null;

  @SerializedName("ruleQuestions")
  private List<RuleQuestionsRequest> ruleQuestions = new ArrayList<RuleQuestionsRequest>();

  @SerializedName("subRuleCriterias")
  private List<RuleCriteriaRequest> subRuleCriterias = new ArrayList<RuleCriteriaRequest>();

  public RuleCriteriaRequest btInvolved(Boolean btInvolved) {
    this.btInvolved = btInvolved;
    return this;
  }

   /**
   * Get btInvolved
   * @return btInvolved
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBtInvolved() {
    return btInvolved;
  }

  public void setBtInvolved(Boolean btInvolved) {
    this.btInvolved = btInvolved;
  }

  public RuleCriteriaRequest chapterId(Long chapterId) {
    this.chapterId = chapterId;
    return this;
  }

   /**
   * Get chapterId
   * @return chapterId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChapterId() {
    return chapterId;
  }

  public void setChapterId(Long chapterId) {
    this.chapterId = chapterId;
  }

  public RuleCriteriaRequest noOfQuestionsInChapter(Long noOfQuestionsInChapter) {
    this.noOfQuestionsInChapter = noOfQuestionsInChapter;
    return this;
  }

   /**
   * Get noOfQuestionsInChapter
   * @return noOfQuestionsInChapter
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getNoOfQuestionsInChapter() {
    return noOfQuestionsInChapter;
  }

  public void setNoOfQuestionsInChapter(Long noOfQuestionsInChapter) {
    this.noOfQuestionsInChapter = noOfQuestionsInChapter;
  }

  public RuleCriteriaRequest paramsInRules(List<String> paramsInRules) {
    this.paramsInRules = paramsInRules;
    return this;
  }

  public RuleCriteriaRequest addParamsInRulesItem(String paramsInRulesItem) {
    this.paramsInRules.add(paramsInRulesItem);
    return this;
  }

   /**
   * Get paramsInRules
   * @return paramsInRules
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getParamsInRules() {
    return paramsInRules;
  }

  public void setParamsInRules(List<String> paramsInRules) {
    this.paramsInRules = paramsInRules;
  }

  public RuleCriteriaRequest questionLevel(QuestionLevelEnum questionLevel) {
    this.questionLevel = questionLevel;
    return this;
  }

   /**
   * Get questionLevel
   * @return questionLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public QuestionLevelEnum getQuestionLevel() {
    return questionLevel;
  }

  public void setQuestionLevel(QuestionLevelEnum questionLevel) {
    this.questionLevel = questionLevel;
  }

  public RuleCriteriaRequest ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public RuleCriteriaRequest ruleQuestions(List<RuleQuestionsRequest> ruleQuestions) {
    this.ruleQuestions = ruleQuestions;
    return this;
  }

  public RuleCriteriaRequest addRuleQuestionsItem(RuleQuestionsRequest ruleQuestionsItem) {
    this.ruleQuestions.add(ruleQuestionsItem);
    return this;
  }

   /**
   * Get ruleQuestions
   * @return ruleQuestions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RuleQuestionsRequest> getRuleQuestions() {
    return ruleQuestions;
  }

  public void setRuleQuestions(List<RuleQuestionsRequest> ruleQuestions) {
    this.ruleQuestions = ruleQuestions;
  }

  public RuleCriteriaRequest subRuleCriterias(List<RuleCriteriaRequest> subRuleCriterias) {
    this.subRuleCriterias = subRuleCriterias;
    return this;
  }

  public RuleCriteriaRequest addSubRuleCriteriasItem(RuleCriteriaRequest subRuleCriteriasItem) {
    this.subRuleCriterias.add(subRuleCriteriasItem);
    return this;
  }

   /**
   * Get subRuleCriterias
   * @return subRuleCriterias
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RuleCriteriaRequest> getSubRuleCriterias() {
    return subRuleCriterias;
  }

  public void setSubRuleCriterias(List<RuleCriteriaRequest> subRuleCriterias) {
    this.subRuleCriterias = subRuleCriterias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleCriteriaRequest ruleCriteriaRequest = (RuleCriteriaRequest) o;
    return Objects.equals(this.btInvolved, ruleCriteriaRequest.btInvolved) &&
        Objects.equals(this.chapterId, ruleCriteriaRequest.chapterId) &&
        Objects.equals(this.noOfQuestionsInChapter, ruleCriteriaRequest.noOfQuestionsInChapter) &&
        Objects.equals(this.paramsInRules, ruleCriteriaRequest.paramsInRules) &&
        Objects.equals(this.questionLevel, ruleCriteriaRequest.questionLevel) &&
        Objects.equals(this.ruleName, ruleCriteriaRequest.ruleName) &&
        Objects.equals(this.ruleQuestions, ruleCriteriaRequest.ruleQuestions) &&
        Objects.equals(this.subRuleCriterias, ruleCriteriaRequest.subRuleCriterias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(btInvolved, chapterId, noOfQuestionsInChapter, paramsInRules, questionLevel, ruleName, ruleQuestions, subRuleCriterias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleCriteriaRequest {\n");
    
    sb.append("    btInvolved: ").append(toIndentedString(btInvolved)).append("\n");
    sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
    sb.append("    noOfQuestionsInChapter: ").append(toIndentedString(noOfQuestionsInChapter)).append("\n");
    sb.append("    paramsInRules: ").append(toIndentedString(paramsInRules)).append("\n");
    sb.append("    questionLevel: ").append(toIndentedString(questionLevel)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleQuestions: ").append(toIndentedString(ruleQuestions)).append("\n");
    sb.append("    subRuleCriterias: ").append(toIndentedString(subRuleCriterias)).append("\n");
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

