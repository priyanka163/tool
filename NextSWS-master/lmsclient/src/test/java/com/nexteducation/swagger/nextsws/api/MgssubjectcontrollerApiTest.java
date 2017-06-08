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
 * API tests for MgssubjectcontrollerApi
 */
public class MgssubjectcontrollerApiTest {

    private MgssubjectcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MgssubjectcontrollerApi.class);
    }

    
    /**
     * showSubjects
     *
     * 
     */
    @Test
    public void showSubjectsUsingGETTest() {
        // ModelAndView response = api.showSubjectsUsingGET();

        // TODO: test validations
    }
    
}
