package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.TaskFetchRequest;
import com.nexteducation.swagger.nextsws.model.TaskResponse;
import com.nexteducation.swagger.nextsws.model.DayPlanResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.LectureDetailResponse;
import com.nexteducation.swagger.nextsws.model.DayPlanDTO;
import com.nexteducation.swagger.nextsws.model.StudentStudyPlanResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DayplancontrollerApi
 */
public class DayplancontrollerApiTest {

    private DayplancontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DayplancontrollerApi.class);
    }

    
    /**
     * fetchTasks
     *
     * 
     */
    @Test
    public void fetchTasksUsingPOSTTest() {
        TaskFetchRequest fetchRequest = null;
        String luid = null;
        String lbid = null;
        // List<TaskResponse> response = api.fetchTasksUsingPOST(fetchRequest, luid, lbid);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLectures
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesUsingGETTest() {
        SessionParams sessionParams = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLecturesWithResource
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesWithResourceUsingGETTest() {
        Boolean isLecture = null;
        SessionParams sessionParams = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesWithResourceUsingGET(isLecture, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanDetail
     *
     * 
     */
    @Test
    public void getLearningPlanDetailUsingGETTest() {
        Long classId = null;
        Long sectionId = null;
        Long syllabusId = null;
        Long subjectId = null;
        Boolean customSyllabus = null;
        SessionParams sessionParams = null;
        // LectureDetailResponse response = api.getLearningPlanDetailUsingGET(classId, sectionId, syllabusId, subjectId, customSyllabus, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getPlanForDay
     *
     * 
     */
    @Test
    public void getPlanForDayUsingGETTest() {
        DayPlanDTO dayPlanDTO = null;
        SessionParams sessionParams = null;
        // DayPlanResponse response = api.getPlanForDayUsingGET(dayPlanDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getStudentStudyPlan
     *
     * 
     */
    @Test
    public void getStudentStudyPlanUsingGETTest() {
        DayPlanDTO dayPlanDTO = null;
        SessionParams sessionParams = null;
        // StudentStudyPlanResponse response = api.getStudentStudyPlanUsingGET(dayPlanDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * publishPlan
     *
     * 
     */
    @Test
    public void publishPlanUsingGETTest() {
        String learningPlanId = null;
        // ModelAndView response = api.publishPlanUsingGET(learningPlanId);

        // TODO: test validations
    }
    
    /**
     * updateObjective
     *
     * 
     */
    @Test
    public void updateObjectiveUsingGETTest() {
        String learningPlanId = null;
        String objective = null;
        // ModelAndView response = api.updateObjectiveUsingGET(learningPlanId, objective);

        // TODO: test validations
    }
    
    /**
     * updateResourceCategory
     *
     * 
     */
    @Test
    public void updateResourceCategoryUsingGETTest() {
        String id = null;
        String value = null;
        // Void response = api.updateResourceCategoryUsingGET(id, value);

        // TODO: test validations
    }
    
}
