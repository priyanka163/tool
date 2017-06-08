package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SubjectTeacherResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubjectteachercontrollerApi
 */
public class SubjectteachercontrollerApiTest {

    private SubjectteachercontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SubjectteachercontrollerApi.class);
    }

    
    /**
     * getsubjectTeacherDetailWithFilters
     *
     * 
     */
    @Test
    public void getsubjectTeacherDetailWithFiltersUsingGETTest() {
        Long sessionId = null;
        SessionParams sessionParams = null;
        // SubjectTeacherResponse response = api.getsubjectTeacherDetailWithFiltersUsingGET(sessionId, sessionParams);

        // TODO: test validations
    }
    
}
