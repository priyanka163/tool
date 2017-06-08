package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.AssociationRequest;
import com.nexteducation.swagger.nextsws.model.UserCommentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface QuestionandanswercontrollerApi {
  /**
   * askQuestionInput
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/questionAndAnswerForum/askQuestion")
  Call<ModelAndView> askQuestionInputUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * downvote
   * 
   * @param associationRequest associationRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/questionAndAnswerForum/downvote")
  Call<ModelAndView> downvoteUsingPOST(
    @Body AssociationRequest associationRequest, @Body SessionParams sessionParams
  );

  /**
   * faqHome
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("faq")
  Call<ModelAndView> faqHomeUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * faqInput
   * 
   * @param requestDTO requestDTO (optional)
   * @return Call&lt;ModelAndView&gt;
   */


  /**
   * follow
   * 
   * @param associationRequest associationRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/questionAndAnswerForum/follow")
  Call<ModelAndView> followUsingPOST(
    @Body AssociationRequest associationRequest, @Body SessionParams sessionParams
  );

  /**
   * getAllCommentsByTypeForModeration
   * 
   * @param userCommentRequest userCommentRequest (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/questionAndAnswerForum/comments/moderation/all")
  Call<ModelAndView> getAllCommentsByTypeForModerationUsingPOST(
    @Body UserCommentRequest userCommentRequest
  );

  /**
   * getAllCommentsByType
   * 
   * @param userCommentRequest userCommentRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/questionAndAnswerForum/comments/all")
  Call<ModelAndView> getAllCommentsByTypeUsingPOST(
    @Body UserCommentRequest userCommentRequest, @Body SessionParams sessionParams
  );

  /**
   * getChapterPost
   * 
   * @param forumId forumId (required)
   * @param syllabusId syllabusId (required)
   * @param chapterId chapterId (required)
   * @param page page (required)
   * @param limit limit (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("nextmentee/questionAndAnswerForum/forum/{forumId}/syllabus/{syllabusId}/chapter/{chapterId}/get/{page}/{limit}")
  Call<Object> getChapterPostUsingGET1(
    @Path("forumId") String forumId, @Path("syllabusId") String syllabusId, @Path("chapterId") String chapterId, @Path("page") Integer page, @Path("limit") Integer limit, @Body SessionParams sessionParams
  );

  /**
   * getForumSyllabusPost
   * 
   * @param forumId forumId (required)
   * @param syllabusId syllabusId (required)
   * @param page page (required)
   * @param limit limit (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("nextmentee/questionAndAnswerForum/forum/{forumId}/syllabus/{syllabusId}/get/{page}/{limit}")
  Call<Object> getForumSyllabusPostUsingGET(
    @Path("forumId") String forumId, @Path("syllabusId") String syllabusId, @Path("page") Integer page, @Path("limit") Integer limit, @Body SessionParams sessionParams
  );

  /**
   * postThread
   * 
   * @param postUUID postUUID (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/questionAndAnswerForum/postDetail/{postUUID}")
  Call<ModelAndView> postThreadUsingGET(
    @Path("postUUID") String postUUID, @Body SessionParams sessionParams
  );

  /**
   * q2aHome
   * 
   * @param page page (required)
   * @param limit limit (required)
   * @param forumId forumId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/questionAndAnswerForum/forum/{forumId}/{page}/{limit}")
  Call<ModelAndView> q2aHomeUsingGET(
    @Path("page") Integer page, @Path("limit") Integer limit, @Path("forumId") String forumId, @Body SessionParams sessionParams
  );

  /**
   * unfollow
   * 
   * @param associationRequest associationRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/questionAndAnswerForum/unfollow")
  Call<ModelAndView> unfollowUsingPOST(
    @Body AssociationRequest associationRequest, @Body SessionParams sessionParams
  );

  /**
   * upvote
   * 
   * @param associationRequest associationRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/questionAndAnswerForum/upvote")
  Call<ModelAndView> upvoteUsingPOST(
    @Body AssociationRequest associationRequest, @Body SessionParams sessionParams
  );

}
