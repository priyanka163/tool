package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.AssignmentRequest;
import com.nexteducation.swagger.nextsws.model.UserResourceResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/insertAssignmentForLecturePlan/{syllabusNode}/{customSyllabusNode}/{sectionId}/{globalResource}/{classId}")
  Call<List<UserResourceResponse>> createNewAssignmentUsingGET(
    @Body AssignmentRequest assignment, @Path("syllabusNode") Long syllabusNode, @Path("customSyllabusNode") Boolean customSyllabusNode, @Path("sectionId") Long sectionId, @Path("globalResource") Boolean globalResource, @Path("classId") Long classId, @Body SessionParams sessionParams
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
   * getImageSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/imageSearch.app")
  Call<Void> getImageSearchResultUsingGET();
    

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/lessonPlan/{classId}/{sectionId}/{chapterId}.app")
  Call<Void> getLessonPlanUsingGET(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Body SessionParams sessionParams
  );

  /**
   * getLessonPlan
   * 
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param customChapter customChapter (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<LessonPlanResponse>&gt;
   */
  
  @GET("data/lessonPlan/{classId}/{sectionId}/{chapterId}/{customChapter}.app")
  Call<List<LessonPlanResponse>> getLessonPlanUsingGET1(
    @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Path("customChapter") Boolean customChapter, @Body SessionParams sessionParams
  );

  /**
   * getNextStudioImagesData
   * 
   * @return Call&lt;HttpServletResponse&gt;
   */

    

  /**
   * getVideoSearchResult
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/videoSearch.app")
  Call<Void> getVideoSearchResultUsingGET();
    

  /**
   * insertLecturePlanActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/insertActivityForLecturePlan")
  Call<List<UserResourceResponse>> insertLecturePlanActivityUsingGET(
    @Body ActivityDTO activityDTO, @Body SessionParams sessionParams
  );

  /**
   * insertWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/insertWorksheetForChapter")
  Call<List<UserResourceResponse>> insertWorksheetUsingGET(
    @Body WorksheetDTO worksheetDTO, @Body SessionParams sessionParams
  );

  /**
   * saveLessonPlanSectionData
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/saveLessonPlanSectionData.app")
  Call<Void> saveLessonPlanSectionDataUsingGET();
    

  /**
   * saveOrUpdateLessonPlan
   * 
   * @param lessonPlanSectionDetailRequest lessonPlanSectionDetailRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;LessonPlanSectionDetailResponse&gt;
   */
  
  @POST("data/lessonPlan/saveUpdateSectionDetails")
  Call<LessonPlanSectionDetailResponse> saveOrUpdateLessonPlanUsingPOST(
    @Body LessonPlanSectionDetailRequest lessonPlanSectionDetailRequest, @Body SessionParams sessionParams
  );

  /**
   * showLessonPlan
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("lessonPlan")
  Call<ModelAndView> showLessonPlanUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * showTeacherWorkspace
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentor/tws")
  Call<ModelAndView> showTeacherWorkspaceUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * updateActivity
   * 
   * @param activityDTO activityDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ActivityPlanResponse&gt;
   */
  
  @GET("data/updateActivity")
  Call<ActivityPlanResponse> updateActivityUsingGET(
    @Body ActivityDTO activityDTO, @Body SessionParams sessionParams
  );

  /**
   * updateAssignment
   * 
   * @param assignmentRequest assignmentRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @GET("data/updateAssignment")
  Call<AssignmentResponse> updateAssignmentUsingGET(
    @Body AssignmentRequest assignmentRequest, @Body SessionParams sessionParams
  );

  /**
   * updateWorksheet
   * 
   * @param worksheetDTO worksheetDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;WorksheetResponse&gt;
   */
  
  @GET("data/updateWorksheet")
  Call<WorksheetResponse> updateWorksheetUsingGET(
    @Body WorksheetDTO worksheetDTO, @Body SessionParams sessionParams
  );

  /**
   * uploadVideo
   * 
   * @return Call&lt;String&gt;
   */
  
  @GET("data/uploadVideo")
  Call<String> uploadVideoUsingGET();
    

}
