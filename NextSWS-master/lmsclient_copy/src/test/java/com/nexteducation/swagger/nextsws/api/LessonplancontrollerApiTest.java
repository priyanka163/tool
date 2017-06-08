package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.AssignmentRequest;
import com.nexteducation.swagger.nextsws.model.UserResourceResponse;
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
    public void createNewAssignmentUsingDELETETest() {
        AssignmentRequest assignment = null;
        Long syllabusNode = null;
        Boolean customSyllabusNode = null;
        Long sectionId = null;
        Boolean globalResource = null;
        Long classId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.createNewAssignmentUsingDELETE(assignment, syllabusNode, customSyllabusNode, sectionId, globalResource, classId, branchId, academicSessionId, userId);

        // TODO: test validations
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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.createNewAssignmentUsingGET(assignment, syllabusNode, customSyllabusNode, sectionId, globalResource, classId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * createNewAssignment
     *
     * 
     */
    @Test
    public void createNewAssignmentUsingHEADTest() {
        AssignmentRequest assignment = null;
        Long syllabusNode = null;
        Boolean customSyllabusNode = null;
        Long sectionId = null;
        Boolean globalResource = null;
        Long classId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.createNewAssignmentUsingHEAD(assignment, syllabusNode, customSyllabusNode, sectionId, globalResource, classId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * createNewAssignment
     *
     * 
     */
    @Test
    public void createNewAssignmentUsingOPTIONSTest() {
        AssignmentRequest assignment = null;
        Long syllabusNode = null;
        Boolean customSyllabusNode = null;
        Long sectionId = null;
        Boolean globalResource = null;
        Long classId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.createNewAssignmentUsingOPTIONS(assignment, syllabusNode, customSyllabusNode, sectionId, globalResource, classId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * createNewAssignment
     *
     * 
     */
    @Test
    public void createNewAssignmentUsingPATCHTest() {
        AssignmentRequest assignment = null;
        Long syllabusNode = null;
        Boolean customSyllabusNode = null;
        Long sectionId = null;
        Boolean globalResource = null;
        Long classId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.createNewAssignmentUsingPATCH(assignment, syllabusNode, customSyllabusNode, sectionId, globalResource, classId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * createNewAssignment
     *
     * 
     */
    @Test
    public void createNewAssignmentUsingPOSTTest() {
        AssignmentRequest assignment = null;
        Long syllabusNode = null;
        Boolean customSyllabusNode = null;
        Long sectionId = null;
        Boolean globalResource = null;
        Long classId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.createNewAssignmentUsingPOST(assignment, syllabusNode, customSyllabusNode, sectionId, globalResource, classId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * createNewAssignment
     *
     * 
     */
    @Test
    public void createNewAssignmentUsingPUTTest() {
        AssignmentRequest assignment = null;
        Long syllabusNode = null;
        Boolean customSyllabusNode = null;
        Long sectionId = null;
        Boolean globalResource = null;
        Long classId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.createNewAssignmentUsingPUT(assignment, syllabusNode, customSyllabusNode, sectionId, globalResource, classId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchActivity
     *
     * 
     */
    @Test
    public void fetchActivityUsingDELETETest() {
        String assetUuid = null;
        // ActivityPlanResponse response = api.fetchActivityUsingDELETE(assetUuid);

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
     * fetchActivity
     *
     * 
     */
    @Test
    public void fetchActivityUsingHEADTest() {
        String assetUuid = null;
        // ActivityPlanResponse response = api.fetchActivityUsingHEAD(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchActivity
     *
     * 
     */
    @Test
    public void fetchActivityUsingOPTIONSTest() {
        String assetUuid = null;
        // ActivityPlanResponse response = api.fetchActivityUsingOPTIONS(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchActivity
     *
     * 
     */
    @Test
    public void fetchActivityUsingPATCHTest() {
        String assetUuid = null;
        // ActivityPlanResponse response = api.fetchActivityUsingPATCH(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchActivity
     *
     * 
     */
    @Test
    public void fetchActivityUsingPOSTTest() {
        String assetUuid = null;
        // ActivityPlanResponse response = api.fetchActivityUsingPOST(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchActivity
     *
     * 
     */
    @Test
    public void fetchActivityUsingPUTTest() {
        String assetUuid = null;
        // ActivityPlanResponse response = api.fetchActivityUsingPUT(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchAssignment
     *
     * 
     */
    @Test
    public void fetchAssignmentUsingDELETETest() {
        String assetUuid = null;
        // AssignmentResponse response = api.fetchAssignmentUsingDELETE(assetUuid);

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
     * fetchAssignment
     *
     * 
     */
    @Test
    public void fetchAssignmentUsingHEADTest() {
        String assetUuid = null;
        // AssignmentResponse response = api.fetchAssignmentUsingHEAD(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchAssignment
     *
     * 
     */
    @Test
    public void fetchAssignmentUsingOPTIONSTest() {
        String assetUuid = null;
        // AssignmentResponse response = api.fetchAssignmentUsingOPTIONS(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchAssignment
     *
     * 
     */
    @Test
    public void fetchAssignmentUsingPATCHTest() {
        String assetUuid = null;
        // AssignmentResponse response = api.fetchAssignmentUsingPATCH(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchAssignment
     *
     * 
     */
    @Test
    public void fetchAssignmentUsingPOSTTest() {
        String assetUuid = null;
        // AssignmentResponse response = api.fetchAssignmentUsingPOST(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchAssignment
     *
     * 
     */
    @Test
    public void fetchAssignmentUsingPUTTest() {
        String assetUuid = null;
        // AssignmentResponse response = api.fetchAssignmentUsingPUT(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchWorksheet
     *
     * 
     */
    @Test
    public void fetchWorksheetUsingDELETETest() {
        String assetUuid = null;
        // WorksheetResponse response = api.fetchWorksheetUsingDELETE(assetUuid);

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
     * fetchWorksheet
     *
     * 
     */
    @Test
    public void fetchWorksheetUsingHEADTest() {
        String assetUuid = null;
        // WorksheetResponse response = api.fetchWorksheetUsingHEAD(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchWorksheet
     *
     * 
     */
    @Test
    public void fetchWorksheetUsingOPTIONSTest() {
        String assetUuid = null;
        // WorksheetResponse response = api.fetchWorksheetUsingOPTIONS(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchWorksheet
     *
     * 
     */
    @Test
    public void fetchWorksheetUsingPATCHTest() {
        String assetUuid = null;
        // WorksheetResponse response = api.fetchWorksheetUsingPATCH(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchWorksheet
     *
     * 
     */
    @Test
    public void fetchWorksheetUsingPOSTTest() {
        String assetUuid = null;
        // WorksheetResponse response = api.fetchWorksheetUsingPOST(assetUuid);

        // TODO: test validations
    }
    
    /**
     * fetchWorksheet
     *
     * 
     */
    @Test
    public void fetchWorksheetUsingPUTTest() {
        String assetUuid = null;
        // WorksheetResponse response = api.fetchWorksheetUsingPUT(assetUuid);

        // TODO: test validations
    }
    
    /**
     * getImageSearchResult
     *
     * 
     */
    @Test
    public void getImageSearchResultUsingDELETETest() {
        // Void response = api.getImageSearchResultUsingDELETE();

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
     * getImageSearchResult
     *
     * 
     */
    @Test
    public void getImageSearchResultUsingHEADTest() {
        // Void response = api.getImageSearchResultUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * getImageSearchResult
     *
     * 
     */
    @Test
    public void getImageSearchResultUsingOPTIONSTest() {
        // Void response = api.getImageSearchResultUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * getImageSearchResult
     *
     * 
     */
    @Test
    public void getImageSearchResultUsingPATCHTest() {
        // Void response = api.getImageSearchResultUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * getImageSearchResult
     *
     * 
     */
    @Test
    public void getImageSearchResultUsingPOSTTest() {
        // Void response = api.getImageSearchResultUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getImageSearchResult
     *
     * 
     */
    @Test
    public void getImageSearchResultUsingPUTTest() {
        // Void response = api.getImageSearchResultUsingPUT();

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingDELETETest() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.getLessonPlanUsingDELETE(sectionId, classId, chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingDELETE1Test() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LessonPlanResponse> response = api.getLessonPlanUsingDELETE1(sectionId, classId, chapterId, customChapter, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.getLessonPlanUsingGET(sectionId, classId, chapterId, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LessonPlanResponse> response = api.getLessonPlanUsingGET1(sectionId, classId, chapterId, customChapter, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingHEADTest() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.getLessonPlanUsingHEAD(sectionId, classId, chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingHEAD1Test() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LessonPlanResponse> response = api.getLessonPlanUsingHEAD1(sectionId, classId, chapterId, customChapter, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingOPTIONSTest() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.getLessonPlanUsingOPTIONS(sectionId, classId, chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingOPTIONS1Test() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LessonPlanResponse> response = api.getLessonPlanUsingOPTIONS1(sectionId, classId, chapterId, customChapter, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingPATCHTest() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.getLessonPlanUsingPATCH(sectionId, classId, chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingPATCH1Test() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LessonPlanResponse> response = api.getLessonPlanUsingPATCH1(sectionId, classId, chapterId, customChapter, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingPOSTTest() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.getLessonPlanUsingPOST(sectionId, classId, chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingPOST1Test() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LessonPlanResponse> response = api.getLessonPlanUsingPOST1(sectionId, classId, chapterId, customChapter, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingPUTTest() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.getLessonPlanUsingPUT(sectionId, classId, chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingPUT1Test() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<LessonPlanResponse> response = api.getLessonPlanUsingPUT1(sectionId, classId, chapterId, customChapter, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getNextStudioImagesData
     *
     * 
     */
    @Test
    public void getNextStudioImagesDataUsingDELETETest() {
        // HttpServletResponse response = api.getNextStudioImagesDataUsingDELETE();

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
     * getNextStudioImagesData
     *
     * 
     */
    @Test
    public void getNextStudioImagesDataUsingHEADTest() {
        // HttpServletResponse response = api.getNextStudioImagesDataUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * getNextStudioImagesData
     *
     * 
     */
    @Test
    public void getNextStudioImagesDataUsingOPTIONSTest() {
        // HttpServletResponse response = api.getNextStudioImagesDataUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * getNextStudioImagesData
     *
     * 
     */
    @Test
    public void getNextStudioImagesDataUsingPATCHTest() {
        // HttpServletResponse response = api.getNextStudioImagesDataUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * getNextStudioImagesData
     *
     * 
     */
    @Test
    public void getNextStudioImagesDataUsingPOSTTest() {
        // HttpServletResponse response = api.getNextStudioImagesDataUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getNextStudioImagesData
     *
     * 
     */
    @Test
    public void getNextStudioImagesDataUsingPUTTest() {
        // HttpServletResponse response = api.getNextStudioImagesDataUsingPUT();

        // TODO: test validations
    }
    
    /**
     * getVideoSearchResult
     *
     * 
     */
    @Test
    public void getVideoSearchResultUsingDELETETest() {
        // Void response = api.getVideoSearchResultUsingDELETE();

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
     * getVideoSearchResult
     *
     * 
     */
    @Test
    public void getVideoSearchResultUsingHEADTest() {
        // Void response = api.getVideoSearchResultUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * getVideoSearchResult
     *
     * 
     */
    @Test
    public void getVideoSearchResultUsingOPTIONSTest() {
        // Void response = api.getVideoSearchResultUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * getVideoSearchResult
     *
     * 
     */
    @Test
    public void getVideoSearchResultUsingPATCHTest() {
        // Void response = api.getVideoSearchResultUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * getVideoSearchResult
     *
     * 
     */
    @Test
    public void getVideoSearchResultUsingPOSTTest() {
        // Void response = api.getVideoSearchResultUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getVideoSearchResult
     *
     * 
     */
    @Test
    public void getVideoSearchResultUsingPUTTest() {
        // Void response = api.getVideoSearchResultUsingPUT();

        // TODO: test validations
    }
    
    /**
     * insertLecturePlanActivity
     *
     * 
     */
    @Test
    public void insertLecturePlanActivityUsingDELETETest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertLecturePlanActivityUsingDELETE(activityDTO, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertLecturePlanActivityUsingGET(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertLecturePlanActivity
     *
     * 
     */
    @Test
    public void insertLecturePlanActivityUsingHEADTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertLecturePlanActivityUsingHEAD(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertLecturePlanActivity
     *
     * 
     */
    @Test
    public void insertLecturePlanActivityUsingOPTIONSTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertLecturePlanActivityUsingOPTIONS(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertLecturePlanActivity
     *
     * 
     */
    @Test
    public void insertLecturePlanActivityUsingPATCHTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertLecturePlanActivityUsingPATCH(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertLecturePlanActivity
     *
     * 
     */
    @Test
    public void insertLecturePlanActivityUsingPOSTTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertLecturePlanActivityUsingPOST(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertLecturePlanActivity
     *
     * 
     */
    @Test
    public void insertLecturePlanActivityUsingPUTTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertLecturePlanActivityUsingPUT(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertWorksheet
     *
     * 
     */
    @Test
    public void insertWorksheetUsingDELETETest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertWorksheetUsingDELETE(worksheetDTO, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertWorksheetUsingGET(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertWorksheet
     *
     * 
     */
    @Test
    public void insertWorksheetUsingHEADTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertWorksheetUsingHEAD(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertWorksheet
     *
     * 
     */
    @Test
    public void insertWorksheetUsingOPTIONSTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertWorksheetUsingOPTIONS(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertWorksheet
     *
     * 
     */
    @Test
    public void insertWorksheetUsingPATCHTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertWorksheetUsingPATCH(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertWorksheet
     *
     * 
     */
    @Test
    public void insertWorksheetUsingPOSTTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertWorksheetUsingPOST(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * insertWorksheet
     *
     * 
     */
    @Test
    public void insertWorksheetUsingPUTTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<UserResourceResponse> response = api.insertWorksheetUsingPUT(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * saveLessonPlanSectionData
     *
     * 
     */
    @Test
    public void saveLessonPlanSectionDataUsingDELETETest() {
        // Void response = api.saveLessonPlanSectionDataUsingDELETE();

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
     * saveLessonPlanSectionData
     *
     * 
     */
    @Test
    public void saveLessonPlanSectionDataUsingHEADTest() {
        // Void response = api.saveLessonPlanSectionDataUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * saveLessonPlanSectionData
     *
     * 
     */
    @Test
    public void saveLessonPlanSectionDataUsingOPTIONSTest() {
        // Void response = api.saveLessonPlanSectionDataUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * saveLessonPlanSectionData
     *
     * 
     */
    @Test
    public void saveLessonPlanSectionDataUsingPATCHTest() {
        // Void response = api.saveLessonPlanSectionDataUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * saveLessonPlanSectionData
     *
     * 
     */
    @Test
    public void saveLessonPlanSectionDataUsingPOSTTest() {
        // Void response = api.saveLessonPlanSectionDataUsingPOST();

        // TODO: test validations
    }
    
    /**
     * saveLessonPlanSectionData
     *
     * 
     */
    @Test
    public void saveLessonPlanSectionDataUsingPUTTest() {
        // Void response = api.saveLessonPlanSectionDataUsingPUT();

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LessonPlanSectionDetailResponse response = api.saveOrUpdateLessonPlanUsingPOST(lessonPlanSectionDetailRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingDELETETest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingDELETE(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingHEADTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingHEAD(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingOPTIONSTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingOPTIONS(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingPATCHTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingPATCH(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingPOSTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingPOST(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showLessonPlan
     *
     * 
     */
    @Test
    public void showLessonPlanUsingPUTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showLessonPlanUsingPUT(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showTeacherWorkspace
     *
     * 
     */
    @Test
    public void showTeacherWorkspaceUsingDELETETest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showTeacherWorkspaceUsingDELETE(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showTeacherWorkspace
     *
     * 
     */
    @Test
    public void showTeacherWorkspaceUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showTeacherWorkspaceUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showTeacherWorkspace
     *
     * 
     */
    @Test
    public void showTeacherWorkspaceUsingHEADTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showTeacherWorkspaceUsingHEAD(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showTeacherWorkspace
     *
     * 
     */
    @Test
    public void showTeacherWorkspaceUsingOPTIONSTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showTeacherWorkspaceUsingOPTIONS(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showTeacherWorkspace
     *
     * 
     */
    @Test
    public void showTeacherWorkspaceUsingPATCHTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showTeacherWorkspaceUsingPATCH(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showTeacherWorkspace
     *
     * 
     */
    @Test
    public void showTeacherWorkspaceUsingPOSTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showTeacherWorkspaceUsingPOST(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showTeacherWorkspace
     *
     * 
     */
    @Test
    public void showTeacherWorkspaceUsingPUTTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showTeacherWorkspaceUsingPUT(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateActivity
     *
     * 
     */
    @Test
    public void updateActivityUsingDELETETest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ActivityPlanResponse response = api.updateActivityUsingDELETE(activityDTO, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ActivityPlanResponse response = api.updateActivityUsingGET(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateActivity
     *
     * 
     */
    @Test
    public void updateActivityUsingHEADTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ActivityPlanResponse response = api.updateActivityUsingHEAD(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateActivity
     *
     * 
     */
    @Test
    public void updateActivityUsingOPTIONSTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ActivityPlanResponse response = api.updateActivityUsingOPTIONS(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateActivity
     *
     * 
     */
    @Test
    public void updateActivityUsingPATCHTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ActivityPlanResponse response = api.updateActivityUsingPATCH(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateActivity
     *
     * 
     */
    @Test
    public void updateActivityUsingPOSTTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ActivityPlanResponse response = api.updateActivityUsingPOST(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateActivity
     *
     * 
     */
    @Test
    public void updateActivityUsingPUTTest() {
        ActivityDTO activityDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ActivityPlanResponse response = api.updateActivityUsingPUT(activityDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateAssignment
     *
     * 
     */
    @Test
    public void updateAssignmentUsingDELETETest() {
        AssignmentRequest assignmentRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssignmentResponse response = api.updateAssignmentUsingDELETE(assignmentRequest, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssignmentResponse response = api.updateAssignmentUsingGET(assignmentRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateAssignment
     *
     * 
     */
    @Test
    public void updateAssignmentUsingHEADTest() {
        AssignmentRequest assignmentRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssignmentResponse response = api.updateAssignmentUsingHEAD(assignmentRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateAssignment
     *
     * 
     */
    @Test
    public void updateAssignmentUsingOPTIONSTest() {
        AssignmentRequest assignmentRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssignmentResponse response = api.updateAssignmentUsingOPTIONS(assignmentRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateAssignment
     *
     * 
     */
    @Test
    public void updateAssignmentUsingPATCHTest() {
        AssignmentRequest assignmentRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssignmentResponse response = api.updateAssignmentUsingPATCH(assignmentRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateAssignment
     *
     * 
     */
    @Test
    public void updateAssignmentUsingPOSTTest() {
        AssignmentRequest assignmentRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssignmentResponse response = api.updateAssignmentUsingPOST(assignmentRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateAssignment
     *
     * 
     */
    @Test
    public void updateAssignmentUsingPUTTest() {
        AssignmentRequest assignmentRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssignmentResponse response = api.updateAssignmentUsingPUT(assignmentRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateWorksheet
     *
     * 
     */
    @Test
    public void updateWorksheetUsingDELETETest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // WorksheetResponse response = api.updateWorksheetUsingDELETE(worksheetDTO, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // WorksheetResponse response = api.updateWorksheetUsingGET(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateWorksheet
     *
     * 
     */
    @Test
    public void updateWorksheetUsingHEADTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // WorksheetResponse response = api.updateWorksheetUsingHEAD(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateWorksheet
     *
     * 
     */
    @Test
    public void updateWorksheetUsingOPTIONSTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // WorksheetResponse response = api.updateWorksheetUsingOPTIONS(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateWorksheet
     *
     * 
     */
    @Test
    public void updateWorksheetUsingPATCHTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // WorksheetResponse response = api.updateWorksheetUsingPATCH(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateWorksheet
     *
     * 
     */
    @Test
    public void updateWorksheetUsingPOSTTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // WorksheetResponse response = api.updateWorksheetUsingPOST(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * updateWorksheet
     *
     * 
     */
    @Test
    public void updateWorksheetUsingPUTTest() {
        WorksheetDTO worksheetDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // WorksheetResponse response = api.updateWorksheetUsingPUT(worksheetDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * uploadVideo
     *
     * 
     */
    @Test
    public void uploadVideoUsingDELETETest() {
        // String response = api.uploadVideoUsingDELETE();

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
    
    /**
     * uploadVideo
     *
     * 
     */
    @Test
    public void uploadVideoUsingHEADTest() {
        // String response = api.uploadVideoUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * uploadVideo
     *
     * 
     */
    @Test
    public void uploadVideoUsingOPTIONSTest() {
        // String response = api.uploadVideoUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * uploadVideo
     *
     * 
     */
    @Test
    public void uploadVideoUsingPATCHTest() {
        // String response = api.uploadVideoUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * uploadVideo
     *
     * 
     */
    @Test
    public void uploadVideoUsingPOSTTest() {
        // String response = api.uploadVideoUsingPOST();

        // TODO: test validations
    }
    
    /**
     * uploadVideo
     *
     * 
     */
    @Test
    public void uploadVideoUsingPUTTest() {
        // String response = api.uploadVideoUsingPUT();

        // TODO: test validations
    }
    
}
