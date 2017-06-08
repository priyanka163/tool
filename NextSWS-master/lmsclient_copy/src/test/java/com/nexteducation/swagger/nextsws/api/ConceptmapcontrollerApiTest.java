package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.ConceptShortResponse;
import com.nexteducation.swagger.nextsws.model.ConceptDetailedResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConceptmapcontrollerApi
 */
public class ConceptmapcontrollerApiTest {

    private ConceptmapcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConceptmapcontrollerApi.class);
    }

    
    /**
     * getConceptDetails
     *
     * 
     */
    @Test
    public void getConceptDetailsUsingGETTest() {
        String uniqueId = null;
        String chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getConceptDetailsUsingGET(uniqueId, chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getConceptsForChapter
     *
     * 
     */
    @Test
    public void getConceptsForChapterUsingGETTest() {
        Long chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<ConceptShortResponse> response = api.getConceptsForChapterUsingGET(chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getConcepts
     *
     * 
     */
    @Test
    public void getConceptsUsingGETTest() {
        String chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getConceptsUsingGET(chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * listDetailedConceptbyUniqueID
     *
     * 
     */
    @Test
    public void listDetailedConceptbyUniqueIDUsingGETTest() {
        String uniqueId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<ConceptDetailedResponse> response = api.listDetailedConceptbyUniqueIDUsingGET(uniqueId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showMultiLevelGraph
     *
     * 
     */
    @Test
    public void showMultiLevelGraphUsingGETTest() {
        String toConceptId = null;
        Long level = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showMultiLevelGraphUsingGET(toConceptId, level, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
