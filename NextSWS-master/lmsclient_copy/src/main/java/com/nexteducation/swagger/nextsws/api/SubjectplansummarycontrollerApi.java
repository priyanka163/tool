package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SubjectPlanSummaryResponse;

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SubjectPlanSummaryResponse&gt;
   */
  
  @DELETE("data/getSubjectPlanSummary/{subjectId}/{syllabusId}/{customSyllabus}/{classId}/{sectionId}")
  Call<SubjectPlanSummaryResponse> getSubjectPlanSummaryResponseUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSubjectPlanSummaryResponse
   * 
   * @param subjectId subjectId (required)
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SubjectPlanSummaryResponse&gt;
   */
  
  @GET("data/getSubjectPlanSummary/{subjectId}/{syllabusId}/{customSyllabus}/{classId}/{sectionId}")
  Call<SubjectPlanSummaryResponse> getSubjectPlanSummaryResponseUsingGET(
    @Path("subjectId") Long subjectId, @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSubjectPlanSummaryResponse
   * 
   * @param subjectId subjectId (required)
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SubjectPlanSummaryResponse&gt;
   */
  
  @HEAD("data/getSubjectPlanSummary/{subjectId}/{syllabusId}/{customSyllabus}/{classId}/{sectionId}")
  Call<SubjectPlanSummaryResponse> getSubjectPlanSummaryResponseUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSubjectPlanSummaryResponse
   * 
   * @param subjectId subjectId (required)
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SubjectPlanSummaryResponse&gt;
   */
  
  @OPTIONS("data/getSubjectPlanSummary/{subjectId}/{syllabusId}/{customSyllabus}/{classId}/{sectionId}")
  Call<SubjectPlanSummaryResponse> getSubjectPlanSummaryResponseUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSubjectPlanSummaryResponse
   * 
   * @param subjectId subjectId (required)
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SubjectPlanSummaryResponse&gt;
   */
  
  @PATCH("data/getSubjectPlanSummary/{subjectId}/{syllabusId}/{customSyllabus}/{classId}/{sectionId}")
  Call<SubjectPlanSummaryResponse> getSubjectPlanSummaryResponseUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSubjectPlanSummaryResponse
   * 
   * @param subjectId subjectId (required)
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SubjectPlanSummaryResponse&gt;
   */
  
  @POST("data/getSubjectPlanSummary/{subjectId}/{syllabusId}/{customSyllabus}/{classId}/{sectionId}")
  Call<SubjectPlanSummaryResponse> getSubjectPlanSummaryResponseUsingPOST(
    @Path("subjectId") Long subjectId, @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSubjectPlanSummaryResponse
   * 
   * @param subjectId subjectId (required)
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SubjectPlanSummaryResponse&gt;
   */
  
  @PUT("data/getSubjectPlanSummary/{subjectId}/{syllabusId}/{customSyllabus}/{classId}/{sectionId}")
  Call<SubjectPlanSummaryResponse> getSubjectPlanSummaryResponseUsingPUT(
    @Path("subjectId") Long subjectId, @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
