package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.PostResponseRequest;
import com.nexteducation.swagger.nextsws.model.PostRequest;
import com.nexteducation.swagger.nextsws.model.UserCommentRequest;
import com.nexteducation.swagger.nextsws.model.AssociationRequest;
import com.nexteducation.swagger.nextsws.model.UserCommentResponse;
import com.nexteducation.swagger.nextsws.model.AssociationObjectResponse;
import com.nexteducation.swagger.nextsws.model.AssociationObjectRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PostcontrollerApi
 */
public class PostcontrollerApiTest {

    private PostcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PostcontrollerApi.class);
    }

    
    /**
     * createPostResponse
     *
     * 
     */
    @Test
    public void createPostResponseUsingPOSTTest() {
        PostResponseRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.createPostResponseUsingPOST(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * createPost
     *
     * 
     */
    @Test
    public void createPostUsingPOSTTest() {
        PostRequest postRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.createPostUsingPOST(postRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * createUserComment
     *
     * 
     */
    @Test
    public void createUserCommentUsingPOSTTest() {
        UserCommentRequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.createUserCommentUsingPOST(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deletePost
     *
     * 
     */
    @Test
    public void deletePostUsingGETTest() {
        String postId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.deletePostUsingGET(postId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getChapterPost
     *
     * 
     */
    @Test
    public void getChapterPostUsingGETTest() {
        String chapterId = null;
        Integer page = null;
        Integer limit = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.getChapterPostUsingGET(chapterId, page, limit, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getChapterPost
     *
     * 
     */
    @Test
    public void getChapterPostUsingPOSTTest() {
        PostRequest postRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.getChapterPostUsingPOST(postRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getChapterWiseSyllabusPost
     *
     * 
     */
    @Test
    public void getChapterWiseSyllabusPostUsingGETTest() {
        String syllabusId = null;
        Integer page = null;
        Integer limit = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.getChapterWiseSyllabusPostUsingGET(syllabusId, page, limit, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getDetailPost
     *
     * 
     */
    @Test
    public void getDetailPostUsingGETTest() {
        String postId = null;
        // Object response = api.getDetailPostUsingGET(postId);

        // TODO: test validations
    }
    
    /**
     * getPostDislikes
     *
     * 
     */
    @Test
    public void getPostDislikesUsingPOSTTest() {
        AssociationRequest associationRequest = null;
        // Object response = api.getPostDislikesUsingPOST(associationRequest);

        // TODO: test validations
    }
    
    /**
     * getPostLikes
     *
     * 
     */
    @Test
    public void getPostLikesUsingPOSTTest() {
        AssociationRequest associationRequest = null;
        // Object response = api.getPostLikesUsingPOST(associationRequest);

        // TODO: test validations
    }
    
    /**
     * getPostResponseUserComments
     *
     * 
     */
    @Test
    public void getPostResponseUserCommentsUsingGETTest() {
        String postResponseUuid = null;
        // List<UserCommentResponse> response = api.getPostResponseUserCommentsUsingGET(postResponseUuid);

        // TODO: test validations
    }
    
    /**
     * getPostUserComments
     *
     * 
     */
    @Test
    public void getPostUserCommentsUsingGETTest() {
        String postUuid = null;
        // List<UserCommentResponse> response = api.getPostUserCommentsUsingGET(postUuid);

        // TODO: test validations
    }
    
    /**
     * getPost
     *
     * 
     */
    @Test
    public void getPostUsingGETTest() {
        String postId = null;
        // Object response = api.getPostUsingGET(postId);

        // TODO: test validations
    }
    
    /**
     * getSyllabusPost
     *
     * 
     */
    @Test
    public void getSyllabusPostUsingGETTest() {
        String syllabusId = null;
        Integer page = null;
        Integer limit = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.getSyllabusPostUsingGET(syllabusId, page, limit, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getUpvoteDownvoteDetails
     *
     * 
     */
    @Test
    public void getUpvoteDownvoteDetailsUsingPOSTTest() {
        AssociationObjectRequest request = null;
        // List<AssociationObjectResponse> response = api.getUpvoteDownvoteDetailsUsingPOST(request);

        // TODO: test validations
    }
    
    /**
     * getUserCommentsResponse
     *
     * 
     */
    @Test
    public void getUserCommentsResponseUsingPOSTTest() {
        UserCommentRequest userCommentRequest = null;
        // List<UserCommentResponse> response = api.getUserCommentsResponseUsingPOST(userCommentRequest);

        // TODO: test validations
    }
    
    /**
     * getUserPost
     *
     * 
     */
    @Test
    public void getUserPostUsingGETTest() {
        Long userId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId2 = null;
        // Object response = api.getUserPostUsingGET(userId, branchId, academicSessionId, userId2);

        // TODO: test validations
    }
    
    /**
     * updatePost
     *
     * 
     */
    @Test
    public void updatePostUsingPOSTTest() {
        PostRequest postRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Object response = api.updatePostUsingPOST(postRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
