package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WikiwscontrollerApi
 */
public class WikiwscontrollerApiTest {

    private WikiwscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WikiwscontrollerApi.class);
    }

    
    /**
     * getChapterWiki
     *
     * 
     */
    @Test
    public void getChapterWikiUsingGETTest() {
        String chapterId = null;
        SessionParams sessionParams = null;
        // Object response = api.getChapterWikiUsingGET(chapterId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChapterWiseSyllabusWiki
     *
     * 
     */
    @Test
    public void getChapterWiseSyllabusWikiUsingGETTest() {
        String syllabusId = null;
        SessionParams sessionParams = null;
        // Object response = api.getChapterWiseSyllabusWikiUsingGET(syllabusId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getDetailWikiPage
     *
     * 
     */
    @Test
    public void getDetailWikiPageUsingGETTest() {
        String wikiId = null;
        // Object response = api.getDetailWikiPageUsingGET(wikiId);

        // TODO: test validations
    }
    
    /**
     * getSyllabusWiki
     *
     * 
     */
    @Test
    public void getSyllabusWikiUsingGETTest() {
        String syllabusId = null;
        SessionParams sessionParams = null;
        // Object response = api.getSyllabusWikiUsingGET(syllabusId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getWikiPage
     *
     * 
     */
    @Test
    public void getWikiPageUsingGET1Test() {
        String wikiId = null;
        // Object response = api.getWikiPageUsingGET1(wikiId);

        // TODO: test validations
    }
    
    /**
     * lessonWikiDetails
     *
     * 
     */
    @Test
    public void lessonWikiDetailsUsingGETTest() {
        String lessonId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.lessonWikiDetailsUsingGET(lessonId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * showWikiCategories
     *
     * 
     */
    @Test
    public void showWikiCategoriesUsingDELETETest() {
        // ModelAndView response = api.showWikiCategoriesUsingDELETE();

        // TODO: test validations
    }
    
    /**
     * showWikiCategories
     *
     * 
     */
    @Test
    public void showWikiCategoriesUsingGETTest() {
        // ModelAndView response = api.showWikiCategoriesUsingGET();

        // TODO: test validations
    }
    
    /**
     * showWikiCategories
     *
     * 
     */
    @Test
    public void showWikiCategoriesUsingHEADTest() {
        // ModelAndView response = api.showWikiCategoriesUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * showWikiCategories
     *
     * 
     */
    @Test
    public void showWikiCategoriesUsingOPTIONSTest() {
        // ModelAndView response = api.showWikiCategoriesUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * showWikiCategories
     *
     * 
     */
    @Test
    public void showWikiCategoriesUsingPATCHTest() {
        // ModelAndView response = api.showWikiCategoriesUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * showWikiCategories
     *
     * 
     */
    @Test
    public void showWikiCategoriesUsingPOSTTest() {
        // ModelAndView response = api.showWikiCategoriesUsingPOST();

        // TODO: test validations
    }
    
    /**
     * showWikiCategories
     *
     * 
     */
    @Test
    public void showWikiCategoriesUsingPUTTest() {
        // ModelAndView response = api.showWikiCategoriesUsingPUT();

        // TODO: test validations
    }
    
    /**
     * wikiDetailsByResource
     *
     * 
     */
    @Test
    public void wikiDetailsByResourceUsingGETTest() {
        String resourceUUID = null;
        // ModelAndView response = api.wikiDetailsByResourceUsingGET(resourceUUID);

        // TODO: test validations
    }
    
    /**
     * wikiDetails
     *
     * 
     */
    @Test
    public void wikiDetailsUsingGETTest() {
        String wikiUUID = null;
        // ModelAndView response = api.wikiDetailsUsingGET(wikiUUID);

        // TODO: test validations
    }
    
}
