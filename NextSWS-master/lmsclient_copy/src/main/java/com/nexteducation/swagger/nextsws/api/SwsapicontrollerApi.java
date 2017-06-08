package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponseV2;
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponseV2>&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/syllabus/{syllabusId}/chapters")
  Call<List<SyllabusNodeResponseV2>> getChaptersForSyllabusUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponseV2>&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/chapters")
  Call<List<SyllabusNodeResponseV2>> getChaptersForSyllabusUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponseV2>&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/syllabus/{syllabusId}/chapters")
  Call<List<SyllabusNodeResponseV2>> getChaptersForSyllabusUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponseV2>&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/syllabus/{syllabusId}/chapters")
  Call<List<SyllabusNodeResponseV2>> getChaptersForSyllabusUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponseV2>&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/syllabus/{syllabusId}/chapters")
  Call<List<SyllabusNodeResponseV2>> getChaptersForSyllabusUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponseV2>&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/chapters")
  Call<List<SyllabusNodeResponseV2>> getChaptersForSyllabusUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponseV2>&gt;
   */
  
  @PUT("data/v1/user/{profileId}/syllabus/{syllabusId}/chapters")
  Call<List<SyllabusNodeResponseV2>> getChaptersForSyllabusUsingPUT(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersWithSyllabusInfo
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @DELETE("data/v1/user/{profileId}/syllabus/{syllabusId}/details")
  Call<SyllabusResponseV2> getChaptersWithSyllabusInfoUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersWithSyllabusInfo
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @GET("data/v1/user/{profileId}/syllabus/{syllabusId}/details")
  Call<SyllabusResponseV2> getChaptersWithSyllabusInfoUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersWithSyllabusInfo
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @HEAD("data/v1/user/{profileId}/syllabus/{syllabusId}/details")
  Call<SyllabusResponseV2> getChaptersWithSyllabusInfoUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersWithSyllabusInfo
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @OPTIONS("data/v1/user/{profileId}/syllabus/{syllabusId}/details")
  Call<SyllabusResponseV2> getChaptersWithSyllabusInfoUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersWithSyllabusInfo
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @PATCH("data/v1/user/{profileId}/syllabus/{syllabusId}/details")
  Call<SyllabusResponseV2> getChaptersWithSyllabusInfoUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersWithSyllabusInfo
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @POST("data/v1/user/{profileId}/syllabus/{syllabusId}/details")
  Call<SyllabusResponseV2> getChaptersWithSyllabusInfoUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersWithSyllabusInfo
   * 
   * @param syllabusId syllabusId (required)
   * @param profileId profileId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param level level (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @PUT("data/v1/user/{profileId}/syllabus/{syllabusId}/details")
  Call<SyllabusResponseV2> getChaptersWithSyllabusInfoUsingPUT(
    @Path("syllabusId") Long syllabusId, @Path("profileId") Long profileId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("level") Integer level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusesForStudent
   * 
   * @param studentId studentId (required)
   * @param academicTermId academicTermId (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @DELETE("nextmentee/v1/student/{studentId}/syllabuses")
  Call<List<SubjectAndSyllabusResponse>> getSyllabusesForStudentUsingDELETE(
    @Path("studentId") Long studentId, @Query("academicTermId") Long academicTermId, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusesForStudent
   * 
   * @param studentId studentId (required)
   * @param academicTermId academicTermId (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @GET("nextmentee/v1/student/{studentId}/syllabuses")
  Call<List<SubjectAndSyllabusResponse>> getSyllabusesForStudentUsingGET(
    @Path("studentId") Long studentId, @Query("academicTermId") Long academicTermId, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusesForStudent
   * 
   * @param studentId studentId (required)
   * @param academicTermId academicTermId (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @HEAD("nextmentee/v1/student/{studentId}/syllabuses")
  Call<List<SubjectAndSyllabusResponse>> getSyllabusesForStudentUsingHEAD(
    @Path("studentId") Long studentId, @Query("academicTermId") Long academicTermId, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusesForStudent
   * 
   * @param studentId studentId (required)
   * @param academicTermId academicTermId (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @OPTIONS("nextmentee/v1/student/{studentId}/syllabuses")
  Call<List<SubjectAndSyllabusResponse>> getSyllabusesForStudentUsingOPTIONS(
    @Path("studentId") Long studentId, @Query("academicTermId") Long academicTermId, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusesForStudent
   * 
   * @param studentId studentId (required)
   * @param academicTermId academicTermId (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @PATCH("nextmentee/v1/student/{studentId}/syllabuses")
  Call<List<SubjectAndSyllabusResponse>> getSyllabusesForStudentUsingPATCH(
    @Path("studentId") Long studentId, @Query("academicTermId") Long academicTermId, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusesForStudent
   * 
   * @param studentId studentId (required)
   * @param academicTermId academicTermId (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @POST("nextmentee/v1/student/{studentId}/syllabuses")
  Call<List<SubjectAndSyllabusResponse>> getSyllabusesForStudentUsingPOST(
    @Path("studentId") Long studentId, @Query("academicTermId") Long academicTermId, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusesForStudent
   * 
   * @param studentId studentId (required)
   * @param academicTermId academicTermId (optional)
   * @param ifMandatorySubject ifMandatorySubject (optional, default to true)
   * @param ifOptionalSubject ifOptionalSubject (optional, default to false)
   * @param ifCoScholastic ifCoScholastic (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @PUT("nextmentee/v1/student/{studentId}/syllabuses")
  Call<List<SubjectAndSyllabusResponse>> getSyllabusesForStudentUsingPUT(
    @Path("studentId") Long studentId, @Query("academicTermId") Long academicTermId, @Query("ifMandatorySubject") Boolean ifMandatorySubject, @Query("ifOptionalSubject") Boolean ifOptionalSubject, @Query("ifCoScholastic") Boolean ifCoScholastic, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
