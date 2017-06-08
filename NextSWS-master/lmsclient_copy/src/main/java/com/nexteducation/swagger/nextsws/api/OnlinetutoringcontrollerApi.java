package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OnlinetutoringcontrollerApi {
  /**
   * getOnlineLectures
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentee/subject/{syllabusId}/chapter/{chapterId}/onlineTutoring.app")
  Call<ModelAndView> getOnlineLecturesUsingDELETE(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOnlineLectures
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/chapter/{chapterId}/onlineTutoring.app")
  Call<ModelAndView> getOnlineLecturesUsingGET(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOnlineLectures
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentee/subject/{syllabusId}/chapter/{chapterId}/onlineTutoring.app")
  Call<ModelAndView> getOnlineLecturesUsingHEAD(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOnlineLectures
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentee/subject/{syllabusId}/chapter/{chapterId}/onlineTutoring.app")
  Call<ModelAndView> getOnlineLecturesUsingOPTIONS(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOnlineLectures
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentee/subject/{syllabusId}/chapter/{chapterId}/onlineTutoring.app")
  Call<ModelAndView> getOnlineLecturesUsingPATCH(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOnlineLectures
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/subject/{syllabusId}/chapter/{chapterId}/onlineTutoring.app")
  Call<ModelAndView> getOnlineLecturesUsingPOST(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getOnlineLectures
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentee/subject/{syllabusId}/chapter/{chapterId}/onlineTutoring.app")
  Call<ModelAndView> getOnlineLecturesUsingPUT(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
