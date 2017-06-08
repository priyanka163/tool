package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ShortAssessmentWOAnswerResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentFilterRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentDetailResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentResourceResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentCriteriaRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentTeacherResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.AssessmentResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AssessmentscontrollerApi {
  /**
   * getAssessmentTypes
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @GET("data/assessmentTypes")
  Call<List<String>> getAssessmentTypesUsingGET();
    

  /**
   * getAssessmentWOAnswers
   * 
   * @param assessmentuuid assessmentuuid (required)
   * @return Call&lt;ShortAssessmentWOAnswerResponse&gt;
   */
  
  @GET("data/assessment/questions/{assessmentuuid}")
  Call<ShortAssessmentWOAnswerResponse> getAssessmentWOAnswersUsingGET(
    @Path("assessmentuuid") String assessmentuuid
  );

  /**
   * getAssessmentsBySyllabusAndFilter
   * 
   * @param syllabusId syllabusId (required)
   * @param assessmentFilterRequest assessmentFilterRequest (required)
   * @return Call&lt;List<AssessmentDetailResponse>&gt;
   */
  
  @GET("assessments/{syllabusId}")
  Call<List<AssessmentDetailResponse>> getAssessmentsBySyllabusAndFilterUsingGET(
    @Path("syllabusId") Long syllabusId, @Body AssessmentFilterRequest assessmentFilterRequest
  );

  /**
   * getAssessments
   * 
   * @param syllabusId syllabusId (required)
   * @return Call&lt;List<AssessmentResourceResponse>&gt;
   */
  
  @GET("data/getAssessments/{syllabusId}")
  Call<List<AssessmentResourceResponse>> getAssessmentsUsingGET(
    @Path("syllabusId") Long syllabusId
  );

  /**
   * getBloomsTaxonomies
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @GET("data/bloomsTaxonomies")
  Call<List<String>> getBloomsTaxonomiesUsingGET();
    

  /**
   * getDifficultyLevels
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @GET("data/difficultyLevels")
  Call<List<String>> getDifficultyLevelsUsingGET();
    

  /**
   * getQuestionTypologies
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @GET("data/questionTypologies")
  Call<List<String>> getQuestionTypologiesUsingGET();
    

  /**
   * getQuestionsByBluePrint
   * 
   * @param assessmentCriteriaRequest assessmentCriteriaRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;AssessmentTeacherResponse&gt;
   */
  
  @POST("data/questionsByBlueprint")
  Call<AssessmentTeacherResponse> getQuestionsByBluePrintUsingPOST(
    @Body AssessmentCriteriaRequest assessmentCriteriaRequest, @Body SessionParams sessionParams
  );

  /**
   * saveGeneratedAssessment
   * 
   * @param assessmentRequest assessmentRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;AssessmentResponse&gt;
   */
  
  @POST("data/saveAssessment")
  Call<AssessmentResponse> saveGeneratedAssessmentUsingPOST(
    @Body AssessmentRequest assessmentRequest, @Body SessionParams sessionParams
  );

  /**
   * showAssessments
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("createAssessments")
  Call<ModelAndView> showAssessmentsUsingGET(
    @Body SessionParams sessionParams
  );

}
