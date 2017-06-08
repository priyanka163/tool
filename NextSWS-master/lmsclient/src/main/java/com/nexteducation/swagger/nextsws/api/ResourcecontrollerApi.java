package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ResourceDTO;
import com.nexteducation.swagger.nextsws.model.UserResourceResponse;
import com.nexteducation.swagger.nextsws.model.AssetResponse;
import com.nexteducation.swagger.nextsws.model.DocResponse;
import com.nexteducation.swagger.nextsws.model.ResourceRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ResourcecontrollerApi {
  /**
   * deleteResourceAssetFile
   * 
   * @param resourceUuid resourceUuid (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/deleteResourceAssetDocument/{resourceUuid}")
  Call<Void> deleteResourceAssetFileUsingGET(
    @Path("resourceUuid") String resourceUuid, @Body SessionParams sessionParams
  );

  /**
   * deleteSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/deleteSyllabusNodeResource")
  Call<Void> deleteSyllabusNodeResourceUsingPOST(
    @Body ResourceDTO resourceDTO, @Body SessionParams sessionParams
  );

  /**
   * fetchResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;String&gt;
   */
  
  @GET("data/resourceAssetDocument/{assetUuid}")
  Call<String> fetchResourceAssetFileUsingGET(
    @Path("assetUuid") String assetUuid, @Body SessionParams sessionParams
  );

  /**
   * fetchSyllabusNodeResourceBasedOnType
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param resourceType resourceType (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/getSyllabusNodeResourceByType/{syllabusNodeId}/{resourceType}")
  Call<List<UserResourceResponse>> fetchSyllabusNodeResourceBasedOnTypeUsingGET(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("resourceType") Long resourceType, @Body SessionParams sessionParams
  );

  /**
   * getAssetByUUid
   * 
   * @param assetuuid assetuuid (required)
   * @return Call&lt;AssetResponse&gt;
   */
  
  @GET("data/getAssetByUuid/{assetuuid}")
  Call<AssetResponse> getAssetByUUidUsingGET(
    @Path("assetuuid") String assetuuid
  );

  /**
   * getCustomSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/getCustomSyllabusNodeResource")
  Call<List<UserResourceResponse>> getCustomSyllabusNodeResourceUsingPOST(
    @Body ResourceDTO resourceDTO, @Body SessionParams sessionParams
  );

  /**
   * getGlobalResources
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/fetchGlobalResources")
  Call<List<UserResourceResponse>> getGlobalResourcesUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getResourceBasedOnType
   * 
   * @param resourceDTO resourceDTO (required)
   * @param resourceType resourceType (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/getSyllabusNodeResourceByType/{resourceType}")
  Call<List<UserResourceResponse>> getResourceBasedOnTypeUsingPOST(
    @Body ResourceDTO resourceDTO, @Path("resourceType") Long resourceType, @Body SessionParams sessionParams
  );

  /**
   * getSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/getSyllabusNodeResource")
  Call<List<UserResourceResponse>> getSyllabusNodeResourceUsingPOST(
    @Body ResourceDTO resourceDTO, @Body SessionParams sessionParams
  );

  /**
   * insertSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/insertSyllabusNodeResource")
  Call<List<UserResourceResponse>> insertSyllabusNodeResourceUsingPOST(
    @Body ResourceDTO resourceDTO, @Body SessionParams sessionParams
  );

  /**
   * updateExternalResource
   * 
   * @param file file (required)
   * @param resourceObj resourceObj (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/uploadExternalResource")
  Call<List<UserResourceResponse>> updateExternalResourceUsingPOST(
    @Query("file") String file, @Query("resourceObj") String resourceObj, @Body SessionParams sessionParams
  );

  /**
   * updateResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/updateAssetDocument/{assetUuid}/{resourceUuid}")
  Call<DocResponse> updateResourceAssetFileUsingGET(
    @Path("assetUuid") String assetUuid, @Path("resourceUuid") String resourceUuid
  );

  /**
   * updateResource
   * 
   * @param resourceRequest resourceRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/updateResource")
  Call<Void> updateResourceUsingPOST(
    @Body ResourceRequest resourceRequest, @Body SessionParams sessionParams
  );

  /**
   * updateSyllabusNodeResourceName
   * 
   * @param resourceDTO resourceDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @POST("data/updateSyllabusNodeResourceName")
  Call<UserResourceResponse> updateSyllabusNodeResourceNameUsingPOST(
    @Body ResourceDTO resourceDTO, @Body SessionParams sessionParams
  );

  /**
   * uploadSyllabusNodeResource
   * 
   * @param file file (required)
   * @param fileExt fileExt (required)
   * @param fileName fileName (required)
   * @param syllabusNodeId syllabusNodeId (required)
   * @param isCustomSyllabusNode isCustomSyllabusNode (required)
   * @param resourceType resourceType (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param assetTypeId assetTypeId (required)
   * @param resourceTypeId resourceTypeId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @POST("data/bulkSyllabusNodeResourceUpload")
  Call<UserResourceResponse> uploadSyllabusNodeResourceUsingPOST1(
    @Query("file") String file, @Query("fileExt") List<String> fileExt, @Query("fileName") List<String> fileName, @Query("syllabusNodeId") Long syllabusNodeId, @Query("isCustomSyllabusNode") Boolean isCustomSyllabusNode, @Query("resourceType") String resourceType, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Query("assetTypeId") Long assetTypeId, @Query("resourceTypeId") Long resourceTypeId, @Body SessionParams sessionParams
  );

}
