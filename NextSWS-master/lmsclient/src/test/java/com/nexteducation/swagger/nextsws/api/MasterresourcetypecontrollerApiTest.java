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
 * API tests for MasterresourcetypecontrollerApi
 */
public class MasterresourcetypecontrollerApiTest {

    private MasterresourcetypecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MasterresourcetypecontrollerApi.class);
    }

    
    /**
     * getMasterResourceTypes
     *
     * 
     */
    @Test
    public void getMasterResourceTypesUsingGETTest() {
        // ModelAndView response = api.getMasterResourceTypesUsingGET();

        // TODO: test validations
    }
    
}
