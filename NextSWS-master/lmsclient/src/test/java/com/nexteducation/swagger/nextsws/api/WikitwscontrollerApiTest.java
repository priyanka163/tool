package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.WikiDTO;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.WikiPageDetailResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WikitwscontrollerApi
 */
public class WikitwscontrollerApiTest {

    private WikitwscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WikitwscontrollerApi.class);
    }

    
    /**
     * createWiki
     *
     * 
     */
    @Test
    public void createWikiUsingGETTest() {
        WikiDTO wikiDTO = null;
        SessionParams sessionParams = null;
        // Object response = api.createWikiUsingGET(wikiDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchWikiForLesson
     *
     * 
     */
    @Test
    public void fetchWikiForLessonUsingGETTest() {
        Long currentSylId = null;
        Long studyClassId = null;
        Long currentChapterId = null;
        Long sectionId = null;
        SessionParams sessionParams = null;
        // Object response = api.fetchWikiForLessonUsingGET(currentSylId, studyClassId, currentChapterId, sectionId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getWikiDetails
     *
     * 
     */
    @Test
    public void getWikiDetailsUsingDELETETest() {
        String wikiUuid = null;
        Boolean editMode = null;
        // WikiPageDetailResponse response = api.getWikiDetailsUsingDELETE(wikiUuid, editMode);

        // TODO: test validations
    }
    
    /**
     * getWikiDetails
     *
     * 
     */
    @Test
    public void getWikiDetailsUsingGETTest() {
        String wikiUuid = null;
        Boolean editMode = null;
        // WikiPageDetailResponse response = api.getWikiDetailsUsingGET(wikiUuid, editMode);

        // TODO: test validations
    }
    
    /**
     * getWikiDetails
     *
     * 
     */
    @Test
    public void getWikiDetailsUsingHEADTest() {
        String wikiUuid = null;
        Boolean editMode = null;
        // WikiPageDetailResponse response = api.getWikiDetailsUsingHEAD(wikiUuid, editMode);

        // TODO: test validations
    }
    
    /**
     * getWikiDetails
     *
     * 
     */
    @Test
    public void getWikiDetailsUsingOPTIONSTest() {
        String wikiUuid = null;
        Boolean editMode = null;
        // WikiPageDetailResponse response = api.getWikiDetailsUsingOPTIONS(wikiUuid, editMode);

        // TODO: test validations
    }
    
    /**
     * getWikiDetails
     *
     * 
     */
    @Test
    public void getWikiDetailsUsingPATCHTest() {
        String wikiUuid = null;
        Boolean editMode = null;
        // WikiPageDetailResponse response = api.getWikiDetailsUsingPATCH(wikiUuid, editMode);

        // TODO: test validations
    }
    
    /**
     * getWikiDetails
     *
     * 
     */
    @Test
    public void getWikiDetailsUsingPOSTTest() {
        String wikiUuid = null;
        Boolean editMode = null;
        // WikiPageDetailResponse response = api.getWikiDetailsUsingPOST(wikiUuid, editMode);

        // TODO: test validations
    }
    
    /**
     * getWikiDetails
     *
     * 
     */
    @Test
    public void getWikiDetailsUsingPUTTest() {
        String wikiUuid = null;
        Boolean editMode = null;
        // WikiPageDetailResponse response = api.getWikiDetailsUsingPUT(wikiUuid, editMode);

        // TODO: test validations
    }
    
}
