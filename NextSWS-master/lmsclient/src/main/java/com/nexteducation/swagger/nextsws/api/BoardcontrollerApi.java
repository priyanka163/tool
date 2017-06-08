package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.CustomSyllabusDTO;
import com.nexteducation.swagger.nextsws.model.SessionParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BoardcontrollerApi {
  /**
   * listAllBoards
   * 
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @GET("data/getAllBoards.app")
  Call<CustomSyllabusDTO> listAllBoardsUsingGET();
    

  /**
   * listAllClasses
   * 
   * @param sessionParams sessionParams (optional)
   * @param queryable queryable (optional)
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  

}
