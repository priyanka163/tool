package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.BookMarkResponse;
import com.nexteducation.swagger.nextsws.model.BookMarkRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
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
        SessionParams sessionParams = null;
        // BookMarkResponse response = api.addBookMarkUsingPOST(bookMarkRequest, sessionParams);

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
        SessionParams sessionParams = null;
        // List<BookMarkResponse> response = api.getBMByUserAndSubjectAndChapterUsingGET(subjectId, chapterId, sessionParams);

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
        SessionParams sessionParams = null;
        // List<BookMarkResponse> response = api.getBMByUserAndSubjectUsingGET(subjectId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getBMByUser
     *
     * 
     */
    @Test
    public void getBMByUserUsingGETTest() {
        SessionParams sessionParams = null;
        // List<BookMarkResponse> response = api.getBMByUserUsingGET(sessionParams);

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
        SessionParams sessionParams = null;
        // ModelAndView response = api.getBookMarksByChapterUsingGET(subjectId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getBookMarks
     *
     * 
     */
    @Test
    public void getBookMarksUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.getBookMarksUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSubjects
     *
     * 
     */
    @Test
    public void getSubjectsUsingGETTest() {
        SessionParams sessionParams = null;
        // List<SubjectAndSyllabusResponse> response = api.getSubjectsUsingGET(sessionParams);

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
