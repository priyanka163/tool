package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.QueryableParams;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AcademicsessioncontrollerApi
 */
public class AcademicsessioncontrollerApiTest {

    private AcademicsessioncontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AcademicsessioncontrollerApi.class);
    }

    
    /**
     * fetches all the academic Sessions
     *
     * fetches all the academic Sessions
     */
    @Test
    public void getAcademicSessionsUsingGET7Test() {
        SessionParams sessionParams = null;
        QueryableParams queryableParams = null;
        // ModelAndView response = api.getAcademicSessionsUsingGET7(sessionParams, queryableParams);

        // TODO: test validations
    }
    
}
