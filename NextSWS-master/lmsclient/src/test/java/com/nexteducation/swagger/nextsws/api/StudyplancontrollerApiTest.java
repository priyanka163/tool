package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.StudyPlanRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.joda.time.DateTime;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StudyplancontrollerApi
 */
public class StudyplancontrollerApiTest {

    private StudyplancontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StudyplancontrollerApi.class);
    }

    
    /**
     * createStudentStudyPlan
     *
     * 
     */
    @Test
    public void createStudentStudyPlanUsingPOSTTest() {
        StudyPlanRequest studyPlanReq = null;
        SessionParams sessionParams = null;
        // Object response = api.createStudentStudyPlanUsingPOST(studyPlanReq, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchPrevNextResources
     *
     * 
     */
    @Test
    public void fetchPrevNextResourcesUsingGETTest() {
        DateTime currentDate = null;
        Long userId = null;
        Long subjectId = null;
        String option = null;
        // Object response = api.fetchPrevNextResourcesUsingGET(currentDate, userId, subjectId, option);

        // TODO: test validations
    }
    
    /**
     * fetchStudentStudyPlanResources
     *
     * 
     */
    @Test
    public void fetchStudentStudyPlanResourcesUsingGETTest() {
        DateTime currentDate = null;
        Long userId = null;
        Long subjectId = null;
        // Object response = api.fetchStudentStudyPlanResourcesUsingGET(currentDate, userId, subjectId);

        // TODO: test validations
    }
    
    /**
     * fetchStudentStudyPlans
     *
     * 
     */
    @Test
    public void fetchStudentStudyPlansUsingGETTest() {
        Long syllabusId = null;
        Long userId = null;
        Long subjectId = null;
        Boolean ifCustomSyllabus = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.fetchStudentStudyPlansUsingGET(syllabusId, userId, subjectId, ifCustomSyllabus, sessionParams);

        // TODO: test validations
    }
    
    /**
     * showStudentStudyPlan
     *
     * 
     */
    @Test
    public void showStudentStudyPlanUsingGETTest() {
        String studyPlanUuid = null;
        // ModelAndView response = api.showStudentStudyPlanUsingGET(studyPlanUuid);

        // TODO: test validations
    }
    
}
