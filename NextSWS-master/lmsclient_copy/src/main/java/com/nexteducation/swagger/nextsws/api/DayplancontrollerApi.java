package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.TaskFetchRequest;
import com.nexteducation.swagger.nextsws.model.TaskResponse;
import com.nexteducation.swagger.nextsws.model.DayPlanResponse;
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @DELETE("data/teacherLecturesDetail")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesUsingDELETE(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLectures
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @GET("data/teacherLecturesDetail")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLectures
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @HEAD("data/teacherLecturesDetail")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesUsingHEAD(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLectures
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @OPTIONS("data/teacherLecturesDetail")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLectures
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @PATCH("data/teacherLecturesDetail")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesUsingPATCH(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLectures
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @POST("data/teacherLecturesDetail")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesUsingPOST(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLectures
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @PUT("data/teacherLecturesDetail")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesUsingPUT(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLecturesWithResource
   * 
   * @param isLecture isLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @DELETE("data/teacherLecturesDetailwithResource/{isLecture}")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesWithResourceUsingDELETE(
    @Path("isLecture") Boolean isLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLecturesWithResource
   * 
   * @param isLecture isLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @GET("data/teacherLecturesDetailwithResource/{isLecture}")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesWithResourceUsingGET(
    @Path("isLecture") Boolean isLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLecturesWithResource
   * 
   * @param isLecture isLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @HEAD("data/teacherLecturesDetailwithResource/{isLecture}")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesWithResourceUsingHEAD(
    @Path("isLecture") Boolean isLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLecturesWithResource
   * 
   * @param isLecture isLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @OPTIONS("data/teacherLecturesDetailwithResource/{isLecture}")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesWithResourceUsingOPTIONS(
    @Path("isLecture") Boolean isLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLecturesWithResource
   * 
   * @param isLecture isLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @PATCH("data/teacherLecturesDetailwithResource/{isLecture}")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesWithResourceUsingPATCH(
    @Path("isLecture") Boolean isLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLecturesWithResource
   * 
   * @param isLecture isLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @POST("data/teacherLecturesDetailwithResource/{isLecture}")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesWithResourceUsingPOST(
    @Path("isLecture") Boolean isLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCurrentUserTodaysLecturesWithResource
   * 
   * @param isLecture isLecture (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @PUT("data/teacherLecturesDetailwithResource/{isLecture}")
  Call<DayPlanResponse> getCurrentUserTodaysLecturesWithResourceUsingPUT(
    @Path("isLecture") Boolean isLecture, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanDetail
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureDetailResponse&gt;
   */
  
  @DELETE("data/learningPlanDetail/{classId}/{subjectId}/{sectionId}/{syllabusId}/{customSyllabus}")
  Call<LectureDetailResponse> getLearningPlanDetailUsingDELETE(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanDetail
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureDetailResponse&gt;
   */
  
  @GET("data/learningPlanDetail/{classId}/{subjectId}/{sectionId}/{syllabusId}/{customSyllabus}")
  Call<LectureDetailResponse> getLearningPlanDetailUsingGET(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanDetail
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureDetailResponse&gt;
   */
  
  @HEAD("data/learningPlanDetail/{classId}/{subjectId}/{sectionId}/{syllabusId}/{customSyllabus}")
  Call<LectureDetailResponse> getLearningPlanDetailUsingHEAD(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanDetail
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureDetailResponse&gt;
   */
  
  @OPTIONS("data/learningPlanDetail/{classId}/{subjectId}/{sectionId}/{syllabusId}/{customSyllabus}")
  Call<LectureDetailResponse> getLearningPlanDetailUsingOPTIONS(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanDetail
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureDetailResponse&gt;
   */
  
  @PATCH("data/learningPlanDetail/{classId}/{subjectId}/{sectionId}/{syllabusId}/{customSyllabus}")
  Call<LectureDetailResponse> getLearningPlanDetailUsingPATCH(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanDetail
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureDetailResponse&gt;
   */
  
  @POST("data/learningPlanDetail/{classId}/{subjectId}/{sectionId}/{syllabusId}/{customSyllabus}")
  Call<LectureDetailResponse> getLearningPlanDetailUsingPOST(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanDetail
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param syllabusId syllabusId (required)
   * @param subjectId subjectId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureDetailResponse&gt;
   */
  
  @PUT("data/learningPlanDetail/{classId}/{subjectId}/{sectionId}/{syllabusId}/{customSyllabus}")
  Call<LectureDetailResponse> getLearningPlanDetailUsingPUT(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("syllabusId") Long syllabusId, @Path("subjectId") Long subjectId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlanForDay
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @DELETE("data/getDayPlanDetail.app")
  Call<DayPlanResponse> getPlanForDayUsingDELETE(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlanForDay
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @GET("data/getDayPlanDetail.app")
  Call<DayPlanResponse> getPlanForDayUsingGET(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlanForDay
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @HEAD("data/getDayPlanDetail.app")
  Call<DayPlanResponse> getPlanForDayUsingHEAD(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlanForDay
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @OPTIONS("data/getDayPlanDetail.app")
  Call<DayPlanResponse> getPlanForDayUsingOPTIONS(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlanForDay
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @PATCH("data/getDayPlanDetail.app")
  Call<DayPlanResponse> getPlanForDayUsingPATCH(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlanForDay
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @POST("data/getDayPlanDetail.app")
  Call<DayPlanResponse> getPlanForDayUsingPOST(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlanForDay
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DayPlanResponse&gt;
   */
  
  @PUT("data/getDayPlanDetail.app")
  Call<DayPlanResponse> getPlanForDayUsingPUT(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getStudentStudyPlan
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;StudentStudyPlanResponse&gt;
   */
  
  @DELETE("data/getStudyPlanDetails.app")
  Call<StudentStudyPlanResponse> getStudentStudyPlanUsingDELETE(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getStudentStudyPlan
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;StudentStudyPlanResponse&gt;
   */
  
  @GET("data/getStudyPlanDetails.app")
  Call<StudentStudyPlanResponse> getStudentStudyPlanUsingGET(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getStudentStudyPlan
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;StudentStudyPlanResponse&gt;
   */
  
  @HEAD("data/getStudyPlanDetails.app")
  Call<StudentStudyPlanResponse> getStudentStudyPlanUsingHEAD(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getStudentStudyPlan
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;StudentStudyPlanResponse&gt;
   */
  
  @OPTIONS("data/getStudyPlanDetails.app")
  Call<StudentStudyPlanResponse> getStudentStudyPlanUsingOPTIONS(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getStudentStudyPlan
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;StudentStudyPlanResponse&gt;
   */
  
  @PATCH("data/getStudyPlanDetails.app")
  Call<StudentStudyPlanResponse> getStudentStudyPlanUsingPATCH(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getStudentStudyPlan
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;StudentStudyPlanResponse&gt;
   */
  
  @POST("data/getStudyPlanDetails.app")
  Call<StudentStudyPlanResponse> getStudentStudyPlanUsingPOST(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getStudentStudyPlan
   * 
   * @param dayPlanDTO dayPlanDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;StudentStudyPlanResponse&gt;
   */
  
  @PUT("data/getStudyPlanDetails.app")
  Call<StudentStudyPlanResponse> getStudentStudyPlanUsingPUT(
    @Body DayPlanDTO dayPlanDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * publishPlan
   * 
   * @param learningPlanId learningPlanId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/publishThePlan/{learningPlanId}")
  Call<ModelAndView> publishPlanUsingDELETE(
    @Path("learningPlanId") String learningPlanId
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
   * publishPlan
   * 
   * @param learningPlanId learningPlanId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/publishThePlan/{learningPlanId}")
  Call<ModelAndView> publishPlanUsingHEAD(
    @Path("learningPlanId") String learningPlanId
  );

  /**
   * publishPlan
   * 
   * @param learningPlanId learningPlanId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/publishThePlan/{learningPlanId}")
  Call<ModelAndView> publishPlanUsingOPTIONS(
    @Path("learningPlanId") String learningPlanId
  );

  /**
   * publishPlan
   * 
   * @param learningPlanId learningPlanId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/publishThePlan/{learningPlanId}")
  Call<ModelAndView> publishPlanUsingPATCH(
    @Path("learningPlanId") String learningPlanId
  );

  /**
   * publishPlan
   * 
   * @param learningPlanId learningPlanId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/publishThePlan/{learningPlanId}")
  Call<ModelAndView> publishPlanUsingPOST1(
    @Path("learningPlanId") String learningPlanId
  );

  /**
   * publishPlan
   * 
   * @param learningPlanId learningPlanId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/publishThePlan/{learningPlanId}")
  Call<ModelAndView> publishPlanUsingPUT(
    @Path("learningPlanId") String learningPlanId
  );

  /**
   * updateObjective
   * 
   * @param learningPlanId learningPlanId (required)
   * @param objective objective (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE(" data/updateObjective/{learningPlanId}/updateObjective/{objective}")
  Call<ModelAndView> updateObjectiveUsingDELETE(
    @Path("learningPlanId") String learningPlanId, @Path("objective") String objective
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
   * updateObjective
   * 
   * @param learningPlanId learningPlanId (required)
   * @param objective objective (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD(" data/updateObjective/{learningPlanId}/updateObjective/{objective}")
  Call<ModelAndView> updateObjectiveUsingHEAD(
    @Path("learningPlanId") String learningPlanId, @Path("objective") String objective
  );

  /**
   * updateObjective
   * 
   * @param learningPlanId learningPlanId (required)
   * @param objective objective (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS(" data/updateObjective/{learningPlanId}/updateObjective/{objective}")
  Call<ModelAndView> updateObjectiveUsingOPTIONS(
    @Path("learningPlanId") String learningPlanId, @Path("objective") String objective
  );

  /**
   * updateObjective
   * 
   * @param learningPlanId learningPlanId (required)
   * @param objective objective (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH(" data/updateObjective/{learningPlanId}/updateObjective/{objective}")
  Call<ModelAndView> updateObjectiveUsingPATCH(
    @Path("learningPlanId") String learningPlanId, @Path("objective") String objective
  );

  /**
   * updateObjective
   * 
   * @param learningPlanId learningPlanId (required)
   * @param objective objective (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST(" data/updateObjective/{learningPlanId}/updateObjective/{objective}")
  Call<ModelAndView> updateObjectiveUsingPOST(
    @Path("learningPlanId") String learningPlanId, @Path("objective") String objective
  );

  /**
   * updateObjective
   * 
   * @param learningPlanId learningPlanId (required)
   * @param objective objective (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT(" data/updateObjective/{learningPlanId}/updateObjective/{objective}")
  Call<ModelAndView> updateObjectiveUsingPUT(
    @Path("learningPlanId") String learningPlanId, @Path("objective") String objective
  );

  /**
   * updateResourceCategory
   * 
   * @param id id (required)
   * @param value value (required)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/updateResourceCategory/{id}/{value}")
  Call<Void> updateResourceCategoryUsingDELETE(
    @Path("id") String id, @Path("value") String value
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

  /**
   * updateResourceCategory
   * 
   * @param id id (required)
   * @param value value (required)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/updateResourceCategory/{id}/{value}")
  Call<Void> updateResourceCategoryUsingHEAD(
    @Path("id") String id, @Path("value") String value
  );

  /**
   * updateResourceCategory
   * 
   * @param id id (required)
   * @param value value (required)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/updateResourceCategory/{id}/{value}")
  Call<Void> updateResourceCategoryUsingOPTIONS(
    @Path("id") String id, @Path("value") String value
  );

  /**
   * updateResourceCategory
   * 
   * @param id id (required)
   * @param value value (required)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/updateResourceCategory/{id}/{value}")
  Call<Void> updateResourceCategoryUsingPATCH(
    @Path("id") String id, @Path("value") String value
  );

  /**
   * updateResourceCategory
   * 
   * @param id id (required)
   * @param value value (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/updateResourceCategory/{id}/{value}")
  Call<Void> updateResourceCategoryUsingPOST(
    @Path("id") String id, @Path("value") String value
  );

  /**
   * updateResourceCategory
   * 
   * @param id id (required)
   * @param value value (required)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/updateResourceCategory/{id}/{value}")
  Call<Void> updateResourceCategoryUsingPUT(
    @Path("id") String id, @Path("value") String value
  );

}
