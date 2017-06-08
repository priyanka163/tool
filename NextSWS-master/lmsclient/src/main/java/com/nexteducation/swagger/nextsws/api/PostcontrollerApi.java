package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.PostResponseRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.PostRequest;
import com.nexteducation.swagger.nextsws.model.UserCommentRequest;
import com.nexteducation.swagger.nextsws.model.AssociationRequest;
import com.nexteducation.swagger.nextsws.model.UserCommentResponse;
import com.nexteducation.swagger.nextsws.model.AssociationObjectResponse;
import com.nexteducation.swagger.nextsws.model.AssociationObjectRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PostcontrollerApi {
  /**
   * createPostResponse
   * 
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/postresponse/add.app")
  Call<Object> createPostResponseUsingPOST(
    @Body PostResponseRequest request, @Body SessionParams sessionParams
  );

  /**
   * createPost
   * 
   * @param postRequest postRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/post/add.app")
  Call<Object> createPostUsingPOST(
    @Body PostRequest postRequest, @Body SessionParams sessionParams
  );

  /**
   * createUserComment
   * 
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/usercomment/add.app")
  Call<Object> createUserCommentUsingPOST(
    @Body UserCommentRequest request, @Body SessionParams sessionParams
  );

  /**
   * deletePost
   * 
   * @param postId postId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/post/delete/{postId}")
  Call<Object> deletePostUsingGET(
    @Path("postId") String postId, @Body SessionParams sessionParams
  );

  /**
   * getChapterPost
   * 
   * @param chapterId chapterId (required)
   * @param page page (required)
   * @param limit limit (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/post/chapter/{chapterId}/get/{page}/{limit}")
  Call<Object> getChapterPostUsingGET(
    @Path("chapterId") String chapterId, @Path("page") Integer page, @Path("limit") Integer limit, @Body SessionParams sessionParams
  );

  /**
   * getChapterPost
   * 
   * @param postRequest postRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/post/chapter/{chapterId}/get.app")
  Call<Object> getChapterPostUsingPOST(
    @Body PostRequest postRequest, @Body SessionParams sessionParams
  );

  /**
   * getChapterWiseSyllabusPost
   * 
   * @param syllabusId syllabusId (required)
   * @param page page (required)
   * @param limit limit (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/post/syllabus/{syllabusId}/chapterWise/get/{page}/{limit}")
  Call<Object> getChapterWiseSyllabusPostUsingGET(
    @Path("syllabusId") String syllabusId, @Path("page") Integer page, @Path("limit") Integer limit, @Body SessionParams sessionParams
  );

  /**
   * getDetailPost
   * 
   * @param postId postId (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/post/detail/get/{postId}")
  Call<Object> getDetailPostUsingGET(
    @Path("postId") String postId
  );

  /**
   * getPostDislikes
   * 
   * @param associationRequest associationRequest (required)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/post/chapter/getDislikes.app")
  Call<Object> getPostDislikesUsingPOST(
    @Body AssociationRequest associationRequest
  );

  /**
   * getPostLikes
   * 
   * @param associationRequest associationRequest (required)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/post/chapter/getLikes.app")
  Call<Object> getPostLikesUsingPOST(
    @Body AssociationRequest associationRequest
  );

  /**
   * getPostResponseUserComments
   * 
   * @param postResponseUuid postResponseUuid (required)
   * @return Call&lt;List<UserCommentResponse>&gt;
   */
  
  @GET("data/post/chapter/getpostResponsecomments/{postResponseUuid}")
  Call<List<UserCommentResponse>> getPostResponseUserCommentsUsingGET(
    @Path("postResponseUuid") String postResponseUuid
  );

  /**
   * getPostUserComments
   * 
   * @param postUuid postUuid (required)
   * @return Call&lt;List<UserCommentResponse>&gt;
   */
  
  @GET("data/post/chapter/getpostcomments/{postUuid}")
  Call<List<UserCommentResponse>> getPostUserCommentsUsingGET(
    @Path("postUuid") String postUuid
  );

  /**
   * getPost
   * 
   * @param postId postId (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/post/get/{postId}")
  Call<Object> getPostUsingGET(
    @Path("postId") String postId
  );

  /**
   * getSyllabusPost
   * 
   * @param syllabusId syllabusId (required)
   * @param page page (required)
   * @param limit limit (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/post/syllabus/{syllabusId}/get/{page}/{limit}")
  Call<Object> getSyllabusPostUsingGET(
    @Path("syllabusId") String syllabusId, @Path("page") Integer page, @Path("limit") Integer limit, @Body SessionParams sessionParams
  );

  /**
   * getUpvoteDownvoteDetails
   * 
   * @param request request (required)
   * @return Call&lt;List<AssociationObjectResponse>&gt;
   */
  
  @POST("data/associationObject/get.app")
  Call<List<AssociationObjectResponse>> getUpvoteDownvoteDetailsUsingPOST(
    @Body AssociationObjectRequest request
  );

  /**
   * getUserCommentsResponse
   * 
   * @param userCommentRequest userCommentRequest (required)
   * @return Call&lt;List<UserCommentResponse>&gt;
   */
  
  @POST("data/post/chapter/getusercommentresponse/.app")
  Call<List<UserCommentResponse>> getUserCommentsResponseUsingPOST(
    @Body UserCommentRequest userCommentRequest
  );

  /**
   * getUserPost
   * 
   * @param userId userId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/post/getUsers/{userId}")
  Call<Object> getUserPostUsingGET(
    @Path("userId") Long userId, @Body SessionParams sessionParams
  );

  /**
   * updatePost
   * 
   * @param postRequest postRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/post/update.app")
  Call<Object> updatePostUsingPOST(
    @Body PostRequest postRequest, @Body SessionParams sessionParams
  );

}
