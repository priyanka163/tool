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
 * API tests for ContentpartnercontrollerApi
 */
public class ContentpartnercontrollerApiTest {

    private ContentpartnercontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ContentpartnercontrollerApi.class);
    }

    
    /**
     * showContentPartners
     *
     * 
     */
    @Test
    public void showContentPartnersUsingGETTest() {
        // ModelAndView response = api.showContentPartnersUsingGET();

        // TODO: test validations
    }
    
}
