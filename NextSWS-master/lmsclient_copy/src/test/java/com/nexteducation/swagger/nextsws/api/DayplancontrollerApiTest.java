package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.TaskFetchRequest;
import com.nexteducation.swagger.nextsws.model.TaskResponse;
import com.nexteducation.swagger.nextsws.model.DayPlanResponse;
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
    public void getCurrentUserTodaysLecturesUsingDELETETest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesUsingDELETE(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLectures
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLectures
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesUsingHEADTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesUsingHEAD(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLectures
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesUsingOPTIONSTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesUsingOPTIONS(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLectures
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesUsingPATCHTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesUsingPATCH(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLectures
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesUsingPOSTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesUsingPOST(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLectures
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesUsingPUTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesUsingPUT(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLecturesWithResource
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesWithResourceUsingDELETETest() {
        Boolean isLecture = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesWithResourceUsingDELETE(isLecture, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesWithResourceUsingGET(isLecture, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLecturesWithResource
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesWithResourceUsingHEADTest() {
        Boolean isLecture = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesWithResourceUsingHEAD(isLecture, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLecturesWithResource
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesWithResourceUsingOPTIONSTest() {
        Boolean isLecture = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesWithResourceUsingOPTIONS(isLecture, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLecturesWithResource
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesWithResourceUsingPATCHTest() {
        Boolean isLecture = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesWithResourceUsingPATCH(isLecture, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLecturesWithResource
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesWithResourceUsingPOSTTest() {
        Boolean isLecture = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesWithResourceUsingPOST(isLecture, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCurrentUserTodaysLecturesWithResource
     *
     * 
     */
    @Test
    public void getCurrentUserTodaysLecturesWithResourceUsingPUTTest() {
        Boolean isLecture = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getCurrentUserTodaysLecturesWithResourceUsingPUT(isLecture, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanDetail
     *
     * 
     */
    @Test
    public void getLearningPlanDetailUsingDELETETest() {
        Long classId = null;
        Long sectionId = null;
        Long syllabusId = null;
        Long subjectId = null;
        Boolean customSyllabus = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureDetailResponse response = api.getLearningPlanDetailUsingDELETE(classId, sectionId, syllabusId, subjectId, customSyllabus, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureDetailResponse response = api.getLearningPlanDetailUsingGET(classId, sectionId, syllabusId, subjectId, customSyllabus, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanDetail
     *
     * 
     */
    @Test
    public void getLearningPlanDetailUsingHEADTest() {
        Long classId = null;
        Long sectionId = null;
        Long syllabusId = null;
        Long subjectId = null;
        Boolean customSyllabus = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureDetailResponse response = api.getLearningPlanDetailUsingHEAD(classId, sectionId, syllabusId, subjectId, customSyllabus, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanDetail
     *
     * 
     */
    @Test
    public void getLearningPlanDetailUsingOPTIONSTest() {
        Long classId = null;
        Long sectionId = null;
        Long syllabusId = null;
        Long subjectId = null;
        Boolean customSyllabus = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureDetailResponse response = api.getLearningPlanDetailUsingOPTIONS(classId, sectionId, syllabusId, subjectId, customSyllabus, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanDetail
     *
     * 
     */
    @Test
    public void getLearningPlanDetailUsingPATCHTest() {
        Long classId = null;
        Long sectionId = null;
        Long syllabusId = null;
        Long subjectId = null;
        Boolean customSyllabus = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureDetailResponse response = api.getLearningPlanDetailUsingPATCH(classId, sectionId, syllabusId, subjectId, customSyllabus, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanDetail
     *
     * 
     */
    @Test
    public void getLearningPlanDetailUsingPOSTTest() {
        Long classId = null;
        Long sectionId = null;
        Long syllabusId = null;
        Long subjectId = null;
        Boolean customSyllabus = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureDetailResponse response = api.getLearningPlanDetailUsingPOST(classId, sectionId, syllabusId, subjectId, customSyllabus, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanDetail
     *
     * 
     */
    @Test
    public void getLearningPlanDetailUsingPUTTest() {
        Long classId = null;
        Long sectionId = null;
        Long syllabusId = null;
        Long subjectId = null;
        Boolean customSyllabus = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureDetailResponse response = api.getLearningPlanDetailUsingPUT(classId, sectionId, syllabusId, subjectId, customSyllabus, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getPlanForDay
     *
     * 
     */
    @Test
    public void getPlanForDayUsingDELETETest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getPlanForDayUsingDELETE(dayPlanDTO, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getPlanForDayUsingGET(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getPlanForDay
     *
     * 
     */
    @Test
    public void getPlanForDayUsingHEADTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getPlanForDayUsingHEAD(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getPlanForDay
     *
     * 
     */
    @Test
    public void getPlanForDayUsingOPTIONSTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getPlanForDayUsingOPTIONS(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getPlanForDay
     *
     * 
     */
    @Test
    public void getPlanForDayUsingPATCHTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getPlanForDayUsingPATCH(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getPlanForDay
     *
     * 
     */
    @Test
    public void getPlanForDayUsingPOSTTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getPlanForDayUsingPOST(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getPlanForDay
     *
     * 
     */
    @Test
    public void getPlanForDayUsingPUTTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // DayPlanResponse response = api.getPlanForDayUsingPUT(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getStudentStudyPlan
     *
     * 
     */
    @Test
    public void getStudentStudyPlanUsingDELETETest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // StudentStudyPlanResponse response = api.getStudentStudyPlanUsingDELETE(dayPlanDTO, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // StudentStudyPlanResponse response = api.getStudentStudyPlanUsingGET(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getStudentStudyPlan
     *
     * 
     */
    @Test
    public void getStudentStudyPlanUsingHEADTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // StudentStudyPlanResponse response = api.getStudentStudyPlanUsingHEAD(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getStudentStudyPlan
     *
     * 
     */
    @Test
    public void getStudentStudyPlanUsingOPTIONSTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // StudentStudyPlanResponse response = api.getStudentStudyPlanUsingOPTIONS(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getStudentStudyPlan
     *
     * 
     */
    @Test
    public void getStudentStudyPlanUsingPATCHTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // StudentStudyPlanResponse response = api.getStudentStudyPlanUsingPATCH(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getStudentStudyPlan
     *
     * 
     */
    @Test
    public void getStudentStudyPlanUsingPOSTTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // StudentStudyPlanResponse response = api.getStudentStudyPlanUsingPOST(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getStudentStudyPlan
     *
     * 
     */
    @Test
    public void getStudentStudyPlanUsingPUTTest() {
        DayPlanDTO dayPlanDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // StudentStudyPlanResponse response = api.getStudentStudyPlanUsingPUT(dayPlanDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * publishPlan
     *
     * 
     */
    @Test
    public void publishPlanUsingDELETETest() {
        String learningPlanId = null;
        // ModelAndView response = api.publishPlanUsingDELETE(learningPlanId);

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
     * publishPlan
     *
     * 
     */
    @Test
    public void publishPlanUsingHEADTest() {
        String learningPlanId = null;
        // ModelAndView response = api.publishPlanUsingHEAD(learningPlanId);

        // TODO: test validations
    }
    
    /**
     * publishPlan
     *
     * 
     */
    @Test
    public void publishPlanUsingOPTIONSTest() {
        String learningPlanId = null;
        // ModelAndView response = api.publishPlanUsingOPTIONS(learningPlanId);

        // TODO: test validations
    }
    
    /**
     * publishPlan
     *
     * 
     */
    @Test
    public void publishPlanUsingPATCHTest() {
        String learningPlanId = null;
        // ModelAndView response = api.publishPlanUsingPATCH(learningPlanId);

        // TODO: test validations
    }
    
    /**
     * publishPlan
     *
     * 
     */
    @Test
    public void publishPlanUsingPOST1Test() {
        String learningPlanId = null;
        // ModelAndView response = api.publishPlanUsingPOST1(learningPlanId);

        // TODO: test validations
    }
    
    /**
     * publishPlan
     *
     * 
     */
    @Test
    public void publishPlanUsingPUTTest() {
        String learningPlanId = null;
        // ModelAndView response = api.publishPlanUsingPUT(learningPlanId);

        // TODO: test validations
    }
    
    /**
     * updateObjective
     *
     * 
     */
    @Test
    public void updateObjectiveUsingDELETETest() {
        String learningPlanId = null;
        String objective = null;
        // ModelAndView response = api.updateObjectiveUsingDELETE(learningPlanId, objective);

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
     * updateObjective
     *
     * 
     */
    @Test
    public void updateObjectiveUsingHEADTest() {
        String learningPlanId = null;
        String objective = null;
        // ModelAndView response = api.updateObjectiveUsingHEAD(learningPlanId, objective);

        // TODO: test validations
    }
    
    /**
     * updateObjective
     *
     * 
     */
    @Test
    public void updateObjectiveUsingOPTIONSTest() {
        String learningPlanId = null;
        String objective = null;
        // ModelAndView response = api.updateObjectiveUsingOPTIONS(learningPlanId, objective);

        // TODO: test validations
    }
    
    /**
     * updateObjective
     *
     * 
     */
    @Test
    public void updateObjectiveUsingPATCHTest() {
        String learningPlanId = null;
        String objective = null;
        // ModelAndView response = api.updateObjectiveUsingPATCH(learningPlanId, objective);

        // TODO: test validations
    }
    
    /**
     * updateObjective
     *
     * 
     */
    @Test
    public void updateObjectiveUsingPOSTTest() {
        String learningPlanId = null;
        String objective = null;
        // ModelAndView response = api.updateObjectiveUsingPOST(learningPlanId, objective);

        // TODO: test validations
    }
    
    /**
     * updateObjective
     *
     * 
     */
    @Test
    public void updateObjectiveUsingPUTTest() {
        String learningPlanId = null;
        String objective = null;
        // ModelAndView response = api.updateObjectiveUsingPUT(learningPlanId, objective);

        // TODO: test validations
    }
    
    /**
     * updateResourceCategory
     *
     * 
     */
    @Test
    public void updateResourceCategoryUsingDELETETest() {
        String id = null;
        String value = null;
        // Void response = api.updateResourceCategoryUsingDELETE(id, value);

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
    
    /**
     * updateResourceCategory
     *
     * 
     */
    @Test
    public void updateResourceCategoryUsingHEADTest() {
        String id = null;
        String value = null;
        // Void response = api.updateResourceCategoryUsingHEAD(id, value);

        // TODO: test validations
    }
    
    /**
     * updateResourceCategory
     *
     * 
     */
    @Test
    public void updateResourceCategoryUsingOPTIONSTest() {
        String id = null;
        String value = null;
        // Void response = api.updateResourceCategoryUsingOPTIONS(id, value);

        // TODO: test validations
    }
    
    /**
     * updateResourceCategory
     *
     * 
     */
    @Test
    public void updateResourceCategoryUsingPATCHTest() {
        String id = null;
        String value = null;
        // Void response = api.updateResourceCategoryUsingPATCH(id, value);

        // TODO: test validations
    }
    
    /**
     * updateResourceCategory
     *
     * 
     */
    @Test
    public void updateResourceCategoryUsingPOSTTest() {
        String id = null;
        String value = null;
        // Void response = api.updateResourceCategoryUsingPOST(id, value);

        // TODO: test validations
    }
    
    /**
     * updateResourceCategory
     *
     * 
     */
    @Test
    public void updateResourceCategoryUsingPUTTest() {
        String id = null;
        String value = null;
        // Void response = api.updateResourceCategoryUsingPUT(id, value);

        // TODO: test validations
    }
    
}
