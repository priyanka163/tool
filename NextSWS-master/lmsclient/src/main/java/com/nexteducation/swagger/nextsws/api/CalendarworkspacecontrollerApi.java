package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.EventRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/studentWorkspaceCalendar")
  Call<ModelAndView> getCalendarPageUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getEventDetails
   * 
   * @param profileId profileId (required)
   * @param calendarEventId calendarEventId (required)
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/v1/user/{profileId}/calendarEvent/{calendarEventId}/calendarEventDetails")
  Call<Object> getEventDetailsUsingPOST(
    @Path("profileId") Long profileId, @Path("calendarEventId") Long calendarEventId, @Body CalendarEventDetailRequest request, @Body SessionParams sessionParams
  );

  /**
   * getEvents
   * 
   * @param profileId profileId (required)
   * @param request request (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/v1/user/{profileId}/calendarEvent/eventsForCalendar")
  Call<Object> getEventsUsingPOST(
    @Path("profileId") Long profileId, @Body EventRequest request, @Body SessionParams sessionParams
  );

}
