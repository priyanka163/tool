package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import java.io.File;
import com.nexteducation.swagger.nextsws.model.ResourceResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MasterresourcecontrollerApi
 */
public class MasterresourcecontrollerApiTest {

    private MasterresourcecontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MasterresourcecontrollerApi.class);
    }

    
    /**
     * getResources
     *
     * 
     */
    @Test
    public void getResourcesUsingGETTest() {
        // ModelAndView response = api.getResourcesUsingGET();

        // TODO: test validations
    }
    
    /**
     * uploadSyllabusNodeResource
     *
     * 
     */
    @Test
    public void uploadSyllabusNodeResourceUsingPOSTTest() {
        List<File> file = null;
        List<String> fileExt = null;
        List<String> fileType = null;
        List<String> fileName = null;
        String resourceName = null;
        Long resourceTypeId = null;
        Long resourceSubTypeId = null;
        Long resourceEndUseTypeId = null;
        Long resourceSourceTypeId = null;
        // List<ResourceResponse> response = api.uploadSyllabusNodeResourceUsingPOST(file, fileExt, fileType, fileName, resourceName, resourceTypeId, resourceSubTypeId, resourceEndUseTypeId, resourceSourceTypeId);

        // TODO: test validations
    }
    
}
