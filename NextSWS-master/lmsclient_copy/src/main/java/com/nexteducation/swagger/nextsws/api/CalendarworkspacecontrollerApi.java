package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.EventRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.CalendarEventDetailRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CalendarworkspacecontrollerApi {
  /**
   * getCalendarEvents
   * 
   * @param eventRequest eventRequest (required)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/calendarEvent/getListOfCalendarEvents")
  Call<Object> getCalendarEventsUsingPOST(
    @Body EventRequest eventRequest
  );

  /**
   * getCalendarPage
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("nextmentee/studentWorkspaceCalendar")
  Call<ModelAndView> getCalendarPageUsingDELETE(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCalendarPage
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/studentWorkspaceCalendar")
  Call<ModelAndView> getCalendarPageUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCalendarPage
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("nextmentee/studentWorkspaceCalendar")
  Call<ModelAndView> getCalendarPageUsingHEAD(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCalendarPage
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("nextmentee/studentWorkspaceCalendar")
  Call<ModelAndView> getCalendarPageUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCalendarPage
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("nextmentee/studentWorkspaceCalendar")
  Call<ModelAndView> getCalendarPageUsingPATCH(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCalendarPage
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/studentWorkspaceCalendar")
  Call<ModelAndView> getCalendarPageUsingPOST(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCalendarPage
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("nextmentee/studentWorkspaceCalendar")
  Call<ModelAndView> getCalendarPageUsingPUT(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getEventDetails
   * 
   * @param profileId profileId (required)
   * @param calendarEventId calendarEventId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/v1/user/{profileId}/calendarEvent/{calendarEventId}/calendarEventDetails")
  Call<Object> getEventDetailsUsingPOST(
    @Path("profileId") Long profileId, @Path("calendarEventId") Long calendarEventId, @Body CalendarEventDetailRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getEvents
   * 
   * @param profileId profileId (required)
   * @param request request (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/v1/user/{profileId}/calendarEvent/eventsForCalendar")
  Call<Object> getEventsUsingPOST(
    @Path("profileId") Long profileId, @Body EventRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
