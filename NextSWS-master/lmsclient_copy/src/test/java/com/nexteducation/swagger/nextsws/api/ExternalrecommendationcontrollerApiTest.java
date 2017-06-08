package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.VideoSearchResponseDTO;
import com.nexteducation.swagger.nextsws.model.VideoSearchRequestDTO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalrecommendationcontrollerApi
 */
public class ExternalrecommendationcontrollerApiTest {

    private ExternalrecommendationcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExternalrecommendationcontrollerApi.class);
    }

    
    /**
     * getVideos
     *
     * 
     */
    @Test
    public void getVideosUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getVideosUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getYoutubeVid
     *
     * 
     */
    @Test
    public void getYoutubeVidUsingPOSTTest() {
        VideoSearchRequestDTO videoSearchRequestDTO = null;
        // VideoSearchResponseDTO response = api.getYoutubeVidUsingPOST(videoSearchRequestDTO);

        // TODO: test validations
    }
    
}
