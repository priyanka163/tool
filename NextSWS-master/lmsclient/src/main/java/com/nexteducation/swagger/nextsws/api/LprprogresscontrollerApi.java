package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.LPRProgressResponse;
import com.nexteducation.swagger.nextsws.model.LPRProgressRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LprprogresscontrollerApi {
  /**
   * getLPRProgressList
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @return Call&lt;List<LPRProgressResponse>&gt;
   */
  
  @GET("data/getLPRProgressList/{learningPlanMemberUuid}")
  Call<List<LPRProgressResponse>> getLPRProgressListUsingGET(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid
  );

  /**
   * updateLPRProgress
   * 
   * @param lprProgress lprProgress (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/updateLPRProgress")
  Call<Void> updateLPRProgressUsingGET(
    @Body LPRProgressRequest lprProgress, @Body SessionParams sessionParams
  );

}
