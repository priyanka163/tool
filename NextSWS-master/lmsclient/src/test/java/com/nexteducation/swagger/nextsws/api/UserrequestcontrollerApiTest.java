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
 * API tests for UserrequestcontrollerApi
 */
public class UserrequestcontrollerApiTest {

    private UserrequestcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UserrequestcontrollerApi.class);
    }

    
    /**
     * getClient
     *
     * 
     */
    @Test
    public void getClientUsingGETTest() {
        // ModelAndView response = api.getClientUsingGET();

        // TODO: test validations
    }
    
}
