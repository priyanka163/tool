package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchcontrollerApi
 */
public class SearchcontrollerApiTest {

    private SearchcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SearchcontrollerApi.class);
    }

    
    /**
     * search
     *
     * 
     */
    @Test
    public void searchUsingGETTest() {
        // Void response = api.searchUsingGET();

        // TODO: test validations
    }
    
    /**
     * search
     *
     * 
     */
    @Test
    public void searchUsingPOSTTest() {
        // Void response = api.searchUsingPOST();

        // TODO: test validations
    }
    
}
