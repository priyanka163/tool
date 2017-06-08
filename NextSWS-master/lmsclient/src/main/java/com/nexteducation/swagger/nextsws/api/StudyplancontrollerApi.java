package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.StudyPlanRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.joda.time.DateTime;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudyplancontrollerApi {
  /**
   * createStudentStudyPlan
   * 
   * @param studyPlanReq studyPlanReq (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("nextmentee/studyPlan/create")
  Call<Object> createStudentStudyPlanUsingPOST(
    @Body StudyPlanRequest studyPlanReq, @Body SessionParams sessionParams
  );

  /**
   * fetchPrevNextResources
   * 
   * @param currentDate currentDate (required)
   * @param userId userId (required)
   * @param subjectId subjectId (required)
   * @param option option (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("nextmentee/studyPlan/resource/date/{currentDate}/getUsers/{userId}/subjectId/{subjectId}/option/{option}")
  Call<Object> fetchPrevNextResourcesUsingGET(
    @Path("currentDate") DateTime currentDate, @Path("userId") Long userId, @Path("subjectId") Long subjectId, @Path("option") String option
  );

  /**
   * fetchStudentStudyPlanResources
   * 
   * @param currentDate currentDate (required)
   * @param userId userId (required)
   * @param subjectId subjectId (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("nextmentee/studyPlan/resource/date/{currentDate}/getUsers/{userId}/subjectId/{subjectId}")
  Call<Object> fetchStudentStudyPlanResourcesUsingGET(
    @Path("currentDate") DateTime currentDate, @Path("userId") Long userId, @Path("subjectId") Long subjectId
  );

  /**
   * fetchStudentStudyPlans
   * 
   * @param syllabusId syllabusId (required)
   * @param userId userId (required)
   * @param subjectId subjectId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/studyPlan/syllabus/{syllabusId}/getUsers/{userId}/subjectId/{subjectId}")
  Call<ModelAndView> fetchStudentStudyPlansUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("userId") Long userId, @Path("subjectId") Long subjectId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Body SessionParams sessionParams
  );

  /**
   * showStudentStudyPlan
   * 
   * @param studyPlanUuid studyPlanUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/studyPlan/get/{studyPlanUuid}")
  Call<ModelAndView> showStudentStudyPlanUsingGET(
    @Path("studyPlanUuid") String studyPlanUuid
  );

}
