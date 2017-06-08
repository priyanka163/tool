package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TeacherworkspacenavigationcontrollerApi {
  /**
   * getAdoptPlanPage
   * 
   * @param academicYear academicYear (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param subjectName subjectName (required)
   * @param boardId boardId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToAdoptPlanPage/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/adopt")
  Call<ModelAndView> getAdoptPlanPageUsingGET(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Body SessionParams sessionParams
  );

  /**
   * getChapterInfoPage
   * 
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterid chapterid (required)
   * @param chapterName chapterName (required)
   * @param customChapter customChapter (required)
   * @param subjectId subjectId (required)
   * @param currentSyllabusObjectId currentSyllabusObjectId (required)
   * @param currentBoardId currentBoardId (required)
   * @param sectionName sectionName (required)
   * @param className className (required)
   * @param isCustom isCustom (required)
   * @param subjectName subjectName (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/chapterInfoPage/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/chapter/{chapterid}/{chapterName}/{customChapter}/subject/{subjectId}/{subjectName}/board/{currentBoardId}/syllabusId/{currentSyllabusObjectId}/chapterInfoPage/{isCustom}")
  Call<ModelAndView> getChapterInfoPageUsingGET(
    @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterid") Long chapterid, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("subjectId") Long subjectId, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("currentBoardId") Long currentBoardId, @Path("sectionName") String sectionName, @Path("className") String className, @Path("isCustom") Boolean isCustom, @Path("subjectName") String subjectName
  );

  /**
   * getCourseworkPage
   * 
   * @param studyClassId studyClassId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param boardId boardId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/coursework/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getCoursework")
  Call<ModelAndView> getCourseworkPageUsingGET(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
  );

  /**
   * getDetailedDayWisePlan
   * 
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param classId classId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param boardId boardId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param currentSyllabusObjectId currentSyllabusObjectId (required)
   * @param isCustom isCustom (required)
   * @param chapterName chapterName (required)
   * @param type type (optional)
   * @param lpuuid lpuuid (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToDayWisePlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/dayWisePlanDetailed")
  Call<ModelAndView> getDetailedDayWisePlanUsingGET(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("type") String type, @Query("lpuuid") String lpuuid, @Body SessionParams sessionParams
  );

  /**
   * getDetailedStudyPlan
   * 
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param classId classId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param boardId boardId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param currentSyllabusObjectId currentSyllabusObjectId (required)
   * @param isCustom isCustom (required)
   * @param chapterName chapterName (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToStudyPlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/studyPlanDetailed")
  Call<ModelAndView> getDetailedStudyPlanUsingGET(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Body SessionParams sessionParams
  );

  /**
   * getDomainMap
   * 
   * @return Call&lt;String&gt;
   */
  
  @GET("nextmentor/")
  Call<String> getDomainMapUsingGET();
    

  /**
   * getLectureBreakupDetails
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param currentBoardId currentBoardId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/fetchChapterResponse/subject/{subjectId}/class/{studyClassId}/section/{sectionId}/board/{currentBoardId}")
  Call<ModelAndView> getLectureBreakupDetailsUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Body SessionParams sessionParams
  );

  /**
   * getLectureBreakupPage
   * 
   * @param addSelectedSyllabus addSelectedSyllabus (required)
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param className className (required)
   * @param sectionName sectionName (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param currentBoardId currentBoardId (required)
   * @param custom custom (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToLectureBreakupPage/syllabusId/{addSelectedSyllabus}/subject/{subjectId}/{subjectName}/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/board/{currentBoardId}/lectureBreakupPage/{custom}")
  Call<ModelAndView> getLectureBreakupPageUsingGET(
    @Path("addSelectedSyllabus") Long addSelectedSyllabus, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("className") String className, @Path("sectionName") String sectionName, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Path("custom") Boolean custom
  );

  /**
   * getLectureDetails
   * 
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param subjectId subjectId (required)
   * @param className className (required)
   * @param sectionName sectionName (required)
   * @param subjectName subjectName (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}")
  Call<ModelAndView> getLectureDetailsUsingGET(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Body SessionParams sessionParams
  );

  /**
   * getLecturePlanPage
   * 
   * @param studyClassId studyClassId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param boardId boardId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/planClass/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getPlanLectureDetails")
  Call<ModelAndView> getLecturePlanPageUsingGET(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
  );

  /**
   * getLecturesForChapters
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param isCustom isCustom (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/daywisePlan/{classId}/{sectionId}/{chapterId}/custom/{isCustom}/dayWisePlan")
  Call<ModelAndView> getLecturesForChaptersUsingGET1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("isCustom") Boolean isCustom, @Body SessionParams sessionParams
  );

  /**
   * getLessonPlan
   * 
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param classId classId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param boardId boardId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param currentSyllabusObjectId currentSyllabusObjectId (required)
   * @param isCustom isCustom (required)
   * @param chapterName chapterName (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToChapterSummary/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/chapterSummary")
  Call<ModelAndView> getLessonPlanUsingGET2(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Body SessionParams sessionParams
  );

  /**
   * getPage
   * 
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param subjectId subjectId (required)
   * @param className className (required)
   * @param sectionName sectionName (required)
   * @param subjectName subjectName (required)
   * @param boardId boardId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}/{boardId}/getLectureDetails")
  Call<ModelAndView> getPageUsingGET(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
  );

  /**
   * getPlanPreviewPage
   * 
   * @param studyClassId studyClassId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param boardId boardId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/planPreview")
  Call<ModelAndView> getPlanPreviewPageUsingGET(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
  );

  /**
   * getPreviousOrNextLectureDetails
   * 
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param subjectId subjectId (required)
   * @param date date (required)
   * @param isNextLecture isNextLecture (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/class/{studyClassId}/section/{sectionId}/subject/{subjectId}/date/{date}/nextLecture/{isNextLecture}")
  Call<ModelAndView> getPreviousOrNextLectureDetailsUsingGET(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("date") String date, @Path("isNextLecture") Boolean isNextLecture, @Body SessionParams sessionParams
  );

  /**
   * getStudyPlan
   * 
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param classId classId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param boardId boardId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param currentSyllabusObjectId currentSyllabusObjectId (required)
   * @param isCustom isCustom (required)
   * @param chapterName chapterName (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/studyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/StudyPlan")
  Call<ModelAndView> getStudyPlanUsingGET(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Body SessionParams sessionParams
  );

  /**
   * goToRunAClass
   * 
   * @param learningPlanId learningPlanId (required)
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/data/runLecture/{learningPlanId}/section/{sectionId}/subject/{subjectId}")
  Call<ModelAndView> goToRunAClassUsingGET(
    @Path("learningPlanId") Long learningPlanId, @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId
  );

  /**
   * navigateToAddFromNextEducation
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/addFromNextEducation/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromNextEducation")
  Call<ModelAndView> navigateToAddFromNextEducationUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate
  );

  /**
   * navigateToAddFromWebPage
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToAddFromWeb/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromWeb")
  Call<ModelAndView> navigateToAddFromWebPageUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate
  );

  /**
   * navigateToCollaborationPage
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param boardId boardId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCollaborationPage/{subjectId}/{classId}/{sectionId}/{boardId}/{chapterId}/{customChapter}/resourceBankPage")
  Call<ModelAndView> navigateToCollaborationPageUsingGET(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter
  );

  /**
   * navigateToCreateActivity
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @param resourceUuid resourceUuid (required)
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreateActivity/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateActivity")
  Call<ModelAndView> navigateToCreateActivityUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
  );

  /**
   * navigateToCreateAssessment
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @param assessmentUuid assessmentUuid (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreateAssessment/{boardId}/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateAssessment")
  Call<ModelAndView> navigateToCreateAssessmentUsingGET(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("assessmentUuid") String assessmentUuid
  );

  /**
   * navigateToCreateAssignment
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @param resourceUuid resourceUuid (required)
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreateAssignment/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateAssignment")
  Call<ModelAndView> navigateToCreateAssignmentUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
  );

  /**
   * navigateToCreateDocument
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @param assetUuid assetUuid (required)
   * @param assetUrl assetUrl (required)
   * @param resourceUuid resourceUuid (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreateDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateDocument")
  Call<ModelAndView> navigateToCreateDocumentUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Body SessionParams sessionParams
  );

  /**
   * navigateToCreatePpt
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @param assetUuid assetUuid (required)
   * @param assetUrl assetUrl (required)
   * @param resourceUuid resourceUuid (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreatePpt/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreatePpt")
  Call<ModelAndView> navigateToCreatePptUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Body SessionParams sessionParams
  );

  /**
   * navigateToCreateSpreadsheet
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @param assetUuid assetUuid (required)
   * @param assetUrl assetUrl (required)
   * @param resourceUuid resourceUuid (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreateSpreadsheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateSpreadsheet")
  Call<ModelAndView> navigateToCreateSpreadsheetUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Body SessionParams sessionParams
  );

  /**
   * navigateToCreateWorksheet
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @param resourceUuid resourceUuid (required)
   * @param assetUuid assetUuid (required)
   * @param location location (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreateWorksheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateWorksheet")
  Call<ModelAndView> navigateToCreateWorksheetUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid, @Query("location") String location
  );

  /**
   * navigateToDayWisePlanPage
   * 
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param classId classId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param boardId boardId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param currentSyllabusObjectId currentSyllabusObjectId (required)
   * @param isCustom isCustom (required)
   * @param chapterName chapterName (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToDayWisePlanPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/dayWisePlan")
  Call<ModelAndView> navigateToDayWisePlanPageUsingGET(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Body SessionParams sessionParams
  );

  /**
   * navigateToFetchDocument
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @param assetUuid assetUuid (required)
   * @param name name (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToFetchDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/{name}/navigateToFetchDocument")
  Call<ModelAndView> navigateToFetchDocumentUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Path("name") String name, @Body SessionParams sessionParams
  );

  /**
   * navigateToHomeworkTracker
   * 
   * @param academicYear academicYear (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param subjectName subjectName (required)
   * @param boardId boardId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToHomeworkTracker/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/homeworkTracker")
  Call<ModelAndView> navigateToHomeworkTrackerUsingGET(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Body SessionParams sessionParams
  );

  /**
   * navigateToPreviewAssessment
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param isForCreate isForCreate (required)
   * @param assessmentUuid assessmentUuid (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToPreviewAssessment/{boardId}/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToPreviewAssessment")
  Call<ModelAndView> navigateToPreviewAssessmentUsingGET(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("assessmentUuid") String assessmentUuid
  );

  /**
   * navigateToResourceBankPage
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param boardId boardId (required)
   * @param chapterId chapterId (required)
   * @param chapterName chapterName (required)
   * @param customChapter customChapter (required)
   * @param isCheck isCheck (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param lpuuid lpuuid (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToResourceBankPage/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{boardId}/{chapterId}/{chapterName}/{customChapter}/resourceBankPage/{isCheck}/member/{learningPlanMemberUuid}")
  Call<ModelAndView> navigateToResourceBankPageUsingGET(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("isCheck") Boolean isCheck, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Query("lpuuid") String lpuuid
  );

  /**
   * navigateToResourcePlayer
   * 
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param category category (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToResourcePlayer.app")
  Call<ModelAndView> navigateToResourcePlayerUsingGET1(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Body SessionParams sessionParams
  );

  /**
   * navigateToRunAClassPage
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToRunAClass")
  Call<ModelAndView> navigateToRunAClassPageUsingGET();
    

  /**
   * navigateToStudyPlan
   * 
   * @param subjectId subjectId (required)
   * @param subjectName subjectName (required)
   * @param classId classId (required)
   * @param className className (required)
   * @param sectionId sectionId (required)
   * @param sectionName sectionName (required)
   * @param boardId boardId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param currentSyllabusObjectId currentSyllabusObjectId (required)
   * @param isCustom isCustom (required)
   * @param chapterName chapterName (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToStudyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/studyPlanPage")
  Call<ModelAndView> navigateToStudyPlanUsingGET(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName
  );

  /**
   * showHome
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("teacherWorkspaceHome")
  Call<ModelAndView> showHomeUsingGET2(
    @Body SessionParams sessionParams
  );

}
