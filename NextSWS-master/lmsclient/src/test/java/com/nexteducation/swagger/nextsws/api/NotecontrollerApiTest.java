package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.AssetResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.NoteResponse;
import com.nexteducation.swagger.nextsws.model.NoteRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotecontrollerApi
 */
public class NotecontrollerApiTest {

    private NotecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotecontrollerApi.class);
    }

    
    /**
     * addNoteFile
     *
     * 
     */
    @Test
    public void addNoteFileUsingPOSTTest() {
        String file = null;
        SessionParams sessionParams = null;
        // AssetResponse response = api.addNoteFileUsingPOST(file, sessionParams);

        // TODO: test validations
    }
    
    /**
     * addNote
     *
     * 
     */
    @Test
    public void addNoteUsingPOSTTest() {
        NoteRequest noteRequest = null;
        SessionParams sessionParams = null;
        // NoteResponse response = api.addNoteUsingPOST(noteRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * deleteNote
     *
     * 
     */
    @Test
    public void deleteNoteUsingGETTest() {
        String noteUuid = null;
        // NoteResponse response = api.deleteNoteUsingGET(noteUuid);

        // TODO: test validations
    }
    
    /**
     * getNoteById
     *
     * 
     */
    @Test
    public void getNoteByIdUsingGETTest() {
        Long noteId = null;
        // ModelAndView response = api.getNoteByIdUsingGET(noteId);

        // TODO: test validations
    }
    
    /**
     * getSubjectPage
     *
     * 
     */
    @Test
    public void getSubjectPageUsingGETTest() {
        Long syllabusId = null;
        String pageUuid = null;
        String pageName = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String schoolSubjectName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getSubjectPageUsingGET(syllabusId, pageUuid, pageName, ifCustomSyllabus, subjectName, schoolSubjectName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * listNoteByBranch
     *
     * 
     */
    @Test
    public void listNoteByBranchUsingGETTest() {
        Long tenantId = null;
        // List<NoteResponse> response = api.listNoteByBranchUsingGET(tenantId);

        // TODO: test validations
    }
    
    /**
     * listNoteById
     *
     * 
     */
    @Test
    public void listNoteByIdUsingGETTest() {
        Long id = null;
        // NoteResponse response = api.listNoteByIdUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * listNoteByPage
     *
     * 
     */
    @Test
    public void listNoteByPageUsingGETTest() {
        String pageuuid = null;
        // List<NoteResponse> response = api.listNoteByPageUsingGET(pageuuid);

        // TODO: test validations
    }
    
    /**
     * updateNote
     *
     * 
     */
    @Test
    public void updateNoteUsingPOSTTest() {
        NoteRequest noteRequest = null;
        // NoteResponse response = api.updateNoteUsingPOST(noteRequest);

        // TODO: test validations
    }
    
}
