package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.WeeklySummaryRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SwssummarycontrollerApi
 */
public class SwssummarycontrollerApiTest {

    private SwssummarycontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SwssummarycontrollerApi.class);
    }

    
    /**
     * getCategoryBasedChapterUsageReport
     *
     * 
     */
    @Test
    public void getCategoryBasedChapterUsageReportUsingPOSTTest() {
        Long syllabusId = null;
        Long profileId = null;
        Long chapterId = null;
        WeeklySummaryRequest request = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getCategoryBasedChapterUsageReportUsingPOST(syllabusId, profileId, chapterId, request, ifCustomSyllabus, ifCustomChapter, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChapterUsageReport
     *
     * 
     */
    @Test
    public void getChapterUsageReportUsingPOSTTest() {
        Long syllabusId = null;
        Long profileId = null;
        Long chapterId = null;
        WeeklySummaryRequest request = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getChapterUsageReportUsingPOST(syllabusId, profileId, chapterId, request, ifCustomSyllabus, ifCustomChapter, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChapterWeeklyReport
     *
     * 
     */
    @Test
    public void getChapterWeeklyReportUsingPOSTTest() {
        Long syllabusId = null;
        Long profileId = null;
        Long chapterId = null;
        WeeklySummaryRequest request = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getChapterWeeklyReportUsingPOST(syllabusId, profileId, chapterId, request, ifCustomSyllabus, ifCustomChapter, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getOverallUsageReport
     *
     * 
     */
    @Test
    public void getOverallUsageReportUsingPOSTTest() {
        Long profileId = null;
        WeeklySummaryRequest request = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getOverallUsageReportUsingPOST(profileId, request, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getOverallWeeklyReport
     *
     * 
     */
    @Test
    public void getOverallWeeklyReportUsingPOSTTest() {
        Long profileId = null;
        WeeklySummaryRequest request = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getOverallWeeklyReportUsingPOST(profileId, request, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSyllabusUsageReport
     *
     * 
     */
    @Test
    public void getSyllabusUsageReportUsingPOSTTest() {
        Long syllabusId = null;
        Long profileId = null;
        WeeklySummaryRequest request = null;
        Boolean ifCustomSyllabus = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getSyllabusUsageReportUsingPOST(syllabusId, profileId, request, ifCustomSyllabus, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSyllabusWeeklyReport
     *
     * 
     */
    @Test
    public void getSyllabusWeeklyReportUsingPOSTTest() {
        Long syllabusId = null;
        Long profileId = null;
        WeeklySummaryRequest request = null;
        Boolean ifCustomSyllabus = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getSyllabusWeeklyReportUsingPOST(syllabusId, profileId, request, ifCustomSyllabus, sessionParams);

        // TODO: test validations
    }
    
}
