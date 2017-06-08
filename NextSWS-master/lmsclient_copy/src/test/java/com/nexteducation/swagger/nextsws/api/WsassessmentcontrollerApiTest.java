package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.AssessmentResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptAnswersResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.AssessmentsTagResponse;
import com.nexteducation.swagger.nextsws.model.ShortAssessmentWithSyllabusResponse;
import com.nexteducation.swagger.nextsws.model.UserAssessmentAttemptsResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentAttemptResponse;
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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssessmentResponse response = api.createAssessmentUsingGET(branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssessmentsTagResponse response = api.getAssessmentByChapterUUIDUsingGET(chapterUUID, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getAssessmentDetailsUsingGET(assessmentUUID, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getAssessmentPageUsingGET(syllabusId, ifCustomSyllabus, chapterId, ifCustomChapter, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getAssessmentTestPageUsingGET1(syllabusId, assessmentType, assessmentUUID, ifCustomSyllabus, ifCustomChapter, chapterId, testPage, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ShortAssessmentWithSyllabusResponse response = api.getShortAssessmentUsingGET(syllabusId, assessmentUUID, ifCustomSyllabus, ifCustomChapter, chapterId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssessmentAttemptResponse response = api.insertAssessmentAttemptUsingPOST(assessmentAttemptRequest, branchId, academicSessionId, userId);

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
    public void sampleQuestionUsingDELETETest() {
        // ModelAndView response = api.sampleQuestionUsingDELETE();

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
     * sampleQuestion
     *
     * 
     */
    @Test
    public void sampleQuestionUsingHEADTest() {
        // ModelAndView response = api.sampleQuestionUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * sampleQuestion
     *
     * 
     */
    @Test
    public void sampleQuestionUsingOPTIONSTest() {
        // ModelAndView response = api.sampleQuestionUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * sampleQuestion
     *
     * 
     */
    @Test
    public void sampleQuestionUsingPATCHTest() {
        // ModelAndView response = api.sampleQuestionUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * sampleQuestion
     *
     * 
     */
    @Test
    public void sampleQuestionUsingPOSTTest() {
        // ModelAndView response = api.sampleQuestionUsingPOST();

        // TODO: test validations
    }
    
    /**
     * sampleQuestion
     *
     * 
     */
    @Test
    public void sampleQuestionUsingPUTTest() {
        // ModelAndView response = api.sampleQuestionUsingPUT();

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // Void response = api.saveAssessmentAttemptUsingPOST(assessmentAttemptRequest, branchId, academicSessionId, userId, sortBy, filter, page, pageSize, select);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // AssessmentAttemptPercentileResponse response = api.saveUserAssessmentAttemptUsingPOST(assessmentAttemptRequest, branchId, academicSessionId, userId, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
}
