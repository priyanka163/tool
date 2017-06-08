package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.WeeklySummaryRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;

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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/categoryUsageSummary")
  Call<ModelAndView> getCategoryBasedChapterUsageReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Body SessionParams sessionParams
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/usageSummary")
  Call<ModelAndView> getChapterUsageReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Body SessionParams sessionParams
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/weeklySummary")
  Call<ModelAndView> getChapterWeeklyReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("chapterId") Long chapterId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Body SessionParams sessionParams
  );

  /**
   * getOverallUsageReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/overallUsageSummary")
  Call<ModelAndView> getOverallUsageReportUsingPOST(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Body SessionParams sessionParams
  );

  /**
   * getOverallWeeklyReport
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/overallWeeklySummary")
  Call<ModelAndView> getOverallWeeklyReportUsingPOST(
    @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Body SessionParams sessionParams
  );

  /**
   * getSyllabusUsageReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/usageSummary")
  Call<ModelAndView> getSyllabusUsageReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Body SessionParams sessionParams
  );

  /**
   * getSyllabusWeeklyReport
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param request request (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/weeklySummary")
  Call<ModelAndView> getSyllabusWeeklyReportUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Body WeeklySummaryRequest request, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Body SessionParams sessionParams
  );

}
