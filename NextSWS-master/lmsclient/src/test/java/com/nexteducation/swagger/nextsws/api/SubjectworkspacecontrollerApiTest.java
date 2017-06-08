package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.StudentSubjectResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubjectworkspacecontrollerApi
 */
public class SubjectworkspacecontrollerApiTest {

    private SubjectworkspacecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SubjectworkspacecontrollerApi.class);
    }

    
    /**
     * getAccessibleSubjcetWithValidSyllabus
     *
     * 
     */
    @Test
    public void getAccessibleSubjcetWithValidSyllabusUsingGETTest() {
        String academicTerm = null;
        Boolean ifMandatorySubject = null;
        Boolean ifOptionalSubject = null;
        Boolean ifCoScholastic = null;
        SessionParams sessionParams = null;
        // Object response = api.getAccessibleSubjcetWithValidSyllabusUsingGET(academicTerm, ifMandatorySubject, ifOptionalSubject, ifCoScholastic, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getAccessibleSubjectOfStudent
     *
     * 
     */
    @Test
    public void getAccessibleSubjectOfStudentUsingGETTest() {
        String academicTerm = null;
        Boolean ifMandatorySubject = null;
        Boolean ifOptionalSubject = null;
        Boolean ifCoScholastic = null;
        SessionParams sessionParams = null;
        // List<StudentSubjectResponse> response = api.getAccessibleSubjectOfStudentUsingGET(academicTerm, ifMandatorySubject, ifOptionalSubject, ifCoScholastic, sessionParams);

        // TODO: test validations
    }
    
}
