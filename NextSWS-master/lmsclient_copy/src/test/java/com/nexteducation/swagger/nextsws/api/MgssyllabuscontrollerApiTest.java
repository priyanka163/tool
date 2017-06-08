package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.MGSBoardSyllabusResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.MGSSyllabusNodeResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MgssyllabuscontrollerApi
 */
public class MgssyllabuscontrollerApiTest {

    private MgssyllabuscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MgssyllabuscontrollerApi.class);
    }

    
    /**
     * getBoardAndSyllabi
     *
     * 
     */
    @Test
    public void getBoardAndSyllabiUsingGETTest() {
        // MGSBoardSyllabusResponse response = api.getBoardAndSyllabiUsingGET();

        // TODO: test validations
    }
    
    /**
     * getContentSectionsByLesson
     *
     * 
     */
    @Test
    public void getContentSectionsByLessonUsingPOSTTest() {
        Long lessonId = null;
        // ModelAndView response = api.getContentSectionsByLessonUsingPOST(lessonId);

        // TODO: test validations
    }
    
    /**
     * getMappedLessonsByLesson
     *
     * 
     */
    @Test
    public void getMappedLessonsByLessonUsingGETTest() {
        Long lessonId = null;
        // String response = api.getMappedLessonsByLessonUsingGET(lessonId);

        // TODO: test validations
    }
    
    /**
     * getSyllabusNode
     *
     * 
     */
    @Test
    public void getSyllabusNodeUsingPOSTTest() {
        Long syllabusId = null;
        // MGSSyllabusNodeResponse response = api.getSyllabusNodeUsingPOST(syllabusId);

        // TODO: test validations
    }
    
    /**
     * showSyllabus
     *
     * 
     */
    @Test
    public void showSyllabusUsingGETTest() {
        // ModelAndView response = api.showSyllabusUsingGET();

        // TODO: test validations
    }
    
}
