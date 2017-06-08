package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.documentViewerUsingGET1(syllabusId, resourceUUID, ifCustomSyllabus, ifCustomChapter, chapterId, resourceLocation, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // SyllabusResponseV2 response = api.fetchChaptersUsingGET(syllabusId, ifCustomSyllabus, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchSyllabus
     *
     * 
     */
    @Test
    public void fetchSyllabusUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<SubjectAndSyllabusResponse> response = api.fetchSyllabusUsingGET(branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getChapterLevelPageUsingGET(syllabusId, category, ifCustomSyllabus, subjectName, schoolSubjectName, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getChapterPageUsingGET(chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, subjectName, schoolSubjectName, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getChapterWithResourceCountUsingGET(syllabusId, category, ifCustomSyllabus, subjectName, schoolSubjectName, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LearningPlanDayWiseResponse response = api.getDayWisePlanUsingPOST(learningPlanRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanDetailResponse> response = api.getDetailLearningplanHomeUsingPOST(learningPlanRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanDetailResponse> response = api.getDetailLearningplanUsingPOST(learningPlanRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getJsonForshowHome
     *
     * 
     */
    @Test
    public void getJsonForshowHomeUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getJsonForshowHomeUsingGET(branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // CollectionLearningPlanDetailResponse response = api.getLearningPlansByCriteriaWithResourcesAndCompletionUsingPOST(learningPlanRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanDetailResponse> response = api.getLearningPlanswithChapterDetailsUsingPOST(learningPlanRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ScheduleResponse response = api.getPastCurrentAndFutureScheduleOfLectureUsingPOST(scheduleRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<StudyPlanDetailResponse> response = api.getStudyPlanWithLearningPlanDetailWithOutResourcesUsingPOST(studyPlanRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<StudyPlanDetailResponse> response = api.getStudyPlanWithLearningPlanDetailsUsingPOST(studyPlanRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getSubjectProjectsUsingGET(syllabusId, subjectName, schoolSubjectName, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showHome
     *
     * 
     */
    @Test
    public void showHomeUsingGET1Test() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showHomeUsingGET1(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
