package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.LanguageResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MgsboardcontrollerApi
 */
public class MgsboardcontrollerApiTest {

    private MgsboardcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MgsboardcontrollerApi.class);
    }

    
    /**
     * getBoardLanguages
     *
     * 
     */
    @Test
    public void getBoardLanguagesUsingGETTest() {
        String syllabusId = null;
        // List<LanguageResponse> response = api.getBoardLanguagesUsingGET(syllabusId);

        // TODO: test validations
    }
    
    /**
     * showBoards
     *
     * 
     */
    @Test
    public void showBoardsUsingGETTest() {
        // ModelAndView response = api.showBoardsUsingGET();

        // TODO: test validations
    }
    
}
