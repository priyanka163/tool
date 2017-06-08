package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.TaskFetchRequest;
import com.nexteducation.swagger.nextsws.model.TaskResponse;
import com.nexteducation.swagger.nextsws.model.DayPlanResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.LectureDetailResponse;
import com.nexteducation.swagger.nextsws.model.DayPlanDTO;
import com.nexteducation.swagger.nextsws.model.StudentStudyPlanResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DayplancontrollerApi {
  /**
   * fetchTasks
   * 
   * @param fetchRequest fetchRequest (required)
   * @param luid luid (required)
   * @param lbid lbid (required)
   * @return Call&lt;List<TaskResponse>&gt;
   */
  
  @POST("data/tasks")
  Call<List<TaskResponse>> fetchTasksUsingPOST(
    @Body TaskFetchRequest fetchRequest, @Query("luid") String luid, @Query("lbid") String lbid
  );

  /**
   * getCurrentUserTodaysLectures
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @GET("data/teacherLecturesDetail")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getCurrentUserTodaysLecturesWithResource
   * 
   * @param isLecture isLecture (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @GET("data/teacherLecturesDetailwithResource/{isLecture}")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesWithResourceUsingGET(
    @Path("isLecture") Boolean isLecture, @Body SessionParams sessionParams
  );

  /**
   * getLearningPlanDetail
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param customSyllabus customSyllabus (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;LectureDetailResponse&gt;
   */
  
  @GET("data/learningPlanDetail/{classId}/{subjectId}/{sectionId}/{syllabusId}/{customSyllabus}")
  Call<LectureDetailResponse> getLearningPlanDetailUsingGET(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Path("customSyllabus") Boolean customSyllabus, @Body SessionParams sessionParams
  );

  /**
   * getPlanForDay
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @GET("data/getDayPlanDetail.app")
  Call<DayPlanResponse> getPlanForDayUsingGET(
    @Body DayPlanDTO dayPlanDTO, @Body SessionParams sessionParams
  );

  /**
   * getStudentStudyPlan
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;StudentStudyPlanResponse&gt;
   */
  
  @GET("data/getStudyPlanDetails.app")
  Call<StudentStudyPlanResponse> getStudentStudyPlanUsingGET(
    @Body DayPlanDTO dayPlanDTO, @Body SessionParams sessionParams
  );

  /**
   * publishPlan
   * 
   * @param learningPlanId learningPlanId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/publishThePlan/{learningPlanId}")
  Call<ModelAndView> publishPlanUsingGET(
    @Path("learningPlanId") String learningPlanId
  );

  /**
   * updateObjective
   * 
   * @param learningPlanId learningPlanId (required)
   * @param objective objective (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET(" data/updateObjective/{learningPlanId}/updateObjective/{objective}")
  Call<ModelAndView> updateObjectiveUsingGET(
    @Path("learningPlanId") String learningPlanId, @Path("objective") String objective
  );

  /**
   * updateResourceCategory
   * 
   * @param id id (required)
   * @param value value (required)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/updateResourceCategory/{id}/{value}")
  Call<Void> updateResourceCategoryUsingGET(
    @Path("id") String id, @Path("value") String value
  );

}
