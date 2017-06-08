package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.EventRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.CalendarEventDetailRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalendarworkspacecontrollerApi
 */
public class CalendarworkspacecontrollerApiTest {

    private CalendarworkspacecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CalendarworkspacecontrollerApi.class);
    }

    
    /**
     * getCalendarEvents
     *
     * 
     */
    @Test
    public void getCalendarEventsUsingPOSTTest() {
        EventRequest eventRequest = null;
        // Object response = api.getCalendarEventsUsingPOST(eventRequest);

        // TODO: test validations
    }
    
    /**
     * getCalendarPage
     *
     * 
     */
    @Test
    public void getCalendarPageUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.getCalendarPageUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * getEventDetails
     *
     * 
     */
    @Test
    public void getEventDetailsUsingPOSTTest() {
        Long profileId = null;
        Long calendarEventId = null;
        CalendarEventDetailRequest request = null;
        SessionParams sessionParams = null;
        // Object response = api.getEventDetailsUsingPOST(profileId, calendarEventId, request, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getEvents
     *
     * 
     */
    @Test
    public void getEventsUsingPOSTTest() {
        Long profileId = null;
        EventRequest request = null;
        SessionParams sessionParams = null;
        // Object response = api.getEventsUsingPOST(profileId, request, sessionParams);

        // TODO: test validations
    }
    
}
