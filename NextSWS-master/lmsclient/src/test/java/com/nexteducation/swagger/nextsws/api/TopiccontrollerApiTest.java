package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.TopicRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
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
        SessionParams sessionParams = null;
        // Object response = api.createTopicUsingPOST(topicRequest, sessionParams);

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
        SessionParams sessionParams = null;
        // Object response = api.deleteTopicUsingGET(topicId, sessionParams);

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
        SessionParams sessionParams = null;
        // Object response = api.updateTopicUsingPOST(topicRequest, sessionParams);

        // TODO: test validations
    }
    
}
