package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ConceptShortResponse;
import com.nexteducation.swagger.nextsws.model.ConceptDetailedResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConceptmapcontrollerApi
 */
public class ConceptmapcontrollerApiTest {

    private ConceptmapcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConceptmapcontrollerApi.class);
    }

    
    /**
     * getConceptDetails
     *
     * 
     */
    @Test
    public void getConceptDetailsUsingGETTest() {
        String uniqueId = null;
        String chapterId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getConceptDetailsUsingGET(uniqueId, chapterId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getConceptsForChapter
     *
     * 
     */
    @Test
    public void getConceptsForChapterUsingGETTest() {
        Long chapterId = null;
        SessionParams sessionParams = null;
        // List<ConceptShortResponse> response = api.getConceptsForChapterUsingGET(chapterId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getConcepts
     *
     * 
     */
    @Test
    public void getConceptsUsingGETTest() {
        String chapterId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getConceptsUsingGET(chapterId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * listDetailedConceptbyUniqueID
     *
     * 
     */
    @Test
    public void listDetailedConceptbyUniqueIDUsingGETTest() {
        String uniqueId = null;
        SessionParams sessionParams = null;
        // List<ConceptDetailedResponse> response = api.listDetailedConceptbyUniqueIDUsingGET(uniqueId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * showMultiLevelGraph
     *
     * 
     */
    @Test
    public void showMultiLevelGraphUsingGETTest() {
        String toConceptId = null;
        Long level = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.showMultiLevelGraphUsingGET(toConceptId, level, sessionParams);

        // TODO: test validations
    }
    
}
