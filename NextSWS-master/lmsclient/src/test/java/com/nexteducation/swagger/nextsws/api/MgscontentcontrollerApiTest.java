package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MgscontentcontrollerApi
 */
public class MgscontentcontrollerApiTest {

    private MgscontentcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MgscontentcontrollerApi.class);
    }

    
    /**
     * deleteContent
     *
     * 
     */
    @Test
    public void deleteContentUsingGETTest() {
        // ModelAndView response = api.deleteContentUsingGET();

        // TODO: test validations
    }
    
    /**
     * getContentsByLesson
     *
     * 
     */
    @Test
    public void getContentsByLessonUsingPOSTTest() {
        Long lessonId = null;
        // ModelAndView response = api.getContentsByLessonUsingPOST(lessonId);

        // TODO: test validations
    }
    
    /**
     * showContent
     *
     * 
     */
    @Test
    public void showContentUsingGETTest() {
        // ModelAndView response = api.showContentUsingGET();

        // TODO: test validations
    }
    
    /**
     * uploadContent
     *
     * 
     */
    @Test
    public void uploadContentUsingPOSTTest() {
        List<> mGSContentSectionRequest = null;
        List<> oldContents = null;
        List<> uploads = null;
        // ModelAndView response = api.uploadContentUsingPOST(mGSContentSectionRequest, oldContents, uploads);

        // TODO: test validations
    }
    
}
