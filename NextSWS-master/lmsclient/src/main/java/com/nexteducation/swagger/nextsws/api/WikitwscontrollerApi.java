package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.WikiDTO;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.WikiPageDetailResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WikitwscontrollerApi {
  /**
   * createWiki
   * 
   * @param wikiDTO wikiDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/createWiki")
  Call<Object> createWikiUsingGET(
    @Body WikiDTO wikiDTO, @Body SessionParams sessionParams
  );

  /**
   * fetchWikiForLesson
   * 
   * @param currentSylId currentSylId (required)
   * @param studyClassId studyClassId (required)
   * @param currentChapterId currentChapterId (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/fetchWikiForLesson/{currentSylId}/{studyClassId}/{currentChapterId}/{sectionId}")
  Call<Object> fetchWikiForLessonUsingGET(
    @Path("currentSylId") Long currentSylId, @Path("studyClassId") Long studyClassId, @Path("currentChapterId") Long currentChapterId, @Path("sectionId") Long sectionId, @Body SessionParams sessionParams
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @DELETE("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingDELETE(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @GET("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingGET(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @HEAD("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingHEAD(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @OPTIONS("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingOPTIONS(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @PATCH("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingPATCH(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @POST("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingPOST(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @PUT("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingPUT(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

}
