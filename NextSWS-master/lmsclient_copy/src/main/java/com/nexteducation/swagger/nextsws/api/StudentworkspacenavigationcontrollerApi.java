package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.ResourceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentworkspacenavigationcontrollerApi {
  /**
   * askAQuestion
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/askQuestion")
  Call<ModelAndView> askAQuestionUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * classRoom
   * 
   * @param syllabusId syllabusId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/classRoom.app")
  Call<ModelAndView> classRoomUsingGET(
    @Query("syllabusId") String syllabusId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createStudyPlan
   * 
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/createStudyPlan/{syllabusId}.app")
  Call<ModelAndView> createStudyPlanUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("schoolSubjectName") String schoolSubjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * documentViewer
   * 
   * @param resourceUUID resourceUUID (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/documentViewer_assignment")
  Call<ModelAndView> documentViewerUsingGET(
    @Query("resourceUUID") String resourceUUID, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchAssetByResource
   * 
   * @param resUuid res_uuid (required)
   * @return Call&lt;ResourceResponse&gt;
   */
  
  @GET("nextmentee/fetchAsset/{res_uuid}")
  Call<ResourceResponse> fetchAssetByResourceUsingGET(
    @Path("res_uuid") String resUuid
  );

  /**
   * getAssessmentTestPage
   * 
   * @param assessmentUUID assessmentUUID (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param chapterId chapterId (optional)
   * @param resourceLocation resourceLocation (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/navigateToAssessmentPage/{syllabusId}/{assessmentUUID}.app")
  Call<ModelAndView> getAssessmentTestPageUsingGET(
    @Path("assessmentUUID") String assessmentUUID, @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("chapterId") Long chapterId, @Query("resourceLocation") String resourceLocation, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaterPage
   * 
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param schoolSubjectId schoolSubjectId (optional)
   * @param syllabusUUID syllabusUUID (optional)
   * @param lpuuid lpuuid (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{subjectId}/{syllabusId}.app")
  Call<ModelAndView> getChaterPageUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("schoolSubjectName") String schoolSubjectName, @Query("schoolSubjectId") Long schoolSubjectId, @Query("syllabusUUID") String syllabusUUID, @Query("lpuuid") String lpuuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLecturesForChapters
   * 
   * @param chapterId chapterId (required)
   * @param subjectId subjectId (required)
   * @param chapterName chapterName (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param chapterUUID chapterUUID (optional)
   * @param schoolSubjectId schoolSubjectId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/syllabus/{syllabusId}/chapter/{chapterId}/{subjectId}/lectures")
  Call<ModelAndView> getLecturesForChaptersUsingGET(
    @Path("chapterId") Long chapterId, @Path("subjectId") Long subjectId, @Query("chapterName") String chapterName, @Path("syllabusId") Long syllabusId, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("schoolSubjectName") String schoolSubjectName, @Query("chapterUUID") String chapterUUID, @Query("schoolSubjectId") Long schoolSubjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceListForChapter
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterName chapterName (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param subjectId subjectId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resources.app")
  Call<ModelAndView> getResourceListForChapterUsingDELETE(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterName") String chapterName, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("schoolSubjectName") String schoolSubjectName, @Query("subjectId") String subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceListForChapter
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterName chapterName (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param subjectId subjectId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resources.app")
  Call<ModelAndView> getResourceListForChapterUsingGET(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterName") String chapterName, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("schoolSubjectName") String schoolSubjectName, @Query("subjectId") String subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceListForChapter
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterName chapterName (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param subjectId subjectId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resources.app")
  Call<ModelAndView> getResourceListForChapterUsingHEAD(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterName") String chapterName, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("schoolSubjectName") String schoolSubjectName, @Query("subjectId") String subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceListForChapter
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterName chapterName (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param subjectId subjectId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resources.app")
  Call<ModelAndView> getResourceListForChapterUsingOPTIONS(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterName") String chapterName, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("schoolSubjectName") String schoolSubjectName, @Query("subjectId") String subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceListForChapter
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterName chapterName (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param subjectId subjectId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resources.app")
  Call<ModelAndView> getResourceListForChapterUsingPATCH(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterName") String chapterName, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("schoolSubjectName") String schoolSubjectName, @Query("subjectId") String subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceListForChapter
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterName chapterName (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param subjectId subjectId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resources.app")
  Call<ModelAndView> getResourceListForChapterUsingPOST(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterName") String chapterName, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("schoolSubjectName") String schoolSubjectName, @Query("subjectId") String subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceListForChapter
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterName chapterName (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param subjectId subjectId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resources.app")
  Call<ModelAndView> getResourceListForChapterUsingPUT(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterName") String chapterName, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("schoolSubjectName") String schoolSubjectName, @Query("subjectId") String subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getWikiPage
   * 
   * @param uuid uuid (required)
   * @param resourceLocation resourceLocation (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/wiki/{uuid}/getWikiMain.app")
  Call<ModelAndView> getWikiPageUsingGET(
    @Path("uuid") String uuid, @Query("resourceLocation") String resourceLocation
  );

  /**
   * getWikiResourceListForChapters
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentee/subject/{syllabusId}/chapter/{chapterId}/wiki/resources.app")
  Call<ModelAndView> getWikiResourceListForChaptersUsingDELETE(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getWikiResourceListForChapters
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/chapter/{chapterId}/wiki/resources.app")
  Call<ModelAndView> getWikiResourceListForChaptersUsingGET(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getWikiResourceListForChapters
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentee/subject/{syllabusId}/chapter/{chapterId}/wiki/resources.app")
  Call<ModelAndView> getWikiResourceListForChaptersUsingHEAD(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getWikiResourceListForChapters
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentee/subject/{syllabusId}/chapter/{chapterId}/wiki/resources.app")
  Call<ModelAndView> getWikiResourceListForChaptersUsingOPTIONS(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getWikiResourceListForChapters
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentee/subject/{syllabusId}/chapter/{chapterId}/wiki/resources.app")
  Call<ModelAndView> getWikiResourceListForChaptersUsingPATCH(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getWikiResourceListForChapters
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/subject/{syllabusId}/chapter/{chapterId}/wiki/resources.app")
  Call<ModelAndView> getWikiResourceListForChaptersUsingPOST(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getWikiResourceListForChapters
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentee/subject/{syllabusId}/chapter/{chapterId}/wiki/resources.app")
  Call<ModelAndView> getWikiResourceListForChaptersUsingPUT(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * goToChapterList
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param subjectId subjectId (required)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/chapter/{syllabusId}/chapterList/{category}")
  Call<ModelAndView> goToChapterListUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("category") String category, @Query("subjectId") Long subjectId, @Query("schoolSubjectName") String schoolSubjectName
  );

  /**
   * navigateToActivity
   * 
   * @param uuid uuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param resourceLocation resourceLocation (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/navigateToActivityViewer/{uuid}")
  Call<ModelAndView> navigateToActivityUsingGET(
    @Path("uuid") String uuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("resourceLocation") String resourceLocation, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param resourceLocation resourceLocation (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/navigateToResourcePlayer.app")
  Call<ModelAndView> navigateToResourcePlayerUsingGET(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Query("resourceLocation") String resourceLocation, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * navigateToSocialView
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param subjectId subjectId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{subjectId}/{syllabusId}/chapterList/{category}/navigateToSocialView.app")
  Call<ModelAndView> navigateToSocialViewUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("category") String category, @Path("subjectId") Long subjectId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("schoolSubjectName") String schoolSubjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * navigateToWorksheet
   * 
   * @param uuid uuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param resourceLocation resourceLocation (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/navigateToWorksheetViewer/{uuid}")
  Call<ModelAndView> navigateToWorksheetUsingGET(
    @Path("uuid") String uuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("resourceLocation") String resourceLocation, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * nextToolsHome
   * 
   * @param syllabusId syllabusId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/nextTools.app")
  Call<ModelAndView> nextToolsHomeUsingGET(
    @Query("syllabusId") String syllabusId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * notesHome
   * 
   * @param syllabusId syllabusId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/nextNotes.app")
  Call<ModelAndView> notesHomeUsingGET(
    @Query("syllabusId") String syllabusId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * postDetail
   * 
   * @param postUUID postUUID (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/postDetail/{postUUID}.app")
  Call<ModelAndView> postDetailUsingGET(
    @Path("postUUID") String postUUID, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * q2aHome
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/qaHome")
  Call<ModelAndView> q2aHomeUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showHome
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("homePage")
  Call<ModelAndView> showHomeUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showStudyPlan
   * 
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/studyPlan/subject/{subjectId}/{syllabusId}.app")
  Call<ModelAndView> showStudyPlanUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("schoolSubjectName") String schoolSubjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
