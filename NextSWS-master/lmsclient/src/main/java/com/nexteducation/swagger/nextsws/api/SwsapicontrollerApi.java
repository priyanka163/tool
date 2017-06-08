package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponseV2;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.SyllabusResponseV2;
import com.nexteducation.swagger.nextsws.model.SubjectAndSyllabusResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SwsapicontrollerApi {
  /**
   * getChaptersForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SyllabusNodeResponseV2>&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/chapters")
  Call<List<SyllabusNodeResponseV2>> getChaptersForSyllabusUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Body SessionParams sessionParams
  );

  /**
   * getChaptersWithSyllabusInfo
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/details")
  Call<SyllabusResponseV2> getChaptersWithSyllabusInfoUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Body SessionParams sessionParams
  );

  /**
   * getSyllabusesForStudent
   * 
   * @param studentId studentId (required)
   * @param academicTermId academicTermId (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @GET("nextmentee/v1/student/{studentId}/syllabuses")
  Call<List<SubjectAndSyllabusResponse>> getSyllabusesForStudentUsingGET(
    @Path("studentId") Long studentId, @Query("academicTermId") Long academicTermId, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Body SessionParams sessionParams
  );

}
