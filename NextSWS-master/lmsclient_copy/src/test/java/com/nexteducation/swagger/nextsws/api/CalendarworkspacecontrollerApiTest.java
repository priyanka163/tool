package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.EventRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
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
    public void getCalendarPageUsingDELETETest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getCalendarPageUsingDELETE(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCalendarPage
     *
     * 
     */
    @Test
    public void getCalendarPageUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getCalendarPageUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCalendarPage
     *
     * 
     */
    @Test
    public void getCalendarPageUsingHEADTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getCalendarPageUsingHEAD(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCalendarPage
     *
     * 
     */
    @Test
    public void getCalendarPageUsingOPTIONSTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getCalendarPageUsingOPTIONS(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCalendarPage
     *
     * 
     */
    @Test
    public void getCalendarPageUsingPATCHTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getCalendarPageUsingPATCH(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCalendarPage
     *
     * 
     */
    @Test
    public void getCalendarPageUsingPOSTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getCalendarPageUsingPOST(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCalendarPage
     *
     * 
     */
    @Test
    public void getCalendarPageUsingPUTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getCalendarPageUsingPUT(branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.getEventDetailsUsingPOST(profileId, calendarEventId, request, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.getEventsUsingPOST(profileId, request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
