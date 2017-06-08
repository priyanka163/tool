package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.AssignmentSubmissionAttachmentResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.AssignmentSubmissionResponse;
import com.nexteducation.swagger.nextsws.model.DocResponse;
import com.nexteducation.swagger.nextsws.model.AssignmentResponse;
import java.io.File;
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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getAssignmentDetailUsingGET(assignmentAssetuuid, lpmuuid, syllabusId, ifCustomSyllabus, ifCustomChapter, chapterId, resourceLocation, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId2 = null;
        // AssignmentSubmissionResponse response = api.getAssignmentSubmissionUsingGET(assignmentUUID, userId, branchId, academicSessionId, userId2);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AssignmentSubmissionResponse response = api.getAssignmentSubmissionUsingGET1(assignmentUUID, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * saveDocument
     *
     * 
     */
    @Test
    public void saveDocumentUsingDELETETest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveDocumentUsingDELETE(branchId, fileName);

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
     * saveDocument
     *
     * 
     */
    @Test
    public void saveDocumentUsingHEADTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveDocumentUsingHEAD(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveDocument
     *
     * 
     */
    @Test
    public void saveDocumentUsingOPTIONSTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveDocumentUsingOPTIONS(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveDocument
     *
     * 
     */
    @Test
    public void saveDocumentUsingPATCHTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveDocumentUsingPATCH(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveDocument
     *
     * 
     */
    @Test
    public void saveDocumentUsingPOSTTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveDocumentUsingPOST(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveDocument
     *
     * 
     */
    @Test
    public void saveDocumentUsingPUTTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveDocumentUsingPUT(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * savePresentation
     *
     * 
     */
    @Test
    public void savePresentationUsingDELETETest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.savePresentationUsingDELETE(branchId, fileName);

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
     * savePresentation
     *
     * 
     */
    @Test
    public void savePresentationUsingHEADTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.savePresentationUsingHEAD(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * savePresentation
     *
     * 
     */
    @Test
    public void savePresentationUsingOPTIONSTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.savePresentationUsingOPTIONS(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * savePresentation
     *
     * 
     */
    @Test
    public void savePresentationUsingPATCHTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.savePresentationUsingPATCH(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * savePresentation
     *
     * 
     */
    @Test
    public void savePresentationUsingPOSTTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.savePresentationUsingPOST(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * savePresentation
     *
     * 
     */
    @Test
    public void savePresentationUsingPUTTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.savePresentationUsingPUT(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveSpreadSheet
     *
     * 
     */
    @Test
    public void saveSpreadSheetUsingDELETETest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveSpreadSheetUsingDELETE(branchId, fileName);

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
     * saveSpreadSheet
     *
     * 
     */
    @Test
    public void saveSpreadSheetUsingHEADTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveSpreadSheetUsingHEAD(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveSpreadSheet
     *
     * 
     */
    @Test
    public void saveSpreadSheetUsingOPTIONSTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveSpreadSheetUsingOPTIONS(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveSpreadSheet
     *
     * 
     */
    @Test
    public void saveSpreadSheetUsingPATCHTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveSpreadSheetUsingPATCH(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveSpreadSheet
     *
     * 
     */
    @Test
    public void saveSpreadSheetUsingPOSTTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveSpreadSheetUsingPOST(branchId, fileName);

        // TODO: test validations
    }
    
    /**
     * saveSpreadSheet
     *
     * 
     */
    @Test
    public void saveSpreadSheetUsingPUTTest() {
        Long branchId = null;
        String fileName = null;
        // DocResponse response = api.saveSpreadSheetUsingPUT(branchId, fileName);

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
        List<File> file = null;
        String assignmentUUID = null;
        String publish = null;
        List<String> fileuuidlist = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.submitAssignmentUsingPOST(file, assignmentUUID, publish, fileuuidlist, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
