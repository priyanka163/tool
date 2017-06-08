package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.LecturePlanResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.StudyPlanResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LecturebreakupcontrollerApi
 */
public class LecturebreakupcontrollerApiTest {

    private LecturebreakupcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LecturebreakupcontrollerApi.class);
    }

    
    /**
     * getLectureBreakupDetail
     *
     * 
     */
    @Test
    public void getLectureBreakupDetailUsingGETTest() {
        Long subjectId = null;
        Long classId = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // LecturePlanResponse response = api.getLectureBreakupDetailUsingGET(subjectId, classId, sectionId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * loadStudyPlanData
     *
     * 
     */
    @Test
    public void loadStudyPlanDataUsingGETTest() {
        Long subjectId = null;
        Long classId = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // StudyPlanResponse response = api.loadStudyPlanDataUsingGET(subjectId, classId, sectionId, sessionParams);

        // TODO: test validations
    }
    
}
