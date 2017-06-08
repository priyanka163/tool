package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.LPRProgressResponse;
import com.nexteducation.swagger.nextsws.model.LPRProgressRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LprprogresscontrollerApi
 */
public class LprprogresscontrollerApiTest {

    private LprprogresscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LprprogresscontrollerApi.class);
    }

    
    /**
     * getLPRProgressList
     *
     * 
     */
    @Test
    public void getLPRProgressListUsingGETTest() {
        String learningPlanMemberUuid = null;
        // List<LPRProgressResponse> response = api.getLPRProgressListUsingGET(learningPlanMemberUuid);

        // TODO: test validations
    }
    
    /**
     * updateLPRProgress
     *
     * 
     */
    @Test
    public void updateLPRProgressUsingGETTest() {
        LPRProgressRequest lprProgress = null;
        SessionParams sessionParams = null;
        // Void response = api.updateLPRProgressUsingGET(lprProgress, sessionParams);

        // TODO: test validations
    }
    
}
