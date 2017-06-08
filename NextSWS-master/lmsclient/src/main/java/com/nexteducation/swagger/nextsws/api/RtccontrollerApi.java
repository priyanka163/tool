package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SessionResponse;
import com.nexteducation.swagger.nextsws.model.SessionRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.SubscriberResponse;
import com.nexteducation.swagger.nextsws.model.SubscriberRequest;
import com.nexteducation.swagger.nextsws.model.TokenRequest;
import com.nexteducation.swagger.nextsws.model.TokenResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RtccontrollerApi {
  /**
   * createSession
   * 
   * @param sessionRequest sessionRequest (required)
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;SessionResponse&gt;
   */
  
  @POST("data/rtc/sessions/{classId}/{chapterId}")
  Call<SessionResponse> createSessionUsingPOST(
    @Body SessionRequest sessionRequest, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Body SessionParams sessionParams
  );

  /**
   * createSession
   * 
   * @param sessionRequest sessionRequest (required)
   * @param classId classId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;SessionResponse&gt;
   */
  
  @POST("data/rtc/sessions/{classId}")
  Call<SessionResponse> createSessionUsingPOST1(
    @Body SessionRequest sessionRequest, @Path("classId") Long classId, @Body SessionParams sessionParams
  );

  /**
   * createSubscriber
   * 
   * @param subscriberRequest subscriberRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;SubscriberResponse&gt;
   */
  
  @POST("data/rtc/subscribe")
  Call<SubscriberResponse> createSubscriberUsingPOST(
    @Body SubscriberRequest subscriberRequest, @Body SessionParams sessionParams
  );

  /**
   * createToken
   * 
   * @param tokenRequest tokenRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;TokenResponse&gt;
   */
  
  @POST("data/rtc/tokens")
  Call<TokenResponse> createTokenUsingPOST(
    @Body TokenRequest tokenRequest, @Body SessionParams sessionParams
  );

  /**
   * deleteSession
   * 
   * @param sessionId sessionId (required)
   * @return Call&lt;SessionResponse&gt;
   */
  
  @DELETE("data/rtc/sessions/{sessionId}")
  Call<SessionResponse> deleteSessionUsingDELETE(
    @Path("sessionId") String sessionId
  );

  /**
   * fetchSession
   * 
   * @param sessionId sessionId (required)
   * @return Call&lt;SessionResponse&gt;
   */
  
  @GET("data/fetchSession/{sessionId}")
  Call<SessionResponse> fetchSessionUsingGET(
    @Path("sessionId") String sessionId
  );

  /**
   * fetchfutureDateSession
   * 
   * @param classId classId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SessionResponse>&gt;
   */
  
  @GET("data/rtc/fetchFutureAndCurrentSessions/{classId}")
  Call<List<SessionResponse>> fetchfutureDateSessionUsingGET(
    @Path("classId") Long classId, @Body SessionParams sessionParams
  );

  /**
   * getSessionsByChapter
   * 
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SessionResponse>&gt;
   */
  
  @GET("data/rtc/sessions/{classId}/{chapterId}")
  Call<List<SessionResponse>> getSessionsByChapterUsingGET(
    @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Body SessionParams sessionParams
  );

  /**
   * getSessions
   * 
   * @param classId classId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SessionResponse>&gt;
   */
  
  @GET("data/rtc/sessions/{classId}")
  Call<List<SessionResponse>> getSessionsUsingGET(
    @Path("classId") Long classId, @Body SessionParams sessionParams
  );

  /**
   * showLessonPlan
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("rtc")
  Call<ModelAndView> showLessonPlanUsingGET1(
    @Body SessionParams sessionParams
  );

  /**
   * updateSession
   * 
   * @param sessionRequest sessionRequest (required)
   * @return Call&lt;SessionResponse&gt;
   */
  
  @POST("data/rtc/updateSession")
  Call<SessionResponse> updateSessionUsingPOST(
    @Body SessionRequest sessionRequest
  );

}
