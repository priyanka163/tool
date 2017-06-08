package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SubjectTeacherResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SubjectteachercontrollerApi {
  /**
   * getsubjectTeacherDetailWithFilters
   * 
   * @param sessionId sessionId (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;SubjectTeacherResponse&gt;
   */
  
  @GET("data/v1/subjectTeacherDetailWithFilters")
  Call<SubjectTeacherResponse> getsubjectTeacherDetailWithFiltersUsingGET(
    @Query("sessionId") Long sessionId, @Body SessionParams sessionParams
  );

}
