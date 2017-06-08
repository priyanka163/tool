package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SessionResponse;
import com.nexteducation.swagger.nextsws.model.SessionRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.SubscriberResponse;
import com.nexteducation.swagger.nextsws.model.SubscriberRequest;
import com.nexteducation.swagger.nextsws.model.TokenRequest;
import com.nexteducation.swagger.nextsws.model.TokenResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RtccontrollerApi
 */
public class RtccontrollerApiTest {

    private RtccontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RtccontrollerApi.class);
    }

    
    /**
     * createSession
     *
     * 
     */
    @Test
    public void createSessionUsingPOSTTest() {
        SessionRequest sessionRequest = null;
        Long classId = null;
        Long chapterId = null;
        SessionParams sessionParams = null;
        // SessionResponse response = api.createSessionUsingPOST(sessionRequest, classId, chapterId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * createSession
     *
     * 
     */
    @Test
    public void createSessionUsingPOST1Test() {
        SessionRequest sessionRequest = null;
        Long classId = null;
        SessionParams sessionParams = null;
        // SessionResponse response = api.createSessionUsingPOST1(sessionRequest, classId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * createSubscriber
     *
     * 
     */
    @Test
    public void createSubscriberUsingPOSTTest() {
        SubscriberRequest subscriberRequest = null;
        SessionParams sessionParams = null;
        // SubscriberResponse response = api.createSubscriberUsingPOST(subscriberRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * createToken
     *
     * 
     */
    @Test
    public void createTokenUsingPOSTTest() {
        TokenRequest tokenRequest = null;
        SessionParams sessionParams = null;
        // TokenResponse response = api.createTokenUsingPOST(tokenRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * deleteSession
     *
     * 
     */
    @Test
    public void deleteSessionUsingDELETETest() {
        String sessionId = null;
        // SessionResponse response = api.deleteSessionUsingDELETE(sessionId);

        // TODO: test validations
    }
    
    /**
     * fetchSession
     *
     * 
     */
    @Test
    public void fetchSessionUsingGETTest() {
        String sessionId = null;
        // SessionResponse response = api.fetchSessionUsingGET(sessionId);

        // TODO: test validations
    }
    
    /**
     * fetchfutureDateSession
     *
     * 
     */
    @Test
    public void fetchfutureDateSessionUsingGETTest() {
        Long classId = null;
        SessionParams sessionParams = null;
        // List<SessionResponse> response = api.fetchfutureDateSessionUsingGET(classId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSessionsByChapter
     *
     * 
     */
    @Test
    public void getSessionsByChapterUsingGETTest() {
        Long classId = null;
        Long chapterId = null;
        SessionParams sessionParams = null;
        // List<SessionResponse> response = api.getSessionsByChapterUsingGET(classId, chapterId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSessions
     *
     * 
     */
    @Test
    public void getSessionsUsingGETTest() {
        Long classId = null;
        SessionParams sessionParams = null;
        // List<SessionResponse> response = api.getSessionsUsingGET(classId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingGET1Test() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.showLessonPlanUsingGET1(sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateSession
     *
     * 
     */
    @Test
    public void updateSessionUsingPOSTTest() {
        SessionRequest sessionRequest = null;
        // SessionResponse response = api.updateSessionUsingPOST(sessionRequest);

        // TODO: test validations
    }
    
}
