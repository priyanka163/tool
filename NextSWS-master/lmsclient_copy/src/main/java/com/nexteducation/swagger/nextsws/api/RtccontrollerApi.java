package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SessionResponse;
import com.nexteducation.swagger.nextsws.model.SessionRequest;
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SessionResponse&gt;
   */
  
  @POST("data/rtc/sessions/{classId}/{chapterId}")
  Call<SessionResponse> createSessionUsingPOST(
    @Body SessionRequest sessionRequest, @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createSession
   * 
   * @param sessionRequest sessionRequest (required)
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SessionResponse&gt;
   */
  
  @POST("data/rtc/sessions/{classId}")
  Call<SessionResponse> createSessionUsingPOST1(
    @Body SessionRequest sessionRequest, @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createSubscriber
   * 
   * @param subscriberRequest subscriberRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SubscriberResponse&gt;
   */
  
  @POST("data/rtc/subscribe")
  Call<SubscriberResponse> createSubscriberUsingPOST(
    @Body SubscriberRequest subscriberRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createToken
   * 
   * @param tokenRequest tokenRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;TokenResponse&gt;
   */
  
  @POST("data/rtc/tokens")
  Call<TokenResponse> createTokenUsingPOST(
    @Body TokenRequest tokenRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SessionResponse>&gt;
   */
  
  @GET("data/rtc/fetchFutureAndCurrentSessions/{classId}")
  Call<List<SessionResponse>> fetchfutureDateSessionUsingGET(
    @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSessionsByChapter
   * 
   * @param classId classId (required)
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SessionResponse>&gt;
   */
  
  @GET("data/rtc/sessions/{classId}/{chapterId}")
  Call<List<SessionResponse>> getSessionsByChapterUsingGET(
    @Path("classId") Long classId, @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSessions
   * 
   * @param classId classId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SessionResponse>&gt;
   */
  
  @GET("data/rtc/sessions/{classId}")
  Call<List<SessionResponse>> getSessionsUsingGET(
    @Path("classId") Long classId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("rtc")
  Call<ModelAndView> showLessonPlanUsingDELETE1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("rtc")
  Call<ModelAndView> showLessonPlanUsingGET1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("rtc")
  Call<ModelAndView> showLessonPlanUsingHEAD1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("rtc")
  Call<ModelAndView> showLessonPlanUsingOPTIONS1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("rtc")
  Call<ModelAndView> showLessonPlanUsingPATCH1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("rtc")
  Call<ModelAndView> showLessonPlanUsingPOST1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showLessonPlan
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("rtc")
  Call<ModelAndView> showLessonPlanUsingPUT1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
