package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("data/studentPlan/syllabus/{syllabusId}/getChaptersWithReources")
  Call<Object> getSyllabusAndResourceForSyllabusUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusAndResourceForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/studentPlan/syllabus/{syllabusId}/getChaptersWithReources")
  Call<Object> getSyllabusAndResourceForSyllabusUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusAndResourceForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("data/studentPlan/syllabus/{syllabusId}/getChaptersWithReources")
  Call<Object> getSyllabusAndResourceForSyllabusUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusAndResourceForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("data/studentPlan/syllabus/{syllabusId}/getChaptersWithReources")
  Call<Object> getSyllabusAndResourceForSyllabusUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusAndResourceForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("data/studentPlan/syllabus/{syllabusId}/getChaptersWithReources")
  Call<Object> getSyllabusAndResourceForSyllabusUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusAndResourceForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/studentPlan/syllabus/{syllabusId}/getChaptersWithReources")
  Call<Object> getSyllabusAndResourceForSyllabusUsingPOST(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusAndResourceForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PUT("data/studentPlan/syllabus/{syllabusId}/getChaptersWithReources")
  Call<Object> getSyllabusAndResourceForSyllabusUsingPUT(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("data/studentPlan/syllabus/{syllabusId}/getChapters")
  Call<Object> getSyllabusForSyllabusUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/studentPlan/syllabus/{syllabusId}/getChapters")
  Call<Object> getSyllabusForSyllabusUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("data/studentPlan/syllabus/{syllabusId}/getChapters")
  Call<Object> getSyllabusForSyllabusUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("data/studentPlan/syllabus/{syllabusId}/getChapters")
  Call<Object> getSyllabusForSyllabusUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("data/studentPlan/syllabus/{syllabusId}/getChapters")
  Call<Object> getSyllabusForSyllabusUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/studentPlan/syllabus/{syllabusId}/getChapters")
  Call<Object> getSyllabusForSyllabusUsingPOST(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusForSyllabus
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PUT("data/studentPlan/syllabus/{syllabusId}/getChapters")
  Call<Object> getSyllabusForSyllabusUsingPUT(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResourcesForSyllabusNode
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param filterRequest filterRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("data/studentPlan/syllabus/{syllabusNodeId}/getSyllabusNodeReources")
  Call<Object> getSyllabusNodeResourcesForSyllabusNodeUsingDELETE(
    @Path("syllabusNodeId") Long syllabusNodeId, @Body FilterRequest filterRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResourcesForSyllabusNode
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param filterRequest filterRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/studentPlan/syllabus/{syllabusNodeId}/getSyllabusNodeReources")
  Call<Object> getSyllabusNodeResourcesForSyllabusNodeUsingGET(
    @Path("syllabusNodeId") Long syllabusNodeId, @Body FilterRequest filterRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResourcesForSyllabusNode
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param filterRequest filterRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("data/studentPlan/syllabus/{syllabusNodeId}/getSyllabusNodeReources")
  Call<Object> getSyllabusNodeResourcesForSyllabusNodeUsingHEAD(
    @Path("syllabusNodeId") Long syllabusNodeId, @Body FilterRequest filterRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResourcesForSyllabusNode
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param filterRequest filterRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("data/studentPlan/syllabus/{syllabusNodeId}/getSyllabusNodeReources")
  Call<Object> getSyllabusNodeResourcesForSyllabusNodeUsingOPTIONS(
    @Path("syllabusNodeId") Long syllabusNodeId, @Body FilterRequest filterRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResourcesForSyllabusNode
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param filterRequest filterRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("data/studentPlan/syllabus/{syllabusNodeId}/getSyllabusNodeReources")
  Call<Object> getSyllabusNodeResourcesForSyllabusNodeUsingPATCH(
    @Path("syllabusNodeId") Long syllabusNodeId, @Body FilterRequest filterRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResourcesForSyllabusNode
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param filterRequest filterRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/studentPlan/syllabus/{syllabusNodeId}/getSyllabusNodeReources")
  Call<Object> getSyllabusNodeResourcesForSyllabusNodeUsingPOST(
    @Path("syllabusNodeId") Long syllabusNodeId, @Body FilterRequest filterRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResourcesForSyllabusNode
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param filterRequest filterRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PUT("data/studentPlan/syllabus/{syllabusNodeId}/getSyllabusNodeReources")
  Call<Object> getSyllabusNodeResourcesForSyllabusNodeUsingPUT(
    @Path("syllabusNodeId") Long syllabusNodeId, @Body FilterRequest filterRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
