package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.CustomSubjectDTO;
import com.nexteducation.swagger.nextsws.model.SessionParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MastersubjectcontrollerApi {
  /**
   * listAllSubjects
   * 
   * @param sessionParams sessionParams (required)
   * @return Call&lt;CustomSubjectDTO&gt;
   */
  
  @GET("data/getAllStandardSubjects")
  Call<CustomSubjectDTO> listAllSubjectsUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * listSyllabusSubjects
   * 
   * @param customSubjectDTO customSubjectDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;CustomSubjectDTO&gt;
   */
  
  @GET("data/listAllSubjects")
  Call<CustomSubjectDTO> listSyllabusSubjectsUsingGET(
    @Body CustomSubjectDTO customSubjectDTO, @Body SessionParams sessionParams
  );

}
