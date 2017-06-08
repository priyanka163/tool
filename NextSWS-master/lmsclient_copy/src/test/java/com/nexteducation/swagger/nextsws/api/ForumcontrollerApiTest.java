package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ForumRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ForumcontrollerApi
 */
public class ForumcontrollerApiTest {

    private ForumcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ForumcontrollerApi.class);
    }

    
    /**
     * createForum
     *
     * 
     */
    @Test
    public void createForumUsingPOSTTest() {
        ForumRequest forumRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.createForumUsingPOST(forumRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteForum
     *
     * 
     */
    @Test
    public void deleteForumUsingGETTest() {
        String forumId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.deleteForumUsingGET(forumId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getForumTopics
     *
     * 
     */
    @Test
    public void getForumTopicsUsingGETTest() {
        String forumId = null;
        // Object response = api.getForumTopicsUsingGET(forumId);

        // TODO: test validations
    }
    
    /**
     * getForum
     *
     * 
     */
    @Test
    public void getForumUsingGETTest() {
        String forumId = null;
        // Object response = api.getForumUsingGET(forumId);

        // TODO: test validations
    }
    
    /**
     * updateForum
     *
     * 
     */
    @Test
    public void updateForumUsingPOSTTest() {
        ForumRequest forumRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.updateForumUsingPOST(forumRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
