package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SubjectPlanSummaryResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SubjectplansummarycontrollerApi {
  /**
   * getSubjectPlanSummaryResponse
   * 
   * @param subjectId subjectId (required)
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;SubjectPlanSummaryResponse&gt;
   */
  
  @GET("data/getSubjectPlanSummary/{subjectId}/{syllabusId}/{customSyllabus}/{classId}/{sectionId}")
  Call<SubjectPlanSummaryResponse> getSubjectPlanSummaryResponseUsingGET(
    @Path("subjectId") Long subjectId, @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Body SessionParams sessionParams
  );

}
