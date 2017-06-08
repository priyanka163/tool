package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ShortAssessmentWOAnswerResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentFilterRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentDetailResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentResourceResponse;
import com.nexteducation.swagger.nextsws.model.AssessmentCriteriaRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentTeacherResponse;
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
    public void getAssessmentWOAnswersUsingDELETETest() {
        String assessmentuuid = null;
        // ShortAssessmentWOAnswerResponse response = api.getAssessmentWOAnswersUsingDELETE(assessmentuuid);

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
     * getAssessmentWOAnswers
     *
     * 
     */
    @Test
    public void getAssessmentWOAnswersUsingHEADTest() {
        String assessmentuuid = null;
        // ShortAssessmentWOAnswerResponse response = api.getAssessmentWOAnswersUsingHEAD(assessmentuuid);

        // TODO: test validations
    }
    
    /**
     * getAssessmentWOAnswers
     *
     * 
     */
    @Test
    public void getAssessmentWOAnswersUsingOPTIONSTest() {
        String assessmentuuid = null;
        // ShortAssessmentWOAnswerResponse response = api.getAssessmentWOAnswersUsingOPTIONS(assessmentuuid);

        // TODO: test validations
    }
    
    /**
     * getAssessmentWOAnswers
     *
     * 
     */
    @Test
    public void getAssessmentWOAnswersUsingPATCHTest() {
        String assessmentuuid = null;
        // ShortAssessmentWOAnswerResponse response = api.getAssessmentWOAnswersUsingPATCH(assessmentuuid);

        // TODO: test validations
    }
    
    /**
     * getAssessmentWOAnswers
     *
     * 
     */
    @Test
    public void getAssessmentWOAnswersUsingPOSTTest() {
        String assessmentuuid = null;
        // ShortAssessmentWOAnswerResponse response = api.getAssessmentWOAnswersUsingPOST(assessmentuuid);

        // TODO: test validations
    }
    
    /**
     * getAssessmentWOAnswers
     *
     * 
     */
    @Test
    public void getAssessmentWOAnswersUsingPUTTest() {
        String assessmentuuid = null;
        // ShortAssessmentWOAnswerResponse response = api.getAssessmentWOAnswersUsingPUT(assessmentuuid);

        // TODO: test validations
    }
    
    /**
     * getAssessmentsBySyllabusAndFilter
     *
     * 
     */
    @Test
    public void getAssessmentsBySyllabusAndFilterUsingDELETETest() {
        Long syllabusId = null;
        AssessmentFilterRequest assessmentFilterRequest = null;
        // List<AssessmentDetailResponse> response = api.getAssessmentsBySyllabusAndFilterUsingDELETE(syllabusId, assessmentFilterRequest);

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
     * getAssessmentsBySyllabusAndFilter
     *
     * 
     */
    @Test
    public void getAssessmentsBySyllabusAndFilterUsingHEADTest() {
        Long syllabusId = null;
        AssessmentFilterRequest assessmentFilterRequest = null;
        // List<AssessmentDetailResponse> response = api.getAssessmentsBySyllabusAndFilterUsingHEAD(syllabusId, assessmentFilterRequest);

        // TODO: test validations
    }
    
    /**
     * getAssessmentsBySyllabusAndFilter
     *
     * 
     */
    @Test
    public void getAssessmentsBySyllabusAndFilterUsingOPTIONSTest() {
        Long syllabusId = null;
        AssessmentFilterRequest assessmentFilterRequest = null;
        // List<AssessmentDetailResponse> response = api.getAssessmentsBySyllabusAndFilterUsingOPTIONS(syllabusId, assessmentFilterRequest);

        // TODO: test validations
    }
    
    /**
     * getAssessmentsBySyllabusAndFilter
     *
     * 
     */
    @Test
    public void getAssessmentsBySyllabusAndFilterUsingPATCHTest() {
        Long syllabusId = null;
        AssessmentFilterRequest assessmentFilterRequest = null;
        // List<AssessmentDetailResponse> response = api.getAssessmentsBySyllabusAndFilterUsingPATCH(syllabusId, assessmentFilterRequest);

        // TODO: test validations
    }
    
    /**
     * getAssessmentsBySyllabusAndFilter
     *
     * 
     */
    @Test
    public void getAssessmentsBySyllabusAndFilterUsingPOSTTest() {
        Long syllabusId = null;
        AssessmentFilterRequest assessmentFilterRequest = null;
        // List<AssessmentDetailResponse> response = api.getAssessmentsBySyllabusAndFilterUsingPOST(syllabusId, assessmentFilterRequest);

        // TODO: test validations
    }
    
    /**
     * getAssessmentsBySyllabusAndFilter
     *
     * 
     */
    @Test
    public void getAssessmentsBySyllabusAndFilterUsingPUTTest() {
        Long syllabusId = null;
        AssessmentFilterRequest assessmentFilterRequest = null;
        // List<AssessmentDetailResponse> response = api.getAssessmentsBySyllabusAndFilterUsingPUT(syllabusId, assessmentFilterRequest);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssessmentTeacherResponse response = api.getQuestionsByBluePrintUsingPOST(assessmentCriteriaRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssessmentResponse response = api.saveGeneratedAssessmentUsingPOST(assessmentRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showAssessments
     *
     * 
     */
    @Test
    public void showAssessmentsUsingDELETETest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showAssessmentsUsingDELETE(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showAssessments
     *
     * 
     */
    @Test
    public void showAssessmentsUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showAssessmentsUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showAssessments
     *
     * 
     */
    @Test
    public void showAssessmentsUsingHEADTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showAssessmentsUsingHEAD(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showAssessments
     *
     * 
     */
    @Test
    public void showAssessmentsUsingOPTIONSTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showAssessmentsUsingOPTIONS(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showAssessments
     *
     * 
     */
    @Test
    public void showAssessmentsUsingPATCHTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showAssessmentsUsingPATCH(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showAssessments
     *
     * 
     */
    @Test
    public void showAssessmentsUsingPOSTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showAssessmentsUsingPOST(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showAssessments
     *
     * 
     */
    @Test
    public void showAssessmentsUsingPUTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showAssessmentsUsingPUT(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
