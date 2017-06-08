package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.TaskDocRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.TaskListRequest;
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
    public void getDueTaskListUsingDELETETest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getDueTaskListUsingDELETE(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getDueTaskList
     *
     * 
     */
    @Test
    public void getDueTaskListUsingGETTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getDueTaskListUsingGET(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getDueTaskList
     *
     * 
     */
    @Test
    public void getDueTaskListUsingHEADTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getDueTaskListUsingHEAD(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getDueTaskList
     *
     * 
     */
    @Test
    public void getDueTaskListUsingOPTIONSTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getDueTaskListUsingOPTIONS(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getDueTaskList
     *
     * 
     */
    @Test
    public void getDueTaskListUsingPATCHTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getDueTaskListUsingPATCH(request, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getDueTaskListUsingPOST(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getDueTaskList
     *
     * 
     */
    @Test
    public void getDueTaskListUsingPUTTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getDueTaskListUsingPUT(request, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<ResourceShortResponse> response = api.getResourceListForHomeworkUsingPOST(profileId, parentId, request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getTaskList
     *
     * 
     */
    @Test
    public void getTaskListUsingDELETETest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getTaskListUsingDELETE(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getTaskList
     *
     * 
     */
    @Test
    public void getTaskListUsingGETTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getTaskListUsingGET(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getTaskList
     *
     * 
     */
    @Test
    public void getTaskListUsingHEADTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getTaskListUsingHEAD(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getTaskList
     *
     * 
     */
    @Test
    public void getTaskListUsingOPTIONSTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getTaskListUsingOPTIONS(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getTaskList
     *
     * 
     */
    @Test
    public void getTaskListUsingPATCHTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getTaskListUsingPATCH(request, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getTaskListUsingPOST(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getTaskList
     *
     * 
     */
    @Test
    public void getTaskListUsingPUTTest() {
        TaskListRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getTaskListUsingPUT(request, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<TaskDoc> response = api.getUserDueTaskListUsingPOST(profileId, request, branchId, academicSessionId, userId);

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
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<TaskDoc> response = api.getUserFutureTaskListUsingPOST(profileId, request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
