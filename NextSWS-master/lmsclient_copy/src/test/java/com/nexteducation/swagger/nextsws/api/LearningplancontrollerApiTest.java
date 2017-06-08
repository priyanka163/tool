package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.LearningPlanResourceResponse;
import com.nexteducation.swagger.nextsws.model.LPResourceRequest;
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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanResourceResponse> response = api.addLearningPlanResourceUsingPOST(resourceRequests, learningPlanMemberUuid, sectionId, classId, subjectId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LectureResourceResponse> response = api.addLectureResourceUsingPOST(resourceUuids, learningPlanMemberUuid, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteLearningPlanResource
     *
     * 
     */
    @Test
    public void deleteLearningPlanResourceUsingDELETETest() {
        String resourceUuid = null;
        String learningPlanMemberUuid = null;
        Long sectionId = null;
        Long classId = null;
        Long subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // String response = api.deleteLearningPlanResourceUsingDELETE(resourceUuid, learningPlanMemberUuid, sectionId, classId, subjectId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // String response = api.deleteLearningPlanResourceUsingGET(resourceUuid, learningPlanMemberUuid, sectionId, classId, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteLearningPlanResource
     *
     * 
     */
    @Test
    public void deleteLearningPlanResourceUsingHEADTest() {
        String resourceUuid = null;
        String learningPlanMemberUuid = null;
        Long sectionId = null;
        Long classId = null;
        Long subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // String response = api.deleteLearningPlanResourceUsingHEAD(resourceUuid, learningPlanMemberUuid, sectionId, classId, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteLearningPlanResource
     *
     * 
     */
    @Test
    public void deleteLearningPlanResourceUsingOPTIONSTest() {
        String resourceUuid = null;
        String learningPlanMemberUuid = null;
        Long sectionId = null;
        Long classId = null;
        Long subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // String response = api.deleteLearningPlanResourceUsingOPTIONS(resourceUuid, learningPlanMemberUuid, sectionId, classId, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteLearningPlanResource
     *
     * 
     */
    @Test
    public void deleteLearningPlanResourceUsingPATCHTest() {
        String resourceUuid = null;
        String learningPlanMemberUuid = null;
        Long sectionId = null;
        Long classId = null;
        Long subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // String response = api.deleteLearningPlanResourceUsingPATCH(resourceUuid, learningPlanMemberUuid, sectionId, classId, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteLearningPlanResource
     *
     * 
     */
    @Test
    public void deleteLearningPlanResourceUsingPOSTTest() {
        String resourceUuid = null;
        String learningPlanMemberUuid = null;
        Long sectionId = null;
        Long classId = null;
        Long subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // String response = api.deleteLearningPlanResourceUsingPOST(resourceUuid, learningPlanMemberUuid, sectionId, classId, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteLearningPlanResource
     *
     * 
     */
    @Test
    public void deleteLearningPlanResourceUsingPUTTest() {
        String resourceUuid = null;
        String learningPlanMemberUuid = null;
        Long sectionId = null;
        Long classId = null;
        Long subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // String response = api.deleteLearningPlanResourceUsingPUT(resourceUuid, learningPlanMemberUuid, sectionId, classId, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteLectureResource
     *
     * 
     */
    @Test
    public void deleteLectureResourceUsingDELETETest() {
        String learningPlanMemberUuid = null;
        String resourceUuid = null;
        Long sectionId = null;
        // Void response = api.deleteLectureResourceUsingDELETE(learningPlanMemberUuid, resourceUuid, sectionId);

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
     * deleteLectureResource
     *
     * 
     */
    @Test
    public void deleteLectureResourceUsingHEADTest() {
        String learningPlanMemberUuid = null;
        String resourceUuid = null;
        Long sectionId = null;
        // Void response = api.deleteLectureResourceUsingHEAD(learningPlanMemberUuid, resourceUuid, sectionId);

        // TODO: test validations
    }
    
    /**
     * deleteLectureResource
     *
     * 
     */
    @Test
    public void deleteLectureResourceUsingOPTIONSTest() {
        String learningPlanMemberUuid = null;
        String resourceUuid = null;
        Long sectionId = null;
        // Void response = api.deleteLectureResourceUsingOPTIONS(learningPlanMemberUuid, resourceUuid, sectionId);

        // TODO: test validations
    }
    
    /**
     * deleteLectureResource
     *
     * 
     */
    @Test
    public void deleteLectureResourceUsingPATCHTest() {
        String learningPlanMemberUuid = null;
        String resourceUuid = null;
        Long sectionId = null;
        // Void response = api.deleteLectureResourceUsingPATCH(learningPlanMemberUuid, resourceUuid, sectionId);

        // TODO: test validations
    }
    
    /**
     * deleteLectureResource
     *
     * 
     */
    @Test
    public void deleteLectureResourceUsingPOSTTest() {
        String learningPlanMemberUuid = null;
        String resourceUuid = null;
        Long sectionId = null;
        // Void response = api.deleteLectureResourceUsingPOST(learningPlanMemberUuid, resourceUuid, sectionId);

        // TODO: test validations
    }
    
    /**
     * deleteLectureResource
     *
     * 
     */
    @Test
    public void deleteLectureResourceUsingPUTTest() {
        String learningPlanMemberUuid = null;
        String resourceUuid = null;
        Long sectionId = null;
        // Void response = api.deleteLectureResourceUsingPUT(learningPlanMemberUuid, resourceUuid, sectionId);

        // TODO: test validations
    }
    
    /**
     * fetchChapterDetails
     *
     * 
     */
    @Test
    public void fetchChapterDetailsUsingDELETETest() {
        Long subjectId = null;
        Long sectionId = null;
        Long studyClassId = null;
        List<SyllabusNodeResponse> chapterList = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Map<String, List<LearningPlanMemberResponse>> response = api.fetchChapterDetailsUsingDELETE(subjectId, sectionId, studyClassId, chapterList, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Map<String, List<LearningPlanMemberResponse>> response = api.fetchChapterDetailsUsingGET(subjectId, sectionId, studyClassId, chapterList, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchChapterDetails
     *
     * 
     */
    @Test
    public void fetchChapterDetailsUsingHEADTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long studyClassId = null;
        List<SyllabusNodeResponse> chapterList = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Map<String, List<LearningPlanMemberResponse>> response = api.fetchChapterDetailsUsingHEAD(subjectId, sectionId, studyClassId, chapterList, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchChapterDetails
     *
     * 
     */
    @Test
    public void fetchChapterDetailsUsingOPTIONSTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long studyClassId = null;
        List<SyllabusNodeResponse> chapterList = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Map<String, List<LearningPlanMemberResponse>> response = api.fetchChapterDetailsUsingOPTIONS(subjectId, sectionId, studyClassId, chapterList, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchChapterDetails
     *
     * 
     */
    @Test
    public void fetchChapterDetailsUsingPATCHTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long studyClassId = null;
        List<SyllabusNodeResponse> chapterList = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Map<String, List<LearningPlanMemberResponse>> response = api.fetchChapterDetailsUsingPATCH(subjectId, sectionId, studyClassId, chapterList, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchChapterDetails
     *
     * 
     */
    @Test
    public void fetchChapterDetailsUsingPOSTTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long studyClassId = null;
        List<SyllabusNodeResponse> chapterList = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Map<String, List<LearningPlanMemberResponse>> response = api.fetchChapterDetailsUsingPOST(subjectId, sectionId, studyClassId, chapterList, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchChapterDetails
     *
     * 
     */
    @Test
    public void fetchChapterDetailsUsingPUTTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long studyClassId = null;
        List<SyllabusNodeResponse> chapterList = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Map<String, List<LearningPlanMemberResponse>> response = api.fetchChapterDetailsUsingPUT(subjectId, sectionId, studyClassId, chapterList, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchLearningPlanResourceTopic
     *
     * 
     */
    @Test
    public void fetchLearningPlanResourceTopicUsingDELETETest() {
        LearningPlanResourceDTO learningPlanResourceDTO = null;
        // List<TopicResponse> response = api.fetchLearningPlanResourceTopicUsingDELETE(learningPlanResourceDTO);

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
     * fetchLearningPlanResourceTopic
     *
     * 
     */
    @Test
    public void fetchLearningPlanResourceTopicUsingHEADTest() {
        LearningPlanResourceDTO learningPlanResourceDTO = null;
        // List<TopicResponse> response = api.fetchLearningPlanResourceTopicUsingHEAD(learningPlanResourceDTO);

        // TODO: test validations
    }
    
    /**
     * fetchLearningPlanResourceTopic
     *
     * 
     */
    @Test
    public void fetchLearningPlanResourceTopicUsingOPTIONSTest() {
        LearningPlanResourceDTO learningPlanResourceDTO = null;
        // List<TopicResponse> response = api.fetchLearningPlanResourceTopicUsingOPTIONS(learningPlanResourceDTO);

        // TODO: test validations
    }
    
    /**
     * fetchLearningPlanResourceTopic
     *
     * 
     */
    @Test
    public void fetchLearningPlanResourceTopicUsingPATCHTest() {
        LearningPlanResourceDTO learningPlanResourceDTO = null;
        // List<TopicResponse> response = api.fetchLearningPlanResourceTopicUsingPATCH(learningPlanResourceDTO);

        // TODO: test validations
    }
    
    /**
     * fetchLearningPlanResourceTopic
     *
     * 
     */
    @Test
    public void fetchLearningPlanResourceTopicUsingPOSTTest() {
        LearningPlanResourceDTO learningPlanResourceDTO = null;
        // List<TopicResponse> response = api.fetchLearningPlanResourceTopicUsingPOST(learningPlanResourceDTO);

        // TODO: test validations
    }
    
    /**
     * fetchLearningPlanResourceTopic
     *
     * 
     */
    @Test
    public void fetchLearningPlanResourceTopicUsingPUTTest() {
        LearningPlanResourceDTO learningPlanResourceDTO = null;
        // List<TopicResponse> response = api.fetchLearningPlanResourceTopicUsingPUT(learningPlanResourceDTO);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanTaskResponse> response = api.fetchLearningPlanTasksUsingPOST(fetchRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchSyllabusByLearningPlanMember
     *
     * 
     */
    @Test
    public void fetchSyllabusByLearningPlanMemberUsingDELETETest() {
        String lpmuuid = null;
        // List<LearningPlanMemberResponse> response = api.fetchSyllabusByLearningPlanMemberUsingDELETE(lpmuuid);

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
     * fetchSyllabusByLearningPlanMember
     *
     * 
     */
    @Test
    public void fetchSyllabusByLearningPlanMemberUsingHEADTest() {
        String lpmuuid = null;
        // List<LearningPlanMemberResponse> response = api.fetchSyllabusByLearningPlanMemberUsingHEAD(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * fetchSyllabusByLearningPlanMember
     *
     * 
     */
    @Test
    public void fetchSyllabusByLearningPlanMemberUsingOPTIONSTest() {
        String lpmuuid = null;
        // List<LearningPlanMemberResponse> response = api.fetchSyllabusByLearningPlanMemberUsingOPTIONS(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * fetchSyllabusByLearningPlanMember
     *
     * 
     */
    @Test
    public void fetchSyllabusByLearningPlanMemberUsingPATCHTest() {
        String lpmuuid = null;
        // List<LearningPlanMemberResponse> response = api.fetchSyllabusByLearningPlanMemberUsingPATCH(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * fetchSyllabusByLearningPlanMember
     *
     * 
     */
    @Test
    public void fetchSyllabusByLearningPlanMemberUsingPOSTTest() {
        String lpmuuid = null;
        // List<LearningPlanMemberResponse> response = api.fetchSyllabusByLearningPlanMemberUsingPOST(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * fetchSyllabusByLearningPlanMember
     *
     * 
     */
    @Test
    public void fetchSyllabusByLearningPlanMemberUsingPUTTest() {
        String lpmuuid = null;
        // List<LearningPlanMemberResponse> response = api.fetchSyllabusByLearningPlanMemberUsingPUT(lpmuuid);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanTaskDetailResponse> response = api.fetchUserTasksUsingPOST(fetchRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCompletionCount
     *
     * 
     */
    @Test
    public void getCompletionCountUsingDELETETest() {
        Long subjectId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanChapterResponse> response = api.getCompletionCountUsingDELETE(subjectId, sectionId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanChapterResponse> response = api.getCompletionCountUsingGET(subjectId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCompletionCount
     *
     * 
     */
    @Test
    public void getCompletionCountUsingHEADTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanChapterResponse> response = api.getCompletionCountUsingHEAD(subjectId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCompletionCount
     *
     * 
     */
    @Test
    public void getCompletionCountUsingOPTIONSTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanChapterResponse> response = api.getCompletionCountUsingOPTIONS(subjectId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCompletionCount
     *
     * 
     */
    @Test
    public void getCompletionCountUsingPATCHTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanChapterResponse> response = api.getCompletionCountUsingPATCH(subjectId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCompletionCount
     *
     * 
     */
    @Test
    public void getCompletionCountUsingPOSTTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanChapterResponse> response = api.getCompletionCountUsingPOST(subjectId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getCompletionCount
     *
     * 
     */
    @Test
    public void getCompletionCountUsingPUTTest() {
        Long subjectId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LearningPlanChapterResponse> response = api.getCompletionCountUsingPUT(subjectId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanResourceByResourceUuid
     *
     * 
     */
    @Test
    public void getLearningPlanResourceByResourceUuidUsingDELETETest() {
        String lpmuuid = null;
        // List<LearningPlanScheduleResponse> response = api.getLearningPlanResourceByResourceUuidUsingDELETE(lpmuuid);

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
     * getLearningPlanResourceByResourceUuid
     *
     * 
     */
    @Test
    public void getLearningPlanResourceByResourceUuidUsingHEADTest() {
        String lpmuuid = null;
        // List<LearningPlanScheduleResponse> response = api.getLearningPlanResourceByResourceUuidUsingHEAD(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanResourceByResourceUuid
     *
     * 
     */
    @Test
    public void getLearningPlanResourceByResourceUuidUsingOPTIONSTest() {
        String lpmuuid = null;
        // List<LearningPlanScheduleResponse> response = api.getLearningPlanResourceByResourceUuidUsingOPTIONS(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanResourceByResourceUuid
     *
     * 
     */
    @Test
    public void getLearningPlanResourceByResourceUuidUsingPATCHTest() {
        String lpmuuid = null;
        // List<LearningPlanScheduleResponse> response = api.getLearningPlanResourceByResourceUuidUsingPATCH(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanResourceByResourceUuid
     *
     * 
     */
    @Test
    public void getLearningPlanResourceByResourceUuidUsingPOSTTest() {
        String lpmuuid = null;
        // List<LearningPlanScheduleResponse> response = api.getLearningPlanResourceByResourceUuidUsingPOST(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanResourceByResourceUuid
     *
     * 
     */
    @Test
    public void getLearningPlanResourceByResourceUuidUsingPUTTest() {
        String lpmuuid = null;
        // List<LearningPlanScheduleResponse> response = api.getLearningPlanResourceByResourceUuidUsingPUT(lpmuuid);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanSWSHome
     *
     * 
     */
    @Test
    public void getLearningPlanSWSHomeUsingDELETETest() {
        LearningPlanRequest learningPlanRequest = null;
        // List<LearningPlanTimeTableResponse> response = api.getLearningPlanSWSHomeUsingDELETE(learningPlanRequest);

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
     * getLearningPlanSWSHome
     *
     * 
     */
    @Test
    public void getLearningPlanSWSHomeUsingHEADTest() {
        LearningPlanRequest learningPlanRequest = null;
        // List<LearningPlanTimeTableResponse> response = api.getLearningPlanSWSHomeUsingHEAD(learningPlanRequest);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanSWSHome
     *
     * 
     */
    @Test
    public void getLearningPlanSWSHomeUsingOPTIONSTest() {
        LearningPlanRequest learningPlanRequest = null;
        // List<LearningPlanTimeTableResponse> response = api.getLearningPlanSWSHomeUsingOPTIONS(learningPlanRequest);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanSWSHome
     *
     * 
     */
    @Test
    public void getLearningPlanSWSHomeUsingPATCHTest() {
        LearningPlanRequest learningPlanRequest = null;
        // List<LearningPlanTimeTableResponse> response = api.getLearningPlanSWSHomeUsingPATCH(learningPlanRequest);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanSWSHome
     *
     * 
     */
    @Test
    public void getLearningPlanSWSHomeUsingPOSTTest() {
        LearningPlanRequest learningPlanRequest = null;
        // List<LearningPlanTimeTableResponse> response = api.getLearningPlanSWSHomeUsingPOST(learningPlanRequest);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanSWSHome
     *
     * 
     */
    @Test
    public void getLearningPlanSWSHomeUsingPUTTest() {
        LearningPlanRequest learningPlanRequest = null;
        // List<LearningPlanTimeTableResponse> response = api.getLearningPlanSWSHomeUsingPUT(learningPlanRequest);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanTaskBasedOnLearningPlanMemberUuid
     *
     * 
     */
    @Test
    public void getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingDELETETest() {
        LearningPlanTaskFetchRequest fetchRequest = null;
        Long classId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LearningPlanHomeworkTaskResponse response = api.getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingDELETE(fetchRequest, classId, sectionId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LearningPlanHomeworkTaskResponse response = api.getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingGET(fetchRequest, classId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanTaskBasedOnLearningPlanMemberUuid
     *
     * 
     */
    @Test
    public void getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingHEADTest() {
        LearningPlanTaskFetchRequest fetchRequest = null;
        Long classId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LearningPlanHomeworkTaskResponse response = api.getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingHEAD(fetchRequest, classId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanTaskBasedOnLearningPlanMemberUuid
     *
     * 
     */
    @Test
    public void getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingOPTIONSTest() {
        LearningPlanTaskFetchRequest fetchRequest = null;
        Long classId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LearningPlanHomeworkTaskResponse response = api.getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingOPTIONS(fetchRequest, classId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanTaskBasedOnLearningPlanMemberUuid
     *
     * 
     */
    @Test
    public void getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingPATCHTest() {
        LearningPlanTaskFetchRequest fetchRequest = null;
        Long classId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LearningPlanHomeworkTaskResponse response = api.getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingPATCH(fetchRequest, classId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanTaskBasedOnLearningPlanMemberUuid
     *
     * 
     */
    @Test
    public void getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingPOSTTest() {
        LearningPlanTaskFetchRequest fetchRequest = null;
        Long classId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LearningPlanHomeworkTaskResponse response = api.getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingPOST(fetchRequest, classId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanTaskBasedOnLearningPlanMemberUuid
     *
     * 
     */
    @Test
    public void getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingPUTTest() {
        LearningPlanTaskFetchRequest fetchRequest = null;
        Long classId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LearningPlanHomeworkTaskResponse response = api.getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingPUT(fetchRequest, classId, sectionId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<StudyPlanResponse> response = api.getStudyPlansBasedOnFilterUsingPOST(lectureBreakupRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.insertLearningPlanUsingPOST(breakupDTO, branchId, academicSessionId, userId);

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
    public void updateLearningPlanResourceTypeUsingDELETETest() {
        String learningPlanResourceUuid = null;
        String learningPlanResourceType = null;
        // LearningPlanResourceResponse response = api.updateLearningPlanResourceTypeUsingDELETE(learningPlanResourceUuid, learningPlanResourceType);

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
     * updateLearningPlanResourceType
     *
     * 
     */
    @Test
    public void updateLearningPlanResourceTypeUsingHEADTest() {
        String learningPlanResourceUuid = null;
        String learningPlanResourceType = null;
        // LearningPlanResourceResponse response = api.updateLearningPlanResourceTypeUsingHEAD(learningPlanResourceUuid, learningPlanResourceType);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlanResourceType
     *
     * 
     */
    @Test
    public void updateLearningPlanResourceTypeUsingOPTIONSTest() {
        String learningPlanResourceUuid = null;
        String learningPlanResourceType = null;
        // LearningPlanResourceResponse response = api.updateLearningPlanResourceTypeUsingOPTIONS(learningPlanResourceUuid, learningPlanResourceType);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlanResourceType
     *
     * 
     */
    @Test
    public void updateLearningPlanResourceTypeUsingPATCHTest() {
        String learningPlanResourceUuid = null;
        String learningPlanResourceType = null;
        // LearningPlanResourceResponse response = api.updateLearningPlanResourceTypeUsingPATCH(learningPlanResourceUuid, learningPlanResourceType);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlanResourceType
     *
     * 
     */
    @Test
    public void updateLearningPlanResourceTypeUsingPOSTTest() {
        String learningPlanResourceUuid = null;
        String learningPlanResourceType = null;
        // LearningPlanResourceResponse response = api.updateLearningPlanResourceTypeUsingPOST(learningPlanResourceUuid, learningPlanResourceType);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlanResourceType
     *
     * 
     */
    @Test
    public void updateLearningPlanResourceTypeUsingPUTTest() {
        String learningPlanResourceUuid = null;
        String learningPlanResourceType = null;
        // LearningPlanResourceResponse response = api.updateLearningPlanResourceTypeUsingPUT(learningPlanResourceUuid, learningPlanResourceType);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingDELETETest() {
        LecturePlanDTO lecturePlanDTO = null;
        String lecturePlanUuid = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.updateLearningPlanUsingDELETE(lecturePlanDTO, lecturePlanUuid, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingDELETE1Test() {
        List<LearningPlanResourceDTO> dtoList = null;
        // Void response = api.updateLearningPlanUsingDELETE1(dtoList);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.updateLearningPlanUsingGET(lecturePlanDTO, lecturePlanUuid, sectionId, branchId, academicSessionId, userId);

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
    public void updateLearningPlanUsingHEADTest() {
        LecturePlanDTO lecturePlanDTO = null;
        String lecturePlanUuid = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.updateLearningPlanUsingHEAD(lecturePlanDTO, lecturePlanUuid, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingHEAD1Test() {
        List<LearningPlanResourceDTO> dtoList = null;
        // Void response = api.updateLearningPlanUsingHEAD1(dtoList);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingOPTIONSTest() {
        LecturePlanDTO lecturePlanDTO = null;
        String lecturePlanUuid = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.updateLearningPlanUsingOPTIONS(lecturePlanDTO, lecturePlanUuid, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingOPTIONS1Test() {
        List<LearningPlanResourceDTO> dtoList = null;
        // Void response = api.updateLearningPlanUsingOPTIONS1(dtoList);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingPATCHTest() {
        LecturePlanDTO lecturePlanDTO = null;
        String lecturePlanUuid = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.updateLearningPlanUsingPATCH(lecturePlanDTO, lecturePlanUuid, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingPATCH1Test() {
        List<LearningPlanResourceDTO> dtoList = null;
        // Void response = api.updateLearningPlanUsingPATCH1(dtoList);

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
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingPOST1Test() {
        LecturePlanDTO lecturePlanDTO = null;
        String lecturePlanUuid = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.updateLearningPlanUsingPOST1(lecturePlanDTO, lecturePlanUuid, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingPOST2Test() {
        List<LearningPlanResourceDTO> dtoList = null;
        // Void response = api.updateLearningPlanUsingPOST2(dtoList);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingPUTTest() {
        LecturePlanDTO lecturePlanDTO = null;
        String lecturePlanUuid = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.updateLearningPlanUsingPUT(lecturePlanDTO, lecturePlanUuid, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLearningPlan
     *
     * 
     */
    @Test
    public void updateLearningPlanUsingPUT1Test() {
        List<LearningPlanResourceDTO> dtoList = null;
        // Void response = api.updateLearningPlanUsingPUT1(dtoList);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Response response = api.updateLearningPlansTasksBasedOnUuidUsingPOST(taskUpdateRequests, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLectureResourceDetail
     *
     * 
     */
    @Test
    public void updateLectureResourceDetailUsingDELETETest() {
        LearningPlanResourceDTO resourceDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureResourceResponse response = api.updateLectureResourceDetailUsingDELETE(resourceDTO, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureResourceResponse response = api.updateLectureResourceDetailUsingGET(resourceDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLectureResourceDetail
     *
     * 
     */
    @Test
    public void updateLectureResourceDetailUsingHEADTest() {
        LearningPlanResourceDTO resourceDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureResourceResponse response = api.updateLectureResourceDetailUsingHEAD(resourceDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLectureResourceDetail
     *
     * 
     */
    @Test
    public void updateLectureResourceDetailUsingOPTIONSTest() {
        LearningPlanResourceDTO resourceDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureResourceResponse response = api.updateLectureResourceDetailUsingOPTIONS(resourceDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLectureResourceDetail
     *
     * 
     */
    @Test
    public void updateLectureResourceDetailUsingPATCHTest() {
        LearningPlanResourceDTO resourceDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureResourceResponse response = api.updateLectureResourceDetailUsingPATCH(resourceDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLectureResourceDetail
     *
     * 
     */
    @Test
    public void updateLectureResourceDetailUsingPOSTTest() {
        LearningPlanResourceDTO resourceDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureResourceResponse response = api.updateLectureResourceDetailUsingPOST(resourceDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateLectureResourceDetail
     *
     * 
     */
    @Test
    public void updateLectureResourceDetailUsingPUTTest() {
        LearningPlanResourceDTO resourceDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureResourceResponse response = api.updateLectureResourceDetailUsingPUT(resourceDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
