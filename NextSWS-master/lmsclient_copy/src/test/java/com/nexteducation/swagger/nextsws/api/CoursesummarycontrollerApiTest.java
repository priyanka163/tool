package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CoursesummarycontrollerApi
 */
public class CoursesummarycontrollerApiTest {

    private CoursesummarycontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CoursesummarycontrollerApi.class);
    }

    
    /**
     * getLatestPublishedLectureBasedonChapter
     *
     * 
     */
    @Test
    public void getLatestPublishedLectureBasedonChapterUsingGETTest() {
        Long sectionId = null;
        Long userId = null;
        Long chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId2 = null;
        // Object response = api.getLatestPublishedLectureBasedonChapterUsingGET(sectionId, userId, chapterId, branchId, academicSessionId, userId2);

        // TODO: test validations
    }
    
    /**
     * getLatestPublishedLectureBasedonSection
     *
     * 
     */
    @Test
    public void getLatestPublishedLectureBasedonSectionUsingGETTest() {
        Long sectionId = null;
        Long userId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId2 = null;
        // Object response = api.getLatestPublishedLectureBasedonSectionUsingGET(sectionId, userId, branchId, academicSessionId, userId2);

        // TODO: test validations
    }
    
    /**
     * getLectureListBasedonChapter
     *
     * 
     */
    @Test
    public void getLectureListBasedonChapterUsingGETTest() {
        Long sectionId = null;
        Long userId = null;
        Long chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId2 = null;
        // List<Object> response = api.getLectureListBasedonChapterUsingGET(sectionId, userId, chapterId, branchId, academicSessionId, userId2);

        // TODO: test validations
    }
    
    /**
     * getLectureListBasedonSection
     *
     * 
     */
    @Test
    public void getLectureListBasedonSectionUsingGETTest() {
        Long sectionId = null;
        Long userId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId2 = null;
        // List<Object> response = api.getLectureListBasedonSectionUsingGET(sectionId, userId, branchId, academicSessionId, userId2);

        // TODO: test validations
    }
    
    /**
     * getResourceListForTask
     *
     * 
     */
    @Test
    public void getResourceListForTaskUsingGETTest() {
        Long taskId = null;
        // List<Object> response = api.getResourceListForTaskUsingGET(taskId);

        // TODO: test validations
    }
    
}
