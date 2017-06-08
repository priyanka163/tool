package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.NoteBookRequest;
import com.nexteducation.swagger.nextsws.model.NoteBookResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotebookcontrollerApi
 */
public class NotebookcontrollerApiTest {

    private NotebookcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotebookcontrollerApi.class);
    }

    
    /**
     * addNoteBook
     *
     * 
     */
    @Test
    public void addNoteBookUsingPOSTTest() {
        NoteBookRequest noteBookRequest = null;
        SessionParams sessionParams = null;
        // NoteBookResponse response = api.addNoteBookUsingPOST(noteBookRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * deleteNoteBook
     *
     * 
     */
    @Test
    public void deleteNoteBookUsingGETTest() {
        String noteBookUuid = null;
        // NoteBookResponse response = api.deleteNoteBookUsingGET(noteBookUuid);

        // TODO: test validations
    }
    
    /**
     * deleteNoteBooks
     *
     * 
     */
    @Test
    public void deleteNoteBooksUsingPOSTTest() {
        List<String> noteBookUuids = null;
        // List<NoteBookResponse> response = api.deleteNoteBooksUsingPOST(noteBookUuids);

        // TODO: test validations
    }
    
    /**
     * getNoteBookByBranch
     *
     * 
     */
    @Test
    public void getNoteBookByBranchUsingGETTest() {
        Long tenantId = null;
        // List<NoteBookResponse> response = api.getNoteBookByBranchUsingGET(tenantId);

        // TODO: test validations
    }
    
    /**
     * getNoteBookBySubjects
     *
     * 
     */
    @Test
    public void getNoteBookBySubjectsUsingGETTest() {
        Long syllabusId = null;
        SessionParams sessionParams = null;
        // List<NoteBookResponse> response = api.getNoteBookBySubjectsUsingGET(syllabusId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getNoteBookByUuids
     *
     * 
     */
    @Test
    public void getNoteBookByUuidsUsingPOSTTest() {
        NoteBookRequest noteBookRequest = null;
        // List<NoteBookResponse> response = api.getNoteBookByUuidsUsingPOST(noteBookRequest);

        // TODO: test validations
    }
    
    /**
     * getNoteBooks
     *
     * 
     */
    @Test
    public void getNoteBooksUsingGETTest() {
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String chapterId = null;
        String schoolSubjectName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getNoteBooksUsingGET(syllabusId, ifCustomSyllabus, subjectName, chapterId, schoolSubjectName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * listNoteBooks
     *
     * 
     */
    @Test
    public void listNoteBooksUsingGETTest() {
        SessionParams sessionParams = null;
        // List<NoteBookResponse> response = api.listNoteBooksUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateNoteBook
     *
     * 
     */
    @Test
    public void updateNoteBookUsingPOSTTest() {
        NoteBookRequest noteBookRequest = null;
        // NoteBookResponse response = api.updateNoteBookUsingPOST(noteBookRequest);

        // TODO: test validations
    }
    
}
