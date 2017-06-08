package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OnlinetutoringcontrollerApi
 */
public class OnlinetutoringcontrollerApiTest {

    private OnlinetutoringcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OnlinetutoringcontrollerApi.class);
    }

    
    /**
     * getOnlineLectures
     *
     * 
     */
    @Test
    public void getOnlineLecturesUsingPOSTTest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getOnlineLecturesUsingPOST(chapterId, syllabusId, category, ifCustomSyllabus, ifCustomChapter, module, sessionParams);

        // TODO: test validations
    }
    
}
