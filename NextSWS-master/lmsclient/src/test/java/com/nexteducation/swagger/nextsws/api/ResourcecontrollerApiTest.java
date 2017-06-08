package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.ResourceDTO;
import com.nexteducation.swagger.nextsws.model.UserResourceResponse;
import com.nexteducation.swagger.nextsws.model.AssetResponse;
import com.nexteducation.swagger.nextsws.model.DocResponse;
import com.nexteducation.swagger.nextsws.model.ResourceRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResourcecontrollerApi
 */
public class ResourcecontrollerApiTest {

    private ResourcecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ResourcecontrollerApi.class);
    }

    
    /**
     * deleteResourceAssetFile
     *
     * 
     */
    @Test
    public void deleteResourceAssetFileUsingGETTest() {
        String resourceUuid = null;
        SessionParams sessionParams = null;
        // Void response = api.deleteResourceAssetFileUsingGET(resourceUuid, sessionParams);

        // TODO: test validations
    }
    
    /**
     * deleteSyllabusNodeResource
     *
     * 
     */
    @Test
    public void deleteSyllabusNodeResourceUsingPOSTTest() {
        ResourceDTO resourceDTO = null;
        SessionParams sessionParams = null;
        // Void response = api.deleteSyllabusNodeResourceUsingPOST(resourceDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchResourceAssetFile
     *
     * 
     */
    @Test
    public void fetchResourceAssetFileUsingGETTest() {
        String assetUuid = null;
        SessionParams sessionParams = null;
        // String response = api.fetchResourceAssetFileUsingGET(assetUuid, sessionParams);

        // TODO: test validations
    }
    
    /**
     * fetchSyllabusNodeResourceBasedOnType
     *
     * 
     */
    @Test
    public void fetchSyllabusNodeResourceBasedOnTypeUsingGETTest() {
        Long syllabusNodeId = null;
        Long resourceType = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.fetchSyllabusNodeResourceBasedOnTypeUsingGET(syllabusNodeId, resourceType, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getAssetByUUid
     *
     * 
     */
    @Test
    public void getAssetByUUidUsingGETTest() {
        String assetuuid = null;
        // AssetResponse response = api.getAssetByUUidUsingGET(assetuuid);

        // TODO: test validations
    }
    
    /**
     * getCustomSyllabusNodeResource
     *
     * 
     */
    @Test
    public void getCustomSyllabusNodeResourceUsingPOSTTest() {
        ResourceDTO resourceDTO = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.getCustomSyllabusNodeResourceUsingPOST(resourceDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getGlobalResources
     *
     * 
     */
    @Test
    public void getGlobalResourcesUsingGETTest() {
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.getGlobalResourcesUsingGET(sessionParams);

        // TODO: test validations
    }
    
    /**
     * getResourceBasedOnType
     *
     * 
     */
    @Test
    public void getResourceBasedOnTypeUsingPOSTTest() {
        ResourceDTO resourceDTO = null;
        Long resourceType = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.getResourceBasedOnTypeUsingPOST(resourceDTO, resourceType, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getSyllabusNodeResource
     *
     * 
     */
    @Test
    public void getSyllabusNodeResourceUsingPOSTTest() {
        ResourceDTO resourceDTO = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.getSyllabusNodeResourceUsingPOST(resourceDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * insertSyllabusNodeResource
     *
     * 
     */
    @Test
    public void insertSyllabusNodeResourceUsingPOSTTest() {
        ResourceDTO resourceDTO = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.insertSyllabusNodeResourceUsingPOST(resourceDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateExternalResource
     *
     * 
     */
    @Test
    public void updateExternalResourceUsingPOSTTest() {
        String file = null;
        String resourceObj = null;
        SessionParams sessionParams = null;
        // List<UserResourceResponse> response = api.updateExternalResourceUsingPOST(file, resourceObj, sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateResourceAssetFile
     *
     * 
     */
    @Test
    public void updateResourceAssetFileUsingGETTest() {
        String assetUuid = null;
        String resourceUuid = null;
        // DocResponse response = api.updateResourceAssetFileUsingGET(assetUuid, resourceUuid);

        // TODO: test validations
    }
    
    /**
     * updateResource
     *
     * 
     */
    @Test
    public void updateResourceUsingPOSTTest() {
        ResourceRequest resourceRequest = null;
        SessionParams sessionParams = null;
        // Void response = api.updateResourceUsingPOST(resourceRequest, sessionParams);

        // TODO: test validations
    }
    
    /**
     * updateSyllabusNodeResourceName
     *
     * 
     */
    @Test
    public void updateSyllabusNodeResourceNameUsingPOSTTest() {
        ResourceDTO resourceDTO = null;
        SessionParams sessionParams = null;
        // UserResourceResponse response = api.updateSyllabusNodeResourceNameUsingPOST(resourceDTO, sessionParams);

        // TODO: test validations
    }
    
    /**
     * uploadSyllabusNodeResource
     *
     * 
     */
    @Test
    public void uploadSyllabusNodeResourceUsingPOST1Test() {
        String file = null;
        List<String> fileExt = null;
        List<String> fileName = null;
        Long syllabusNodeId = null;
        Boolean isCustomSyllabusNode = null;
        String resourceType = null;
        Long classId = null;
        Long sectionId = null;
        Long assetTypeId = null;
        Long resourceTypeId = null;
        SessionParams sessionParams = null;
        // UserResourceResponse response = api.uploadSyllabusNodeResourceUsingPOST1(file, fileExt, fileName, syllabusNodeId, isCustomSyllabusNode, resourceType, classId, sectionId, assetTypeId, resourceTypeId, sessionParams);

        // TODO: test validations
    }
    
}
