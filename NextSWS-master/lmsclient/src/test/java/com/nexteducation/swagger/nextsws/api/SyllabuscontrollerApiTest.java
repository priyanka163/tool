package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.CustomSyllabusNodeResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusDTO;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.CustomSyllabusNodeRequest;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeDTO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SyllabuscontrollerApi
 */
public class SyllabuscontrollerApiTest {

    private SyllabuscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SyllabuscontrollerApi.class);
    }

    
    /**
     * addChapters
     *
     * 
     */
    @Test
    public void addChaptersUsingGETTest() {
        SyllabusDTO syllabusDTO = null;
        SessionParams sessionParams = null;
        // List<CustomSyllabusNodeResponse> response = api.addChaptersUsingGET(syllabusDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * deleteChapter
     *
     * 
     */
    @Test
    public void deleteChapterUsingGETTest() {
        CustomSyllabusNodeRequest nodeRequest = null;
        SessionParams sessionParams = null;
        // Void response = api.deleteChapterUsingGET(nodeRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChaptersBySubjectClassBoard
     *
     * 
     */
    @Test
    public void getChaptersBySubjectClassBoardUsingGETTest() {
        Long boardId = null;
        Long subjectId = null;
        Long classId = null;
        Long sectionId = null;
        Boolean customSyllabus = null;
        SessionParams sessionParams = null;
        // List<SyllabusNodeResponse> response = api.getChaptersBySubjectClassBoardUsingGET(boardId, subjectId, classId, sectionId, customSyllabus, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChapters
     *
     * 
     */
    @Test
    public void getChaptersUsingGETTest() {
        Long syllabusId = null;
        Long classId = null;
        Long sectionId = null;
        Boolean customSyllabus = null;
        SessionParams sessionParams = null;
        // List<SyllabusNodeResponse> response = api.getChaptersUsingGET(syllabusId, classId, sectionId, customSyllabus, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSyllabus
     *
     * 
     */
    @Test
    public void getSyllabusUsingGETTest() {
        Long subjectId = null;
        Long classId = null;
        Long boardId = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // SyllabusResponse response = api.getSyllabusUsingGET(subjectId, classId, boardId, sectionId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * insertCustomSyllabus
     *
     * 
     */
    @Test
    public void insertCustomSyllabusUsingGETTest() {
        Long subjectId = null;
        Long classId = null;
        Long boardId = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // SyllabusResponse response = api.insertCustomSyllabusUsingGET(subjectId, classId, boardId, sectionId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * listChapters
     *
     * 
     */
    @Test
    public void listChaptersUsingGETTest() {
        SyllabusNodeDTO syllabusNodeDTO = null;
        Long classId = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // List<SyllabusNodeResponse> response = api.listChaptersUsingGET(syllabusNodeDTO, classId, sectionId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateChapterName
     *
     * 
     */
    @Test
    public void updateChapterNameUsingGETTest() {
        CustomSyllabusNodeRequest nodeRequest = null;
        SessionParams sessionParams = null;
        // CustomSyllabusNodeResponse response = api.updateChapterNameUsingGET(nodeRequest, sessionParams);

        // TODO: test validations
    }
    
}
