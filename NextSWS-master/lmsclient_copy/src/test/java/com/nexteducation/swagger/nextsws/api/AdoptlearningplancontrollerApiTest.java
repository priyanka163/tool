package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.LectureBreakupResponse;
import com.nexteducation.swagger.nextsws.model.AdoptLecturePlanResponse;
import com.nexteducation.swagger.nextsws.model.LectureBreakupDTO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdoptlearningplancontrollerApi
 */
public class AdoptlearningplancontrollerApiTest {

    private AdoptlearningplancontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AdoptlearningplancontrollerApi.class);
    }

    
    /**
     * adoptLecturePlan
     *
     * 
     */
    @Test
    public void adoptLecturePlanUsingPOSTTest() {
        Long classId = null;
        Long sectionId = null;
        Long subjectId = null;
        String selectedLectureBreakupId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureBreakupResponse response = api.adoptLecturePlanUsingPOST(classId, sectionId, subjectId, selectedLectureBreakupId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchAdoptableLearningPlans
     *
     * 
     */
    @Test
    public void fetchAdoptableLearningPlansUsingGETTest() {
        Long subjectId = null;
        Long classId = null;
        Long sectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // AdoptLecturePlanResponse response = api.fetchAdoptableLearningPlansUsingGET(subjectId, classId, sectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchLectureBreakupDetailsForSelectedAdoptablePlan
     *
     * 
     */
    @Test
    public void fetchLectureBreakupDetailsForSelectedAdoptablePlanUsingGETTest() {
        String lectureBreakupUuid = null;
        // AdoptLecturePlanResponse response = api.fetchLectureBreakupDetailsForSelectedAdoptablePlanUsingGET(lectureBreakupUuid);

        // TODO: test validations
    }
    
    /**
     * InsertAdoptedLectureBreakup
     *
     * 
     */
    @Test
    public void insertAdoptedLectureBreakupUsingDELETETest() {
        LectureBreakupDTO breakupDTO = null;
        Boolean adoptResource = null;
        Boolean levelOfSelectedPlan = null;
        Long selectedPlanSectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureBreakupResponse response = api.insertAdoptedLectureBreakupUsingDELETE(breakupDTO, adoptResource, levelOfSelectedPlan, selectedPlanSectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * InsertAdoptedLectureBreakup
     *
     * 
     */
    @Test
    public void insertAdoptedLectureBreakupUsingGETTest() {
        LectureBreakupDTO breakupDTO = null;
        Boolean adoptResource = null;
        Boolean levelOfSelectedPlan = null;
        Long selectedPlanSectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureBreakupResponse response = api.insertAdoptedLectureBreakupUsingGET(breakupDTO, adoptResource, levelOfSelectedPlan, selectedPlanSectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * InsertAdoptedLectureBreakup
     *
     * 
     */
    @Test
    public void insertAdoptedLectureBreakupUsingHEADTest() {
        LectureBreakupDTO breakupDTO = null;
        Boolean adoptResource = null;
        Boolean levelOfSelectedPlan = null;
        Long selectedPlanSectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureBreakupResponse response = api.insertAdoptedLectureBreakupUsingHEAD(breakupDTO, adoptResource, levelOfSelectedPlan, selectedPlanSectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * InsertAdoptedLectureBreakup
     *
     * 
     */
    @Test
    public void insertAdoptedLectureBreakupUsingOPTIONSTest() {
        LectureBreakupDTO breakupDTO = null;
        Boolean adoptResource = null;
        Boolean levelOfSelectedPlan = null;
        Long selectedPlanSectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureBreakupResponse response = api.insertAdoptedLectureBreakupUsingOPTIONS(breakupDTO, adoptResource, levelOfSelectedPlan, selectedPlanSectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * InsertAdoptedLectureBreakup
     *
     * 
     */
    @Test
    public void insertAdoptedLectureBreakupUsingPATCHTest() {
        LectureBreakupDTO breakupDTO = null;
        Boolean adoptResource = null;
        Boolean levelOfSelectedPlan = null;
        Long selectedPlanSectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureBreakupResponse response = api.insertAdoptedLectureBreakupUsingPATCH(breakupDTO, adoptResource, levelOfSelectedPlan, selectedPlanSectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * InsertAdoptedLectureBreakup
     *
     * 
     */
    @Test
    public void insertAdoptedLectureBreakupUsingPOSTTest() {
        LectureBreakupDTO breakupDTO = null;
        Boolean adoptResource = null;
        Boolean levelOfSelectedPlan = null;
        Long selectedPlanSectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureBreakupResponse response = api.insertAdoptedLectureBreakupUsingPOST(breakupDTO, adoptResource, levelOfSelectedPlan, selectedPlanSectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * InsertAdoptedLectureBreakup
     *
     * 
     */
    @Test
    public void insertAdoptedLectureBreakupUsingPUTTest() {
        LectureBreakupDTO breakupDTO = null;
        Boolean adoptResource = null;
        Boolean levelOfSelectedPlan = null;
        Long selectedPlanSectionId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // LectureBreakupResponse response = api.insertAdoptedLectureBreakupUsingPUT(breakupDTO, adoptResource, levelOfSelectedPlan, selectedPlanSectionId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * publishPlan
     *
     * 
     */
    @Test
    public void publishPlanUsingPOSTTest() {
        Long classId = null;
        Long sectionId = null;
        Long subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // String response = api.publishPlanUsingPOST(classId, sectionId, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
