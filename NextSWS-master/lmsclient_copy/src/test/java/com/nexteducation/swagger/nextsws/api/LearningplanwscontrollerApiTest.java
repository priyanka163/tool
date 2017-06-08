package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.CollectionResourceResponse;
import com.nexteducation.swagger.nextsws.model.CollectionLearningPlanDetailResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LearningplanwscontrollerApi
 */
public class LearningplanwscontrollerApiTest {

    private LearningplanwscontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LearningplanwscontrollerApi.class);
    }

    
    /**
     * getDetailLearningplansByUUID
     *
     * 
     */
    @Test
    public void getDetailLearningplansByUUIDUsingPOSTTest() {
        List<String> resourceUuids = null;
        // CollectionResourceResponse response = api.getDetailLearningplansByUUIDUsingPOST(resourceUuids);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanByChapter
     *
     * 
     */
    @Test
    public void getLearningPlanByChapterUsingGETTest() {
        Long chapterId = null;
        Long sectionId = null;
        Long classId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.getLearningPlanByChapterUsingGET(chapterId, sectionId, classId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLearningPlanForChapter
     *
     * 
     */
    @Test
    public void getLearningPlanForChapterUsingGETTest() {
        Long chapterId = null;
        Long sectionId = null;
        Long classId = null;
        Long subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // CollectionLearningPlanDetailResponse response = api.getLearningPlanForChapterUsingGET(chapterId, sectionId, classId, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
