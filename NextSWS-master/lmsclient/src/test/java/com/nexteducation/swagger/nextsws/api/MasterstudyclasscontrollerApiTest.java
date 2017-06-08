package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.MasterStudyClassDTO;
import com.nexteducation.swagger.nextsws.model.LessonPlanRO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MasterstudyclasscontrollerApi
 */
public class MasterstudyclasscontrollerApiTest {

    private MasterstudyclasscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MasterstudyclasscontrollerApi.class);
    }

    
    /**
     * listClassSections
     *
     * 
     */
    @Test
    public void listClassSectionsUsingGETTest() {
        MasterStudyClassDTO studyClassDTO = null;
        // LessonPlanRO response = api.listClassSectionsUsingGET(studyClassDTO);

        // TODO: test validations
    }
    
    /**
     * listClasses
     *
     * 
     */
    @Test
    public void listClassesUsingGETTest() {
        MasterStudyClassDTO studyClassDTO = null;
        // LessonPlanRO response = api.listClassesUsingGET(studyClassDTO);

        // TODO: test validations
    }
    
}
