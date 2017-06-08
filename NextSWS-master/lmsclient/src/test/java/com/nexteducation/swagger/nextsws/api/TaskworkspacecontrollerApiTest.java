package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.TaskDocRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.TaskListRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.TaskRequest;
import com.nexteducation.swagger.nextsws.model.ResourceShortResponse;
import com.nexteducation.swagger.nextsws.model.TaskDoc;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskworkspacecontrollerApi
 */
public class TaskworkspacecontrollerApiTest {

    private TaskworkspacecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TaskworkspacecontrollerApi.class);
    }

    
    /**
     * createTask
     *
     * 
     */
    @Test
    public void createTaskUsingPOSTTest() {
        TaskDocRequest request = null;
        // Object response = api.createTaskUsingPOST(request);

        // TODO: test validations
    }
    
    /**
     * getDueTaskList
     *
     * 
     */
    @Test
    public void getDueTaskListUsingPOSTTest() {
        TaskListRequest request = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getDueTaskListUsingPOST(request, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getResourceListForHomework
     *
     * 
     */
    @Test
    public void getResourceListForHomeworkUsingPOSTTest() {
        Long profileId = null;
        String parentId = null;
        TaskRequest request = null;
        SessionParams sessionParams = null;
        // List<ResourceShortResponse> response = api.getResourceListForHomeworkUsingPOST(profileId, parentId, request, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getTaskList
     *
     * 
     */
    @Test
    public void getTaskListUsingPOSTTest() {
        TaskListRequest request = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getTaskListUsingPOST(request, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getUserDueTaskList
     *
     * 
     */
    @Test
    public void getUserDueTaskListUsingPOSTTest() {
        Long profileId = null;
        TaskRequest request = null;
        SessionParams sessionParams = null;
        // List<TaskDoc> response = api.getUserDueTaskListUsingPOST(profileId, request, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getUserFutureTaskList
     *
     * 
     */
    @Test
    public void getUserFutureTaskListUsingPOSTTest() {
        Long profileId = null;
        TaskRequest request = null;
        SessionParams sessionParams = null;
        // List<TaskDoc> response = api.getUserFutureTaskListUsingPOST(profileId, request, sessionParams);

        // TODO: test validations
    }
    
}
