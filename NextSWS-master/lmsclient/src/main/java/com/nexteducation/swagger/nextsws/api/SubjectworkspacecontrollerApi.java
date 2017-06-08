package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.StudentSubjectResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SubjectworkspacecontrollerApi {
  /**
   * getAccessibleSubjcetWithValidSyllabus
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/studentPlan/student/getAccessibleSubjectAndSyllabus")
  Call<Object> getAccessibleSubjcetWithValidSyllabusUsingGET(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Body SessionParams sessionParams
  );

  /**
   * getAccessibleSubjectOfStudent
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<StudentSubjectResponse>&gt;
   */
  
  @GET("data/studentPlan/student/getAccessibleSubjects")
  Call<List<StudentSubjectResponse>> getAccessibleSubjectOfStudentUsingGET(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Body SessionParams sessionParams
  );

}
