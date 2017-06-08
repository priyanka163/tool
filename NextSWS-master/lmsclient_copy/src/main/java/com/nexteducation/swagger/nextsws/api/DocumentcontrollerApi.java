package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.DocResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DocumentcontrollerApi {
  /**
   * createSpreadsheetResource
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param globalresource globalresource (required)
   * @param isCustomSyllabusNode isCustomSyllabusNode (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/createSpreadsheetResource/{syllabusNodeId}/{isCustomSyllabusNode}/{classId}/{sectionId}/{isGlobalResource}")
  Call<Void> createSpreadsheetResourceUsingDELETE(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("globalresource") Boolean globalresource, @Query("isCustomSyllabusNode") Boolean isCustomSyllabusNode, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createSpreadsheetResource
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param globalresource globalresource (required)
   * @param isCustomSyllabusNode isCustomSyllabusNode (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/createSpreadsheetResource/{syllabusNodeId}/{isCustomSyllabusNode}/{classId}/{sectionId}/{isGlobalResource}")
  Call<Void> createSpreadsheetResourceUsingGET(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("globalresource") Boolean globalresource, @Query("isCustomSyllabusNode") Boolean isCustomSyllabusNode, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createSpreadsheetResource
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param globalresource globalresource (required)
   * @param isCustomSyllabusNode isCustomSyllabusNode (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/createSpreadsheetResource/{syllabusNodeId}/{isCustomSyllabusNode}/{classId}/{sectionId}/{isGlobalResource}")
  Call<Void> createSpreadsheetResourceUsingHEAD(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("globalresource") Boolean globalresource, @Query("isCustomSyllabusNode") Boolean isCustomSyllabusNode, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createSpreadsheetResource
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param globalresource globalresource (required)
   * @param isCustomSyllabusNode isCustomSyllabusNode (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/createSpreadsheetResource/{syllabusNodeId}/{isCustomSyllabusNode}/{classId}/{sectionId}/{isGlobalResource}")
  Call<Void> createSpreadsheetResourceUsingOPTIONS(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("globalresource") Boolean globalresource, @Query("isCustomSyllabusNode") Boolean isCustomSyllabusNode, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createSpreadsheetResource
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param globalresource globalresource (required)
   * @param isCustomSyllabusNode isCustomSyllabusNode (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/createSpreadsheetResource/{syllabusNodeId}/{isCustomSyllabusNode}/{classId}/{sectionId}/{isGlobalResource}")
  Call<Void> createSpreadsheetResourceUsingPATCH(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("globalresource") Boolean globalresource, @Query("isCustomSyllabusNode") Boolean isCustomSyllabusNode, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createSpreadsheetResource
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param globalresource globalresource (required)
   * @param isCustomSyllabusNode isCustomSyllabusNode (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/createSpreadsheetResource/{syllabusNodeId}/{isCustomSyllabusNode}/{classId}/{sectionId}/{isGlobalResource}")
  Call<Void> createSpreadsheetResourceUsingPOST(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("globalresource") Boolean globalresource, @Query("isCustomSyllabusNode") Boolean isCustomSyllabusNode, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createSpreadsheetResource
   * 
   * @param syllabusNodeId syllabusNodeId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param globalresource globalresource (required)
   * @param isCustomSyllabusNode isCustomSyllabusNode (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/createSpreadsheetResource/{syllabusNodeId}/{isCustomSyllabusNode}/{classId}/{sectionId}/{isGlobalResource}")
  Call<Void> createSpreadsheetResourceUsingPUT(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("globalresource") Boolean globalresource, @Query("isCustomSyllabusNode") Boolean isCustomSyllabusNode, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createSpreadsheet
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/createSpreadsheet")
  Call<Void> createSpreadsheetUsingDELETE();
    

  /**
   * createSpreadsheet
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/createSpreadsheet")
  Call<Void> createSpreadsheetUsingGET();
    

  /**
   * createSpreadsheet
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/createSpreadsheet")
  Call<Void> createSpreadsheetUsingHEAD();
    

  /**
   * createSpreadsheet
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/createSpreadsheet")
  Call<Void> createSpreadsheetUsingOPTIONS();
    

  /**
   * createSpreadsheet
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/createSpreadsheet")
  Call<Void> createSpreadsheetUsingPATCH();
    

  /**
   * createSpreadsheet
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/createSpreadsheet")
  Call<Void> createSpreadsheetUsingPOST();
    

  /**
   * createSpreadsheet
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/createSpreadsheet")
  Call<Void> createSpreadsheetUsingPUT();
    

  /**
   * getDocEditor
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/documentEdit")
  Call<ModelAndView> getDocEditorUsingDELETE();
    

  /**
   * getDocEditor
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/documentEdit")
  Call<ModelAndView> getDocEditorUsingGET();
    

  /**
   * getDocEditor
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/documentEdit")
  Call<ModelAndView> getDocEditorUsingHEAD();
    

  /**
   * getDocEditor
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/documentEdit")
  Call<ModelAndView> getDocEditorUsingOPTIONS();
    

  /**
   * getDocEditor
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/documentEdit")
  Call<ModelAndView> getDocEditorUsingPATCH();
    

  /**
   * getDocEditor
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/documentEdit")
  Call<ModelAndView> getDocEditorUsingPOST();
    

  /**
   * getDocEditor
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/documentEdit")
  Call<ModelAndView> getDocEditorUsingPUT();
    

  /**
   * getNewResourceDocumentEditor
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/resourceNewDocument")
  Call<ModelAndView> getNewResourceDocumentEditorUsingDELETE(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getNewResourceDocumentEditor
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/resourceNewDocument")
  Call<ModelAndView> getNewResourceDocumentEditorUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getNewResourceDocumentEditor
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/resourceNewDocument")
  Call<ModelAndView> getNewResourceDocumentEditorUsingHEAD(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getNewResourceDocumentEditor
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/resourceNewDocument")
  Call<ModelAndView> getNewResourceDocumentEditorUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getNewResourceDocumentEditor
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/resourceNewDocument")
  Call<ModelAndView> getNewResourceDocumentEditorUsingPATCH(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getNewResourceDocumentEditor
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/resourceNewDocument")
  Call<ModelAndView> getNewResourceDocumentEditorUsingPOST(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getNewResourceDocumentEditor
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/resourceNewDocument")
  Call<ModelAndView> getNewResourceDocumentEditorUsingPUT(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceDocumentEditor
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/resourceDocument/{assetUuid}")
  Call<ModelAndView> getResourceDocumentEditorUsingDELETE(
    @Path("assetUuid") String assetUuid
  );

  /**
   * getResourceDocumentEditor
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/resourceDocument/{assetUuid}")
  Call<ModelAndView> getResourceDocumentEditorUsingGET(
    @Path("assetUuid") String assetUuid
  );

  /**
   * getResourceDocumentEditor
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/resourceDocument/{assetUuid}")
  Call<ModelAndView> getResourceDocumentEditorUsingHEAD(
    @Path("assetUuid") String assetUuid
  );

  /**
   * getResourceDocumentEditor
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/resourceDocument/{assetUuid}")
  Call<ModelAndView> getResourceDocumentEditorUsingOPTIONS(
    @Path("assetUuid") String assetUuid
  );

  /**
   * getResourceDocumentEditor
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/resourceDocument/{assetUuid}")
  Call<ModelAndView> getResourceDocumentEditorUsingPATCH(
    @Path("assetUuid") String assetUuid
  );

  /**
   * getResourceDocumentEditor
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/resourceDocument/{assetUuid}")
  Call<ModelAndView> getResourceDocumentEditorUsingPOST(
    @Path("assetUuid") String assetUuid
  );

  /**
   * getResourceDocumentEditor
   * 
   * @param assetUuid assetUuid (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/resourceDocument/{assetUuid}")
  Call<ModelAndView> getResourceDocumentEditorUsingPUT(
    @Path("assetUuid") String assetUuid
  );

  /**
   * getResourceSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/getResourceSpreadsheet")
  Call<ModelAndView> getResourceSpreadsheetUsingDELETE();
    

  /**
   * getResourceSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/getResourceSpreadsheet")
  Call<ModelAndView> getResourceSpreadsheetUsingGET();
    

  /**
   * getResourceSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/getResourceSpreadsheet")
  Call<ModelAndView> getResourceSpreadsheetUsingHEAD();
    

  /**
   * getResourceSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/getResourceSpreadsheet")
  Call<ModelAndView> getResourceSpreadsheetUsingOPTIONS();
    

  /**
   * getResourceSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/getResourceSpreadsheet")
  Call<ModelAndView> getResourceSpreadsheetUsingPATCH();
    

  /**
   * getResourceSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/getResourceSpreadsheet")
  Call<ModelAndView> getResourceSpreadsheetUsingPOST();
    

  /**
   * getResourceSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/getResourceSpreadsheet")
  Call<ModelAndView> getResourceSpreadsheetUsingPUT();
    

  /**
   * getSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/getSpreadsheet")
  Call<ModelAndView> getSpreadsheetUsingDELETE();
    

  /**
   * getSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/getSpreadsheet")
  Call<ModelAndView> getSpreadsheetUsingGET();
    

  /**
   * getSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/getSpreadsheet")
  Call<ModelAndView> getSpreadsheetUsingHEAD();
    

  /**
   * getSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/getSpreadsheet")
  Call<ModelAndView> getSpreadsheetUsingOPTIONS();
    

  /**
   * getSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/getSpreadsheet")
  Call<ModelAndView> getSpreadsheetUsingPATCH();
    

  /**
   * getSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/getSpreadsheet")
  Call<ModelAndView> getSpreadsheetUsingPOST();
    

  /**
   * getSpreadsheet
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/getSpreadsheet")
  Call<ModelAndView> getSpreadsheetUsingPUT();
    

  /**
   * initiateSQSQueue
   * 
   * @param fileId fileId (required)
   * @return Call&lt;String&gt;
   */
  
  @DELETE("data/initiateQueue/{fileId}")
  Call<String> initiateSQSQueueUsingDELETE(
    @Path("fileId") String fileId
  );

  /**
   * initiateSQSQueue
   * 
   * @param fileId fileId (required)
   * @return Call&lt;String&gt;
   */
  
  @GET("data/initiateQueue/{fileId}")
  Call<String> initiateSQSQueueUsingGET(
    @Path("fileId") String fileId
  );

  /**
   * initiateSQSQueue
   * 
   * @param fileId fileId (required)
   * @return Call&lt;String&gt;
   */
  
  @HEAD("data/initiateQueue/{fileId}")
  Call<String> initiateSQSQueueUsingHEAD(
    @Path("fileId") String fileId
  );

  /**
   * initiateSQSQueue
   * 
   * @param fileId fileId (required)
   * @return Call&lt;String&gt;
   */
  
  @OPTIONS("data/initiateQueue/{fileId}")
  Call<String> initiateSQSQueueUsingOPTIONS(
    @Path("fileId") String fileId
  );

  /**
   * initiateSQSQueue
   * 
   * @param fileId fileId (required)
   * @return Call&lt;String&gt;
   */
  
  @PATCH("data/initiateQueue/{fileId}")
  Call<String> initiateSQSQueueUsingPATCH(
    @Path("fileId") String fileId
  );

  /**
   * initiateSQSQueue
   * 
   * @param fileId fileId (required)
   * @return Call&lt;String&gt;
   */
  
  @POST("data/initiateQueue/{fileId}")
  Call<String> initiateSQSQueueUsingPOST(
    @Path("fileId") String fileId
  );

  /**
   * initiateSQSQueue
   * 
   * @param fileId fileId (required)
   * @return Call&lt;String&gt;
   */
  
  @PUT("data/initiateQueue/{fileId}")
  Call<String> initiateSQSQueueUsingPUT(
    @Path("fileId") String fileId
  );

  /**
   * saveDocument
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @DELETE("data/saveDocFile")
  Call<DocResponse> saveDocumentUsingDELETE1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveDocument
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/saveDocFile")
  Call<DocResponse> saveDocumentUsingGET1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveDocument
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @HEAD("data/saveDocFile")
  Call<DocResponse> saveDocumentUsingHEAD1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveDocument
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @OPTIONS("data/saveDocFile")
  Call<DocResponse> saveDocumentUsingOPTIONS1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveDocument
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PATCH("data/saveDocFile")
  Call<DocResponse> saveDocumentUsingPATCH1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveDocument
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/saveDocFile")
  Call<DocResponse> saveDocumentUsingPOST1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveDocument
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PUT("data/saveDocFile")
  Call<DocResponse> saveDocumentUsingPUT1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * savePresentation
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @DELETE("data/savePresentation")
  Call<DocResponse> savePresentationUsingDELETE1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * savePresentation
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/savePresentation")
  Call<DocResponse> savePresentationUsingGET1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * savePresentation
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @HEAD("data/savePresentation")
  Call<DocResponse> savePresentationUsingHEAD1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * savePresentation
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @OPTIONS("data/savePresentation")
  Call<DocResponse> savePresentationUsingOPTIONS1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * savePresentation
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PATCH("data/savePresentation")
  Call<DocResponse> savePresentationUsingPATCH1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * savePresentation
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/savePresentation")
  Call<DocResponse> savePresentationUsingPOST1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * savePresentation
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PUT("data/savePresentation")
  Call<DocResponse> savePresentationUsingPUT1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @DELETE("data/saveSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingDELETE1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/saveSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingGET1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @HEAD("data/saveSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingHEAD1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @OPTIONS("data/saveSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingOPTIONS1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PATCH("data/saveSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingPATCH1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/saveSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingPOST1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PUT("data/saveSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingPUT1(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * uploadFile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/uploadFile")
  Call<Void> uploadFileUsingDELETE();
    

  /**
   * uploadFile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/uploadFile")
  Call<Void> uploadFileUsingGET();
    

  /**
   * uploadFile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/uploadFile")
  Call<Void> uploadFileUsingHEAD();
    

  /**
   * uploadFile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/uploadFile")
  Call<Void> uploadFileUsingOPTIONS();
    

  /**
   * uploadFile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/uploadFile")
  Call<Void> uploadFileUsingPATCH();
    

  /**
   * uploadFile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/uploadFile")
  Call<Void> uploadFileUsingPOST();
    

  /**
   * uploadFile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/uploadFile")
  Call<Void> uploadFileUsingPUT();
    

}
