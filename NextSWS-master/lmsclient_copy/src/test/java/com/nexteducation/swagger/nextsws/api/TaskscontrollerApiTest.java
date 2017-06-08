package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskscontrollerApi
 */
public class TaskscontrollerApiTest {

    private TaskscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TaskscontrollerApi.class);
    }

    
    /**
     * getAllTasks
     *
     * 
     */
    @Test
    public void getAllTasksUsingGETTest() {
        Long userId = null;
        // ModelAndView response = api.getAllTasksUsingGET(userId);

        // TODO: test validations
    }
    
}
