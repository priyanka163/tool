package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.WeeklySummaryRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SwssummarycontrollerApi {
  /**
   * getCategoryBasedChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/categoryUsageSummary")
  Call<ModelAndView> getCategoryBasedChapterUsageReportUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCategoryBasedChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/categoryUsageSummary")
  Call<ModelAndView> getCategoryBasedChapterUsageReportUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCategoryBasedChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/categoryUsageSummary")
  Call<ModelAndView> getCategoryBasedChapterUsageReportUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCategoryBasedChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/categoryUsageSummary")
  Call<ModelAndView> getCategoryBasedChapterUsageReportUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCategoryBasedChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/categoryUsageSummary")
  Call<ModelAndView> getCategoryBasedChapterUsageReportUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCategoryBasedChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/categoryUsageSummary")
  Call<ModelAndView> getCategoryBasedChapterUsageReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCategoryBasedChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/categoryUsageSummary")
  Call<ModelAndView> getCategoryBasedChapterUsageReportUsingPUT(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/usageSummary")
  Call<ModelAndView> getChapterUsageReportUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/usageSummary")
  Call<ModelAndView> getChapterUsageReportUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/usageSummary")
  Call<ModelAndView> getChapterUsageReportUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/usageSummary")
  Call<ModelAndView> getChapterUsageReportUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/usageSummary")
  Call<ModelAndView> getChapterUsageReportUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/usageSummary")
  Call<ModelAndView> getChapterUsageReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/usageSummary")
  Call<ModelAndView> getChapterUsageReportUsingPUT(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/weeklySummary")
  Call<ModelAndView> getChapterWeeklyReportUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/weeklySummary")
  Call<ModelAndView> getChapterWeeklyReportUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/weeklySummary")
  Call<ModelAndView> getChapterWeeklyReportUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/weeklySummary")
  Call<ModelAndView> getChapterWeeklyReportUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/weeklySummary")
  Call<ModelAndView> getChapterWeeklyReportUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/weeklySummary")
  Call<ModelAndView> getChapterWeeklyReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param chapterId chapterId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/weeklySummary")
  Call<ModelAndView> getChapterWeeklyReportUsingPUT(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallUsageReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/overallUsageSummary")
  Call<ModelAndView> getOverallUsageReportUsingDELETE(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallUsageReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/v1/user/{profileId}/overallUsageSummary")
  Call<ModelAndView> getOverallUsageReportUsingGET(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallUsageReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/overallUsageSummary")
  Call<ModelAndView> getOverallUsageReportUsingHEAD(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallUsageReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/overallUsageSummary")
  Call<ModelAndView> getOverallUsageReportUsingOPTIONS(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallUsageReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/overallUsageSummary")
  Call<ModelAndView> getOverallUsageReportUsingPATCH(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallUsageReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/overallUsageSummary")
  Call<ModelAndView> getOverallUsageReportUsingPOST(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallUsageReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/v1/user/{profileId}/overallUsageSummary")
  Call<ModelAndView> getOverallUsageReportUsingPUT(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallWeeklyReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/overallWeeklySummary")
  Call<ModelAndView> getOverallWeeklyReportUsingDELETE(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallWeeklyReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/v1/user/{profileId}/overallWeeklySummary")
  Call<ModelAndView> getOverallWeeklyReportUsingGET(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallWeeklyReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/overallWeeklySummary")
  Call<ModelAndView> getOverallWeeklyReportUsingHEAD(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallWeeklyReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/overallWeeklySummary")
  Call<ModelAndView> getOverallWeeklyReportUsingOPTIONS(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallWeeklyReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/overallWeeklySummary")
  Call<ModelAndView> getOverallWeeklyReportUsingPATCH(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallWeeklyReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/overallWeeklySummary")
  Call<ModelAndView> getOverallWeeklyReportUsingPOST(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOverallWeeklyReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/v1/user/{profileId}/overallWeeklySummary")
  Call<ModelAndView> getOverallWeeklyReportUsingPUT(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/syllabus/{syllabusId}/usageSummary")
  Call<ModelAndView> getSyllabusUsageReportUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/usageSummary")
  Call<ModelAndView> getSyllabusUsageReportUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/syllabus/{syllabusId}/usageSummary")
  Call<ModelAndView> getSyllabusUsageReportUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/syllabus/{syllabusId}/usageSummary")
  Call<ModelAndView> getSyllabusUsageReportUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/syllabus/{syllabusId}/usageSummary")
  Call<ModelAndView> getSyllabusUsageReportUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/usageSummary")
  Call<ModelAndView> getSyllabusUsageReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/v1/user/{profileId}/syllabus/{syllabusId}/usageSummary")
  Call<ModelAndView> getSyllabusUsageReportUsingPUT(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/syllabus/{syllabusId}/weeklySummary")
  Call<ModelAndView> getSyllabusWeeklyReportUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/weeklySummary")
  Call<ModelAndView> getSyllabusWeeklyReportUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/syllabus/{syllabusId}/weeklySummary")
  Call<ModelAndView> getSyllabusWeeklyReportUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/syllabus/{syllabusId}/weeklySummary")
  Call<ModelAndView> getSyllabusWeeklyReportUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/syllabus/{syllabusId}/weeklySummary")
  Call<ModelAndView> getSyllabusWeeklyReportUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/weeklySummary")
  Call<ModelAndView> getSyllabusWeeklyReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/v1/user/{profileId}/syllabus/{syllabusId}/weeklySummary")
  Call<ModelAndView> getSyllabusWeeklyReportUsingPUT(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
