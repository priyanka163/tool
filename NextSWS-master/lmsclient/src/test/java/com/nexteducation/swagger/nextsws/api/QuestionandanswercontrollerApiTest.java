package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.AssociationRequest;
import com.nexteducation.swagger.nextsws.model.QueAndAnsDTO;
import com.nexteducation.swagger.nextsws.model.UserCommentRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuestionandanswercontrollerApi
 */
public class QuestionandanswercontrollerApiTest {

    private QuestionandanswercontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(QuestionandanswercontrollerApi.class);
    }

    
    /**
     * askQuestionInput
     *
     * 
     */
    @Test
    public void askQuestionInputUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.askQuestionInputUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * downvote
     *
     * 
     */
    @Test
    public void downvoteUsingPOSTTest() {
        AssociationRequest associationRequest = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.downvoteUsingPOST(associationRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * faqHome
     *
     * 
     */
    @Test
    public void faqHomeUsingGETTest() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.faqHomeUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * faqInput
     *
     * 
     */
    @Test
    public void faqInputUsingGETTest() {
        QueAndAnsDTO requestDTO = null;
        // ModelAndView response = api.faqInputUsingGET(requestDTO);

        // TODO: test validations
    }
    
    /**
     * follow
     *
     * 
     */
    @Test
    public void followUsingPOSTTest() {
        AssociationRequest associationRequest = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.followUsingPOST(associationRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getAllCommentsByTypeForModeration
     *
     * 
     */
    @Test
    public void getAllCommentsByTypeForModerationUsingPOSTTest() {
        UserCommentRequest userCommentRequest = null;
        // ModelAndView response = api.getAllCommentsByTypeForModerationUsingPOST(userCommentRequest);

        // TODO: test validations
    }
    
    /**
     * getAllCommentsByType
     *
     * 
     */
    @Test
    public void getAllCommentsByTypeUsingPOSTTest() {
        UserCommentRequest userCommentRequest = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getAllCommentsByTypeUsingPOST(userCommentRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChapterPost
     *
     * 
     */
    @Test
    public void getChapterPostUsingGET1Test() {
        String forumId = null;
        String syllabusId = null;
        String chapterId = null;
        Integer page = null;
        Integer limit = null;
        SessionParams sessionParams = null;
        // Object response = api.getChapterPostUsingGET1(forumId, syllabusId, chapterId, page, limit, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getForumSyllabusPost
     *
     * 
     */
    @Test
    public void getForumSyllabusPostUsingGETTest() {
        String forumId = null;
        String syllabusId = null;
        Integer page = null;
        Integer limit = null;
        SessionParams sessionParams = null;
        // Object response = api.getForumSyllabusPostUsingGET(forumId, syllabusId, page, limit, sessionParams);

        // TODO: test validations
    }
    
    /**
     * postThread
     *
     * 
     */
    @Test
    public void postThreadUsingGETTest() {
        String postUUID = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.postThreadUsingGET(postUUID, sessionParams);

        // TODO: test validations
    }
    
    /**
     * q2aHome
     *
     * 
     */
    @Test
    public void q2aHomeUsingGETTest() {
        Integer page = null;
        Integer limit = null;
        String forumId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.q2aHomeUsingGET(page, limit, forumId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * unfollow
     *
     * 
     */
    @Test
    public void unfollowUsingPOSTTest() {
        AssociationRequest associationRequest = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.unfollowUsingPOST(associationRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * upvote
     *
     * 
     */
    @Test
    public void upvoteUsingPOSTTest() {
        AssociationRequest associationRequest = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.upvoteUsingPOST(associationRequest, sessionParams);

        // TODO: test validations
    }
    
}
