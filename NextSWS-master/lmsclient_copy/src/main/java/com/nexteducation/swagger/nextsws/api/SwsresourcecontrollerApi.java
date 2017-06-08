package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.UserResourceResponseV3;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SwsresourcecontrollerApi {
  /**
   * getInternalRecommendation
   * 
   * @param category category (required)
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param start start (optional)
   * @param end end (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponseV3>&gt;
   */
  
  @DELETE("data/internalRecommendation")
  Call<List<UserResourceResponseV3>> getInternalRecommendationUsingDELETE(
    @Query("category") String category, @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("start") Integer start, @Query("end") Integer end, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getInternalRecommendation
   * 
   * @param category category (required)
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param start start (optional)
   * @param end end (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponseV3>&gt;
   */
  
  @GET("data/internalRecommendation")
  Call<List<UserResourceResponseV3>> getInternalRecommendationUsingGET(
    @Query("category") String category, @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("start") Integer start, @Query("end") Integer end, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getInternalRecommendation
   * 
   * @param category category (required)
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param start start (optional)
   * @param end end (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponseV3>&gt;
   */
  
  @HEAD("data/internalRecommendation")
  Call<List<UserResourceResponseV3>> getInternalRecommendationUsingHEAD(
    @Query("category") String category, @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("start") Integer start, @Query("end") Integer end, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getInternalRecommendation
   * 
   * @param category category (required)
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param start start (optional)
   * @param end end (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponseV3>&gt;
   */
  
  @OPTIONS("data/internalRecommendation")
  Call<List<UserResourceResponseV3>> getInternalRecommendationUsingOPTIONS(
    @Query("category") String category, @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("start") Integer start, @Query("end") Integer end, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getInternalRecommendation
   * 
   * @param category category (required)
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param start start (optional)
   * @param end end (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponseV3>&gt;
   */
  
  @PATCH("data/internalRecommendation")
  Call<List<UserResourceResponseV3>> getInternalRecommendationUsingPATCH(
    @Query("category") String category, @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("start") Integer start, @Query("end") Integer end, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getInternalRecommendation
   * 
   * @param category category (required)
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param start start (optional)
   * @param end end (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponseV3>&gt;
   */
  
  @POST("data/internalRecommendation")
  Call<List<UserResourceResponseV3>> getInternalRecommendationUsingPOST(
    @Query("category") String category, @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("start") Integer start, @Query("end") Integer end, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getInternalRecommendation
   * 
   * @param category category (required)
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param start start (optional)
   * @param end end (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponseV3>&gt;
   */
  
  @PUT("data/internalRecommendation")
  Call<List<UserResourceResponseV3>> getInternalRecommendationUsingPUT(
    @Query("category") String category, @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("start") Integer start, @Query("end") Integer end, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getMindMapsOptions
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
  
  @DELETE("nextmentee/subject/{syllabusId}/chapter/{chapterId}/mindMapsOptions.app")
  Call<ModelAndView> getMindMapsOptionsUsingDELETE(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getMindMapsOptions
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
  
  @GET("nextmentee/subject/{syllabusId}/chapter/{chapterId}/mindMapsOptions.app")
  Call<ModelAndView> getMindMapsOptionsUsingGET(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getMindMapsOptions
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
  
  @HEAD("nextmentee/subject/{syllabusId}/chapter/{chapterId}/mindMapsOptions.app")
  Call<ModelAndView> getMindMapsOptionsUsingHEAD(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getMindMapsOptions
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
  
  @OPTIONS("nextmentee/subject/{syllabusId}/chapter/{chapterId}/mindMapsOptions.app")
  Call<ModelAndView> getMindMapsOptionsUsingOPTIONS(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getMindMapsOptions
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
  
  @PATCH("nextmentee/subject/{syllabusId}/chapter/{chapterId}/mindMapsOptions.app")
  Call<ModelAndView> getMindMapsOptionsUsingPATCH(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getMindMapsOptions
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
  
  @POST("nextmentee/subject/{syllabusId}/chapter/{chapterId}/mindMapsOptions.app")
  Call<ModelAndView> getMindMapsOptionsUsingPOST(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getMindMapsOptions
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
  
  @PUT("nextmentee/subject/{syllabusId}/chapter/{chapterId}/mindMapsOptions.app")
  Call<ModelAndView> getMindMapsOptionsUsingPUT(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlayer
   * 
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param category category (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentee/rPlayer.app")
  Call<ModelAndView> getPlayerUsingDELETE(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlayer
   * 
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param category category (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/rPlayer.app")
  Call<ModelAndView> getPlayerUsingGET(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlayer
   * 
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param category category (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentee/rPlayer.app")
  Call<ModelAndView> getPlayerUsingHEAD(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlayer
   * 
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param category category (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentee/rPlayer.app")
  Call<ModelAndView> getPlayerUsingOPTIONS(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlayer
   * 
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param category category (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentee/rPlayer.app")
  Call<ModelAndView> getPlayerUsingPATCH(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlayer
   * 
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param category category (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/rPlayer.app")
  Call<ModelAndView> getPlayerUsingPOST(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getPlayer
   * 
   * @param resourceUuid resourceUuid (required)
   * @param chapterId chapterId (optional)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param category category (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentee/rPlayer.app")
  Call<ModelAndView> getPlayerUsingPUT(
    @Query("resourceUuid") String resourceUuid, @Query("chapterId") Long chapterId, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("category") String category, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourecListPlayerPage
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resourcesOnPlayer.app")
  Call<ModelAndView> getResourecListPlayerPageUsingDELETE(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourecListPlayerPage
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resourcesOnPlayer.app")
  Call<ModelAndView> getResourecListPlayerPageUsingGET(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourecListPlayerPage
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resourcesOnPlayer.app")
  Call<ModelAndView> getResourecListPlayerPageUsingHEAD(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourecListPlayerPage
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resourcesOnPlayer.app")
  Call<ModelAndView> getResourecListPlayerPageUsingOPTIONS(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourecListPlayerPage
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resourcesOnPlayer.app")
  Call<ModelAndView> getResourecListPlayerPageUsingPATCH(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourecListPlayerPage
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resourcesOnPlayer.app")
  Call<ModelAndView> getResourecListPlayerPageUsingPOST(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourecListPlayerPage
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param sectionType sectionType (optional)
   * @param module module (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentee/subject/{syllabusId}/chapter/{chapterId}/resourcesOnPlayer.app")
  Call<ModelAndView> getResourecListPlayerPageUsingPUT(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("sectionType") String sectionType, @Query("module") String module, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showAVAidsOptions
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterId chapterId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentee/audioVisualOptions")
  Call<ModelAndView> showAVAidsOptionsUsingDELETE(
    @Query("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterId") Long chapterId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter
  );

  /**
   * showAVAidsOptions
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterId chapterId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/audioVisualOptions")
  Call<ModelAndView> showAVAidsOptionsUsingGET(
    @Query("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterId") Long chapterId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter
  );

  /**
   * showAVAidsOptions
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterId chapterId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentee/audioVisualOptions")
  Call<ModelAndView> showAVAidsOptionsUsingHEAD(
    @Query("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterId") Long chapterId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter
  );

  /**
   * showAVAidsOptions
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterId chapterId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentee/audioVisualOptions")
  Call<ModelAndView> showAVAidsOptionsUsingOPTIONS(
    @Query("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterId") Long chapterId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter
  );

  /**
   * showAVAidsOptions
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterId chapterId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentee/audioVisualOptions")
  Call<ModelAndView> showAVAidsOptionsUsingPATCH(
    @Query("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterId") Long chapterId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter
  );

  /**
   * showAVAidsOptions
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterId chapterId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/audioVisualOptions")
  Call<ModelAndView> showAVAidsOptionsUsingPOST(
    @Query("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterId") Long chapterId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter
  );

  /**
   * showAVAidsOptions
   * 
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param chapterId chapterId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentee/audioVisualOptions")
  Call<ModelAndView> showAVAidsOptionsUsingPUT(
    @Query("syllabusId") Long syllabusId, @Query("category") String category, @Query("chapterId") Long chapterId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter
  );

}
