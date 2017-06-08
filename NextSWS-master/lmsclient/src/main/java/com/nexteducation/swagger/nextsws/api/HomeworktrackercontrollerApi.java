package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.TaskDoc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HomeworktrackercontrollerApi {
  /**
   * getLatestHomeWorkWithResourceStudentCount
   * 
   * @param sectionId sectionId (required)
   * @param className className (required)
   * @param subjectName subjectName (required)
   * @param sectionName sectionName (required)
   * @param subjectId subjectId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET(" /data/workspace/{className}/section/{sectionId}/{sectionName}/latestPublishedHomework/Resource/{subjectId}/{subjectName}")
  Call<ModelAndView> getLatestHomeWorkWithResourceStudentCountUsingGET(
    @Path("sectionId") Long sectionId, @Path("className") String className, @Path("subjectName") String subjectName, @Path("sectionName") String sectionName, @Path("subjectId") Long subjectId
  );

  /**
   * getLatestHomeWorkWithStudent
   * 
   * @param sectionId sectionId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET(" /data/workspace/section/{sectionId}/latestPublishedHomework/StudentList")
  Call<ModelAndView> getLatestHomeWorkWithStudentUsingGET(
    @Path("sectionId") Long sectionId
  );

  /**
   * getLatestPublishedHomeworkWithResource
   * 
   * @param sectionId sectionId (required)
   * @param subjectId subjectId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/workspace/section/{sectionId}/latest/{subjectId}")
  Call<ModelAndView> getLatestPublishedHomeworkWithResourceUsingGET(
    @Path("sectionId") Long sectionId, @Path("subjectId") Long subjectId, @Body SessionParams sessionParams
  );

  /**
   * getLectureBasedOnPublishedDateForSection
   * 
   * @param sectionId sectionId (required)
   * @param publishedOn publishedOn (required)
   * @param isNext isNext (required)
   * @param subjectId subjectId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/workspace/section/{sectionId}/{publishedOn}/{isNext}/subject/{subjectId}")
  Call<ModelAndView> getLectureBasedOnPublishedDateForSectionUsingGET(
    @Path("sectionId") Long sectionId, @Path("publishedOn") String publishedOn, @Path("isNext") Boolean isNext, @Path("subjectId") Long subjectId, @Body SessionParams sessionParams
  );

  /**
   * getResourceListForLectureBasedOnUser
   * 
   * @param learningPlanId learningPlanId (required)
   * @param userId userId (required)
   * @return Call&lt;List<Object>&gt;
   */
  
  @GET("data/workspace/{learningPlanId}/user/{userId}/resources")
  Call<List<Object>> getResourceListForLectureBasedOnUserUsingGET(
    @Path("learningPlanId") Long learningPlanId, @Path("userId") Long userId
  );

  /**
   * getResourceListForLecture
   * 
   * @param learningPlanId learningPlanId (required)
   * @return Call&lt;List<Object>&gt;
   */
  
  @GET("data/workspace/{learningPlanId}/resources")
  Call<List<Object>> getResourceListForLectureUsingGET(
    @Path("learningPlanId") Long learningPlanId
  );

  /**
   * getStudentListForLectureBasedOnResource
   * 
   * @param resourceId resourceId (required)
   * @return Call&lt;List<TaskDoc>&gt;
   */
  
  @GET("data/lecture/resource/{resourceId}/studentList")
  Call<List<TaskDoc>> getStudentListForLectureBasedOnResourceUsingGET(
    @Path("resourceId") Long resourceId
  );

}
