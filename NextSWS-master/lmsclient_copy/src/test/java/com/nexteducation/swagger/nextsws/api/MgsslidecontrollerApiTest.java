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
 * API tests for MgsslidecontrollerApi
 */
public class MgsslidecontrollerApiTest {

    private MgsslidecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MgsslidecontrollerApi.class);
    }

    
    /**
     * getContentsByLesson
     *
     * 
     */
    @Test
    public void getContentsByLessonUsingPOST1Test() {
        Long lessonId = null;
        // ModelAndView response = api.getContentsByLessonUsingPOST1(lessonId);

        // TODO: test validations
    }
    
    /**
     * showSlides
     *
     * 
     */
    @Test
    public void showSlidesUsingGETTest() {
        // ModelAndView response = api.showSlidesUsingGET();

        // TODO: test validations
    }
    
}
