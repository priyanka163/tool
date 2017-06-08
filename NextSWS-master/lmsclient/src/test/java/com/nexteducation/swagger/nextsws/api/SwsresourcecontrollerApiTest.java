package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.UserResourceResponseV3;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SwsresourcecontrollerApi
 */
public class SwsresourcecontrollerApiTest {

    private SwsresourcecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SwsresourcecontrollerApi.class);
    }

    
    /**
     * getInternalRecommendation
     *
     * 
     */
    @Test
    public void getInternalRecommendationUsingGETTest() {
        String category = null;
        String resourceUuid = null;
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String sectionType = null;
        Integer start = null;
        Integer end = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponseV3> response = api.getInternalRecommendationUsingGET(category, resourceUuid, chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, sectionType, start, end, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getMindMapsOptions
     *
     * 
     */
    @Test
    public void getMindMapsOptionsUsingGETTest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getMindMapsOptionsUsingGET(chapterId, syllabusId, category, ifCustomSyllabus, ifCustomChapter, module, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getPlayer
     *
     * 
     */
    @Test
    public void getPlayerUsingGETTest() {
        String resourceUuid = null;
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String sectionType = null;
        String category = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getPlayerUsingGET(resourceUuid, chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, sectionType, category, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getResourecListPlayerPage
     *
     * 
     */
    @Test
    public void getResourecListPlayerPageUsingGETTest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String sectionType = null;
        String module = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getResourecListPlayerPageUsingGET(chapterId, syllabusId, category, ifCustomSyllabus, ifCustomChapter, sectionType, module, sessionParams);

        // TODO: test validations
    }
    
    /**
     * showAVAidsOptions
     *
     * 
     */
    @Test
    public void showAVAidsOptionsUsingGETTest() {
        Long syllabusId = null;
        String category = null;
        Long chapterId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        // ModelAndView response = api.showAVAidsOptionsUsingGET(syllabusId, category, chapterId, ifCustomSyllabus, ifCustomChapter);

        // TODO: test validations
    }
    
}
