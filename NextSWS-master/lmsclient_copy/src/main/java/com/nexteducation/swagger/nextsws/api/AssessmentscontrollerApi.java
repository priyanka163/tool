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
  
  @DELETE("data/assessment/questions/{assessmentuuid}")
  Call<ShortAssessmentWOAnswerResponse> getAssessmentWOAnswersUsingDELETE(
    @Path("assessmentuuid") String assessmentuuid
  );

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
   * getAssessmentWOAnswers
   * 
   * @param assessmentuuid assessmentuuid (required)
   * @return Call&lt;ShortAssessmentWOAnswerResponse&gt;
   */
  
  @HEAD("data/assessment/questions/{assessmentuuid}")
  Call<ShortAssessmentWOAnswerResponse> getAssessmentWOAnswersUsingHEAD(
    @Path("assessmentuuid") String assessmentuuid
  );

  /**
   * getAssessmentWOAnswers
   * 
   * @param assessmentuuid assessmentuuid (required)
   * @return Call&lt;ShortAssessmentWOAnswerResponse&gt;
   */
  
  @OPTIONS("data/assessment/questions/{assessmentuuid}")
  Call<ShortAssessmentWOAnswerResponse> getAssessmentWOAnswersUsingOPTIONS(
    @Path("assessmentuuid") String assessmentuuid
  );

  /**
   * getAssessmentWOAnswers
   * 
   * @param assessmentuuid assessmentuuid (required)
   * @return Call&lt;ShortAssessmentWOAnswerResponse&gt;
   */
  
  @PATCH("data/assessment/questions/{assessmentuuid}")
  Call<ShortAssessmentWOAnswerResponse> getAssessmentWOAnswersUsingPATCH(
    @Path("assessmentuuid") String assessmentuuid
  );

  /**
   * getAssessmentWOAnswers
   * 
   * @param assessmentuuid assessmentuuid (required)
   * @return Call&lt;ShortAssessmentWOAnswerResponse&gt;
   */
  
  @POST("data/assessment/questions/{assessmentuuid}")
  Call<ShortAssessmentWOAnswerResponse> getAssessmentWOAnswersUsingPOST(
    @Path("assessmentuuid") String assessmentuuid
  );

  /**
   * getAssessmentWOAnswers
   * 
   * @param assessmentuuid assessmentuuid (required)
   * @return Call&lt;ShortAssessmentWOAnswerResponse&gt;
   */
  
  @PUT("data/assessment/questions/{assessmentuuid}")
  Call<ShortAssessmentWOAnswerResponse> getAssessmentWOAnswersUsingPUT(
    @Path("assessmentuuid") String assessmentuuid
  );

  /**
   * getAssessmentsBySyllabusAndFilter
   * 
   * @param syllabusId syllabusId (required)
   * @param assessmentFilterRequest assessmentFilterRequest (required)
   * @return Call&lt;List<AssessmentDetailResponse>&gt;
   */
  
  @DELETE("assessments/{syllabusId}")
  Call<List<AssessmentDetailResponse>> getAssessmentsBySyllabusAndFilterUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Body AssessmentFilterRequest assessmentFilterRequest
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
   * getAssessmentsBySyllabusAndFilter
   * 
   * @param syllabusId syllabusId (required)
   * @param assessmentFilterRequest assessmentFilterRequest (required)
   * @return Call&lt;List<AssessmentDetailResponse>&gt;
   */
  
  @HEAD("assessments/{syllabusId}")
  Call<List<AssessmentDetailResponse>> getAssessmentsBySyllabusAndFilterUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Body AssessmentFilterRequest assessmentFilterRequest
  );

  /**
   * getAssessmentsBySyllabusAndFilter
   * 
   * @param syllabusId syllabusId (required)
   * @param assessmentFilterRequest assessmentFilterRequest (required)
   * @return Call&lt;List<AssessmentDetailResponse>&gt;
   */
  
  @OPTIONS("assessments/{syllabusId}")
  Call<List<AssessmentDetailResponse>> getAssessmentsBySyllabusAndFilterUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Body AssessmentFilterRequest assessmentFilterRequest
  );

  /**
   * getAssessmentsBySyllabusAndFilter
   * 
   * @param syllabusId syllabusId (required)
   * @param assessmentFilterRequest assessmentFilterRequest (required)
   * @return Call&lt;List<AssessmentDetailResponse>&gt;
   */
  
  @PATCH("assessments/{syllabusId}")
  Call<List<AssessmentDetailResponse>> getAssessmentsBySyllabusAndFilterUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Body AssessmentFilterRequest assessmentFilterRequest
  );

  /**
   * getAssessmentsBySyllabusAndFilter
   * 
   * @param syllabusId syllabusId (required)
   * @param assessmentFilterRequest assessmentFilterRequest (required)
   * @return Call&lt;List<AssessmentDetailResponse>&gt;
   */
  
  @POST("assessments/{syllabusId}")
  Call<List<AssessmentDetailResponse>> getAssessmentsBySyllabusAndFilterUsingPOST(
    @Path("syllabusId") Long syllabusId, @Body AssessmentFilterRequest assessmentFilterRequest
  );

  /**
   * getAssessmentsBySyllabusAndFilter
   * 
   * @param syllabusId syllabusId (required)
   * @param assessmentFilterRequest assessmentFilterRequest (required)
   * @return Call&lt;List<AssessmentDetailResponse>&gt;
   */
  
  @PUT("assessments/{syllabusId}")
  Call<List<AssessmentDetailResponse>> getAssessmentsBySyllabusAndFilterUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssessmentTeacherResponse&gt;
   */
  
  @POST("data/questionsByBlueprint")
  Call<AssessmentTeacherResponse> getQuestionsByBluePrintUsingPOST(
    @Body AssessmentCriteriaRequest assessmentCriteriaRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveGeneratedAssessment
   * 
   * @param assessmentRequest assessmentRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssessmentResponse&gt;
   */
  
  @POST("data/saveAssessment")
  Call<AssessmentResponse> saveGeneratedAssessmentUsingPOST(
    @Body AssessmentRequest assessmentRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showAssessments
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("createAssessments")
  Call<ModelAndView> showAssessmentsUsingDELETE(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showAssessments
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("createAssessments")
  Call<ModelAndView> showAssessmentsUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showAssessments
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("createAssessments")
  Call<ModelAndView> showAssessmentsUsingHEAD(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showAssessments
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("createAssessments")
  Call<ModelAndView> showAssessmentsUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showAssessments
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("createAssessments")
  Call<ModelAndView> showAssessmentsUsingPATCH(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showAssessments
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("createAssessments")
  Call<ModelAndView> showAssessmentsUsingPOST(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showAssessments
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("createAssessments")
  Call<ModelAndView> showAssessmentsUsingPUT(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
