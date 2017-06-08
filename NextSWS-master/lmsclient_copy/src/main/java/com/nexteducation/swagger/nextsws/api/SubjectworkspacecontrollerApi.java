package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SubjectResponse;

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("data/studentPlan/student/getAccessibleSubjectAndSyllabus")
  Call<Object> getAccessibleSubjcetWithValidSyllabusUsingDELETE(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjcetWithValidSyllabus
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/studentPlan/student/getAccessibleSubjectAndSyllabus")
  Call<Object> getAccessibleSubjcetWithValidSyllabusUsingGET(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjcetWithValidSyllabus
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("data/studentPlan/student/getAccessibleSubjectAndSyllabus")
  Call<Object> getAccessibleSubjcetWithValidSyllabusUsingHEAD(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjcetWithValidSyllabus
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("data/studentPlan/student/getAccessibleSubjectAndSyllabus")
  Call<Object> getAccessibleSubjcetWithValidSyllabusUsingOPTIONS(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjcetWithValidSyllabus
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("data/studentPlan/student/getAccessibleSubjectAndSyllabus")
  Call<Object> getAccessibleSubjcetWithValidSyllabusUsingPATCH(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjcetWithValidSyllabus
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/studentPlan/student/getAccessibleSubjectAndSyllabus")
  Call<Object> getAccessibleSubjcetWithValidSyllabusUsingPOST(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjcetWithValidSyllabus
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PUT("data/studentPlan/student/getAccessibleSubjectAndSyllabus")
  Call<Object> getAccessibleSubjcetWithValidSyllabusUsingPUT(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjectOfStudent
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectResponse>&gt;
   */
  
  @DELETE("data/studentPlan/student/getAccessibleSubjects")
  Call<List<SubjectResponse>> getAccessibleSubjectOfStudentUsingDELETE(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjectOfStudent
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectResponse>&gt;
   */
  
  @GET("data/studentPlan/student/getAccessibleSubjects")
  Call<List<SubjectResponse>> getAccessibleSubjectOfStudentUsingGET(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjectOfStudent
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectResponse>&gt;
   */
  
  @HEAD("data/studentPlan/student/getAccessibleSubjects")
  Call<List<SubjectResponse>> getAccessibleSubjectOfStudentUsingHEAD(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjectOfStudent
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectResponse>&gt;
   */
  
  @OPTIONS("data/studentPlan/student/getAccessibleSubjects")
  Call<List<SubjectResponse>> getAccessibleSubjectOfStudentUsingOPTIONS(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjectOfStudent
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectResponse>&gt;
   */
  
  @PATCH("data/studentPlan/student/getAccessibleSubjects")
  Call<List<SubjectResponse>> getAccessibleSubjectOfStudentUsingPATCH(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjectOfStudent
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectResponse>&gt;
   */
  
  @POST("data/studentPlan/student/getAccessibleSubjects")
  Call<List<SubjectResponse>> getAccessibleSubjectOfStudentUsingPOST(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAccessibleSubjectOfStudent
   * 
   * @param academicTerm academicTerm (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectResponse>&gt;
   */
  
  @PUT("data/studentPlan/student/getAccessibleSubjects")
  Call<List<SubjectResponse>> getAccessibleSubjectOfStudentUsingPUT(
    @Query("academicTerm") String academicTerm, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
