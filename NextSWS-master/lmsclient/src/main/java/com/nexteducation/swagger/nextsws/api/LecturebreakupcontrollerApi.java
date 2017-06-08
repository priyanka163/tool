package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.LecturePlanResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.StudyPlanResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LecturebreakupcontrollerApi {
  /**
   * getLectureBreakupDetail
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;LecturePlanResponse&gt;
   */
  
  @GET("data/lectureBreakup/{subjectId}/{classId}/{sectionId}.app")
  Call<LecturePlanResponse> getLectureBreakupDetailUsingGET(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Body SessionParams sessionParams
  );

  /**
   * loadStudyPlanData
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;StudyPlanResponse&gt;
   */
  
  @GET("data/studyPlan/{subjectId}/{classId}/{sectionId}.app")
  Call<StudyPlanResponse> loadStudyPlanDataUsingGET(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Body SessionParams sessionParams
  );

}
