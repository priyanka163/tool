package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.TopicRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TopiccontrollerApi {
  /**
   * createTopic
   * 
   * @param topicRequest topicRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/topic/add.app")
  Call<Object> createTopicUsingPOST(
    @Body TopicRequest topicRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteTopic
   * 
   * @param topicId topicId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/topic/delete/{topicId}")
  Call<Object> deleteTopicUsingGET(
    @Path("topicId") String topicId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChildTopics
   * 
   * @param topicId topicId (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/topic/get/topics/{topicId}")
  Call<Object> getChildTopicsUsingGET(
    @Path("topicId") String topicId
  );

  /**
   * getTopic
   * 
   * @param topicId topicId (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/topic/get/{topicId}")
  Call<Object> getTopicUsingGET(
    @Path("topicId") String topicId
  );

  /**
   * updateTopic
   * 
   * @param topicRequest topicRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/topic/update.app")
  Call<Object> updateTopicUsingPOST(
    @Body TopicRequest topicRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
