package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.LanguageResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MgsboardcontrollerApi {
  /**
   * getBoardLanguages
   * 
   * @param syllabusId syllabusId (required)
   * @return Call&lt;List<LanguageResponse>&gt;
   */
  
  @GET("data/getBoardLanguages")
  Call<List<LanguageResponse>> getBoardLanguagesUsingGET(
    @Query("syllabusId") String syllabusId
  );

  /**
   * showBoards
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("manageBoards")
  Call<ModelAndView> showBoardsUsingGET();
    

}
