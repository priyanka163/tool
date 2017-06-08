package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.DocResponse;
import java.io.File;

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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/createSpreadsheetResource/{syllabusNodeId}/{isCustomSyllabusNode}/{classId}/{sectionId}/{isGlobalResource}")
  Call<Void> createSpreadsheetResourceUsingGET(
    @Path("syllabusNodeId") Long syllabusNodeId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("globalresource") Boolean globalresource, @Body Boolean isCustomSyllabusNode, @Body SessionParams sessionParams
  );

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
  
  @POST("data/createSpreadsheet")
  Call<Void> createSpreadsheetUsingPOST();
    

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
  
  @POST("data/documentEdit")
  Call<ModelAndView> getDocEditorUsingPOST();
    

  /**
   * getNewResourceDocumentEditor
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/resourceNewDocument")
  Call<ModelAndView> getNewResourceDocumentEditorUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getNewResourceDocumentEditor
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/resourceNewDocument")
  Call<ModelAndView> getNewResourceDocumentEditorUsingPOST(
    @Body SessionParams sessionParams
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
  
  @POST("data/getResourceSpreadsheet")
  Call<ModelAndView> getResourceSpreadsheetUsingPOST();
    

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
  
  @POST("data/getSpreadsheet")
  Call<ModelAndView> getSpreadsheetUsingPOST();
    

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
  
  @POST("data/initiateQueue/{fileId}")
  Call<String> initiateSQSQueueUsingPOST(
    @Path("fileId") String fileId
  );

  /**
   * saveDocument
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/saveDocFile")
  Call<DocResponse> saveDocumentUsingGET1(
    @Body SessionParams sessionParams
  );

  /**
   * saveDocument
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/saveDocFile")
  Call<DocResponse> saveDocumentUsingPOST(
    @Body SessionParams sessionParams
  );

  /**
   * savePresentation
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/savePresentation")
  Call<DocResponse> savePresentationUsingGET1(
    @Body SessionParams sessionParams
  );

  /**
   * savePresentation
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/savePresentation")
  Call<DocResponse> savePresentationUsingPOST(
    @Body SessionParams sessionParams
  );

  /**
   * saveSpreadSheet
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/saveSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingGET1(
    @Body SessionParams sessionParams
  );

  /**
   * saveSpreadSheet
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/saveSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingPOST(
    @Body SessionParams sessionParams
  );

  /**
   * uploadFile
   * 
   * @param file file (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/uploadFile")
  Call<Void> uploadFileUsingGET(
    @Body File file
  );

  /**
   * uploadFile
   * 
   * @param file file (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/uploadFile")
  Call<Void> uploadFileUsingPOST(
    @Body File file
  );

}
