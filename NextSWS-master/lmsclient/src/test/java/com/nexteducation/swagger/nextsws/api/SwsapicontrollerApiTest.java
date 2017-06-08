package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponseV2;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.SyllabusResponseV2;
import com.nexteducation.swagger.nextsws.model.SubjectAndSyllabusResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SwsapicontrollerApi
 */
public class SwsapicontrollerApiTest {

    private SwsapicontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SwsapicontrollerApi.class);
    }

    
    /**
     * getChaptersForSyllabus
     *
     * 
     */
    @Test
    public void getChaptersForSyllabusUsingGETTest() {
        Long syllabusId = null;
        Long profileId = null;
        Boolean ifCustomSyllabus = null;
        Integer level = null;
        SessionParams sessionParams = null;
        // List<SyllabusNodeResponseV2> response = api.getChaptersForSyllabusUsingGET(syllabusId, profileId, ifCustomSyllabus, level, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChaptersWithSyllabusInfo
     *
     * 
     */
    @Test
    public void getChaptersWithSyllabusInfoUsingGETTest() {
        Long syllabusId = null;
        Long profileId = null;
        Boolean ifCustomSyllabus = null;
        Integer level = null;
        SessionParams sessionParams = null;
        // SyllabusResponseV2 response = api.getChaptersWithSyllabusInfoUsingGET(syllabusId, profileId, ifCustomSyllabus, level, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSyllabusesForStudent
     *
     * 
     */
    @Test
    public void getSyllabusesForStudentUsingGETTest() {
        Long studentId = null;
        Long academicTermId = null;
        Boolean ifMandatorySubject = null;
        Boolean ifOptionalSubject = null;
        Boolean ifCoScholastic = null;
        SessionParams sessionParams = null;
        // List<SubjectAndSyllabusResponse> response = api.getSyllabusesForStudentUsingGET(studentId, academicTermId, ifMandatorySubject, ifOptionalSubject, ifCoScholastic, sessionParams);

        // TODO: test validations
    }
    
}
