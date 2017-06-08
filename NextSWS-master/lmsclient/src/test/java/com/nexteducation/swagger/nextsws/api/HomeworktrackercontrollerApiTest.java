package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.TaskDoc;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HomeworktrackercontrollerApi
 */
public class HomeworktrackercontrollerApiTest {

    private HomeworktrackercontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(HomeworktrackercontrollerApi.class);
    }

    
    /**
     * getLatestHomeWorkWithResourceStudentCount
     *
     * 
     */
    @Test
    public void getLatestHomeWorkWithResourceStudentCountUsingGETTest() {
        Long sectionId = null;
        String className = null;
        String subjectName = null;
        String sectionName = null;
        Long subjectId = null;
        // ModelAndView response = api.getLatestHomeWorkWithResourceStudentCountUsingGET(sectionId, className, subjectName, sectionName, subjectId);

        // TODO: test validations
    }
    
    /**
     * getLatestHomeWorkWithStudent
     *
     * 
     */
    @Test
    public void getLatestHomeWorkWithStudentUsingGETTest() {
        Long sectionId = null;
        // ModelAndView response = api.getLatestHomeWorkWithStudentUsingGET(sectionId);

        // TODO: test validations
    }
    
    /**
     * getLatestPublishedHomeworkWithResource
     *
     * 
     */
    @Test
    public void getLatestPublishedHomeworkWithResourceUsingGETTest() {
        Long sectionId = null;
        Long subjectId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getLatestPublishedHomeworkWithResourceUsingGET(sectionId, subjectId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLectureBasedOnPublishedDateForSection
     *
     * 
     */
    @Test
    public void getLectureBasedOnPublishedDateForSectionUsingGETTest() {
        Long sectionId = null;
        String publishedOn = null;
        Boolean isNext = null;
        Long subjectId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getLectureBasedOnPublishedDateForSectionUsingGET(sectionId, publishedOn, isNext, subjectId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getResourceListForLectureBasedOnUser
     *
     * 
     */
    @Test
    public void getResourceListForLectureBasedOnUserUsingGETTest() {
        Long learningPlanId = null;
        Long userId = null;
        // List<Object> response = api.getResourceListForLectureBasedOnUserUsingGET(learningPlanId, userId);

        // TODO: test validations
    }
    
    /**
     * getResourceListForLecture
     *
     * 
     */
    @Test
    public void getResourceListForLectureUsingGETTest() {
        Long learningPlanId = null;
        // List<Object> response = api.getResourceListForLectureUsingGET(learningPlanId);

        // TODO: test validations
    }
    
    /**
     * getStudentListForLectureBasedOnResource
     *
     * 
     */
    @Test
    public void getStudentListForLectureBasedOnResourceUsingGETTest() {
        Long resourceId = null;
        // List<TaskDoc> response = api.getStudentListForLectureBasedOnResourceUsingGET(resourceId);

        // TODO: test validations
    }
    
}
