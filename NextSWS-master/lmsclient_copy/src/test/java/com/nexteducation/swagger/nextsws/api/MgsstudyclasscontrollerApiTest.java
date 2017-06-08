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
 * API tests for MgsstudyclasscontrollerApi
 */
public class MgsstudyclasscontrollerApiTest {

    private MgsstudyclasscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MgsstudyclasscontrollerApi.class);
    }

    
    /**
     * showStudyClasses
     *
     * 
     */
    @Test
    public void showStudyClassesUsingGETTest() {
        // ModelAndView response = api.showStudyClassesUsingGET();

        // TODO: test validations
    }
    
}
