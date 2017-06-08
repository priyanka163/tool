package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.LearningPlanResourceResponse;
import com.nexteducation.swagger.nextsws.model.LPResourceRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.LectureResourceResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanResourceDTO;
import com.nexteducation.swagger.nextsws.model.TopicResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanTaskFetchRequest;
import com.nexteducation.swagger.nextsws.model.LearningPlanTaskResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanMemberResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanTaskDetailResponse;
import com.nexteducation.swagger.nextsws.model.TaskFetchRequest;
import com.nexteducation.swagger.nextsws.model.LearningPlanChapterResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanScheduleResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanTimeTableResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanRequest;
import com.nexteducation.swagger.nextsws.model.LearningPlanHomeworkTaskResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanResponse;
import com.nexteducation.swagger.nextsws.model.StudyPlanTypeResponse;
import com.nexteducation.swagger.nextsws.model.LectureBreakupRequest;
import com.nexteducation.swagger.nextsws.model.StudyPlanResponse;
import com.nexteducation.swagger.nextsws.model.LectureBreakupDTO;
import com.nexteducation.swagger.nextsws.model.LearningPlanResourceRequest;
import com.nexteducation.swagger.nextsws.model.LecturePlanDTO;
import com.nexteducation.swagger.nextsws.model.LearningPlanTaskUpdateRequest;
import com.nexteducation.swagger.nextsws.model.Response;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LearningplancontrollerApi
 */
public class LearningplancontrollerApiTest {

