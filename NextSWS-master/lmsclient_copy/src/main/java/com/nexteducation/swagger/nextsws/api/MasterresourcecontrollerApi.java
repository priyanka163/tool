package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import java.io.File;
import com.nexteducation.swagger.nextsws.model.ResourceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MasterresourcecontrollerApi {
  /**
   * getResources
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("resourceManagement")
  Call<ModelAndView> getResourcesUsingGET();
    

  /**
   * uploadSyllabusNodeResource
   * 
   * @param file file (required)
   * @param fileExt fileExt (required)
   * @param fileType fileType (required)
   * @param fileName fileName (required)
   * @param resourceName resourceName (required)
   * @param resourceTypeId resourceTypeId (required)
   * @param resourceSubTypeId resourceSubTypeId (required)
   * @param resourceEndUseTypeId resourceEndUseTypeId (required)
   * @param resourceSourceTypeId resourceSourceTypeId (required)
   * @return Call&lt;List<ResourceResponse>&gt;
   */
  
  @POST("data/resources")
  Call<List<ResourceResponse>> uploadSyllabusNodeResourceUsingPOST(
    @Query("file") List<File> file, @Query("fileExt") List<String> fileExt, @Query("fileType") List<String> fileType, @Query("fileName") List<String> fileName, @Query("resourceName") String resourceName, @Query("resourceTypeId") Long resourceTypeId, @Query("resourceSubTypeId") Long resourceSubTypeId, @Query("resourceEndUseTypeId") Long resourceEndUseTypeId, @Query("resourceSourceTypeId") Long resourceSourceTypeId
  );

}
