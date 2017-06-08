package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.AssessmentResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptAnswersResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.AssessmentsTagResponse;
import com.nexteducation.swagger.nextsws.model.ShortAssessmentWithSyllabusResponse;
import com.nexteducation.swagger.nextsws.model.UserAssessmentAttemptsResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptPercentileResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WsassessmentcontrollerApi {
  /**
   * createAssessment
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;AssessmentResponse&gt;
   */
  
  @GET("data/createAssessment")
  Call<AssessmentResponse> createAssessmentUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * fetchAssessmentDetail
   * 
   * @param assessmentUUID assessmentUUID (required)
   * @return Call&lt;Void&gt;
   */
  
  @GET("nextmentee/assessmentDetail/{assessmentUUID}.app")
  Call<Void> fetchAssessmentDetailUsingGET(
    @Path("assessmentUUID") String assessmentUUID
  );

  /**
   * getAnswersForAssessmentAttempt
   * 
   * @param assessmentUuid assessmentUuid (required)
   * @return Call&lt;List<AssessmentAttemptAnswersResponse>&gt;
   */
  
  @GET("data/getAssessmentAttemptAnswers/{assessmentUuid}")
  Call<List<AssessmentAttemptAnswersResponse>> getAnswersForAssessmentAttemptUsingGET(
    @Path("assessmentUuid") String assessmentUuid
  );

  /**
   * getAssessmentByChapterId
   * 
   * @param chapterId chapterId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/assessmentsByChapter")
  Call<ModelAndView> getAssessmentByChapterIdUsingGET(
    @Query("chapterId") Long chapterId
  );

  /**
   * getAssessmentByChapterUUID
   * 
   * @param chapterUUID chapterUUID (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;AssessmentsTagResponse&gt;
   */
  
  @GET("data/assessmentsByChapter/{chapterUUID}")
  Call<AssessmentsTagResponse> getAssessmentByChapterUUIDUsingGET(
    @Path("chapterUUID") String chapterUUID, @Body SessionParams sessionParams
  );

  /**
   * getAssessmentDetails
   * 
   * @param assessmentUUID assessmentUUID (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/assessmentDetail/{assessmentUUID}")
  Call<ModelAndView> getAssessmentDetailsUsingGET(
    @Path("assessmentUUID") String assessmentUUID, @Body SessionParams sessionParams
  );

  /**
   * getAssessmentPage
   * 
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param chapterId chapterId (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/assessment/{syllabusId}.app")
  Call<ModelAndView> getAssessmentPageUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("chapterId") Long chapterId, @Query("ifCustomChapter") Boolean ifCustomChapter, @Body SessionParams sessionParams
  );

  /**
   * getAssessmentTestPage
   * 
   * @param syllabusId syllabusId (required)
   * @param assessmentType assessmentType (required)
   * @param assessmentUUID assessmentUUID (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param chapterId chapterId (optional)
   * @param testPage testPage (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/assessment/{syllabusId}/{assessmentType}/{assessmentUUID}.app")
  Call<ModelAndView> getAssessmentTestPageUsingGET1(
    @Path("syllabusId") Long syllabusId, @Path("assessmentType") String assessmentType, @Path("assessmentUUID") String assessmentUUID, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("chapterId") Long chapterId, @Query("testPage") String testPage, @Body SessionParams sessionParams
  );

  /**
   * getAssessment
   * 
   * @param assessmentUUID assessmentUUID (required)
   * @return Call&lt;AssessmentResponse&gt;
   */
  
  @GET("data/assessmentDetail/{assessmentUUID}.app")
  Call<AssessmentResponse> getAssessmentUsingGET(
    @Path("assessmentUUID") String assessmentUUID
  );

  /**
   * getAssessmentsByChapter
   * 
   * @param chapterId chapterId (required)
   * @return Call&lt;List<AssessmentResponse>&gt;
   */
  
  @GET("data/assessments/{chapterId}")
  Call<List<AssessmentResponse>> getAssessmentsByChapterUsingGET(
    @Path("chapterId") Long chapterId
  );

  /**
   * getShortAssessment
   * 
   * @param syllabusId syllabusId (required)
   * @param assessmentUUID assessmentUUID (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param chapterId chapterId (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ShortAssessmentWithSyllabusResponse&gt;
   */
  
  @GET("data/shortAssessment/{syllabusId}/{assessmentUUID}.app")
  Call<ShortAssessmentWithSyllabusResponse> getShortAssessmentUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("assessmentUUID") String assessmentUUID, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("chapterId") Long chapterId, @Body SessionParams sessionParams
  );

  /**
   * getUserAssessmentAttempts
   * 
   * @param userId userId (required)
   * @param assessmentId assessmentId (optional)
   * @return Call&lt;List<UserAssessmentAttemptsResponse>&gt;
   */
  
  @GET("data/userAssessmentAttempts")
  Call<List<UserAssessmentAttemptsResponse>> getUserAssessmentAttemptsUsingGET(
    @Query("userId") Long userId, @Query("assessmentId") String assessmentId
  );

  /**
   * insertAssessmentAttempt
   * 
   * @param assessmentAttemptRequest assessmentAttemptRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;AssessmentAttemptResponse&gt;
   */
  
  @POST("data/insertAssessmentAttempt")
  Call<AssessmentAttemptResponse> insertAssessmentAttemptUsingPOST(
    @Body AssessmentAttemptRequest assessmentAttemptRequest, @Body SessionParams sessionParams
  );

  /**
   * insertQuestionAttempt
   * 
   * @param assessmentAttemptRequest assessmentAttemptRequest (required)
   * @return Call&lt;AssessmentAttemptResponse&gt;
   */
  
  @POST("data/insertQuestionAttempt")
  Call<AssessmentAttemptResponse> insertQuestionAttemptUsingPOST(
    @Body AssessmentAttemptRequest assessmentAttemptRequest
  );

  /**
   * sampleQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("twsAssessment")
  Call<ModelAndView> sampleQuestionUsingGET();
    

  /**
   * saveAssessmentAttempt
   * 
   * @param assessmentAttemptRequest assessmentAttemptRequest (required)
   * @param sessionParams sessionParams (optional)
   * @param queryable queryable (optional)
   * @return Call&lt;Void&gt;
   */


  /**
   * saveUserAssessmentAttempt
   * 
   * @param assessmentAttemptRequest assessmentAttemptRequest (required)
   * @param sessionParams sessionParams (optional)
   * @param queryable queryable (optional)
   * @return Call&lt;AssessmentAttemptPercentileResponse&gt;
   */


}
