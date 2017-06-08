package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.TopicRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TopiccontrollerApi {
  /**
   * createTopic
   * 
   * @param topicRequest topicRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/topic/add.app")
  Call<Object> createTopicUsingPOST(
    @Body TopicRequest topicRequest, @Body SessionParams sessionParams
  );

  /**
   * deleteTopic
   * 
   * @param topicId topicId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/topic/delete/{topicId}")
  Call<Object> deleteTopicUsingGET(
    @Path("topicId") String topicId, @Body SessionParams sessionParams
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/topic/update.app")
  Call<Object> updateTopicUsingPOST(
    @Body TopicRequest topicRequest, @Body SessionParams sessionParams
  );

}
