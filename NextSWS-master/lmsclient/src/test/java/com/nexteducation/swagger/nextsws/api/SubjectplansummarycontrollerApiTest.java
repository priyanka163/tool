package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SubjectPlanSummaryResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubjectplansummarycontrollerApi
 */
public class SubjectplansummarycontrollerApiTest {

    private SubjectplansummarycontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SubjectplansummarycontrollerApi.class);
    }

    
    /**
     * getSubjectPlanSummaryResponse
     *
     * 
     */
    @Test
    public void getSubjectPlanSummaryResponseUsingGETTest() {
        Long subjectId = null;
        Long syllabusId = null;
        Long classId = null;
        Long sectionId = null;
        Boolean customSyllabus = null;
        SessionParams sessionParams = null;
        // SubjectPlanSummaryResponse response = api.getSubjectPlanSummaryResponseUsingGET(subjectId, syllabusId, classId, sectionId, customSyllabus, sessionParams);

        // TODO: test validations
    }
    
}
