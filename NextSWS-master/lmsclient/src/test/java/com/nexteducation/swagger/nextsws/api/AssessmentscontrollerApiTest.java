package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ShortAssessmentWOAnswerResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentFilterRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentDetailResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentResourceResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentCriteriaRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentTeacherResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.AssessmentResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssessmentscontrollerApi
 */
public class AssessmentscontrollerApiTest {

    private AssessmentscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AssessmentscontrollerApi.class);
    }

    
    /**
     * getAssessmentTypes
     *
     * 
     */
    @Test
    public void getAssessmentTypesUsingGETTest() {
        // List<String> response = api.getAssessmentTypesUsingGET();

        // TODO: test validations
    }
    
    /**
     * getAssessmentWOAnswers
     *
     * 
     */
    @Test
    public void getAssessmentWOAnswersUsingGETTest() {
        String assessmentuuid = null;
        // ShortAssessmentWOAnswerResponse response = api.getAssessmentWOAnswersUsingGET(assessmentuuid);

        // TODO: test validations
    }
    
    /**
     * getAssessmentsBySyllabusAndFilter
     *
     * 
     */
    @Test
    public void getAssessmentsBySyllabusAndFilterUsingGETTest() {
        Long syllabusId = null;
        AssessmentFilterRequest assessmentFilterRequest = null;
        // List<AssessmentDetailResponse> response = api.getAssessmentsBySyllabusAndFilterUsingGET(syllabusId, assessmentFilterRequest);

        // TODO: test validations
    }
    
    /**
     * getAssessments
     *
     * 
     */
    @Test
    public void getAssessmentsUsingGETTest() {
        Long syllabusId = null;
        // List<AssessmentResourceResponse> response = api.getAssessmentsUsingGET(syllabusId);

        // TODO: test validations
    }
    
    /**
     * getBloomsTaxonomies
     *
     * 
     */
    @Test
    public void getBloomsTaxonomiesUsingGETTest() {
        // List<String> response = api.getBloomsTaxonomiesUsingGET();

        // TODO: test validations
    }
    
    /**
     * getDifficultyLevels
     *
     * 
     */
    @Test
    public void getDifficultyLevelsUsingGETTest() {
        // List<String> response = api.getDifficultyLevelsUsingGET();

        // TODO: test validations
    }
    
    /**
     * getQuestionTypologies
     *
     * 
     */
    @Test
    public void getQuestionTypologiesUsingGETTest() {
        // List<String> response = api.getQuestionTypologiesUsingGET();

        // TODO: test validations
    }
    
    /**
     * getQuestionsByBluePrint
     *
     * 
     */
    @Test
    public void getQuestionsByBluePrintUsingPOSTTest() {
        AssessmentCriteriaRequest assessmentCriteriaRequest = null;
        SessionParams sessionParams = null;
        // AssessmentTeacherResponse response = api.getQuestionsByBluePrintUsingPOST(assessmentCriteriaRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * saveGeneratedAssessment
     *
     * 
     */
    @Test
    public void saveGeneratedAssessmentUsingPOSTTest() {
        AssessmentRequest assessmentRequest = null;
        SessionParams sessionParams = null;
        // AssessmentResponse response = api.saveGeneratedAssessmentUsingPOST(assessmentRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * showAssessments
     *
     * 
     */
    @Test
    public void showAssessmentsUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.showAssessmentsUsingGET(sessionParams);

        // TODO: test validations
    }
    
}
