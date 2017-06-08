package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MdcnotificationcontrollerApi
 */
public class MdcnotificationcontrollerApiTest {

    private MdcnotificationcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MdcnotificationcontrollerApi.class);
    }

    
    /**
     * getNotificationObjectBasedOnId
     *
     * 
     */
    @Test
    public void getNotificationObjectBasedOnIdUsingGETTest() {
        String notificationMessageId = null;
        // String response = api.getNotificationObjectBasedOnIdUsingGET(notificationMessageId);

        // TODO: test validations
    }
    
    /**
     * getNotificationObjectBasedOnUserId
     *
     * 
     */
    @Test
    public void getNotificationObjectBasedOnUserIdUsingGETTest() {
        String userId = null;
        // List<Object> response = api.getNotificationObjectBasedOnUserIdUsingGET(userId);

        // TODO: test validations
    }
    
}
