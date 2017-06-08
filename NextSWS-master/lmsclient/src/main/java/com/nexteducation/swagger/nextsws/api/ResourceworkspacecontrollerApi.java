package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ResourceRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/studentPlan/resource/getDetailedResources")
  Call<Object> getResourceResponseUsingGET(
    @Body ResourceRequest resourceRequest, @Body SessionParams sessionParams
  );

  /**
   * getResourceResponseV1
   * 
   * @param profileId profileId (required)
   * @param resourceRequest resourceRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/v1/user/{profileId}/resources/details")
  Call<Object> getResourceResponseV1UsingGET(
    @Path("profileId") Long profileId, @Body ResourceRequest resourceRequest, @Body SessionParams sessionParams
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/chapter/{chapterId}/category/{category}/resources")
  Call<ModelAndView> getResourcesUnderChapterForCategoryUsingGET(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Path("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Body SessionParams sessionParams
  );

}
