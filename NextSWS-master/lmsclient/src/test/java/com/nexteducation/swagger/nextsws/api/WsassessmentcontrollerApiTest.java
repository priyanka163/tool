package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.AssessmentResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptAnswersResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.AssessmentsTagResponse;
import com.nexteducation.swagger.nextsws.model.ShortAssessmentWithSyllabusResponse;
import com.nexteducation.swagger.nextsws.model.UserAssessmentAttemptsResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptResponse;
import com.nexteducation.swagger.nextsws.model.QueryableParams;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptPercentileResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WsassessmentcontrollerApi
 */
public class WsassessmentcontrollerApiTest {

    private WsassessmentcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WsassessmentcontrollerApi.class);
    }

    
    /**
     * createAssessment
     *
     * 
     */
    @Test
    public void createAssessmentUsingGETTest() {
        SessionParams sessionParams = null;
        // AssessmentResponse response = api.createAssessmentUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchAssessmentDetail
     *
     * 
     */
    @Test
    public void fetchAssessmentDetailUsingGETTest() {
        String assessmentUUID = null;
        // Void response = api.fetchAssessmentDetailUsingGET(assessmentUUID);

        // TODO: test validations
    }
    
    /**
     * getAnswersForAssessmentAttempt
     *
     * 
     */
    @Test
    public void getAnswersForAssessmentAttemptUsingGETTest() {
        String assessmentUuid = null;
        // List<AssessmentAttemptAnswersResponse> response = api.getAnswersForAssessmentAttemptUsingGET(assessmentUuid);

        // TODO: test validations
    }
    
    /**
     * getAssessmentByChapterId
     *
     * 
     */
    @Test
    public void getAssessmentByChapterIdUsingGETTest() {
        Long chapterId = null;
        // ModelAndView response = api.getAssessmentByChapterIdUsingGET(chapterId);

        // TODO: test validations
    }
    
    /**
     * getAssessmentByChapterUUID
     *
     * 
     */
    @Test
    public void getAssessmentByChapterUUIDUsingGETTest() {
        String chapterUUID = null;
        SessionParams sessionParams = null;
        // AssessmentsTagResponse response = api.getAssessmentByChapterUUIDUsingGET(chapterUUID, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getAssessmentDetails
     *
     * 
     */
    @Test
    public void getAssessmentDetailsUsingGETTest() {
        String assessmentUUID = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getAssessmentDetailsUsingGET(assessmentUUID, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getAssessmentPage
     *
     * 
     */
    @Test
    public void getAssessmentPageUsingGETTest() {
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Long chapterId = null;
        Boolean ifCustomChapter = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getAssessmentPageUsingGET(syllabusId, ifCustomSyllabus, chapterId, ifCustomChapter, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getAssessmentTestPage
     *
     * 
     */
    @Test
    public void getAssessmentTestPageUsingGET1Test() {
        Long syllabusId = null;
        String assessmentType = null;
        String assessmentUUID = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        Long chapterId = null;
        String testPage = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getAssessmentTestPageUsingGET1(syllabusId, assessmentType, assessmentUUID, ifCustomSyllabus, ifCustomChapter, chapterId, testPage, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getAssessment
     *
     * 
     */
    @Test
    public void getAssessmentUsingGETTest() {
        String assessmentUUID = null;
        // AssessmentResponse response = api.getAssessmentUsingGET(assessmentUUID);

        // TODO: test validations
    }
    
    /**
     * getAssessmentsByChapter
     *
     * 
     */
    @Test
    public void getAssessmentsByChapterUsingGETTest() {
        Long chapterId = null;
        // List<AssessmentResponse> response = api.getAssessmentsByChapterUsingGET(chapterId);

        // TODO: test validations
    }
    
    /**
     * getShortAssessment
     *
     * 
     */
    @Test
    public void getShortAssessmentUsingGETTest() {
        Long syllabusId = null;
        String assessmentUUID = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        Long chapterId = null;
        SessionParams sessionParams = null;
        // ShortAssessmentWithSyllabusResponse response = api.getShortAssessmentUsingGET(syllabusId, assessmentUUID, ifCustomSyllabus, ifCustomChapter, chapterId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getUserAssessmentAttempts
     *
     * 
     */
    @Test
    public void getUserAssessmentAttemptsUsingGETTest() {
        Long userId = null;
        String assessmentId = null;
        // List<UserAssessmentAttemptsResponse> response = api.getUserAssessmentAttemptsUsingGET(userId, assessmentId);

        // TODO: test validations
    }
    
    /**
     * insertAssessmentAttempt
     *
     * 
     */
    @Test
    public void insertAssessmentAttemptUsingPOSTTest() {
        AssessmentAttemptRequest assessmentAttemptRequest = null;
        SessionParams sessionParams = null;
        // AssessmentAttemptResponse response = api.insertAssessmentAttemptUsingPOST(assessmentAttemptRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * insertQuestionAttempt
     *
     * 
     */
    @Test
    public void insertQuestionAttemptUsingPOSTTest() {
        AssessmentAttemptRequest assessmentAttemptRequest = null;
        // AssessmentAttemptResponse response = api.insertQuestionAttemptUsingPOST(assessmentAttemptRequest);

        // TODO: test validations
    }
    
    /**
     * sampleQuestion
     *
     * 
     */
    @Test
    public void sampleQuestionUsingGETTest() {
        // ModelAndView response = api.sampleQuestionUsingGET();

        // TODO: test validations
    }
    
    /**
     * saveAssessmentAttempt
     *
     * 
     */
    @Test
    public void saveAssessmentAttemptUsingPOSTTest() {
        AssessmentAttemptRequest assessmentAttemptRequest = null;
        SessionParams sessionParams = null;
        QueryableParams queryable = null;
        // Void response = api.saveAssessmentAttemptUsingPOST(assessmentAttemptRequest, sessionParams, queryable);

        // TODO: test validations
    }
    
    /**
     * saveUserAssessmentAttempt
     *
     * 
     */
    @Test
    public void saveUserAssessmentAttemptUsingPOSTTest() {
        AssessmentAttemptRequest assessmentAttemptRequest = null;
        SessionParams sessionParams = null;
        QueryableParams queryable = null;
        // AssessmentAttemptPercentileResponse response = api.saveUserAssessmentAttemptUsingPOST(assessmentAttemptRequest, sessionParams, queryable);

        // TODO: test validations
    }
    
}
