package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ResourceDTO;
import com.nexteducation.swagger.nextsws.model.UserResourceResponse;
import com.nexteducation.swagger.nextsws.model.AssetResponse;
import java.io.File;
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/deleteResourceAssetDocument/{resourceUuid}")
  Call<Void> deleteResourceAssetFileUsingDELETE(
    @Path("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteResourceAssetFile
   * 
   * @param resourceUuid resourceUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/deleteResourceAssetDocument/{resourceUuid}")
  Call<Void> deleteResourceAssetFileUsingGET(
    @Path("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteResourceAssetFile
   * 
   * @param resourceUuid resourceUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/deleteResourceAssetDocument/{resourceUuid}")
  Call<Void> deleteResourceAssetFileUsingHEAD(
    @Path("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteResourceAssetFile
   * 
   * @param resourceUuid resourceUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/deleteResourceAssetDocument/{resourceUuid}")
  Call<Void> deleteResourceAssetFileUsingOPTIONS(
    @Path("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteResourceAssetFile
   * 
   * @param resourceUuid resourceUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/deleteResourceAssetDocument/{resourceUuid}")
  Call<Void> deleteResourceAssetFileUsingPATCH(
    @Path("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteResourceAssetFile
   * 
   * @param resourceUuid resourceUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/deleteResourceAssetDocument/{resourceUuid}")
  Call<Void> deleteResourceAssetFileUsingPOST(
    @Path("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteResourceAssetFile
   * 
   * @param resourceUuid resourceUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/deleteResourceAssetDocument/{resourceUuid}")
  Call<Void> deleteResourceAssetFileUsingPUT(
    @Path("resourceUuid") String resourceUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/deleteSyllabusNodeResource")
  Call<Void> deleteSyllabusNodeResourceUsingDELETE(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/deleteSyllabusNodeResource")
  Call<Void> deleteSyllabusNodeResourceUsingGET(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/deleteSyllabusNodeResource")
  Call<Void> deleteSyllabusNodeResourceUsingHEAD(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/deleteSyllabusNodeResource")
  Call<Void> deleteSyllabusNodeResourceUsingOPTIONS(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/deleteSyllabusNodeResource")
  Call<Void> deleteSyllabusNodeResourceUsingPATCH(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/deleteSyllabusNodeResource")
  Call<Void> deleteSyllabusNodeResourceUsingPOST(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/deleteSyllabusNodeResource")
  Call<Void> deleteSyllabusNodeResourceUsingPUT(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @DELETE("data/resourceAssetDocument/{assetUuid}")
  Call<String> fetchResourceAssetFileUsingDELETE(
    @Path("assetUuid") String assetUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @GET("data/resourceAssetDocument/{assetUuid}")
  Call<String> fetchResourceAssetFileUsingGET(
    @Path("assetUuid") String assetUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @HEAD("data/resourceAssetDocument/{assetUuid}")
  Call<String> fetchResourceAssetFileUsingHEAD(
    @Path("assetUuid") String assetUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @OPTIONS("data/resourceAssetDocument/{assetUuid}")
  Call<String> fetchResourceAssetFileUsingOPTIONS(
    @Path("assetUuid") String assetUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @PATCH("data/resourceAssetDocument/{assetUuid}")
  Call<String> fetchResourceAssetFileUsingPATCH(
    @Path("assetUuid") String assetUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @POST("data/resourceAssetDocument/{assetUuid}")
  Call<String> fetchResourceAssetFileUsingPOST(
    @Path("assetUuid") String assetUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @PUT("data/resourceAssetDocument/{assetUuid}")
  Call<String> fetchResourceAssetFileUsingPUT(
    @Path("assetUuid") String assetUuid, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchSyllabusNodeResourceBasedOnType
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @DELETE("data/getSyllabusNodeResourceByType/{syllabusNodeId}/{resourceType}")
  Call<List<UserResourceResponse>> fetchSyllabusNodeResourceBasedOnTypeUsingDELETE(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchSyllabusNodeResourceBasedOnType
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/getSyllabusNodeResourceByType/{syllabusNodeId}/{resourceType}")
  Call<List<UserResourceResponse>> fetchSyllabusNodeResourceBasedOnTypeUsingGET(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchSyllabusNodeResourceBasedOnType
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @HEAD("data/getSyllabusNodeResourceByType/{syllabusNodeId}/{resourceType}")
  Call<List<UserResourceResponse>> fetchSyllabusNodeResourceBasedOnTypeUsingHEAD(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchSyllabusNodeResourceBasedOnType
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @OPTIONS("data/getSyllabusNodeResourceByType/{syllabusNodeId}/{resourceType}")
  Call<List<UserResourceResponse>> fetchSyllabusNodeResourceBasedOnTypeUsingOPTIONS(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchSyllabusNodeResourceBasedOnType
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PATCH("data/getSyllabusNodeResourceByType/{syllabusNodeId}/{resourceType}")
  Call<List<UserResourceResponse>> fetchSyllabusNodeResourceBasedOnTypeUsingPATCH(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchSyllabusNodeResourceBasedOnType
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/getSyllabusNodeResourceByType/{syllabusNodeId}/{resourceType}")
  Call<List<UserResourceResponse>> fetchSyllabusNodeResourceBasedOnTypeUsingPOST(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchSyllabusNodeResourceBasedOnType
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PUT("data/getSyllabusNodeResourceByType/{syllabusNodeId}/{resourceType}")
  Call<List<UserResourceResponse>> fetchSyllabusNodeResourceBasedOnTypeUsingPUT(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAssetByUUid
   * 
   * @param assetuuid assetuuid (required)
   * @return Call&lt;AssetResponse&gt;
   */
  
  @DELETE("data/getAssetByUuid/{assetuuid}")
  Call<AssetResponse> getAssetByUUidUsingDELETE(
    @Path("assetuuid") String assetuuid
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
   * getAssetByUUid
   * 
   * @param assetuuid assetuuid (required)
   * @return Call&lt;AssetResponse&gt;
   */
  
  @HEAD("data/getAssetByUuid/{assetuuid}")
  Call<AssetResponse> getAssetByUUidUsingHEAD(
    @Path("assetuuid") String assetuuid
  );

  /**
   * getAssetByUUid
   * 
   * @param assetuuid assetuuid (required)
   * @return Call&lt;AssetResponse&gt;
   */
  
  @OPTIONS("data/getAssetByUuid/{assetuuid}")
  Call<AssetResponse> getAssetByUUidUsingOPTIONS(
    @Path("assetuuid") String assetuuid
  );

  /**
   * getAssetByUUid
   * 
   * @param assetuuid assetuuid (required)
   * @return Call&lt;AssetResponse&gt;
   */
  
  @PATCH("data/getAssetByUuid/{assetuuid}")
  Call<AssetResponse> getAssetByUUidUsingPATCH(
    @Path("assetuuid") String assetuuid
  );

  /**
   * getAssetByUUid
   * 
   * @param assetuuid assetuuid (required)
   * @return Call&lt;AssetResponse&gt;
   */
  
  @POST("data/getAssetByUuid/{assetuuid}")
  Call<AssetResponse> getAssetByUUidUsingPOST(
    @Path("assetuuid") String assetuuid
  );

  /**
   * getAssetByUUid
   * 
   * @param assetuuid assetuuid (required)
   * @return Call&lt;AssetResponse&gt;
   */
  
  @PUT("data/getAssetByUuid/{assetuuid}")
  Call<AssetResponse> getAssetByUUidUsingPUT(
    @Path("assetuuid") String assetuuid
  );

  /**
   * getCustomSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @DELETE("data/getCustomSyllabusNodeResource")
  Call<List<UserResourceResponse>> getCustomSyllabusNodeResourceUsingDELETE(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCustomSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/getCustomSyllabusNodeResource")
  Call<List<UserResourceResponse>> getCustomSyllabusNodeResourceUsingGET(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCustomSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @HEAD("data/getCustomSyllabusNodeResource")
  Call<List<UserResourceResponse>> getCustomSyllabusNodeResourceUsingHEAD(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCustomSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @OPTIONS("data/getCustomSyllabusNodeResource")
  Call<List<UserResourceResponse>> getCustomSyllabusNodeResourceUsingOPTIONS(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCustomSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PATCH("data/getCustomSyllabusNodeResource")
  Call<List<UserResourceResponse>> getCustomSyllabusNodeResourceUsingPATCH(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCustomSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/getCustomSyllabusNodeResource")
  Call<List<UserResourceResponse>> getCustomSyllabusNodeResourceUsingPOST(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCustomSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PUT("data/getCustomSyllabusNodeResource")
  Call<List<UserResourceResponse>> getCustomSyllabusNodeResourceUsingPUT(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getGlobalResources
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @DELETE("data/fetchGlobalResources")
  Call<List<UserResourceResponse>> getGlobalResourcesUsingDELETE(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getGlobalResources
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/fetchGlobalResources")
  Call<List<UserResourceResponse>> getGlobalResourcesUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getGlobalResources
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @HEAD("data/fetchGlobalResources")
  Call<List<UserResourceResponse>> getGlobalResourcesUsingHEAD(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getGlobalResources
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @OPTIONS("data/fetchGlobalResources")
  Call<List<UserResourceResponse>> getGlobalResourcesUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getGlobalResources
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PATCH("data/fetchGlobalResources")
  Call<List<UserResourceResponse>> getGlobalResourcesUsingPATCH(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getGlobalResources
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/fetchGlobalResources")
  Call<List<UserResourceResponse>> getGlobalResourcesUsingPOST(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getGlobalResources
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PUT("data/fetchGlobalResources")
  Call<List<UserResourceResponse>> getGlobalResourcesUsingPUT(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceBasedOnType
   * 
   * @param resourceDTO resourceDTO (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @DELETE("data/getSyllabusNodeResourceByType/{resourceType}")
  Call<List<UserResourceResponse>> getResourceBasedOnTypeUsingDELETE(
    @Body ResourceDTO resourceDTO, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceBasedOnType
   * 
   * @param resourceDTO resourceDTO (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/getSyllabusNodeResourceByType/{resourceType}")
  Call<List<UserResourceResponse>> getResourceBasedOnTypeUsingGET(
    @Body ResourceDTO resourceDTO, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceBasedOnType
   * 
   * @param resourceDTO resourceDTO (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @HEAD("data/getSyllabusNodeResourceByType/{resourceType}")
  Call<List<UserResourceResponse>> getResourceBasedOnTypeUsingHEAD(
    @Body ResourceDTO resourceDTO, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceBasedOnType
   * 
   * @param resourceDTO resourceDTO (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @OPTIONS("data/getSyllabusNodeResourceByType/{resourceType}")
  Call<List<UserResourceResponse>> getResourceBasedOnTypeUsingOPTIONS(
    @Body ResourceDTO resourceDTO, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceBasedOnType
   * 
   * @param resourceDTO resourceDTO (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PATCH("data/getSyllabusNodeResourceByType/{resourceType}")
  Call<List<UserResourceResponse>> getResourceBasedOnTypeUsingPATCH(
    @Body ResourceDTO resourceDTO, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceBasedOnType
   * 
   * @param resourceDTO resourceDTO (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/getSyllabusNodeResourceByType/{resourceType}")
  Call<List<UserResourceResponse>> getResourceBasedOnTypeUsingPOST(
    @Body ResourceDTO resourceDTO, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceBasedOnType
   * 
   * @param resourceDTO resourceDTO (required)
   * @param resourceType resourceType (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PUT("data/getSyllabusNodeResourceByType/{resourceType}")
  Call<List<UserResourceResponse>> getResourceBasedOnTypeUsingPUT(
    @Body ResourceDTO resourceDTO, @Path("resourceType") Long resourceType, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @DELETE("data/getSyllabusNodeResource")
  Call<List<UserResourceResponse>> getSyllabusNodeResourceUsingDELETE(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/getSyllabusNodeResource")
  Call<List<UserResourceResponse>> getSyllabusNodeResourceUsingGET(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @HEAD("data/getSyllabusNodeResource")
  Call<List<UserResourceResponse>> getSyllabusNodeResourceUsingHEAD(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @OPTIONS("data/getSyllabusNodeResource")
  Call<List<UserResourceResponse>> getSyllabusNodeResourceUsingOPTIONS(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PATCH("data/getSyllabusNodeResource")
  Call<List<UserResourceResponse>> getSyllabusNodeResourceUsingPATCH(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/getSyllabusNodeResource")
  Call<List<UserResourceResponse>> getSyllabusNodeResourceUsingPOST(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PUT("data/getSyllabusNodeResource")
  Call<List<UserResourceResponse>> getSyllabusNodeResourceUsingPUT(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @DELETE("data/insertSyllabusNodeResource")
  Call<List<UserResourceResponse>> insertSyllabusNodeResourceUsingDELETE(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @GET("data/insertSyllabusNodeResource")
  Call<List<UserResourceResponse>> insertSyllabusNodeResourceUsingGET(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @HEAD("data/insertSyllabusNodeResource")
  Call<List<UserResourceResponse>> insertSyllabusNodeResourceUsingHEAD(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @OPTIONS("data/insertSyllabusNodeResource")
  Call<List<UserResourceResponse>> insertSyllabusNodeResourceUsingOPTIONS(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PATCH("data/insertSyllabusNodeResource")
  Call<List<UserResourceResponse>> insertSyllabusNodeResourceUsingPATCH(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/insertSyllabusNodeResource")
  Call<List<UserResourceResponse>> insertSyllabusNodeResourceUsingPOST(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertSyllabusNodeResource
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @PUT("data/insertSyllabusNodeResource")
  Call<List<UserResourceResponse>> insertSyllabusNodeResourceUsingPUT(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateExternalResource
   * 
   * @param file file (required)
   * @param resourceObj resourceObj (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<UserResourceResponse>&gt;
   */
  
  @POST("data/uploadExternalResource")
  Call<List<UserResourceResponse>> updateExternalResourceUsingPOST(
    @Query("file") List<File> file, @Query("resourceObj") String resourceObj, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @return Call&lt;DocResponse&gt;
   */
  
  @DELETE("data/updateAssetDocument/{assetUuid}/{resourceUuid}")
  Call<DocResponse> updateResourceAssetFileUsingDELETE(
    @Path("assetUuid") String assetUuid, @Path("resourceUuid") String resourceUuid
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
   * updateResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @return Call&lt;DocResponse&gt;
   */
  
  @HEAD("data/updateAssetDocument/{assetUuid}/{resourceUuid}")
  Call<DocResponse> updateResourceAssetFileUsingHEAD(
    @Path("assetUuid") String assetUuid, @Path("resourceUuid") String resourceUuid
  );

  /**
   * updateResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @return Call&lt;DocResponse&gt;
   */
  
  @OPTIONS("data/updateAssetDocument/{assetUuid}/{resourceUuid}")
  Call<DocResponse> updateResourceAssetFileUsingOPTIONS(
    @Path("assetUuid") String assetUuid, @Path("resourceUuid") String resourceUuid
  );

  /**
   * updateResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PATCH("data/updateAssetDocument/{assetUuid}/{resourceUuid}")
  Call<DocResponse> updateResourceAssetFileUsingPATCH(
    @Path("assetUuid") String assetUuid, @Path("resourceUuid") String resourceUuid
  );

  /**
   * updateResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/updateAssetDocument/{assetUuid}/{resourceUuid}")
  Call<DocResponse> updateResourceAssetFileUsingPOST(
    @Path("assetUuid") String assetUuid, @Path("resourceUuid") String resourceUuid
  );

  /**
   * updateResourceAssetFile
   * 
   * @param assetUuid assetUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PUT("data/updateAssetDocument/{assetUuid}/{resourceUuid}")
  Call<DocResponse> updateResourceAssetFileUsingPUT(
    @Path("assetUuid") String assetUuid, @Path("resourceUuid") String resourceUuid
  );

  /**
   * updateResource
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/updateResource")
  Call<Void> updateResourceUsingDELETE(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateResource
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/updateResource")
  Call<Void> updateResourceUsingGET(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateResource
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/updateResource")
  Call<Void> updateResourceUsingHEAD(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateResource
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/updateResource")
  Call<Void> updateResourceUsingOPTIONS(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateResource
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/updateResource")
  Call<Void> updateResourceUsingPATCH(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateResource
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/updateResource")
  Call<Void> updateResourceUsingPOST(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateResource
   * 
   * @param resourceRequest resourceRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/updateResource")
  Call<Void> updateResourceUsingPUT(
    @Body ResourceRequest resourceRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateSyllabusNodeResourceName
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @DELETE("data/updateSyllabusNodeResourceName")
  Call<UserResourceResponse> updateSyllabusNodeResourceNameUsingDELETE(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateSyllabusNodeResourceName
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @GET("data/updateSyllabusNodeResourceName")
  Call<UserResourceResponse> updateSyllabusNodeResourceNameUsingGET(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateSyllabusNodeResourceName
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @HEAD("data/updateSyllabusNodeResourceName")
  Call<UserResourceResponse> updateSyllabusNodeResourceNameUsingHEAD(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateSyllabusNodeResourceName
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @OPTIONS("data/updateSyllabusNodeResourceName")
  Call<UserResourceResponse> updateSyllabusNodeResourceNameUsingOPTIONS(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateSyllabusNodeResourceName
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @PATCH("data/updateSyllabusNodeResourceName")
  Call<UserResourceResponse> updateSyllabusNodeResourceNameUsingPATCH(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateSyllabusNodeResourceName
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @POST("data/updateSyllabusNodeResourceName")
  Call<UserResourceResponse> updateSyllabusNodeResourceNameUsingPOST(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateSyllabusNodeResourceName
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @PUT("data/updateSyllabusNodeResourceName")
  Call<UserResourceResponse> updateSyllabusNodeResourceNameUsingPUT(
    @Body ResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;UserResourceResponse&gt;
   */
  
  @POST("data/bulkSyllabusNodeResourceUpload")
  Call<UserResourceResponse> uploadSyllabusNodeResourceUsingPOST1(
    @Query("file") List<File> file, @Query("fileExt") List<String> fileExt, @Query("fileName") List<String> fileName, @Query("syllabusNodeId") Long syllabusNodeId, @Query("isCustomSyllabusNode") Boolean isCustomSyllabusNode, @Query("resourceType") String resourceType, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Query("assetTypeId") Long assetTypeId, @Query("resourceTypeId") Long resourceTypeId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
