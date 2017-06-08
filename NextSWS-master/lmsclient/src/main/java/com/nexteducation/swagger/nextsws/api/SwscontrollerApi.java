package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.SyllabusResponseV2;
import com.nexteducation.swagger.nextsws.model.SubjectAndSyllabusResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanRequest;
import com.nexteducation.swagger.nextsws.model.LearningPlanDayWiseResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanDetailResponse;
import com.nexteducation.swagger.nextsws.model.CollectionLearningPlanDetailResponse;
import com.nexteducation.swagger.nextsws.model.ScheduleResponse;
import com.nexteducation.swagger.nextsws.model.ScheduleRequest;
import com.nexteducation.swagger.nextsws.model.StudyPlanDetailResponse;
import com.nexteducation.swagger.nextsws.model.StudyPlanRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SwscontrollerApi {
  /**
   * documentViewer
   * 
   * @param syllabusId syllabusId (required)
   * @param resourceUUID resourceUUID (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param chapterId chapterId (optional)
   * @param resourceLocation resourceLocation (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/documentViewer.app")
  Call<ModelAndView> documentViewerUsingGET1(
    @Query("syllabusId") Long syllabusId, @Query("resourceUUID") String resourceUUID, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("chapterId") Long chapterId, @Query("resourceLocation") String resourceLocation, @Body SessionParams sessionParams
  );

  /**
   * fetchChapters
   * 
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @GET("data/fetchSyllabus/{syllabusId}/fetchChapters")
  Call<SyllabusResponseV2> fetchChaptersUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Body SessionParams sessionParams
  );

  /**
   * fetchSyllabus
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @GET("data/fetchSyllabus")
  Call<List<SubjectAndSyllabusResponse>> fetchSyllabusUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getChapterLevelPage
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/chapters.app")
  Call<ModelAndView> getChapterLevelPageUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("schoolSubjectName") String schoolSubjectName, @Body SessionParams sessionParams
  );

  /**
   * getChapterPage
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param subjectName subjectName (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/chapter/{chapterId}.app")
  Call<ModelAndView> getChapterPageUsingGET(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("subjectName") String subjectName, @Query("schoolSubjectName") String schoolSubjectName, @Body SessionParams sessionParams
  );

  /**
   * getChapterWithResourceCount
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/chaptersWithResourceCount/{category}")
  Call<ModelAndView> getChapterWithResourceCountUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("schoolSubjectName") String schoolSubjectName, @Body SessionParams sessionParams
  );

  /**
   * getDayWisePlan
   * 
   * @param learningPlanRequest LearningPlanRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;LearningPlanDayWiseResponse&gt;
   */
  
  @POST("data/getDayWisePlan")
  Call<LearningPlanDayWiseResponse> getDayWisePlanUsingPOST(
    @Body LearningPlanRequest learningPlanRequest, @Body SessionParams sessionParams
  );

  /**
   * getDetailLearningplanHome
   * 
   * @param learningPlanRequest LearningPlanRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<LearningPlanDetailResponse>&gt;
   */
  
  @POST("data/getLearningPlan/home")
  Call<List<LearningPlanDetailResponse>> getDetailLearningplanHomeUsingPOST(
    @Body LearningPlanRequest learningPlanRequest, @Body SessionParams sessionParams
  );

  /**
   * getDetailLearningplan
   * 
   * @param learningPlanRequest LearningPlanRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<LearningPlanDetailResponse>&gt;
   */
  
  @POST("data/getLearningPlan/detail")
  Call<List<LearningPlanDetailResponse>> getDetailLearningplanUsingPOST(
    @Body LearningPlanRequest learningPlanRequest, @Body SessionParams sessionParams
  );

  /**
   * getJsonForshowHome
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/studentWorkspaceJson")
  Call<ModelAndView> getJsonForshowHomeUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getLearningPlansByCriteriaWithResourcesAndCompletion
   * 
   * @param learningPlanRequest learningPlanRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;CollectionLearningPlanDetailResponse&gt;
   */
  
  @POST("data/getLearningPlanWithResources")
  Call<CollectionLearningPlanDetailResponse> getLearningPlansByCriteriaWithResourcesAndCompletionUsingPOST(
    @Body LearningPlanRequest learningPlanRequest, @Body SessionParams sessionParams
  );

  /**
   * getLearningPlanswithChapterDetails
   * 
   * @param learningPlanRequest LearningPlanRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<LearningPlanDetailResponse>&gt;
   */
  
  @POST("data/getLearningPlan/learningPlanswithChapterDetails")
  Call<List<LearningPlanDetailResponse>> getLearningPlanswithChapterDetailsUsingPOST(
    @Body LearningPlanRequest learningPlanRequest, @Body SessionParams sessionParams
  );

  /**
   * getPastCurrentAndFutureScheduleOfLecture
   * 
   * @param scheduleRequest scheduleRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ScheduleResponse&gt;
   */
  
  @POST("data/getPastCurrentAndFutureScheduleOfLecture")
  Call<ScheduleResponse> getPastCurrentAndFutureScheduleOfLectureUsingPOST(
    @Body ScheduleRequest scheduleRequest, @Body SessionParams sessionParams
  );

  /**
   * getStudyPlanWithLearningPlanDetailWithOutResources
   * 
   * @param studyPlanRequest studyPlanRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<StudyPlanDetailResponse>&gt;
   */
  
  @POST("data/getStudyPlanWithLearningPlanWithOutResources")
  Call<List<StudyPlanDetailResponse>> getStudyPlanWithLearningPlanDetailWithOutResourcesUsingPOST(
    @Body StudyPlanRequest studyPlanRequest, @Body SessionParams sessionParams
  );

  /**
   * getStudyPlanWithLearningPlanDetails
   * 
   * @param studyPlanRequest studyPlanRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<StudyPlanDetailResponse>&gt;
   */
  
  @POST("data/getStudyPlanWithLearningPlan")
  Call<List<StudyPlanDetailResponse>> getStudyPlanWithLearningPlanDetailsUsingPOST(
    @Body StudyPlanRequest studyPlanRequest, @Body SessionParams sessionParams
  );

  /**
   * getSubjectProjects
   * 
   * @param syllabusId syllabusId (required)
   * @param subjectName subjectName (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/projects.app")
  Call<ModelAndView> getSubjectProjectsUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("subjectName") String subjectName, @Query("schoolSubjectName") String schoolSubjectName, @Body SessionParams sessionParams
  );

  /**
   * showHome
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("studentWorkspace")
  Call<ModelAndView> showHomeUsingGET1(
    @Body SessionParams sessionParams
  );

}
