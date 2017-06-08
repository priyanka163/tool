package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.SyllabusResponseV2;
import com.nexteducation.swagger.nextsws.model.SubjectAndSyllabusResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanRequest;
import com.nexteducation.swagger.nextsws.model.LearningPlanDayWiseResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanDetailResponse;
import com.nexteducation.swagger.nextsws.model.CollectionLearningPlanDetailResponse;
import com.nexteducation.swagger.nextsws.model.ScheduleResponse;
import com.nexteducation.swagger.nextsws.model.ScheduleRequest;
import com.nexteducation.swagger.nextsws.model.StudyPlanDetailResponse;
import com.nexteducation.swagger.nextsws.model.StudyPlanRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SwscontrollerApi
 */
public class SwscontrollerApiTest {

    private SwscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SwscontrollerApi.class);
    }

    
    /**
     * documentViewer
     *
     * 
     */
    @Test
    public void documentViewerUsingGET1Test() {
        Long syllabusId = null;
        String resourceUUID = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        Long chapterId = null;
        String resourceLocation = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.documentViewerUsingGET1(syllabusId, resourceUUID, ifCustomSyllabus, ifCustomChapter, chapterId, resourceLocation, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchChapters
     *
     * 
     */
    @Test
    public void fetchChaptersUsingGETTest() {
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        SessionParams sessionParams = null;
        // SyllabusResponseV2 response = api.fetchChaptersUsingGET(syllabusId, ifCustomSyllabus, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchSyllabus
     *
     * 
     */
    @Test
    public void fetchSyllabusUsingGETTest() {
        SessionParams sessionParams = null;
        // List<SubjectAndSyllabusResponse> response = api.fetchSyllabusUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChapterLevelPage
     *
     * 
     */
    @Test
    public void getChapterLevelPageUsingGETTest() {
        Long syllabusId = null;
        String category = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String schoolSubjectName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getChapterLevelPageUsingGET(syllabusId, category, ifCustomSyllabus, subjectName, schoolSubjectName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChapterPage
     *
     * 
     */
    @Test
    public void getChapterPageUsingGETTest() {
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String subjectName = null;
        String schoolSubjectName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getChapterPageUsingGET(chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, subjectName, schoolSubjectName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChapterWithResourceCount
     *
     * 
     */
    @Test
    public void getChapterWithResourceCountUsingGETTest() {
        Long syllabusId = null;
        String category = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String schoolSubjectName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getChapterWithResourceCountUsingGET(syllabusId, category, ifCustomSyllabus, subjectName, schoolSubjectName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getDayWisePlan
     *
     * 
     */
    @Test
    public void getDayWisePlanUsingPOSTTest() {
        LearningPlanRequest learningPlanRequest = null;
        SessionParams sessionParams = null;
        // LearningPlanDayWiseResponse response = api.getDayWisePlanUsingPOST(learningPlanRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getDetailLearningplanHome
     *
     * 
     */
    @Test
    public void getDetailLearningplanHomeUsingPOSTTest() {
        LearningPlanRequest learningPlanRequest = null;
        SessionParams sessionParams = null;
        // List<LearningPlanDetailResponse> response = api.getDetailLearningplanHomeUsingPOST(learningPlanRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getDetailLearningplan
     *
     * 
     */
    @Test
    public void getDetailLearningplanUsingPOSTTest() {
        LearningPlanRequest learningPlanRequest = null;
        SessionParams sessionParams = null;
        // List<LearningPlanDetailResponse> response = api.getDetailLearningplanUsingPOST(learningPlanRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getJsonForshowHome
     *
     * 
     */
    @Test
    public void getJsonForshowHomeUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.getJsonForshowHomeUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLearningPlansByCriteriaWithResourcesAndCompletion
     *
     * 
     */
    @Test
    public void getLearningPlansByCriteriaWithResourcesAndCompletionUsingPOSTTest() {
        LearningPlanRequest learningPlanRequest = null;
        SessionParams sessionParams = null;
        // CollectionLearningPlanDetailResponse response = api.getLearningPlansByCriteriaWithResourcesAndCompletionUsingPOST(learningPlanRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanswithChapterDetails
     *
     * 
     */
    @Test
    public void getLearningPlanswithChapterDetailsUsingPOSTTest() {
        LearningPlanRequest learningPlanRequest = null;
        SessionParams sessionParams = null;
        // List<LearningPlanDetailResponse> response = api.getLearningPlanswithChapterDetailsUsingPOST(learningPlanRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getPastCurrentAndFutureScheduleOfLecture
     *
     * 
     */
    @Test
    public void getPastCurrentAndFutureScheduleOfLectureUsingPOSTTest() {
        ScheduleRequest scheduleRequest = null;
        SessionParams sessionParams = null;
        // ScheduleResponse response = api.getPastCurrentAndFutureScheduleOfLectureUsingPOST(scheduleRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getStudyPlanWithLearningPlanDetailWithOutResources
     *
     * 
     */
    @Test
    public void getStudyPlanWithLearningPlanDetailWithOutResourcesUsingPOSTTest() {
        StudyPlanRequest studyPlanRequest = null;
        SessionParams sessionParams = null;
        // List<StudyPlanDetailResponse> response = api.getStudyPlanWithLearningPlanDetailWithOutResourcesUsingPOST(studyPlanRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getStudyPlanWithLearningPlanDetails
     *
     * 
     */
    @Test
    public void getStudyPlanWithLearningPlanDetailsUsingPOSTTest() {
        StudyPlanRequest studyPlanRequest = null;
        SessionParams sessionParams = null;
        // List<StudyPlanDetailResponse> response = api.getStudyPlanWithLearningPlanDetailsUsingPOST(studyPlanRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSubjectProjects
     *
     * 
     */
    @Test
    public void getSubjectProjectsUsingGETTest() {
        Long syllabusId = null;
        String subjectName = null;
        String schoolSubjectName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getSubjectProjectsUsingGET(syllabusId, subjectName, schoolSubjectName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * showHome
     *
     * 
     */
    @Test
    public void showHomeUsingGET1Test() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.showHomeUsingGET1(sessionParams);

        // TODO: test validations
    }
    
}
