package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.CustomSubjectDTO;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MastersubjectcontrollerApi
 */
public class MastersubjectcontrollerApiTest {

    private MastersubjectcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MastersubjectcontrollerApi.class);
    }

    
    /**
     * listAllSubjects
     *
     * 
     */
    @Test
    public void listAllSubjectsUsingGETTest() {
        SessionParams sessionParams = null;
        // CustomSubjectDTO response = api.listAllSubjectsUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * listSyllabusSubjects
     *
     * 
     */
    @Test
    public void listSyllabusSubjectsUsingGETTest() {
        CustomSubjectDTO customSubjectDTO = null;
        SessionParams sessionParams = null;
        // CustomSubjectDTO response = api.listSyllabusSubjectsUsingGET(customSubjectDTO, sessionParams);

        // TODO: test validations
    }
    
}