    private LearningplancontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LearningplancontrollerApi.class);
    }

    
    /**
     * addLearningPlanResource
     *
     * 
     */
    @Test
    public void addLearningPlanResourceUsingPOSTTest() {
        List<LPResourceRequest> resourceRequests = null;
        String learningPlanMemberUuid = null;
        Long sectionId = null;
        Long classId = null;
        Long subjectId = null;
        SessionParams sessionParams = null;
        // List<LearningPlanResourceResponse> response = api.addLearningPlanResourceUsingPOST(resourceRequests, learningPlanMemberUuid, sectionId, classId, subjectId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * addLectureResource
     *
     * 
     */
    @Test
    public void addLectureResourceUsingPOSTTest() {
        List<String> resourceUuids = null;
        String learningPlanMemberUuid = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // List<LectureResourceResponse> response = api.addLectureResourceUsingPOST(resourceUuids, learningPlanMemberUuid, sectionId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * deleteLearningPlanResource
     *
     * 
     */
    @Test
    public void deleteLearningPlanResourceUsingGETTest() {
        String resourceUuid = null;
        String learningPlanMemberUuid = null;
        Long sectionId = null;
        Long classId = null;
        Long subjectId = null;
        SessionParams sessionParams = null;
        // String response = api.deleteLearningPlanResourceUsingGET(resourceUuid, learningPlanMemberUuid, sectionId, classId, subjectId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * deleteLectureResource
     *
     * 
     */
    @Test
    public void deleteLectureResourceUsingGETTest() {
        String learningPlanMemberUuid = null;
        String resourceUuid = null;
        Long sectionId = null;
        // Void response = api.deleteLectureResourceUsingGET(learningPlanMemberUuid, resourceUuid, sectionId);

        // TODO: test validations
    }
    
    /**
     * fetchChapterDetails
     *
     * 
     */
    @Test
    public void fetchChapterDetailsUsingGETTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long studyClassId = null;
        List<SyllabusNodeResponse> chapterList = null;
        SessionParams sessionParams = null;
        // Map<String, List> response = api.fetchChapterDetailsUsingGET(subjectId, sectionId, studyClassId, chapterList, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchLearningPlanResourceTopic
     *
     * 
     */
    @Test
    public void fetchLearningPlanResourceTopicUsingGETTest() {
        LearningPlanResourceDTO learningPlanResourceDTO = null;
        // List<TopicResponse> response = api.fetchLearningPlanResourceTopicUsingGET(learningPlanResourceDTO);

        // TODO: test validations
    }
    
    /**
     * fetchLearningPlanTasks
     *
     * 
     */
    @Test
    public void fetchLearningPlanTasksUsingPOSTTest() {
        LearningPlanTaskFetchRequest fetchRequest = null;
        SessionParams sessionParams = null;
        // List<LearningPlanTaskResponse> response = api.fetchLearningPlanTasksUsingPOST(fetchRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchSyllabusByLearningPlanMember
     *
     * 
     */
    @Test
    public void fetchSyllabusByLearningPlanMemberUsingGETTest() {
        String lpmuuid = null;
        // List<LearningPlanMemberResponse> response = api.fetchSyllabusByLearningPlanMemberUsingGET(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * fetchUserTasks
     *
     * 
     */
    @Test
    public void fetchUserTasksUsingPOSTTest() {
        TaskFetchRequest fetchRequest = null;
        SessionParams sessionParams = null;
        // List<LearningPlanTaskDetailResponse> response = api.fetchUserTasksUsingPOST(fetchRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getCompletionCount
     *
     * 
     */
    @Test
    public void getCompletionCountUsingGETTest() {
        Long subjectId = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // List<LearningPlanChapterResponse> response = api.getCompletionCountUsingGET(subjectId, sectionId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanResourceByResourceUuid
     *
     * 
     */
    @Test
    public void getLearningPlanResourceByResourceUuidUsingGETTest() {
        String lpmuuid = null;
        // List<LearningPlanScheduleResponse> response = api.getLearningPlanResourceByResourceUuidUsingGET(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanSWSHome
     *
     * 
     */
    @Test
    public void getLearningPlanSWSHomeUsingGETTest() {
        LearningPlanRequest learningPlanRequest = null;
        // List<LearningPlanTimeTableResponse> response = api.getLearningPlanSWSHomeUsingGET(learningPlanRequest);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanTaskBasedOnLearningPlanMemberUuid
     *
     * 
     */
    @Test
    public void getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingGETTest() {
        LearningPlanTaskFetchRequest fetchRequest = null;
        Long classId = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // LearningPlanHomeworkTaskResponse response = api.getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingGET(fetchRequest, classId, sectionId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLearningPlansBasedOnStudyPlanUuid
     *
     * 
     */
    @Test
    public void getLearningPlansBasedOnStudyPlanUuidUsingGETTest() {
        String studyPlanUuid = null;
        // List<LearningPlanResponse> response = api.getLearningPlansBasedOnStudyPlanUuidUsingGET(studyPlanUuid);

        // TODO: test validations
    }
    
    /**
     * getStudyPlanTypes
     *
     * 
     */
    @Test
    public void getStudyPlanTypesUsingGETTest() {
        // List<StudyPlanTypeResponse> response = api.getStudyPlanTypesUsingGET();

        // TODO: test validations
    }
    
    /**
     * getStudyPlansBasedOnFilter
     *
     * 
     */
    @Test
    public void getStudyPlansBasedOnFilterUsingPOSTTest() {
        LectureBreakupRequest lectureBreakupRequest = null;
        SessionParams sessionParams = null;
        // List<StudyPlanResponse> response = api.getStudyPlansBasedOnFilterUsingPOST(lectureBreakupRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * insertLearningPlan
     *
     * 
     */
    @Test
    public void insertLearningPlanUsingPOSTTest() {
        LectureBreakupDTO breakupDTO = null;
        SessionParams sessionParams = null;
        // Object response = api.insertLearningPlanUsingPOST(breakupDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlanResourceDueDate
     *
     * 
     */
    @Test
    public void updateLearningPlanResourceDueDateUsingPOSTTest() {
        LearningPlanResourceRequest learningPlanResourceRequest = null;
        // LearningPlanResourceResponse response = api.updateLearningPlanResourceDueDateUsingPOST(learningPlanResourceRequest);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlanResourceType
     *
     * 
     */
    @Test
    public void updateLearningPlanResourceTypeUsingGETTest() {
        String learningPlanResourceUuid = null;
        String learningPlanResourceType = null;
        // LearningPlanResourceResponse response = api.updateLearningPlanResourceTypeUsingGET(learningPlanResourceUuid, learningPlanResourceType);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingGETTest() {
        LecturePlanDTO lecturePlanDTO = null;
        String lecturePlanUuid = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // Void response = api.updateLearningPlanUsingGET(lecturePlanDTO, lecturePlanUuid, sectionId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingGET1Test() {
        List<LearningPlanResourceDTO> dtoList = null;
        // Void response = api.updateLearningPlanUsingGET1(dtoList);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingPOSTTest() {
        String learningPlanUuid = null;
        // String response = api.updateLearningPlanUsingPOST(learningPlanUuid);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlansTasksBasedOnUuid
     *
     * 
     */
    @Test
    public void updateLearningPlansTasksBasedOnUuidUsingPOSTTest() {
        List<LearningPlanTaskUpdateRequest> taskUpdateRequests = null;
        SessionParams sessionParams = null;
        // Response response = api.updateLearningPlansTasksBasedOnUuidUsingPOST(taskUpdateRequests, sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateLectureResourceDetail
     *
     * 
     */
    @Test
    public void updateLectureResourceDetailUsingGETTest() {
        LearningPlanResourceDTO resourceDTO = null;
        SessionParams sessionParams = null;
        // LectureResourceResponse response = api.updateLectureResourceDetailUsingGET(resourceDTO, sessionParams);

        // TODO: test validations
    }
    
}
