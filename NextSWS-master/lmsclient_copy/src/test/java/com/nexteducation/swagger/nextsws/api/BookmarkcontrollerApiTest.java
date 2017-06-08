package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.BookMarkResponse;
import com.nexteducation.swagger.nextsws.model.BookMarkRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SubjectAndSyllabusResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookmarkcontrollerApi
 */
public class BookmarkcontrollerApiTest {

    private BookmarkcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BookmarkcontrollerApi.class);
    }

    
    /**
     * addBookMark
     *
     * 
     */
    @Test
    public void addBookMarkUsingPOSTTest() {
        BookMarkRequest bookMarkRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // BookMarkResponse response = api.addBookMarkUsingPOST(bookMarkRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteBookMark
     *
     * 
     */
    @Test
    public void deleteBookMarkUsingPOSTTest() {
        BookMarkRequest bookMarkRequest = null;
        // BookMarkResponse response = api.deleteBookMarkUsingPOST(bookMarkRequest);

        // TODO: test validations
    }
    
    /**
     * getBMByUserAndSubjectAndChapter
     *
     * 
     */
    @Test
    public void getBMByUserAndSubjectAndChapterUsingGETTest() {
        String subjectId = null;
        String chapterId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<BookMarkResponse> response = api.getBMByUserAndSubjectAndChapterUsingGET(subjectId, chapterId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getBMByUserAndSubject
     *
     * 
     */
    @Test
    public void getBMByUserAndSubjectUsingGETTest() {
        String subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<BookMarkResponse> response = api.getBMByUserAndSubjectUsingGET(subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getBMByUser
     *
     * 
     */
    @Test
    public void getBMByUserUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<BookMarkResponse> response = api.getBMByUserUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getBookMarksByChapter
     *
     * 
     */
    @Test
    public void getBookMarksByChapterUsingGETTest() {
        String subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getBookMarksByChapterUsingGET(subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getBookMarks
     *
     * 
     */
    @Test
    public void getBookMarksUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getBookMarksUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getSubjects
     *
     * 
     */
    @Test
    public void getSubjectsUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<SubjectAndSyllabusResponse> response = api.getSubjectsUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * listBookMarkByUser
     *
     * 
     */
    @Test
    public void listBookMarkByUserUsingGETTest() {
        String userId = null;
        // List<BookMarkResponse> response = api.listBookMarkByUserUsingGET(userId);

        // TODO: test validations
    }
    
    /**
     * updateBookMark
     *
     * 
     */
    @Test
    public void updateBookMarkUsingPUTTest() {
        BookMarkRequest bookMarkRequest = null;
        // BookMarkResponse response = api.updateBookMarkUsingPUT(bookMarkRequest);

        // TODO: test validations
    }
    
}
