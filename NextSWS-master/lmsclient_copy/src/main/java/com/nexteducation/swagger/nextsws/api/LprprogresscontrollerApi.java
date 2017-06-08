package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.LPRProgressResponse;
import com.nexteducation.swagger.nextsws.model.LPRProgressRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LprprogresscontrollerApi {
  /**
   * getLPRProgressList
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @return Call&lt;List<LPRProgressResponse>&gt;
   */
  
  @DELETE("data/getLPRProgressList/{learningPlanMemberUuid}")
  Call<List<LPRProgressResponse>> getLPRProgressListUsingDELETE(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid
  );

  /**
   * getLPRProgressList
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @return Call&lt;List<LPRProgressResponse>&gt;
   */
  
  @GET("data/getLPRProgressList/{learningPlanMemberUuid}")
  Call<List<LPRProgressResponse>> getLPRProgressListUsingGET(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid
  );

  /**
   * getLPRProgressList
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @return Call&lt;List<LPRProgressResponse>&gt;
   */
  
  @HEAD("data/getLPRProgressList/{learningPlanMemberUuid}")
  Call<List<LPRProgressResponse>> getLPRProgressListUsingHEAD(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid
  );

  /**
   * getLPRProgressList
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @return Call&lt;List<LPRProgressResponse>&gt;
   */
  
  @OPTIONS("data/getLPRProgressList/{learningPlanMemberUuid}")
  Call<List<LPRProgressResponse>> getLPRProgressListUsingOPTIONS(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid
  );

  /**
   * getLPRProgressList
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @return Call&lt;List<LPRProgressResponse>&gt;
   */
  
  @PATCH("data/getLPRProgressList/{learningPlanMemberUuid}")
  Call<List<LPRProgressResponse>> getLPRProgressListUsingPATCH(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid
  );

  /**
   * getLPRProgressList
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @return Call&lt;List<LPRProgressResponse>&gt;
   */
  
  @POST("data/getLPRProgressList/{learningPlanMemberUuid}")
  Call<List<LPRProgressResponse>> getLPRProgressListUsingPOST(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid
  );

  /**
   * getLPRProgressList
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @return Call&lt;List<LPRProgressResponse>&gt;
   */
  
  @PUT("data/getLPRProgressList/{learningPlanMemberUuid}")
  Call<List<LPRProgressResponse>> getLPRProgressListUsingPUT(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid
  );

  /**
   * updateLPRProgress
   * 
   * @param lprProgress lprProgress (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/updateLPRProgress")
  Call<Void> updateLPRProgressUsingDELETE(
    @Body LPRProgressRequest lprProgress, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLPRProgress
   * 
   * @param lprProgress lprProgress (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/updateLPRProgress")
  Call<Void> updateLPRProgressUsingGET(
    @Body LPRProgressRequest lprProgress, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLPRProgress
   * 
   * @param lprProgress lprProgress (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/updateLPRProgress")
  Call<Void> updateLPRProgressUsingHEAD(
    @Body LPRProgressRequest lprProgress, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLPRProgress
   * 
   * @param lprProgress lprProgress (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/updateLPRProgress")
  Call<Void> updateLPRProgressUsingOPTIONS(
    @Body LPRProgressRequest lprProgress, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLPRProgress
   * 
   * @param lprProgress lprProgress (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/updateLPRProgress")
  Call<Void> updateLPRProgressUsingPATCH(
    @Body LPRProgressRequest lprProgress, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLPRProgress
   * 
   * @param lprProgress lprProgress (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/updateLPRProgress")
  Call<Void> updateLPRProgressUsingPOST(
    @Body LPRProgressRequest lprProgress, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLPRProgress
   * 
   * @param lprProgress lprProgress (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/updateLPRProgress")
  Call<Void> updateLPRProgressUsingPUT(
    @Body LPRProgressRequest lprProgress, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
