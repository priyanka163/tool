package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.CollectionResourceResponse;
import com.nexteducation.swagger.nextsws.model.CollectionLearningPlanDetailResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LearningplanwscontrollerApi {
  /**
   * getDetailLearningplansByUUID
   * 
   * @param resourceUuids resourceUuids (required)
   * @return Call&lt;CollectionResourceResponse&gt;
   */
  
  @POST("data/learningPlan/getResourcesForLectures")
  Call<CollectionResourceResponse> getDetailLearningplansByUUIDUsingPOST(
    @Body List<String> resourceUuids
  );

  /**
   * getLearningPlanByChapter
   * 
   * @param chapterId chapterId (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/learningPlan/get/{sectionId}/{classId}/{chapterId}")
  Call<Object> getLearningPlanByChapterUsingGET(
    @Path("chapterId") Long chapterId, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanForChapter
   * 
   * @param chapterId chapterId (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;CollectionLearningPlanDetailResponse&gt;
   */
  
  @GET("data/learningPlan/get/{sectionId}/{classId}/{chapterId}/lectures/{subjectId}")
  Call<CollectionLearningPlanDetailResponse> getLearningPlanForChapterUsingGET(
    @Path("chapterId") Long chapterId, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
