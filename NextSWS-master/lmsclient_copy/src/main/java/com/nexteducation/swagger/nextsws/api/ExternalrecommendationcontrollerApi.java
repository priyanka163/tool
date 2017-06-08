package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.VideoSearchResponseDTO;
import com.nexteducation.swagger.nextsws.model.VideoSearchRequestDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExternalrecommendationcontrollerApi {
  /**
   * getVideos
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/externalrecommendations")
  Call<ModelAndView> getVideosUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getYoutubeVid
   * 
   * @param videoSearchRequestDTO videoSearchRequestDTO (required)
   * @return Call&lt;VideoSearchResponseDTO&gt;
   */
  
  @POST("nextmentee/externalrecommendations/youtubevid")
  Call<VideoSearchResponseDTO> getYoutubeVidUsingPOST(
    @Body VideoSearchRequestDTO videoSearchRequestDTO
  );

}
