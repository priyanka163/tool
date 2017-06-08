package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ResourceRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResourceworkspacecontrollerApi
 */
public class ResourceworkspacecontrollerApiTest {

    private ResourceworkspacecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ResourceworkspacecontrollerApi.class);
    }

    
    /**
     * getResourceResponse
     *
     * 
     */
    @Test
    public void getResourceResponseUsingGETTest() {
        ResourceRequest resourceRequest = null;
        SessionParams sessionParams = null;
        // Object response = api.getResourceResponseUsingGET(resourceRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getResourceResponseV1
     *
     * 
     */
    @Test
    public void getResourceResponseV1UsingGETTest() {
        Long profileId = null;
        ResourceRequest resourceRequest = null;
        SessionParams sessionParams = null;
        // Object response = api.getResourceResponseV1UsingGET(profileId, resourceRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getResourcesUnderChapterForCategory
     *
     * 
     */
    @Test
    public void getResourcesUnderChapterForCategoryUsingGETTest() {
        Long chapterId = null;
        Long syllabusId = null;
        Long profileId = null;
        String category = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getResourcesUnderChapterForCategoryUsingGET(chapterId, syllabusId, profileId, category, ifCustomSyllabus, ifCustomChapter, sessionParams);

        // TODO: test validations
    }
    
}
