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
import com.nexteducation.swagger.nextsws.model.BoardDTO;
import com.nexteducation.swagger.nextsws.model.CustomChapterDTO;
import com.nexteducation.swagger.nextsws.model.MasterStudyClassDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CustomSyllabusDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T17:16:40.307+05:30")
public class CustomSyllabusDTO   {
  @SerializedName("boards")
  private List<BoardDTO> boards = new ArrayList<BoardDTO>();

  @SerializedName("chapters")
  private List<CustomChapterDTO> chapters = new ArrayList<CustomChapterDTO>();

  @SerializedName("studyClasses")
  private List<MasterStudyClassDTO> studyClasses = new ArrayList<MasterStudyClassDTO>();

  public CustomSyllabusDTO boards(List<BoardDTO> boards) {
    this.boards = boards;
    return this;
  }

  public CustomSyllabusDTO addBoardsItem(BoardDTO boardsItem) {
    this.boards.add(boardsItem);
    return this;
  }

   /**
   * Get boards
   * @return boards
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BoardDTO> getBoards() {
    return boards;
  }

  public void setBoards(List<BoardDTO> boards) {
    this.boards = boards;
  }

  public CustomSyllabusDTO chapters(List<CustomChapterDTO> chapters) {
    this.chapters = chapters;
    return this;
  }

  public CustomSyllabusDTO addChaptersItem(CustomChapterDTO chaptersItem) {
    this.chapters.add(chaptersItem);
    return this;
  }

   /**
   * Get chapters
   * @return chapters
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CustomChapterDTO> getChapters() {
    return chapters;
  }

  public void setChapters(List<CustomChapterDTO> chapters) {
    this.chapters = chapters;
  }

  public CustomSyllabusDTO studyClasses(List<MasterStudyClassDTO> studyClasses) {
    this.studyClasses = studyClasses;
    return this;
  }

  public CustomSyllabusDTO addStudyClassesItem(MasterStudyClassDTO studyClassesItem) {
    this.studyClasses.add(studyClassesItem);
    return this;
  }

   /**
   * Get studyClasses
   * @return studyClasses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MasterStudyClassDTO> getStudyClasses() {
    return studyClasses;
  }

  public void setStudyClasses(List<MasterStudyClassDTO> studyClasses) {
    this.studyClasses = studyClasses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSyllabusDTO customSyllabusDTO = (CustomSyllabusDTO) o;
    return Objects.equals(this.boards, customSyllabusDTO.boards) &&
        Objects.equals(this.chapters, customSyllabusDTO.chapters) &&
        Objects.equals(this.studyClasses, customSyllabusDTO.studyClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boards, chapters, studyClasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomSyllabusDTO {\n");
    
    sb.append("    boards: ").append(toIndentedString(boards)).append("\n");
    sb.append("    chapters: ").append(toIndentedString(chapters)).append("\n");
    sb.append("    studyClasses: ").append(toIndentedString(studyClasses)).append("\n");
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

