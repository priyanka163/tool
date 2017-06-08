package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.PageRequest;
import com.nexteducation.swagger.nextsws.model.PageResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusResponseV2;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PagecontrollerApi
 */
public class PagecontrollerApiTest {

    private PagecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PagecontrollerApi.class);
    }

    
    /**
     * addPage
     *
     * 
     */
    @Test
    public void addPageUsingPOSTTest() {
        PageRequest pageRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // PageResponse response = api.addPageUsingPOST(pageRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deletePage
     *
     * 
     */
    @Test
    public void deletePageUsingGETTest() {
        String pageUuid = null;
        // PageResponse response = api.deletePageUsingGET(pageUuid);

        // TODO: test validations
    }
    
    /**
     * deletePages
     *
     * 
     */
    @Test
    public void deletePagesUsingPOSTTest() {
        List<String> pageUuids = null;
        // List<PageResponse> response = api.deletePagesUsingPOST(pageUuids);

        // TODO: test validations
    }
    
    /**
     * getChapterList
     *
     * 
     */
    @Test
    public void getChapterListUsingGETTest() {
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // SyllabusResponseV2 response = api.getChapterListUsingGET(syllabusId, ifCustomSyllabus, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getSubjectPageByChapter
     *
     * 
     */
    @Test
    public void getSubjectPageByChapterUsingGETTest() {
        Long syllabusId = null;
        String reference = null;
        String noteBookUuid = null;
        String noteBookName = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String chapterId = null;
        String schoolSubjectName = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getSubjectPageByChapterUsingGET(syllabusId, reference, noteBookUuid, noteBookName, ifCustomSyllabus, subjectName, chapterId, schoolSubjectName, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getSubjectPage
     *
     * 
     */
    @Test
    public void getSubjectPageUsingGET1Test() {
        Long syllabusId = null;
        String noteBookName = null;
        String noteBookUuid = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String chapterId = null;
        String schoolSubjectName = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getSubjectPageUsingGET1(syllabusId, noteBookName, noteBookUuid, ifCustomSyllabus, subjectName, chapterId, schoolSubjectName, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * listPageByNoteBook
     *
     * 
     */
    @Test
    public void listPageByNoteBookUsingGETTest() {
        String noteBookUuid = null;
        // List<PageResponse> response = api.listPageByNoteBookUsingGET(noteBookUuid);

        // TODO: test validations
    }
    
    /**
     * listPage
     *
     * 
     */
    @Test
    public void listPageUsingGETTest() {
        Long tenantId = null;
        // List<PageResponse> response = api.listPageUsingGET(tenantId);

        // TODO: test validations
    }
    
    /**
     * updatePage
     *
     * 
     */
    @Test
    public void updatePageUsingPOSTTest() {
        PageRequest pageRequest = null;
        // PageResponse response = api.updatePageUsingPOST(pageRequest);

        // TODO: test validations
    }
    
}
