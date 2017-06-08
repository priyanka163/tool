package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MasterresourcesourcetypecontrollerApi {
  /**
   * getMasterResourceSourceTypes
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("masterResourceSourceType")
  Call<ModelAndView> getMasterResourceSourceTypesUsingGET();
    

}
