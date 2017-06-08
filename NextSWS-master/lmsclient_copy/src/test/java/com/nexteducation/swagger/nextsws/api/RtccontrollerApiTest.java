package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SessionResponse;
import com.nexteducation.swagger.nextsws.model.SessionRequest;
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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // SessionResponse response = api.createSessionUsingPOST(sessionRequest, classId, chapterId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // SessionResponse response = api.createSessionUsingPOST1(sessionRequest, classId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // SubscriberResponse response = api.createSubscriberUsingPOST(subscriberRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // TokenResponse response = api.createTokenUsingPOST(tokenRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<SessionResponse> response = api.fetchfutureDateSessionUsingGET(classId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<SessionResponse> response = api.getSessionsByChapterUsingGET(classId, chapterId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<SessionResponse> response = api.getSessionsUsingGET(classId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingDELETE1Test() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingDELETE1(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingGET1Test() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingGET1(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingHEAD1Test() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingHEAD1(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingOPTIONS1Test() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingOPTIONS1(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingPATCH1Test() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingPATCH1(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingPOST1Test() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingPOST1(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingPUT1Test() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingPUT1(branchId, academicSessionId, userId);

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
