package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.AssignmentRequest;
import com.nexteducation.swagger.nextsws.model.UserResourceResponse;
import com.nexteducation.swagger.nextsws.model.ActivityPlanResponse;
import com.nexteducation.swagger.nextsws.model.AssignmentResponse;
import com.nexteducation.swagger.nextsws.model.WorksheetResponse;
import com.nexteducation.swagger.nextsws.model.LessonPlanResponse;
import com.nexteducation.swagger.nextsws.model.ActivityDTO;
import com.nexteducation.swagger.nextsws.model.WorksheetDTO;
import com.nexteducation.swagger.nextsws.model.LessonPlanSectionDetailResponse;
import com.nexteducation.swagger.nextsws.model.LessonPlanSectionDetailRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LessonplancontrollerApi {
  /**
   * createNewAssignment
   * 
   * @param assignment assignment (required)
   * @param syllabusNode syllabusNode (required)
   * @param customSyllabusNode customSyllabusNode (required)
   * @param sectionId sectionId (required)
   * @param globalResource globalResource (required)
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @DELETE("data/insertAssignmentForLecturePlan/{syllabusNode}/{customSyllabusNode}/{sectionId}/{globalResource}/{classId}")
  Call<List<UserResourceResponse>> createNewAssignmentUsingDELETE(
    @Body AssignmentRequest assignment, @Path("syllabusNode") Long syllabusNode, @Path("customSyllabusNode") Boolean customSyllabusNode, @Path("sectionId") Long sectionId, @Path("globalResource") Boolean globalResource, @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createNewAssignment
   * 
   * @param assignment assignment (required)
   * @param syllabusNode syllabusNode (required)
   * @param customSyllabusNode customSyllabusNode (required)
   * @param sectionId sectionId (required)
   * @param globalResource globalResource (required)
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/insertAssignmentForLecturePlan/{syllabusNode}/{customSyllabusNode}/{sectionId}/{globalResource}/{classId}")
  Call<List<UserResourceResponse>> createNewAssignmentUsingGET(
    @Body AssignmentRequest assignment, @Path("syllabusNode") Long syllabusNode, @Path("customSyllabusNode") Boolean customSyllabusNode, @Path("sectionId") Long sectionId, @Path("globalResource") Boolean globalResource, @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createNewAssignment
   * 
   * @param assignment assignment (required)
   * @param syllabusNode syllabusNode (required)
   * @param customSyllabusNode customSyllabusNode (required)
   * @param sectionId sectionId (required)
   * @param globalResource globalResource (required)
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @HEAD("data/insertAssignmentForLecturePlan/{syllabusNode}/{customSyllabusNode}/{sectionId}/{globalResource}/{classId}")
  Call<List<UserResourceResponse>> createNewAssignmentUsingHEAD(
    @Body AssignmentRequest assignment, @Path("syllabusNode") Long syllabusNode, @Path("customSyllabusNode") Boolean customSyllabusNode, @Path("sectionId") Long sectionId, @Path("globalResource") Boolean globalResource, @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createNewAssignment
   * 
   * @param assignment assignment (required)
   * @param syllabusNode syllabusNode (required)
   * @param customSyllabusNode customSyllabusNode (required)
   * @param sectionId sectionId (required)
   * @param globalResource globalResource (required)
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @OPTIONS("data/insertAssignmentForLecturePlan/{syllabusNode}/{customSyllabusNode}/{sectionId}/{globalResource}/{classId}")
  Call<List<UserResourceResponse>> createNewAssignmentUsingOPTIONS(
    @Body AssignmentRequest assignment, @Path("syllabusNode") Long syllabusNode, @Path("customSyllabusNode") Boolean customSyllabusNode, @Path("sectionId") Long sectionId, @Path("globalResource") Boolean globalResource, @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createNewAssignment
   * 
   * @param assignment assignment (required)
   * @param syllabusNode syllabusNode (required)
   * @param customSyllabusNode customSyllabusNode (required)
   * @param sectionId sectionId (required)
   * @param globalResource globalResource (required)
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PATCH("data/insertAssignmentForLecturePlan/{syllabusNode}/{customSyllabusNode}/{sectionId}/{globalResource}/{classId}")
  Call<List<UserResourceResponse>> createNewAssignmentUsingPATCH(
    @Body AssignmentRequest assignment, @Path("syllabusNode") Long syllabusNode, @Path("customSyllabusNode") Boolean customSyllabusNode, @Path("sectionId") Long sectionId, @Path("globalResource") Boolean globalResource, @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createNewAssignment
   * 
   * @param assignment assignment (required)
   * @param syllabusNode syllabusNode (required)
   * @param customSyllabusNode customSyllabusNode (required)
   * @param sectionId sectionId (required)
   * @param globalResource globalResource (required)
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/insertAssignmentForLecturePlan/{syllabusNode}/{customSyllabusNode}/{sectionId}/{globalResource}/{classId}")
  Call<List<UserResourceResponse>> createNewAssignmentUsingPOST(
    @Body AssignmentRequest assignment, @Path("syllabusNode") Long syllabusNode, @Path("customSyllabusNode") Boolean customSyllabusNode, @Path("sectionId") Long sectionId, @Path("globalResource") Boolean globalResource, @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createNewAssignment
   * 
   * @param assignment assignment (required)
   * @param syllabusNode syllabusNode (required)
   * @param customSyllabusNode customSyllabusNode (required)
   * @param sectionId sectionId (required)
   * @param globalResource globalResource (required)
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PUT("data/insertAssignmentForLecturePlan/{syllabusNode}/{customSyllabusNode}/{sectionId}/{globalResource}/{classId}")
  Call<List<UserResourceResponse>> createNewAssignmentUsingPUT(
    @Body AssignmentRequest assignment, @Path("syllabusNode") Long syllabusNode, @Path("customSyllabusNode") Boolean customSyllabusNode, @Path("sectionId") Long sectionId, @Path("globalResource") Boolean globalResource, @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchActivity
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @DELETE("data/fetchActivity/{assetUuid}")
  Call<ActivityPlanResponse> fetchActivityUsingDELETE(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchActivity
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @GET("data/fetchActivity/{assetUuid}")
  Call<ActivityPlanResponse> fetchActivityUsingGET(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchActivity
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @HEAD("data/fetchActivity/{assetUuid}")
  Call<ActivityPlanResponse> fetchActivityUsingHEAD(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchActivity
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @OPTIONS("data/fetchActivity/{assetUuid}")
  Call<ActivityPlanResponse> fetchActivityUsingOPTIONS(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchActivity
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @PATCH("data/fetchActivity/{assetUuid}")
  Call<ActivityPlanResponse> fetchActivityUsingPATCH(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchActivity
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @POST("data/fetchActivity/{assetUuid}")
  Call<ActivityPlanResponse> fetchActivityUsingPOST(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchActivity
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @PUT("data/fetchActivity/{assetUuid}")
  Call<ActivityPlanResponse> fetchActivityUsingPUT(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchAssignment
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @DELETE("data/fetchAssignment/{assetUuid}")
  Call<AssignmentResponse> fetchAssignmentUsingDELETE(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchAssignment
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @GET("data/fetchAssignment/{assetUuid}")
  Call<AssignmentResponse> fetchAssignmentUsingGET(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchAssignment
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @HEAD("data/fetchAssignment/{assetUuid}")
  Call<AssignmentResponse> fetchAssignmentUsingHEAD(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchAssignment
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @OPTIONS("data/fetchAssignment/{assetUuid}")
  Call<AssignmentResponse> fetchAssignmentUsingOPTIONS(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchAssignment
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @PATCH("data/fetchAssignment/{assetUuid}")
  Call<AssignmentResponse> fetchAssignmentUsingPATCH(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchAssignment
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @POST("data/fetchAssignment/{assetUuid}")
  Call<AssignmentResponse> fetchAssignmentUsingPOST(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchAssignment
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @PUT("data/fetchAssignment/{assetUuid}")
  Call<AssignmentResponse> fetchAssignmentUsingPUT(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchWorksheet
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @DELETE("data/fetchWorksheet/{assetUuid}")
  Call<WorksheetResponse> fetchWorksheetUsingDELETE(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchWorksheet
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @GET("data/fetchWorksheet/{assetUuid}")
  Call<WorksheetResponse> fetchWorksheetUsingGET(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchWorksheet
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @HEAD("data/fetchWorksheet/{assetUuid}")
  Call<WorksheetResponse> fetchWorksheetUsingHEAD(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchWorksheet
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @OPTIONS("data/fetchWorksheet/{assetUuid}")
  Call<WorksheetResponse> fetchWorksheetUsingOPTIONS(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchWorksheet
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @PATCH("data/fetchWorksheet/{assetUuid}")
  Call<WorksheetResponse> fetchWorksheetUsingPATCH(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchWorksheet
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @POST("data/fetchWorksheet/{assetUuid}")
  Call<WorksheetResponse> fetchWorksheetUsingPOST(
    @Path("assetUuid") String assetUuid
  );

  /**
   * fetchWorksheet
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @PUT("data/fetchWorksheet/{assetUuid}")
  Call<WorksheetResponse> fetchWorksheetUsingPUT(
    @Path("assetUuid") String assetUuid
  );

  /**
   * getImageSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/imageSearch.app")
  Call<Void> getImageSearchResultUsingDELETE();
    

  /**
   * getImageSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/imageSearch.app")
  Call<Void> getImageSearchResultUsingGET();
    

  /**
   * getImageSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/imageSearch.app")
  Call<Void> getImageSearchResultUsingHEAD();
    

  /**
   * getImageSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/imageSearch.app")
  Call<Void> getImageSearchResultUsingOPTIONS();
    

  /**
   * getImageSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/imageSearch.app")
  Call<Void> getImageSearchResultUsingPATCH();
    

  /**
   * getImageSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/imageSearch.app")
  Call<Void> getImageSearchResultUsingPOST();
    

  /**
   * getImageSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/imageSearch.app")
  Call<Void> getImageSearchResultUsingPUT();
    

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/lessonPlan/{classId}/{sectionId}/{chapterId}.app")
  Call<Void> getLessonPlanUsingDELETE(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LessonPlanResponse>&gt;
   */
  
  @DELETE("data/lessonPlan/{classId}/{sectionId}/{chapterId}/{customChapter}.app")
  Call<List<LessonPlanResponse>> getLessonPlanUsingDELETE1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/lessonPlan/{classId}/{sectionId}/{chapterId}.app")
  Call<Void> getLessonPlanUsingGET(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LessonPlanResponse>&gt;
   */
  
  @GET("data/lessonPlan/{classId}/{sectionId}/{chapterId}/{customChapter}.app")
  Call<List<LessonPlanResponse>> getLessonPlanUsingGET1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/lessonPlan/{classId}/{sectionId}/{chapterId}.app")
  Call<Void> getLessonPlanUsingHEAD(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LessonPlanResponse>&gt;
   */
  
  @HEAD("data/lessonPlan/{classId}/{sectionId}/{chapterId}/{customChapter}.app")
  Call<List<LessonPlanResponse>> getLessonPlanUsingHEAD1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/lessonPlan/{classId}/{sectionId}/{chapterId}.app")
  Call<Void> getLessonPlanUsingOPTIONS(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LessonPlanResponse>&gt;
   */
  
  @OPTIONS("data/lessonPlan/{classId}/{sectionId}/{chapterId}/{customChapter}.app")
  Call<List<LessonPlanResponse>> getLessonPlanUsingOPTIONS1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/lessonPlan/{classId}/{sectionId}/{chapterId}.app")
  Call<Void> getLessonPlanUsingPATCH(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LessonPlanResponse>&gt;
   */
  
  @PATCH("data/lessonPlan/{classId}/{sectionId}/{chapterId}/{customChapter}.app")
  Call<List<LessonPlanResponse>> getLessonPlanUsingPATCH1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/lessonPlan/{classId}/{sectionId}/{chapterId}.app")
  Call<Void> getLessonPlanUsingPOST(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LessonPlanResponse>&gt;
   */
  
  @POST("data/lessonPlan/{classId}/{sectionId}/{chapterId}/{customChapter}.app")
  Call<List<LessonPlanResponse>> getLessonPlanUsingPOST1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/lessonPlan/{classId}/{sectionId}/{chapterId}.app")
  Call<Void> getLessonPlanUsingPUT(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LessonPlanResponse>&gt;
   */
  
  @PUT("data/lessonPlan/{classId}/{sectionId}/{chapterId}/{customChapter}.app")
  Call<List<LessonPlanResponse>> getLessonPlanUsingPUT1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

    

  /**
   * getVideoSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/videoSearch.app")
  Call<Void> getVideoSearchResultUsingDELETE();
    

  /**
   * getVideoSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/videoSearch.app")
  Call<Void> getVideoSearchResultUsingGET();
    

  /**
   * getVideoSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/videoSearch.app")
  Call<Void> getVideoSearchResultUsingHEAD();
    

  /**
   * getVideoSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/videoSearch.app")
  Call<Void> getVideoSearchResultUsingOPTIONS();
    

  /**
   * getVideoSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/videoSearch.app")
  Call<Void> getVideoSearchResultUsingPATCH();
    

  /**
   * getVideoSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/videoSearch.app")
  Call<Void> getVideoSearchResultUsingPOST();
    

  /**
   * getVideoSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/videoSearch.app")
  Call<Void> getVideoSearchResultUsingPUT();
    

  /**
   * insertLecturePlanActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @DELETE("data/insertActivityForLecturePlan")
  Call<List<UserResourceResponse>> insertLecturePlanActivityUsingDELETE(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertLecturePlanActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/insertActivityForLecturePlan")
  Call<List<UserResourceResponse>> insertLecturePlanActivityUsingGET(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertLecturePlanActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @HEAD("data/insertActivityForLecturePlan")
  Call<List<UserResourceResponse>> insertLecturePlanActivityUsingHEAD(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertLecturePlanActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @OPTIONS("data/insertActivityForLecturePlan")
  Call<List<UserResourceResponse>> insertLecturePlanActivityUsingOPTIONS(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertLecturePlanActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PATCH("data/insertActivityForLecturePlan")
  Call<List<UserResourceResponse>> insertLecturePlanActivityUsingPATCH(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertLecturePlanActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/insertActivityForLecturePlan")
  Call<List<UserResourceResponse>> insertLecturePlanActivityUsingPOST(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertLecturePlanActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PUT("data/insertActivityForLecturePlan")
  Call<List<UserResourceResponse>> insertLecturePlanActivityUsingPUT(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @DELETE("data/insertWorksheetForChapter")
  Call<List<UserResourceResponse>> insertWorksheetUsingDELETE(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/insertWorksheetForChapter")
  Call<List<UserResourceResponse>> insertWorksheetUsingGET(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @HEAD("data/insertWorksheetForChapter")
  Call<List<UserResourceResponse>> insertWorksheetUsingHEAD(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @OPTIONS("data/insertWorksheetForChapter")
  Call<List<UserResourceResponse>> insertWorksheetUsingOPTIONS(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PATCH("data/insertWorksheetForChapter")
  Call<List<UserResourceResponse>> insertWorksheetUsingPATCH(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/insertWorksheetForChapter")
  Call<List<UserResourceResponse>> insertWorksheetUsingPOST(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PUT("data/insertWorksheetForChapter")
  Call<List<UserResourceResponse>> insertWorksheetUsingPUT(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveLessonPlanSectionData
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/saveLessonPlanSectionData.app")
  Call<Void> saveLessonPlanSectionDataUsingDELETE();
    

  /**
   * saveLessonPlanSectionData
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/saveLessonPlanSectionData.app")
  Call<Void> saveLessonPlanSectionDataUsingGET();
    

  /**
   * saveLessonPlanSectionData
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/saveLessonPlanSectionData.app")
  Call<Void> saveLessonPlanSectionDataUsingHEAD();
    

  /**
   * saveLessonPlanSectionData
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/saveLessonPlanSectionData.app")
  Call<Void> saveLessonPlanSectionDataUsingOPTIONS();
    

  /**
   * saveLessonPlanSectionData
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/saveLessonPlanSectionData.app")
  Call<Void> saveLessonPlanSectionDataUsingPATCH();
    

  /**
   * saveLessonPlanSectionData
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/saveLessonPlanSectionData.app")
  Call<Void> saveLessonPlanSectionDataUsingPOST();
    

  /**
   * saveLessonPlanSectionData
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/saveLessonPlanSectionData.app")
  Call<Void> saveLessonPlanSectionDataUsingPUT();
    

  /**
   * saveOrUpdateLessonPlan
   * 
   * @param lessonPlanSectionDetailRequest lessonPlanSectionDetailRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LessonPlanSectionDetailResponse&gt;
   */
  
  @POST("data/lessonPlan/saveUpdateSectionDetails")
  Call<LessonPlanSectionDetailResponse> saveOrUpdateLessonPlanUsingPOST(
    @Body LessonPlanSectionDetailRequest lessonPlanSectionDetailRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("lessonPlan")
  Call<ModelAndView> showLessonPlanUsingDELETE(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("lessonPlan")
  Call<ModelAndView> showLessonPlanUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("lessonPlan")
  Call<ModelAndView> showLessonPlanUsingHEAD(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("lessonPlan")
  Call<ModelAndView> showLessonPlanUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("lessonPlan")
  Call<ModelAndView> showLessonPlanUsingPATCH(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("lessonPlan")
  Call<ModelAndView> showLessonPlanUsingPOST(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("lessonPlan")
  Call<ModelAndView> showLessonPlanUsingPUT(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showTeacherWorkspace
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("tws")
  Call<ModelAndView> showTeacherWorkspaceUsingDELETE(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showTeacherWorkspace
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("tws")
  Call<ModelAndView> showTeacherWorkspaceUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showTeacherWorkspace
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("tws")
  Call<ModelAndView> showTeacherWorkspaceUsingHEAD(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showTeacherWorkspace
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("tws")
  Call<ModelAndView> showTeacherWorkspaceUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showTeacherWorkspace
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("tws")
  Call<ModelAndView> showTeacherWorkspaceUsingPATCH(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showTeacherWorkspace
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("tws")
  Call<ModelAndView> showTeacherWorkspaceUsingPOST(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showTeacherWorkspace
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("tws")
  Call<ModelAndView> showTeacherWorkspaceUsingPUT(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @DELETE("data/updateActivity")
  Call<ActivityPlanResponse> updateActivityUsingDELETE(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @GET("data/updateActivity")
  Call<ActivityPlanResponse> updateActivityUsingGET(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @HEAD("data/updateActivity")
  Call<ActivityPlanResponse> updateActivityUsingHEAD(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @OPTIONS("data/updateActivity")
  Call<ActivityPlanResponse> updateActivityUsingOPTIONS(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @PATCH("data/updateActivity")
  Call<ActivityPlanResponse> updateActivityUsingPATCH(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @POST("data/updateActivity")
  Call<ActivityPlanResponse> updateActivityUsingPOST(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @PUT("data/updateActivity")
  Call<ActivityPlanResponse> updateActivityUsingPUT(
    @Body ActivityDTO activityDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateAssignment
   * 
   * @param assignmentRequest assignmentRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @DELETE("data/updateAssignment")
  Call<AssignmentResponse> updateAssignmentUsingDELETE(
    @Body AssignmentRequest assignmentRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateAssignment
   * 
   * @param assignmentRequest assignmentRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @GET("data/updateAssignment")
  Call<AssignmentResponse> updateAssignmentUsingGET(
    @Body AssignmentRequest assignmentRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateAssignment
   * 
   * @param assignmentRequest assignmentRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @HEAD("data/updateAssignment")
  Call<AssignmentResponse> updateAssignmentUsingHEAD(
    @Body AssignmentRequest assignmentRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateAssignment
   * 
   * @param assignmentRequest assignmentRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @OPTIONS("data/updateAssignment")
  Call<AssignmentResponse> updateAssignmentUsingOPTIONS(
    @Body AssignmentRequest assignmentRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateAssignment
   * 
   * @param assignmentRequest assignmentRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @PATCH("data/updateAssignment")
  Call<AssignmentResponse> updateAssignmentUsingPATCH(
    @Body AssignmentRequest assignmentRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateAssignment
   * 
   * @param assignmentRequest assignmentRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @POST("data/updateAssignment")
  Call<AssignmentResponse> updateAssignmentUsingPOST(
    @Body AssignmentRequest assignmentRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateAssignment
   * 
   * @param assignmentRequest assignmentRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @PUT("data/updateAssignment")
  Call<AssignmentResponse> updateAssignmentUsingPUT(
    @Body AssignmentRequest assignmentRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @DELETE("data/updateWorksheet")
  Call<WorksheetResponse> updateWorksheetUsingDELETE(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @GET("data/updateWorksheet")
  Call<WorksheetResponse> updateWorksheetUsingGET(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @HEAD("data/updateWorksheet")
  Call<WorksheetResponse> updateWorksheetUsingHEAD(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @OPTIONS("data/updateWorksheet")
  Call<WorksheetResponse> updateWorksheetUsingOPTIONS(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @PATCH("data/updateWorksheet")
  Call<WorksheetResponse> updateWorksheetUsingPATCH(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @POST("data/updateWorksheet")
  Call<WorksheetResponse> updateWorksheetUsingPOST(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @PUT("data/updateWorksheet")
  Call<WorksheetResponse> updateWorksheetUsingPUT(
    @Body WorksheetDTO worksheetDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * uploadVideo
   * 
   * @return Call&lt;String&gt;
   */
  
  @DELETE("data/uploadVideo")
  Call<String> uploadVideoUsingDELETE();
    

  /**
   * uploadVideo
   * 
   * @return Call&lt;String&gt;
   */
  
  @GET("data/uploadVideo")
  Call<String> uploadVideoUsingGET();
    

  /**
   * uploadVideo
   * 
   * @return Call&lt;String&gt;
   */
  
  @HEAD("data/uploadVideo")
  Call<String> uploadVideoUsingHEAD();
    

  /**
   * uploadVideo
   * 
   * @return Call&lt;String&gt;
   */
  
  @OPTIONS("data/uploadVideo")
  Call<String> uploadVideoUsingOPTIONS();
    

  /**
   * uploadVideo
   * 
   * @return Call&lt;String&gt;
   */
  
  @PATCH("data/uploadVideo")
  Call<String> uploadVideoUsingPATCH();
    

  /**
   * uploadVideo
   * 
   * @return Call&lt;String&gt;
   */
  
  @POST("data/uploadVideo")
  Call<String> uploadVideoUsingPOST();
    

  /**
   * uploadVideo
   * 
   * @return Call&lt;String&gt;
   */
  
  @PUT("data/uploadVideo")
  Call<String> uploadVideoUsingPUT();
    

}
