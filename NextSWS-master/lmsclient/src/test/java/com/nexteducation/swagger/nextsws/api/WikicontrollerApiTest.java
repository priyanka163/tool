package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WikicontrollerApi
 */
public class WikicontrollerApiTest {

    private WikicontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WikicontrollerApi.class);
    }

    
    /**
     * fetchWikiChapterDetails
     *
     * 
     */
    @Test
    public void fetchWikiChapterDetailsUsingGETTest() {
        Long syllabusId = null;
        Integer level = null;
        Boolean ifCustomSyllabus = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.fetchWikiChapterDetailsUsingGET(syllabusId, level, ifCustomSyllabus, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchWikiLessonDetails
     *
     * 
     */
    @Test
    public void fetchWikiLessonDetailsUsingGETTest() {
        Long chapterId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.fetchWikiLessonDetailsUsingGET(chapterId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * wikiHome
     *
     * 
     */
    @Test
    public void wikiHomeUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.wikiHomeUsingGET(sessionParams);

        // TODO: test validations
    }
    
}
