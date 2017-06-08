package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ResourceRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ResourceworkspacecontrollerApi {
  /**
   * getResourceResponse
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("data/studentPlan/resource/getDetailedResources")
  Call<Object> getResourceResponseUsingDELETE(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponse
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/studentPlan/resource/getDetailedResources")
  Call<Object> getResourceResponseUsingGET(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponse
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("data/studentPlan/resource/getDetailedResources")
  Call<Object> getResourceResponseUsingHEAD(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponse
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("data/studentPlan/resource/getDetailedResources")
  Call<Object> getResourceResponseUsingOPTIONS(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponse
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("data/studentPlan/resource/getDetailedResources")
  Call<Object> getResourceResponseUsingPATCH(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponse
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/studentPlan/resource/getDetailedResources")
  Call<Object> getResourceResponseUsingPOST(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponse
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PUT("data/studentPlan/resource/getDetailedResources")
  Call<Object> getResourceResponseUsingPUT(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponseV1
   * 
   * @param profileId profileId (required)
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/resources/details")
  Call<Object> getResourceResponseV1UsingDELETE(
    @Path("profileId") Long profileId, @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponseV1
   * 
   * @param profileId profileId (required)
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/v1/user/{profileId}/resources/details")
  Call<Object> getResourceResponseV1UsingGET(
    @Path("profileId") Long profileId, @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponseV1
   * 
   * @param profileId profileId (required)
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/resources/details")
  Call<Object> getResourceResponseV1UsingHEAD(
    @Path("profileId") Long profileId, @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponseV1
   * 
   * @param profileId profileId (required)
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/resources/details")
  Call<Object> getResourceResponseV1UsingOPTIONS(
    @Path("profileId") Long profileId, @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponseV1
   * 
   * @param profileId profileId (required)
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/resources/details")
  Call<Object> getResourceResponseV1UsingPATCH(
    @Path("profileId") Long profileId, @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponseV1
   * 
   * @param profileId profileId (required)
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/v1/user/{profileId}/resources/details")
  Call<Object> getResourceResponseV1UsingPOST(
    @Path("profileId") Long profileId, @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceResponseV1
   * 
   * @param profileId profileId (required)
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PUT("data/v1/user/{profileId}/resources/details")
  Call<Object> getResourceResponseV1UsingPUT(
    @Path("profileId") Long profileId, @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourcesUnderChapterForCategory
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/category/{category}/resources")
  Call<ModelAndView> getResourcesUnderChapterForCategoryUsingDELETE(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourcesUnderChapterForCategory
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/category/{category}/resources")
  Call<ModelAndView> getResourcesUnderChapterForCategoryUsingGET(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourcesUnderChapterForCategory
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/category/{category}/resources")
  Call<ModelAndView> getResourcesUnderChapterForCategoryUsingHEAD(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourcesUnderChapterForCategory
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/category/{category}/resources")
  Call<ModelAndView> getResourcesUnderChapterForCategoryUsingOPTIONS(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourcesUnderChapterForCategory
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/category/{category}/resources")
  Call<ModelAndView> getResourcesUnderChapterForCategoryUsingPATCH(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourcesUnderChapterForCategory
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/category/{category}/resources")
  Call<ModelAndView> getResourcesUnderChapterForCategoryUsingPOST(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourcesUnderChapterForCategory
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/category/{category}/resources")
  Call<ModelAndView> getResourcesUnderChapterForCategoryUsingPUT(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
