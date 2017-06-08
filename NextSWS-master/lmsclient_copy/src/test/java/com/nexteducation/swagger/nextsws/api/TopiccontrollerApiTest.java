package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.TopicRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TopiccontrollerApi
 */
public class TopiccontrollerApiTest {

    private TopiccontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TopiccontrollerApi.class);
    }

    
    /**
     * createTopic
     *
     * 
     */
    @Test
    public void createTopicUsingPOSTTest() {
        TopicRequest topicRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.createTopicUsingPOST(topicRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteTopic
     *
     * 
     */
    @Test
    public void deleteTopicUsingGETTest() {
        String topicId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.deleteTopicUsingGET(topicId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getChildTopics
     *
     * 
     */
    @Test
    public void getChildTopicsUsingGETTest() {
        String topicId = null;
        // Object response = api.getChildTopicsUsingGET(topicId);

        // TODO: test validations
    }
    
    /**
     * getTopic
     *
     * 
     */
    @Test
    public void getTopicUsingGETTest() {
        String topicId = null;
        // Object response = api.getTopicUsingGET(topicId);

        // TODO: test validations
    }
    
    /**
     * updateTopic
     *
     * 
     */
    @Test
    public void updateTopicUsingPOSTTest() {
        TopicRequest topicRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.updateTopicUsingPOST(topicRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
