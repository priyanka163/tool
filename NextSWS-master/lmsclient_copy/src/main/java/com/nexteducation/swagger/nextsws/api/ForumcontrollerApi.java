package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ForumRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ForumcontrollerApi {
  /**
   * createForum
   * 
   * @param forumRequest forumRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/forum/add.app")
  Call<Object> createForumUsingPOST(
    @Body ForumRequest forumRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteForum
   * 
   * @param forumId forumId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/forum/delete/{forumId}")
  Call<Object> deleteForumUsingGET(
    @Path("forumId") String forumId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getForumTopics
   * 
   * @param forumId forumId (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/forum/get/topics/{forumId}")
  Call<Object> getForumTopicsUsingGET(
    @Path("forumId") String forumId
  );

  /**
   * getForum
   * 
   * @param forumId forumId (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/forum/get/{forumId}")
  Call<Object> getForumUsingGET(
    @Path("forumId") String forumId
  );

  /**
   * updateForum
   * 
   * @param forumRequest forumRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/forum/update.app")
  Call<Object> updateForumUsingPOST(
    @Body ForumRequest forumRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
