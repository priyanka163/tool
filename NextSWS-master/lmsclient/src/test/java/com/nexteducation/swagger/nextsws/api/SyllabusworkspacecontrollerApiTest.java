package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.FilterRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SyllabusworkspacecontrollerApi
 */
public class SyllabusworkspacecontrollerApiTest {

    private SyllabusworkspacecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SyllabusworkspacecontrollerApi.class);
    }

    
    /**
     * getSyllabusAndResourceForSyllabus
     *
     * 
     */
    @Test
    public void getSyllabusAndResourceForSyllabusUsingGETTest() {
        Long syllabusId = null;
        Integer level = null;
        Boolean ifCustomSyllabus = null;
        SessionParams sessionParams = null;
        // Object response = api.getSyllabusAndResourceForSyllabusUsingGET(syllabusId, level, ifCustomSyllabus, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSyllabusForSyllabus
     *
     * 
     */
    @Test
    public void getSyllabusForSyllabusUsingGETTest() {
        Long syllabusId = null;
        Integer level = null;
        Boolean ifCustomSyllabus = null;
        SessionParams sessionParams = null;
        // Object response = api.getSyllabusForSyllabusUsingGET(syllabusId, level, ifCustomSyllabus, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSyllabusNodeResourcesForSyllabusNode
     *
     * 
     */
    @Test
    public void getSyllabusNodeResourcesForSyllabusNodeUsingPOSTTest() {
        Long syllabusNodeId = null;
        FilterRequest filterRequest = null;
        SessionParams sessionParams = null;
        // Object response = api.getSyllabusNodeResourcesForSyllabusNodeUsingPOST(syllabusNodeId, filterRequest, sessionParams);

        // TODO: test validations
    }
    
}
