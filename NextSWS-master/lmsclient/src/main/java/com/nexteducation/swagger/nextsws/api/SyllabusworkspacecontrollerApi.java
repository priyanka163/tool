package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.FilterRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SyllabusworkspacecontrollerApi {
  /**
   * getSyllabusAndResourceForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/studentPlan/syllabus/{syllabusId}/getChaptersWithReources")
  Call<Object> getSyllabusAndResourceForSyllabusUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Body SessionParams sessionParams
  );

  /**
   * getSyllabusForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/studentPlan/syllabus/{syllabusId}/getChapters")
  Call<Object> getSyllabusForSyllabusUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Body SessionParams sessionParams
  );

  /**
   * getSyllabusNodeResourcesForSyllabusNode
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param filterRequest filterRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/studentPlan/syllabus/{syllabusNodeId}/getSyllabusNodeReources")
  Call<Object> getSyllabusNodeResourcesForSyllabusNodeUsingPOST(
    @Path("syllabusNodeId") Long syllabusNodeId, @Body FilterRequest filterRequest, @Body SessionParams sessionParams
  );

}
