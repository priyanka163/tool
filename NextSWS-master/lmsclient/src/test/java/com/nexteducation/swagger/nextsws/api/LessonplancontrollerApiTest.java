package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.AssignmentRequest;
import com.nexteducation.swagger.nextsws.model.UserResourceResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ActivityPlanResponse;
import com.nexteducation.swagger.nextsws.model.AssignmentResponse;
import com.nexteducation.swagger.nextsws.model.WorksheetResponse;
import com.nexteducation.swagger.nextsws.model.LessonPlanResponse;
import com.nexteducation.swagger.nextsws.model.HttpServletResponse;
import com.nexteducation.swagger.nextsws.model.ActivityDTO;
import com.nexteducation.swagger.nextsws.model.WorksheetDTO;
import com.nexteducation.swagger.nextsws.model.LessonPlanSectionDetailResponse;
import com.nexteducation.swagger.nextsws.model.LessonPlanSectionDetailRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LessonplancontrollerApi
 */
public class LessonplancontrollerApiTest {

    private LessonplancontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LessonplancontrollerApi.class);
    }

    
    /**
     * createNewAssignment
     *
     * 
     */
    @Test
    public void createNewAssignmentUsingGETTest() {
        AssignmentRequest assignment = null;
        Long syllabusNode = null;
        Boolean customSyllabusNode = null;
        Long sectionId = null;
        Boolean globalResource = null;
        Long classId = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.createNewAssignmentUsingGET(assignment, syllabusNode, customSyllabusNode, sectionId, globalResource, classId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchActivity
     *
     * 
     */
    @Test
    public void fetchActivityUsingGETTest() {
        String assetUuid = null;
        // ActivityPlanResponse response = api.fetchActivityUsingGET(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchAssignment
     *
     * 
     */
    @Test
    public void fetchAssignmentUsingGETTest() {
        String assetUuid = null;
        // AssignmentResponse response = api.fetchAssignmentUsingGET(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchWorksheet
     *
     * 
     */
    @Test
    public void fetchWorksheetUsingGETTest() {
        String assetUuid = null;
        // WorksheetResponse response = api.fetchWorksheetUsingGET(assetUuid);

        // TODO: test validations
    }
    
    /**
     * getImageSearchResult
     *
     * 
     */
    @Test
    public void getImageSearchResultUsingGETTest() {
        // Void response = api.getImageSearchResultUsingGET();

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingGETTest() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        SessionParams sessionParams = null;
        // Void response = api.getLessonPlanUsingGET(sectionId, classId, chapterId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingGET1Test() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        SessionParams sessionParams = null;
        // List<LessonPlanResponse> response = api.getLessonPlanUsingGET1(sectionId, classId, chapterId, customChapter, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getNextStudioImagesData
     *
     * 
     */
    @Test
    public void getNextStudioImagesDataUsingGETTest() {
        // HttpServletResponse response = api.getNextStudioImagesDataUsingGET();

        // TODO: test validations
    }
    
    /**
     * getVideoSearchResult
     *
     * 
     */
    @Test
    public void getVideoSearchResultUsingGETTest() {
        // Void response = api.getVideoSearchResultUsingGET();

        // TODO: test validations
    }
    
    /**
     * insertLecturePlanActivity
     *
     * 
     */
    @Test
    public void insertLecturePlanActivityUsingGETTest() {
        ActivityDTO activityDTO = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.insertLecturePlanActivityUsingGET(activityDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * insertWorksheet
     *
     * 
     */
    @Test
    public void insertWorksheetUsingGETTest() {
        WorksheetDTO worksheetDTO = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.insertWorksheetUsingGET(worksheetDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * saveLessonPlanSectionData
     *
     * 
     */
    @Test
    public void saveLessonPlanSectionDataUsingGETTest() {
        // Void response = api.saveLessonPlanSectionDataUsingGET();

        // TODO: test validations
    }
    
    /**
     * saveOrUpdateLessonPlan
     *
     * 
     */
    @Test
    public void saveOrUpdateLessonPlanUsingPOSTTest() {
        LessonPlanSectionDetailRequest lessonPlanSectionDetailRequest = null;
        SessionParams sessionParams = null;
        // LessonPlanSectionDetailResponse response = api.saveOrUpdateLessonPlanUsingPOST(lessonPlanSectionDetailRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.showLessonPlanUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * showTeacherWorkspace
     *
     * 
     */
    @Test
    public void showTeacherWorkspaceUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.showTeacherWorkspaceUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateActivity
     *
     * 
     */
    @Test
    public void updateActivityUsingGETTest() {
        ActivityDTO activityDTO = null;
        SessionParams sessionParams = null;
        // ActivityPlanResponse response = api.updateActivityUsingGET(activityDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateAssignment
     *
     * 
     */
    @Test
    public void updateAssignmentUsingGETTest() {
        AssignmentRequest assignmentRequest = null;
        SessionParams sessionParams = null;
        // AssignmentResponse response = api.updateAssignmentUsingGET(assignmentRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateWorksheet
     *
     * 
     */
    @Test
    public void updateWorksheetUsingGETTest() {
        WorksheetDTO worksheetDTO = null;
        SessionParams sessionParams = null;
        // WorksheetResponse response = api.updateWorksheetUsingGET(worksheetDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * uploadVideo
     *
     * 
     */
    @Test
    public void uploadVideoUsingGETTest() {
        // String response = api.uploadVideoUsingGET();

        // TODO: test validations
    }
    
}
