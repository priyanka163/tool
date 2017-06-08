package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.DocResponse;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentcontrollerApi
 */
public class DocumentcontrollerApiTest {

    private DocumentcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DocumentcontrollerApi.class);
    }

    
    /**
     * createSpreadsheetResource
     *
     * 
     */
    @Test
    public void createSpreadsheetResourceUsingGETTest() {
        Long syllabusNodeId = null;
        Long classId = null;
        Long sectionId = null;
        Boolean globalresource = null;
        Boolean isCustomSyllabusNode = null;
        SessionParams sessionParams = null;
        // Void response = api.createSpreadsheetResourceUsingGET(syllabusNodeId, classId, sectionId, globalresource, isCustomSyllabusNode, sessionParams);

        // TODO: test validations
    }
    
    /**
     * createSpreadsheet
     *
     * 
     */
    @Test
    public void createSpreadsheetUsingGETTest() {
        // Void response = api.createSpreadsheetUsingGET();

        // TODO: test validations
    }
    
    /**
     * createSpreadsheet
     *
     * 
     */
    @Test
    public void createSpreadsheetUsingPOSTTest() {
        // Void response = api.createSpreadsheetUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getDocEditor
     *
     * 
     */
    @Test
    public void getDocEditorUsingGETTest() {
        // ModelAndView response = api.getDocEditorUsingGET();

        // TODO: test validations
    }
    
    /**
     * getDocEditor
     *
     * 
     */
    @Test
    public void getDocEditorUsingPOSTTest() {
        // ModelAndView response = api.getDocEditorUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getNewResourceDocumentEditor
     *
     * 
     */
    @Test
    public void getNewResourceDocumentEditorUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.getNewResourceDocumentEditorUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * getNewResourceDocumentEditor
     *
     * 
     */
    @Test
    public void getNewResourceDocumentEditorUsingPOSTTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.getNewResourceDocumentEditorUsingPOST(sessionParams);

        // TODO: test validations
    }
    
    /**
     * getResourceDocumentEditor
     *
     * 
     */
    @Test
    public void getResourceDocumentEditorUsingGETTest() {
        String assetUuid = null;
        // ModelAndView response = api.getResourceDocumentEditorUsingGET(assetUuid);

        // TODO: test validations
    }
    
    /**
     * getResourceSpreadsheet
     *
     * 
     */
    @Test
    public void getResourceSpreadsheetUsingGETTest() {
        // ModelAndView response = api.getResourceSpreadsheetUsingGET();

        // TODO: test validations
    }
    
    /**
     * getResourceSpreadsheet
     *
     * 
     */
    @Test
    public void getResourceSpreadsheetUsingPOSTTest() {
        // ModelAndView response = api.getResourceSpreadsheetUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getSpreadsheet
     *
     * 
     */
    @Test
    public void getSpreadsheetUsingGETTest() {
        // ModelAndView response = api.getSpreadsheetUsingGET();

        // TODO: test validations
    }
    
    /**
     * getSpreadsheet
     *
     * 
     */
    @Test
    public void getSpreadsheetUsingPOSTTest() {
        // ModelAndView response = api.getSpreadsheetUsingPOST();

        // TODO: test validations
    }
    
    /**
     * initiateSQSQueue
     *
     * 
     */
    @Test
    public void initiateSQSQueueUsingGETTest() {
        String fileId = null;
        // String response = api.initiateSQSQueueUsingGET(fileId);

        // TODO: test validations
    }
    
    /**
     * initiateSQSQueue
     *
     * 
     */
    @Test
    public void initiateSQSQueueUsingPOSTTest() {
        String fileId = null;
        // String response = api.initiateSQSQueueUsingPOST(fileId);

        // TODO: test validations
    }
    
    /**
     * saveDocument
     *
     * 
     */
    @Test
    public void saveDocumentUsingGET1Test() {
        SessionParams sessionParams = null;
        // DocResponse response = api.saveDocumentUsingGET1(sessionParams);

        // TODO: test validations
    }
    
    /**
     * saveDocument
     *
     * 
     */
    @Test
    public void saveDocumentUsingPOSTTest() {
        SessionParams sessionParams = null;
        // DocResponse response = api.saveDocumentUsingPOST(sessionParams);

        // TODO: test validations
    }
    
    /**
     * savePresentation
     *
     * 
     */
    @Test
    public void savePresentationUsingGET1Test() {
        SessionParams sessionParams = null;
        // DocResponse response = api.savePresentationUsingGET1(sessionParams);

        // TODO: test validations
    }
    
    /**
     * savePresentation
     *
     * 
     */
    @Test
    public void savePresentationUsingPOSTTest() {
        SessionParams sessionParams = null;
        // DocResponse response = api.savePresentationUsingPOST(sessionParams);

        // TODO: test validations
    }
    
    /**
     * saveSpreadSheet
     *
     * 
     */
    @Test
    public void saveSpreadSheetUsingGET1Test() {
        SessionParams sessionParams = null;
        // DocResponse response = api.saveSpreadSheetUsingGET1(sessionParams);

        // TODO: test validations
    }
    
    /**
     * saveSpreadSheet
     *
     * 
     */
    @Test
    public void saveSpreadSheetUsingPOSTTest() {
        SessionParams sessionParams = null;
        // DocResponse response = api.saveSpreadSheetUsingPOST(sessionParams);

        // TODO: test validations
    }
    
    /**
     * uploadFile
     *
     * 
     */
    @Test
    public void uploadFileUsingGETTest() {
        File file = null;
        // Void response = api.uploadFileUsingGET(file);

        // TODO: test validations
    }
    
    /**
     * uploadFile
     *
     * 
     */
    @Test
    public void uploadFileUsingPOSTTest() {
        File file = null;
        // Void response = api.uploadFileUsingPOST(file);

        // TODO: test validations
    }
    
}
