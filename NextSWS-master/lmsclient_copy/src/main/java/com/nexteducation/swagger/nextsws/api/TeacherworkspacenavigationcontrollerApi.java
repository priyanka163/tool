package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToAdoptPlanPage/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/adopt")
  Call<ModelAndView> getAdoptPlanPageUsingDELETE(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToAdoptPlanPage/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/adopt")
  Call<ModelAndView> getAdoptPlanPageUsingGET(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToAdoptPlanPage/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/adopt")
  Call<ModelAndView> getAdoptPlanPageUsingHEAD(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToAdoptPlanPage/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/adopt")
  Call<ModelAndView> getAdoptPlanPageUsingOPTIONS(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToAdoptPlanPage/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/adopt")
  Call<ModelAndView> getAdoptPlanPageUsingPATCH(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToAdoptPlanPage/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/adopt")
  Call<ModelAndView> getAdoptPlanPageUsingPOST(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToAdoptPlanPage/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/adopt")
  Call<ModelAndView> getAdoptPlanPageUsingPUT(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
  
  @DELETE("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/chapter/{chapterid}/{chapterName}/{customChapter}/subject/{subjectId}/{subjectName}/board/{currentBoardId}/syllabusId/{currentSyllabusObjectId}/chapterInfoPage/{isCustom}")
  Call<ModelAndView> getChapterInfoPageUsingDELETE(
    @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterid") Long chapterid, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("subjectId") Long subjectId, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("currentBoardId") Long currentBoardId, @Path("sectionName") String sectionName, @Path("className") String className, @Path("isCustom") Boolean isCustom, @Path("subjectName") String subjectName
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
  
  @GET("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/chapter/{chapterid}/{chapterName}/{customChapter}/subject/{subjectId}/{subjectName}/board/{currentBoardId}/syllabusId/{currentSyllabusObjectId}/chapterInfoPage/{isCustom}")
  Call<ModelAndView> getChapterInfoPageUsingGET(
    @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterid") Long chapterid, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("subjectId") Long subjectId, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("currentBoardId") Long currentBoardId, @Path("sectionName") String sectionName, @Path("className") String className, @Path("isCustom") Boolean isCustom, @Path("subjectName") String subjectName
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
  
  @HEAD("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/chapter/{chapterid}/{chapterName}/{customChapter}/subject/{subjectId}/{subjectName}/board/{currentBoardId}/syllabusId/{currentSyllabusObjectId}/chapterInfoPage/{isCustom}")
  Call<ModelAndView> getChapterInfoPageUsingHEAD(
    @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterid") Long chapterid, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("subjectId") Long subjectId, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("currentBoardId") Long currentBoardId, @Path("sectionName") String sectionName, @Path("className") String className, @Path("isCustom") Boolean isCustom, @Path("subjectName") String subjectName
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
  
  @OPTIONS("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/chapter/{chapterid}/{chapterName}/{customChapter}/subject/{subjectId}/{subjectName}/board/{currentBoardId}/syllabusId/{currentSyllabusObjectId}/chapterInfoPage/{isCustom}")
  Call<ModelAndView> getChapterInfoPageUsingOPTIONS(
    @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterid") Long chapterid, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("subjectId") Long subjectId, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("currentBoardId") Long currentBoardId, @Path("sectionName") String sectionName, @Path("className") String className, @Path("isCustom") Boolean isCustom, @Path("subjectName") String subjectName
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
  
  @PATCH("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/chapter/{chapterid}/{chapterName}/{customChapter}/subject/{subjectId}/{subjectName}/board/{currentBoardId}/syllabusId/{currentSyllabusObjectId}/chapterInfoPage/{isCustom}")
  Call<ModelAndView> getChapterInfoPageUsingPATCH(
    @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterid") Long chapterid, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("subjectId") Long subjectId, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("currentBoardId") Long currentBoardId, @Path("sectionName") String sectionName, @Path("className") String className, @Path("isCustom") Boolean isCustom, @Path("subjectName") String subjectName
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
  
  @POST("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/chapter/{chapterid}/{chapterName}/{customChapter}/subject/{subjectId}/{subjectName}/board/{currentBoardId}/syllabusId/{currentSyllabusObjectId}/chapterInfoPage/{isCustom}")
  Call<ModelAndView> getChapterInfoPageUsingPOST(
    @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterid") Long chapterid, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("subjectId") Long subjectId, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("currentBoardId") Long currentBoardId, @Path("sectionName") String sectionName, @Path("className") String className, @Path("isCustom") Boolean isCustom, @Path("subjectName") String subjectName
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
  
  @PUT("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/chapter/{chapterid}/{chapterName}/{customChapter}/subject/{subjectId}/{subjectName}/board/{currentBoardId}/syllabusId/{currentSyllabusObjectId}/chapterInfoPage/{isCustom}")
  Call<ModelAndView> getChapterInfoPageUsingPUT(
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
  
  @DELETE("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getCoursework")
  Call<ModelAndView> getCourseworkPageUsingDELETE(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @GET("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getCoursework")
  Call<ModelAndView> getCourseworkPageUsingGET(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @HEAD("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getCoursework")
  Call<ModelAndView> getCourseworkPageUsingHEAD(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @OPTIONS("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getCoursework")
  Call<ModelAndView> getCourseworkPageUsingOPTIONS(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @PATCH("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getCoursework")
  Call<ModelAndView> getCourseworkPageUsingPATCH(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @POST("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getCoursework")
  Call<ModelAndView> getCourseworkPageUsingPOST(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @PUT("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getCoursework")
  Call<ModelAndView> getCourseworkPageUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToDayWisePlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/dayWisePlanDetailed")
  Call<ModelAndView> getDetailedDayWisePlanUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("type") String type, @Query("lpuuid") String lpuuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToDayWisePlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/dayWisePlanDetailed")
  Call<ModelAndView> getDetailedDayWisePlanUsingGET(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("type") String type, @Query("lpuuid") String lpuuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToDayWisePlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/dayWisePlanDetailed")
  Call<ModelAndView> getDetailedDayWisePlanUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("type") String type, @Query("lpuuid") String lpuuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToDayWisePlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/dayWisePlanDetailed")
  Call<ModelAndView> getDetailedDayWisePlanUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("type") String type, @Query("lpuuid") String lpuuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToDayWisePlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/dayWisePlanDetailed")
  Call<ModelAndView> getDetailedDayWisePlanUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("type") String type, @Query("lpuuid") String lpuuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToDayWisePlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/dayWisePlanDetailed")
  Call<ModelAndView> getDetailedDayWisePlanUsingPOST(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("type") String type, @Query("lpuuid") String lpuuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToDayWisePlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/dayWisePlanDetailed")
  Call<ModelAndView> getDetailedDayWisePlanUsingPUT(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("type") String type, @Query("lpuuid") String lpuuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToStudyPlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/studyPlanDetailed")
  Call<ModelAndView> getDetailedStudyPlanUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToStudyPlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/studyPlanDetailed")
  Call<ModelAndView> getDetailedStudyPlanUsingGET(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToStudyPlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/studyPlanDetailed")
  Call<ModelAndView> getDetailedStudyPlanUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToStudyPlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/studyPlanDetailed")
  Call<ModelAndView> getDetailedStudyPlanUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToStudyPlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/studyPlanDetailed")
  Call<ModelAndView> getDetailedStudyPlanUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToStudyPlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/studyPlanDetailed")
  Call<ModelAndView> getDetailedStudyPlanUsingPOST(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToStudyPlanDetailedPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/studyPlanDetailed")
  Call<ModelAndView> getDetailedStudyPlanUsingPUT(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getDomainMap
   * 
   * @return Call&lt;String&gt;
   */
  
  @DELETE("nextmentor/")
  Call<String> getDomainMapUsingDELETE();
    

  /**
   * getDomainMap
   * 
   * @return Call&lt;String&gt;
   */
  
  @GET("nextmentor/")
  Call<String> getDomainMapUsingGET();
    

  /**
   * getDomainMap
   * 
   * @return Call&lt;String&gt;
   */
  
  @HEAD("nextmentor/")
  Call<String> getDomainMapUsingHEAD();
    

  /**
   * getDomainMap
   * 
   * @return Call&lt;String&gt;
   */
  
  @OPTIONS("nextmentor/")
  Call<String> getDomainMapUsingOPTIONS();
    

  /**
   * getDomainMap
   * 
   * @return Call&lt;String&gt;
   */
  
  @PATCH("nextmentor/")
  Call<String> getDomainMapUsingPATCH();
    

  /**
   * getDomainMap
   * 
   * @return Call&lt;String&gt;
   */
  
  @POST("nextmentor/")
  Call<String> getDomainMapUsingPOST();
    

  /**
   * getDomainMap
   * 
   * @return Call&lt;String&gt;
   */
  
  @PUT("nextmentor/")
  Call<String> getDomainMapUsingPUT();
    

  /**
   * getLectureBreakupDetails
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param currentBoardId currentBoardId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/fetchChapterResponse/subject/{subjectId}/class/{studyClassId}/section/{sectionId}/board/{currentBoardId}")
  Call<ModelAndView> getLectureBreakupDetailsUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLectureBreakupDetails
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param currentBoardId currentBoardId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/fetchChapterResponse/subject/{subjectId}/class/{studyClassId}/section/{sectionId}/board/{currentBoardId}")
  Call<ModelAndView> getLectureBreakupDetailsUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLectureBreakupDetails
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param currentBoardId currentBoardId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/fetchChapterResponse/subject/{subjectId}/class/{studyClassId}/section/{sectionId}/board/{currentBoardId}")
  Call<ModelAndView> getLectureBreakupDetailsUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLectureBreakupDetails
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param currentBoardId currentBoardId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/fetchChapterResponse/subject/{subjectId}/class/{studyClassId}/section/{sectionId}/board/{currentBoardId}")
  Call<ModelAndView> getLectureBreakupDetailsUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLectureBreakupDetails
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param currentBoardId currentBoardId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/fetchChapterResponse/subject/{subjectId}/class/{studyClassId}/section/{sectionId}/board/{currentBoardId}")
  Call<ModelAndView> getLectureBreakupDetailsUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLectureBreakupDetails
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param currentBoardId currentBoardId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/fetchChapterResponse/subject/{subjectId}/class/{studyClassId}/section/{sectionId}/board/{currentBoardId}")
  Call<ModelAndView> getLectureBreakupDetailsUsingPOST(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLectureBreakupDetails
   * 
   * @param subjectId subjectId (required)
   * @param studyClassId studyClassId (required)
   * @param sectionId sectionId (required)
   * @param currentBoardId currentBoardId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/fetchChapterResponse/subject/{subjectId}/class/{studyClassId}/section/{sectionId}/board/{currentBoardId}")
  Call<ModelAndView> getLectureBreakupDetailsUsingPUT(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
  
  @DELETE("nextmentor/navigateToLectureBreakupPage/syllabusId/{addSelectedSyllabus}/subject/{subjectId}/{subjectName}/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/board/{currentBoardId}/lectureBreakupPage/{custom}")
  Call<ModelAndView> getLectureBreakupPageUsingDELETE(
    @Path("addSelectedSyllabus") Long addSelectedSyllabus, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("className") String className, @Path("sectionName") String sectionName, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Path("custom") Boolean custom
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
  
  @HEAD("nextmentor/navigateToLectureBreakupPage/syllabusId/{addSelectedSyllabus}/subject/{subjectId}/{subjectName}/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/board/{currentBoardId}/lectureBreakupPage/{custom}")
  Call<ModelAndView> getLectureBreakupPageUsingHEAD(
    @Path("addSelectedSyllabus") Long addSelectedSyllabus, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("className") String className, @Path("sectionName") String sectionName, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Path("custom") Boolean custom
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
  
  @OPTIONS("nextmentor/navigateToLectureBreakupPage/syllabusId/{addSelectedSyllabus}/subject/{subjectId}/{subjectName}/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/board/{currentBoardId}/lectureBreakupPage/{custom}")
  Call<ModelAndView> getLectureBreakupPageUsingOPTIONS(
    @Path("addSelectedSyllabus") Long addSelectedSyllabus, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("className") String className, @Path("sectionName") String sectionName, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Path("custom") Boolean custom
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
  
  @PATCH("nextmentor/navigateToLectureBreakupPage/syllabusId/{addSelectedSyllabus}/subject/{subjectId}/{subjectName}/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/board/{currentBoardId}/lectureBreakupPage/{custom}")
  Call<ModelAndView> getLectureBreakupPageUsingPATCH(
    @Path("addSelectedSyllabus") Long addSelectedSyllabus, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("className") String className, @Path("sectionName") String sectionName, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Path("custom") Boolean custom
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
  
  @POST("nextmentor/navigateToLectureBreakupPage/syllabusId/{addSelectedSyllabus}/subject/{subjectId}/{subjectName}/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/board/{currentBoardId}/lectureBreakupPage/{custom}")
  Call<ModelAndView> getLectureBreakupPageUsingPOST(
    @Path("addSelectedSyllabus") Long addSelectedSyllabus, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("className") String className, @Path("sectionName") String sectionName, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("currentBoardId") Long currentBoardId, @Path("custom") Boolean custom
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
  
  @PUT("nextmentor/navigateToLectureBreakupPage/syllabusId/{addSelectedSyllabus}/subject/{subjectId}/{subjectName}/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/board/{currentBoardId}/lectureBreakupPage/{custom}")
  Call<ModelAndView> getLectureBreakupPageUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}")
  Call<ModelAndView> getLectureDetailsUsingDELETE(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}")
  Call<ModelAndView> getLectureDetailsUsingGET(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}")
  Call<ModelAndView> getLectureDetailsUsingHEAD(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}")
  Call<ModelAndView> getLectureDetailsUsingOPTIONS(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}")
  Call<ModelAndView> getLectureDetailsUsingPATCH(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}")
  Call<ModelAndView> getLectureDetailsUsingPOST(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}")
  Call<ModelAndView> getLectureDetailsUsingPUT(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
  
  @DELETE("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getPlanLectureDetails")
  Call<ModelAndView> getLecturePlanPageUsingDELETE(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @GET("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getPlanLectureDetails")
  Call<ModelAndView> getLecturePlanPageUsingGET(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @HEAD("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getPlanLectureDetails")
  Call<ModelAndView> getLecturePlanPageUsingHEAD(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @OPTIONS("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getPlanLectureDetails")
  Call<ModelAndView> getLecturePlanPageUsingOPTIONS(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @PATCH("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getPlanLectureDetails")
  Call<ModelAndView> getLecturePlanPageUsingPATCH(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @POST("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getPlanLectureDetails")
  Call<ModelAndView> getLecturePlanPageUsingPOST(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @PUT("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/getPlanLectureDetails")
  Call<ModelAndView> getLecturePlanPageUsingPUT(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
  );

  /**
   * getLecturesForChapters
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param isCustom isCustom (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/daywisePlan/{classId}/{sectionId}/{chapterId}/custom/{isCustom}/dayWisePlan")
  Call<ModelAndView> getLecturesForChaptersUsingDELETE(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("isCustom") Boolean isCustom, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLecturesForChapters
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param isCustom isCustom (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/daywisePlan/{classId}/{sectionId}/{chapterId}/custom/{isCustom}/dayWisePlan")
  Call<ModelAndView> getLecturesForChaptersUsingGET1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("isCustom") Boolean isCustom, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLecturesForChapters
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param isCustom isCustom (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/daywisePlan/{classId}/{sectionId}/{chapterId}/custom/{isCustom}/dayWisePlan")
  Call<ModelAndView> getLecturesForChaptersUsingHEAD(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("isCustom") Boolean isCustom, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLecturesForChapters
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param isCustom isCustom (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/daywisePlan/{classId}/{sectionId}/{chapterId}/custom/{isCustom}/dayWisePlan")
  Call<ModelAndView> getLecturesForChaptersUsingOPTIONS(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("isCustom") Boolean isCustom, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLecturesForChapters
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param isCustom isCustom (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/daywisePlan/{classId}/{sectionId}/{chapterId}/custom/{isCustom}/dayWisePlan")
  Call<ModelAndView> getLecturesForChaptersUsingPATCH(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("isCustom") Boolean isCustom, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLecturesForChapters
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param isCustom isCustom (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/daywisePlan/{classId}/{sectionId}/{chapterId}/custom/{isCustom}/dayWisePlan")
  Call<ModelAndView> getLecturesForChaptersUsingPOST(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("isCustom") Boolean isCustom, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLecturesForChapters
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param isCustom isCustom (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/daywisePlan/{classId}/{sectionId}/{chapterId}/custom/{isCustom}/dayWisePlan")
  Call<ModelAndView> getLecturesForChaptersUsingPUT(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("isCustom") Boolean isCustom, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToChapterSummary/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/chapterSummary")
  Call<ModelAndView> getLessonPlanUsingDELETE2(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToChapterSummary/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/chapterSummary")
  Call<ModelAndView> getLessonPlanUsingGET2(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToChapterSummary/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/chapterSummary")
  Call<ModelAndView> getLessonPlanUsingHEAD2(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToChapterSummary/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/chapterSummary")
  Call<ModelAndView> getLessonPlanUsingOPTIONS2(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToChapterSummary/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/chapterSummary")
  Call<ModelAndView> getLessonPlanUsingPATCH2(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToChapterSummary/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/chapterSummary")
  Call<ModelAndView> getLessonPlanUsingPOST2(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToChapterSummary/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/chapterSummary")
  Call<ModelAndView> getLessonPlanUsingPUT2(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
  
  @DELETE("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}/{boardId}/getLectureDetails")
  Call<ModelAndView> getPageUsingDELETE(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @HEAD("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}/{boardId}/getLectureDetails")
  Call<ModelAndView> getPageUsingHEAD(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @OPTIONS("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}/{boardId}/getLectureDetails")
  Call<ModelAndView> getPageUsingOPTIONS(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @PATCH("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}/{boardId}/getLectureDetails")
  Call<ModelAndView> getPageUsingPATCH(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @POST("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}/{boardId}/getLectureDetails")
  Call<ModelAndView> getPageUsingPOST(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("className") String className, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @PUT("nextmentor/class/{studyClassId}/{className}/section/{sectionId}/{sectionName}/subject/{subjectId}/{subjectName}/{boardId}/getLectureDetails")
  Call<ModelAndView> getPageUsingPUT(
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
  
  @DELETE("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/planPreview")
  Call<ModelAndView> getPlanPreviewPageUsingDELETE(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @HEAD("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/planPreview")
  Call<ModelAndView> getPlanPreviewPageUsingHEAD(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @OPTIONS("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/planPreview")
  Call<ModelAndView> getPlanPreviewPageUsingOPTIONS(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @PATCH("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/planPreview")
  Call<ModelAndView> getPlanPreviewPageUsingPATCH(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @POST("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/planPreview")
  Call<ModelAndView> getPlanPreviewPageUsingPOST(
    @Path("studyClassId") Long studyClassId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("boardId") Long boardId
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
  
  @PUT("nextmentor/class/{studyClassId}/{className}/sectionId/{sectionId}/{sectionName}/subjectId/{subjectId}/{subjectName}/boardId/{boardId}/planPreview")
  Call<ModelAndView> getPlanPreviewPageUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/class/{studyClassId}/section/{sectionId}/subject/{subjectId}/date/{date}/nextLecture/{isNextLecture}")
  Call<ModelAndView> getPreviousOrNextLectureDetailsUsingDELETE(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("date") String date, @Path("isNextLecture") Boolean isNextLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPreviousOrNextLectureDetails
   * 
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param subjectId subjectId (required)
   * @param date date (required)
   * @param isNextLecture isNextLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/class/{studyClassId}/section/{sectionId}/subject/{subjectId}/date/{date}/nextLecture/{isNextLecture}")
  Call<ModelAndView> getPreviousOrNextLectureDetailsUsingGET(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("date") String date, @Path("isNextLecture") Boolean isNextLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPreviousOrNextLectureDetails
   * 
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param subjectId subjectId (required)
   * @param date date (required)
   * @param isNextLecture isNextLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/class/{studyClassId}/section/{sectionId}/subject/{subjectId}/date/{date}/nextLecture/{isNextLecture}")
  Call<ModelAndView> getPreviousOrNextLectureDetailsUsingHEAD(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("date") String date, @Path("isNextLecture") Boolean isNextLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPreviousOrNextLectureDetails
   * 
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param subjectId subjectId (required)
   * @param date date (required)
   * @param isNextLecture isNextLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/class/{studyClassId}/section/{sectionId}/subject/{subjectId}/date/{date}/nextLecture/{isNextLecture}")
  Call<ModelAndView> getPreviousOrNextLectureDetailsUsingOPTIONS(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("date") String date, @Path("isNextLecture") Boolean isNextLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPreviousOrNextLectureDetails
   * 
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param subjectId subjectId (required)
   * @param date date (required)
   * @param isNextLecture isNextLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/class/{studyClassId}/section/{sectionId}/subject/{subjectId}/date/{date}/nextLecture/{isNextLecture}")
  Call<ModelAndView> getPreviousOrNextLectureDetailsUsingPATCH(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("date") String date, @Path("isNextLecture") Boolean isNextLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPreviousOrNextLectureDetails
   * 
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param subjectId subjectId (required)
   * @param date date (required)
   * @param isNextLecture isNextLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/class/{studyClassId}/section/{sectionId}/subject/{subjectId}/date/{date}/nextLecture/{isNextLecture}")
  Call<ModelAndView> getPreviousOrNextLectureDetailsUsingPOST(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("date") String date, @Path("isNextLecture") Boolean isNextLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPreviousOrNextLectureDetails
   * 
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param subjectId subjectId (required)
   * @param date date (required)
   * @param isNextLecture isNextLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/class/{studyClassId}/section/{sectionId}/subject/{subjectId}/date/{date}/nextLecture/{isNextLecture}")
  Call<ModelAndView> getPreviousOrNextLectureDetailsUsingPUT(
    @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Path("subjectId") Long subjectId, @Path("date") String date, @Path("isNextLecture") Boolean isNextLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/studyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/StudyPlan")
  Call<ModelAndView> getStudyPlanUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/studyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/StudyPlan")
  Call<ModelAndView> getStudyPlanUsingGET(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/studyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/StudyPlan")
  Call<ModelAndView> getStudyPlanUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/studyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/StudyPlan")
  Call<ModelAndView> getStudyPlanUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/studyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/StudyPlan")
  Call<ModelAndView> getStudyPlanUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/studyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/StudyPlan")
  Call<ModelAndView> getStudyPlanUsingPOST(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/studyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/{chapterName}/StudyPlan")
  Call<ModelAndView> getStudyPlanUsingPUT(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * goToRunAClass
   * 
   * @param learningPlanId learningPlanId (required)
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/data/runLecture/{learningPlanId}/section/{sectionId}/subject/{subjectId}")
  Call<ModelAndView> goToRunAClassUsingDELETE(
    @Path("learningPlanId") Long learningPlanId, @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId
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
   * goToRunAClass
   * 
   * @param learningPlanId learningPlanId (required)
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/data/runLecture/{learningPlanId}/section/{sectionId}/subject/{subjectId}")
  Call<ModelAndView> goToRunAClassUsingHEAD(
    @Path("learningPlanId") Long learningPlanId, @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId
  );

  /**
   * goToRunAClass
   * 
   * @param learningPlanId learningPlanId (required)
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/data/runLecture/{learningPlanId}/section/{sectionId}/subject/{subjectId}")
  Call<ModelAndView> goToRunAClassUsingOPTIONS(
    @Path("learningPlanId") Long learningPlanId, @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId
  );

  /**
   * goToRunAClass
   * 
   * @param learningPlanId learningPlanId (required)
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/data/runLecture/{learningPlanId}/section/{sectionId}/subject/{subjectId}")
  Call<ModelAndView> goToRunAClassUsingPATCH(
    @Path("learningPlanId") Long learningPlanId, @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId
  );

  /**
   * goToRunAClass
   * 
   * @param learningPlanId learningPlanId (required)
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/data/runLecture/{learningPlanId}/section/{sectionId}/subject/{subjectId}")
  Call<ModelAndView> goToRunAClassUsingPOST(
    @Path("learningPlanId") Long learningPlanId, @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId
  );

  /**
   * goToRunAClass
   * 
   * @param learningPlanId learningPlanId (required)
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/data/runLecture/{learningPlanId}/section/{sectionId}/subject/{subjectId}")
  Call<ModelAndView> goToRunAClassUsingPUT(
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
  
  @DELETE("nextmentor/addFromNextEducation/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromNextEducation")
  Call<ModelAndView> navigateToAddFromNextEducationUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate
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
  
  @HEAD("nextmentor/addFromNextEducation/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromNextEducation")
  Call<ModelAndView> navigateToAddFromNextEducationUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate
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
  
  @OPTIONS("nextmentor/addFromNextEducation/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromNextEducation")
  Call<ModelAndView> navigateToAddFromNextEducationUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate
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
  
  @PATCH("nextmentor/addFromNextEducation/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromNextEducation")
  Call<ModelAndView> navigateToAddFromNextEducationUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate
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
  
  @POST("nextmentor/addFromNextEducation/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromNextEducation")
  Call<ModelAndView> navigateToAddFromNextEducationUsingPOST(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate
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
  
  @PUT("nextmentor/addFromNextEducation/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromNextEducation")
  Call<ModelAndView> navigateToAddFromNextEducationUsingPUT(
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
  
  @DELETE("nextmentor/navigateToAddFromWeb/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromWeb")
  Call<ModelAndView> navigateToAddFromWebPageUsingDELETE(
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
  
  @HEAD("nextmentor/navigateToAddFromWeb/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromWeb")
  Call<ModelAndView> navigateToAddFromWebPageUsingHEAD(
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
  
  @OPTIONS("nextmentor/navigateToAddFromWeb/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromWeb")
  Call<ModelAndView> navigateToAddFromWebPageUsingOPTIONS(
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
  
  @PATCH("nextmentor/navigateToAddFromWeb/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromWeb")
  Call<ModelAndView> navigateToAddFromWebPageUsingPATCH(
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
  
  @POST("nextmentor/navigateToAddFromWeb/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromWeb")
  Call<ModelAndView> navigateToAddFromWebPageUsingPOST(
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
  
  @PUT("nextmentor/navigateToAddFromWeb/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/addFromWeb")
  Call<ModelAndView> navigateToAddFromWebPageUsingPUT(
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
  
  @DELETE("nextmentor/navigateToCollaborationPage/{subjectId}/{classId}/{sectionId}/{boardId}/{chapterId}/{customChapter}/resourceBankPage")
  Call<ModelAndView> navigateToCollaborationPageUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter
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
  
  @HEAD("nextmentor/navigateToCollaborationPage/{subjectId}/{classId}/{sectionId}/{boardId}/{chapterId}/{customChapter}/resourceBankPage")
  Call<ModelAndView> navigateToCollaborationPageUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter
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
  
  @OPTIONS("nextmentor/navigateToCollaborationPage/{subjectId}/{classId}/{sectionId}/{boardId}/{chapterId}/{customChapter}/resourceBankPage")
  Call<ModelAndView> navigateToCollaborationPageUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter
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
  
  @PATCH("nextmentor/navigateToCollaborationPage/{subjectId}/{classId}/{sectionId}/{boardId}/{chapterId}/{customChapter}/resourceBankPage")
  Call<ModelAndView> navigateToCollaborationPageUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter
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
  
  @POST("nextmentor/navigateToCollaborationPage/{subjectId}/{classId}/{sectionId}/{boardId}/{chapterId}/{customChapter}/resourceBankPage")
  Call<ModelAndView> navigateToCollaborationPageUsingPOST(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter
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
  
  @PUT("nextmentor/navigateToCollaborationPage/{subjectId}/{classId}/{sectionId}/{boardId}/{chapterId}/{customChapter}/resourceBankPage")
  Call<ModelAndView> navigateToCollaborationPageUsingPUT(
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
  
  @DELETE("nextmentor/navigateToCreateActivity/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateActivity")
  Call<ModelAndView> navigateToCreateActivityUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @HEAD("nextmentor/navigateToCreateActivity/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateActivity")
  Call<ModelAndView> navigateToCreateActivityUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @OPTIONS("nextmentor/navigateToCreateActivity/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateActivity")
  Call<ModelAndView> navigateToCreateActivityUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @PATCH("nextmentor/navigateToCreateActivity/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateActivity")
  Call<ModelAndView> navigateToCreateActivityUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @POST("nextmentor/navigateToCreateActivity/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateActivity")
  Call<ModelAndView> navigateToCreateActivityUsingPOST(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @PUT("nextmentor/navigateToCreateActivity/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateActivity")
  Call<ModelAndView> navigateToCreateActivityUsingPUT(
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
  
  @DELETE("nextmentor/navigateToCreateAssessment/{boardId}/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateAssessment")
  Call<ModelAndView> navigateToCreateAssessmentUsingDELETE(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("assessmentUuid") String assessmentUuid
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
  
  @HEAD("nextmentor/navigateToCreateAssessment/{boardId}/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateAssessment")
  Call<ModelAndView> navigateToCreateAssessmentUsingHEAD(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("assessmentUuid") String assessmentUuid
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
  
  @OPTIONS("nextmentor/navigateToCreateAssessment/{boardId}/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateAssessment")
  Call<ModelAndView> navigateToCreateAssessmentUsingOPTIONS(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("assessmentUuid") String assessmentUuid
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
  
  @PATCH("nextmentor/navigateToCreateAssessment/{boardId}/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateAssessment")
  Call<ModelAndView> navigateToCreateAssessmentUsingPATCH(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("assessmentUuid") String assessmentUuid
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
  
  @POST("nextmentor/navigateToCreateAssessment/{boardId}/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateAssessment")
  Call<ModelAndView> navigateToCreateAssessmentUsingPOST(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("assessmentUuid") String assessmentUuid
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
  
  @PUT("nextmentor/navigateToCreateAssessment/{boardId}/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateAssessment")
  Call<ModelAndView> navigateToCreateAssessmentUsingPUT(
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
  
  @DELETE("nextmentor/navigateToCreateAssignment/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateAssignment")
  Call<ModelAndView> navigateToCreateAssignmentUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @HEAD("nextmentor/navigateToCreateAssignment/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateAssignment")
  Call<ModelAndView> navigateToCreateAssignmentUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @OPTIONS("nextmentor/navigateToCreateAssignment/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateAssignment")
  Call<ModelAndView> navigateToCreateAssignmentUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @PATCH("nextmentor/navigateToCreateAssignment/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateAssignment")
  Call<ModelAndView> navigateToCreateAssignmentUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @POST("nextmentor/navigateToCreateAssignment/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateAssignment")
  Call<ModelAndView> navigateToCreateAssignmentUsingPOST(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid
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
  
  @PUT("nextmentor/navigateToCreateAssignment/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateAssignment")
  Call<ModelAndView> navigateToCreateAssignmentUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToCreateDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateDocument")
  Call<ModelAndView> navigateToCreateDocumentUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreateDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateDocument")
  Call<ModelAndView> navigateToCreateDocumentUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToCreateDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateDocument")
  Call<ModelAndView> navigateToCreateDocumentUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToCreateDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateDocument")
  Call<ModelAndView> navigateToCreateDocumentUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToCreateDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateDocument")
  Call<ModelAndView> navigateToCreateDocumentUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToCreateDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateDocument")
  Call<ModelAndView> navigateToCreateDocumentUsingPOST(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToCreateDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateDocument")
  Call<ModelAndView> navigateToCreateDocumentUsingPUT(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToCreatePpt/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreatePpt")
  Call<ModelAndView> navigateToCreatePptUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreatePpt/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreatePpt")
  Call<ModelAndView> navigateToCreatePptUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToCreatePpt/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreatePpt")
  Call<ModelAndView> navigateToCreatePptUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToCreatePpt/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreatePpt")
  Call<ModelAndView> navigateToCreatePptUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToCreatePpt/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreatePpt")
  Call<ModelAndView> navigateToCreatePptUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToCreatePpt/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreatePpt")
  Call<ModelAndView> navigateToCreatePptUsingPOST(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToCreatePpt/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreatePpt")
  Call<ModelAndView> navigateToCreatePptUsingPUT(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToCreateSpreadsheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateSpreadsheet")
  Call<ModelAndView> navigateToCreateSpreadsheetUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToCreateSpreadsheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateSpreadsheet")
  Call<ModelAndView> navigateToCreateSpreadsheetUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToCreateSpreadsheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateSpreadsheet")
  Call<ModelAndView> navigateToCreateSpreadsheetUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToCreateSpreadsheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateSpreadsheet")
  Call<ModelAndView> navigateToCreateSpreadsheetUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToCreateSpreadsheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateSpreadsheet")
  Call<ModelAndView> navigateToCreateSpreadsheetUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToCreateSpreadsheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateSpreadsheet")
  Call<ModelAndView> navigateToCreateSpreadsheetUsingPOST(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToCreateSpreadsheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/navigateToCreateSpreadsheet")
  Call<ModelAndView> navigateToCreateSpreadsheetUsingPUT(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Query("assetUrl") String assetUrl, @Query("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
  
  @DELETE("nextmentor/navigateToCreateWorksheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateWorksheet")
  Call<ModelAndView> navigateToCreateWorksheetUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid, @Query("location") String location
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
  
  @HEAD("nextmentor/navigateToCreateWorksheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateWorksheet")
  Call<ModelAndView> navigateToCreateWorksheetUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid, @Query("location") String location
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
  
  @OPTIONS("nextmentor/navigateToCreateWorksheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateWorksheet")
  Call<ModelAndView> navigateToCreateWorksheetUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid, @Query("location") String location
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
  
  @PATCH("nextmentor/navigateToCreateWorksheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateWorksheet")
  Call<ModelAndView> navigateToCreateWorksheetUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid, @Query("location") String location
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
  
  @POST("nextmentor/navigateToCreateWorksheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateWorksheet")
  Call<ModelAndView> navigateToCreateWorksheetUsingPOST(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Query("resourceUuid") String resourceUuid, @Query("assetUuid") String assetUuid, @Query("location") String location
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
  
  @PUT("nextmentor/navigateToCreateWorksheet/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/navigateToCreateWorksheet")
  Call<ModelAndView> navigateToCreateWorksheetUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToDayWisePlanPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/dayWisePlan")
  Call<ModelAndView> navigateToDayWisePlanPageUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToDayWisePlanPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/dayWisePlan")
  Call<ModelAndView> navigateToDayWisePlanPageUsingGET(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToDayWisePlanPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/dayWisePlan")
  Call<ModelAndView> navigateToDayWisePlanPageUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToDayWisePlanPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/dayWisePlan")
  Call<ModelAndView> navigateToDayWisePlanPageUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToDayWisePlanPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/dayWisePlan")
  Call<ModelAndView> navigateToDayWisePlanPageUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToDayWisePlanPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/dayWisePlan")
  Call<ModelAndView> navigateToDayWisePlanPageUsingPOST(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToDayWisePlanPage/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/dayWisePlan")
  Call<ModelAndView> navigateToDayWisePlanPageUsingPUT(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToFetchDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/{name}/navigateToFetchDocument")
  Call<ModelAndView> navigateToFetchDocumentUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Path("name") String name, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToFetchDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/{name}/navigateToFetchDocument")
  Call<ModelAndView> navigateToFetchDocumentUsingGET(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Path("name") String name, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToFetchDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/{name}/navigateToFetchDocument")
  Call<ModelAndView> navigateToFetchDocumentUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Path("name") String name, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToFetchDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/{name}/navigateToFetchDocument")
  Call<ModelAndView> navigateToFetchDocumentUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Path("name") String name, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToFetchDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/{name}/navigateToFetchDocument")
  Call<ModelAndView> navigateToFetchDocumentUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Path("name") String name, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToFetchDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/{name}/navigateToFetchDocument")
  Call<ModelAndView> navigateToFetchDocumentUsingPOST(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Path("name") String name, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToFetchDocument/{subjectId}/{studyClassId}/{sectionId}/{chapterId}/custom/{customChapter}/{isForCreate}/{assetUuid}/{name}/navigateToFetchDocument")
  Call<ModelAndView> navigateToFetchDocumentUsingPUT(
    @Path("subjectId") Long subjectId, @Path("studyClassId") Long studyClassId, @Path("sectionId") Long sectionId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("isForCreate") Boolean isForCreate, @Path("assetUuid") String assetUuid, @Path("name") String name, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToHomeworkTracker/{academicYear}/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{subjectName}/boardId/{boardId}/homeworkTracker")
  Call<ModelAndView> navigateToHomeworkTrackerUsingGET(
    @Path("academicYear") Long academicYear, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("subjectName") String subjectName, @Path("boardId") Long boardId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
  
  @DELETE("nextmentor/navigateToResourceBankPage/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{boardId}/{chapterId}/{chapterName}/{customChapter}/resourceBankPage/{isCheck}/member/{learningPlanMemberUuid}")
  Call<ModelAndView> navigateToResourceBankPageUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("isCheck") Boolean isCheck, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Query("lpuuid") String lpuuid
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
  
  @HEAD("nextmentor/navigateToResourceBankPage/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{boardId}/{chapterId}/{chapterName}/{customChapter}/resourceBankPage/{isCheck}/member/{learningPlanMemberUuid}")
  Call<ModelAndView> navigateToResourceBankPageUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("isCheck") Boolean isCheck, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Query("lpuuid") String lpuuid
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
  
  @OPTIONS("nextmentor/navigateToResourceBankPage/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{boardId}/{chapterId}/{chapterName}/{customChapter}/resourceBankPage/{isCheck}/member/{learningPlanMemberUuid}")
  Call<ModelAndView> navigateToResourceBankPageUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("isCheck") Boolean isCheck, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Query("lpuuid") String lpuuid
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
  
  @PATCH("nextmentor/navigateToResourceBankPage/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{boardId}/{chapterId}/{chapterName}/{customChapter}/resourceBankPage/{isCheck}/member/{learningPlanMemberUuid}")
  Call<ModelAndView> navigateToResourceBankPageUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("isCheck") Boolean isCheck, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Query("lpuuid") String lpuuid
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
  
  @POST("nextmentor/navigateToResourceBankPage/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{boardId}/{chapterId}/{chapterName}/{customChapter}/resourceBankPage/{isCheck}/member/{learningPlanMemberUuid}")
  Call<ModelAndView> navigateToResourceBankPageUsingPOST(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("chapterName") String chapterName, @Path("customChapter") Boolean customChapter, @Path("isCheck") Boolean isCheck, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Query("lpuuid") String lpuuid
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
  
  @PUT("nextmentor/navigateToResourceBankPage/{subjectId}/{classId}/{className}/{sectionId}/{sectionName}/{boardId}/{chapterId}/{chapterName}/{customChapter}/resourceBankPage/{isCheck}/member/{learningPlanMemberUuid}")
  Call<ModelAndView> navigateToResourceBankPageUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToResourcePlayer.app")
  Call<ModelAndView> navigateToResourcePlayerUsingGET1(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * navigateToRunAClassPage
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentor/navigateToRunAClass")
  Call<ModelAndView> navigateToRunAClassPageUsingDELETE();
    

  /**
   * navigateToRunAClassPage
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/navigateToRunAClass")
  Call<ModelAndView> navigateToRunAClassPageUsingGET();
    

  /**
   * navigateToRunAClassPage
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentor/navigateToRunAClass")
  Call<ModelAndView> navigateToRunAClassPageUsingHEAD();
    

  /**
   * navigateToRunAClassPage
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentor/navigateToRunAClass")
  Call<ModelAndView> navigateToRunAClassPageUsingOPTIONS();
    

  /**
   * navigateToRunAClassPage
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentor/navigateToRunAClass")
  Call<ModelAndView> navigateToRunAClassPageUsingPATCH();
    

  /**
   * navigateToRunAClassPage
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentor/navigateToRunAClass")
  Call<ModelAndView> navigateToRunAClassPageUsingPOST();
    

  /**
   * navigateToRunAClassPage
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentor/navigateToRunAClass")
  Call<ModelAndView> navigateToRunAClassPageUsingPUT();
    

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
  
  @DELETE("nextmentor/navigateToStudyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/studyPlanPage")
  Call<ModelAndView> navigateToStudyPlanUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName
  );

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
  
  @HEAD("nextmentor/navigateToStudyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/studyPlanPage")
  Call<ModelAndView> navigateToStudyPlanUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName
  );

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
  
  @OPTIONS("nextmentor/navigateToStudyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/studyPlanPage")
  Call<ModelAndView> navigateToStudyPlanUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName
  );

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
  
  @PATCH("nextmentor/navigateToStudyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/studyPlanPage")
  Call<ModelAndView> navigateToStudyPlanUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName
  );

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
  
  @POST("nextmentor/navigateToStudyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/studyPlanPage")
  Call<ModelAndView> navigateToStudyPlanUsingPOST(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName
  );

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
  
  @PUT("nextmentor/navigateToStudyPlan/class/{classId}/{className}/section/{sectionId}/{sectionName}/board/{boardId}/syllabus/{currentSyllabusObjectId}/subject/{subjectId}/{subjectName}/isCustom/{isCustom}/chapter/{chapterId}/{customChapter}/studyPlanPage")
  Call<ModelAndView> navigateToStudyPlanUsingPUT(
    @Path("subjectId") Long subjectId, @Path("subjectName") String subjectName, @Path("classId") Long classId, @Path("className") String className, @Path("sectionId") Long sectionId, @Path("sectionName") String sectionName, @Path("boardId") Long boardId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Path("currentSyllabusObjectId") Long currentSyllabusObjectId, @Path("isCustom") Boolean isCustom, @Path("chapterName") String chapterName
  );

  /**
   * showHome
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("teacherWorkspaceHome")
  Call<ModelAndView> showHomeUsingGET2(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
