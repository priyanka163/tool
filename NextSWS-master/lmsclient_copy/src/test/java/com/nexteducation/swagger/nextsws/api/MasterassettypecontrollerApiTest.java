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
 * API tests for MasterassettypecontrollerApi
 */
public class MasterassettypecontrollerApiTest {

    private MasterassettypecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MasterassettypecontrollerApi.class);
    }

    
    /**
     * getMasterAssetTypes
     *
     * 
     */
    @Test
    public void getMasterAssetTypesUsingGETTest() {
        // ModelAndView response = api.getMasterAssetTypesUsingGET();

        // TODO: test validations
    }
    
}
