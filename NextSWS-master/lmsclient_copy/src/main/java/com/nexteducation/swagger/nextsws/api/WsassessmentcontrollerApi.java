package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.AssessmentResponse;
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssessmentResponse&gt;
   */
  
  @GET("data/createAssessment")
  Call<AssessmentResponse> createAssessmentUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssessmentsTagResponse&gt;
   */
  
  @GET("data/assessmentsByChapter/{chapterUUID}")
  Call<AssessmentsTagResponse> getAssessmentByChapterUUIDUsingGET(
    @Path("chapterUUID") String chapterUUID, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAssessmentDetails
   * 
   * @param assessmentUUID assessmentUUID (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/assessmentDetail/{assessmentUUID}")
  Call<ModelAndView> getAssessmentDetailsUsingGET(
    @Path("assessmentUUID") String assessmentUUID, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAssessmentPage
   * 
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param chapterId chapterId (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/assessment/{syllabusId}.app")
  Call<ModelAndView> getAssessmentPageUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("chapterId") Long chapterId, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/assessment/{syllabusId}/{assessmentType}/{assessmentUUID}.app")
  Call<ModelAndView> getAssessmentTestPageUsingGET1(
    @Path("syllabusId") Long syllabusId, @Path("assessmentType") String assessmentType, @Path("assessmentUUID") String assessmentUUID, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("chapterId") Long chapterId, @Query("testPage") String testPage, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ShortAssessmentWithSyllabusResponse&gt;
   */
  
  @GET("data/shortAssessment/{syllabusId}/{assessmentUUID}.app")
  Call<ShortAssessmentWithSyllabusResponse> getShortAssessmentUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("assessmentUUID") String assessmentUUID, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssessmentAttemptResponse&gt;
   */
  
  @POST("data/insertAssessmentAttempt")
  Call<AssessmentAttemptResponse> insertAssessmentAttemptUsingPOST(
    @Body AssessmentAttemptRequest assessmentAttemptRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
  
  @DELETE("twsAssessment")
  Call<ModelAndView> sampleQuestionUsingDELETE();
    

  /**
   * sampleQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("twsAssessment")
  Call<ModelAndView> sampleQuestionUsingGET();
    

  /**
   * sampleQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("twsAssessment")
  Call<ModelAndView> sampleQuestionUsingHEAD();
    

  /**
   * sampleQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("twsAssessment")
  Call<ModelAndView> sampleQuestionUsingOPTIONS();
    

  /**
   * sampleQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("twsAssessment")
  Call<ModelAndView> sampleQuestionUsingPATCH();
    

  /**
   * sampleQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("twsAssessment")
  Call<ModelAndView> sampleQuestionUsingPOST();
    

  /**
   * sampleQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("twsAssessment")
  Call<ModelAndView> sampleQuestionUsingPUT();
    

  /**
   * saveAssessmentAttempt
   * 
   * @param assessmentAttemptRequest assessmentAttemptRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("nextmentee/saveAssessmentAttempt.app")
  Call<Void> saveAssessmentAttemptUsingPOST(
    @Body AssessmentAttemptRequest assessmentAttemptRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId, @Query("sortBy") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("pageSize") Integer pageSize, @Query("select") String select
  );

  /**
   * saveUserAssessmentAttempt
   * 
   * @param assessmentAttemptRequest assessmentAttemptRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;AssessmentAttemptPercentileResponse&gt;
   */
  
  @POST("data/saveUserAssessmentAttempt.app")
  Call<AssessmentAttemptPercentileResponse> saveUserAssessmentAttemptUsingPOST(
    @Body AssessmentAttemptRequest assessmentAttemptRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId, @Query("sortBy") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("pageSize") Integer pageSize, @Query("select") String select
  );

}
