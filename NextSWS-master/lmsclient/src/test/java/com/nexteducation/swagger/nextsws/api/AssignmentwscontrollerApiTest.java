package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.AssignmentSubmissionAttachmentResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.AssignmentSubmissionResponse;
import com.nexteducation.swagger.nextsws.model.DocResponse;
import com.nexteducation.swagger.nextsws.model.AssignmentResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssignmentwscontrollerApi
 */
public class AssignmentwscontrollerApiTest {

    private AssignmentwscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AssignmentwscontrollerApi.class);
    }

    
    /**
     * deleteAssignmentSubmissionAttachment
     *
     * 
     */
    @Test
    public void deleteAssignmentSubmissionAttachmentUsingGETTest() {
        String assignmentSubmissionAttachmentUuid = null;
        // AssignmentSubmissionAttachmentResponse response = api.deleteAssignmentSubmissionAttachmentUsingGET(assignmentSubmissionAttachmentUuid);

        // TODO: test validations
    }
    
    /**
     * getAssignmentDetail
     *
     * 
     */
    @Test
    public void getAssignmentDetailUsingGETTest() {
        String assignmentAssetuuid = null;
        String lpmuuid = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        Long chapterId = null;
        String resourceLocation = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getAssignmentDetailUsingGET(assignmentAssetuuid, lpmuuid, syllabusId, ifCustomSyllabus, ifCustomChapter, chapterId, resourceLocation, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getAssignmentSubmission
     *
     * 
     */
    @Test
    public void getAssignmentSubmissionUsingGETTest() {
        String assignmentUUID = null;
        String userId = null;
        SessionParams sessionParams = null;
        // AssignmentSubmissionResponse response = api.getAssignmentSubmissionUsingGET(assignmentUUID, userId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getAssignmentSubmission
     *
     * 
     */
    @Test
    public void getAssignmentSubmissionUsingGET1Test() {
        String assignmentUUID = null;
        SessionParams sessionParams = null;
        // AssignmentSubmissionResponse response = api.getAssignmentSubmissionUsingGET1(assignmentUUID, sessionParams);

        // TODO: test validations
    }
    
    /**
     * saveDocument
     *
     * 
     */
    @Test
    public void saveDocumentUsingGETTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveDocumentUsingGET(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * savePresentation
     *
     * 
     */
    @Test
    public void savePresentationUsingGETTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.savePresentationUsingGET(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveSpreadSheet
     *
     * 
     */
    @Test
    public void saveSpreadSheetUsingGETTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveSpreadSheetUsingGET(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * showAssignment
     *
     * 
     */
    @Test
    public void showAssignmentUsingGETTest() {
        String assignmentuuid = null;
        // AssignmentResponse response = api.showAssignmentUsingGET(assignmentuuid);

        // TODO: test validations
    }
    
    /**
     * submitAssignment
     *
     * 
     */
    @Test
    public void submitAssignmentUsingPOSTTest() {
        String file = null;
        String assignmentUUID = null;
        String publish = null;
        List<String> fileuuidlist = null;
        SessionParams sessionParams = null;
        // Object response = api.submitAssignmentUsingPOST(file, assignmentUUID, publish, fileuuidlist, sessionParams);

        // TODO: test validations
    }
    
}
