package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.CustomSyllabusDTO;
import com.nexteducation.swagger.nextsws.model.QueryableParams;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BoardcontrollerApi
 */
public class BoardcontrollerApiTest {

    private BoardcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BoardcontrollerApi.class);
    }

    
    /**
     * listAllBoards
     *
     * 
     */
    @Test
    public void listAllBoardsUsingGETTest() {
        // CustomSyllabusDTO response = api.listAllBoardsUsingGET();

        // TODO: test validations
    }
    
    /**
     * listAllClasses
     *
     * 
     */
    @Test
    public void listAllClassesUsingGETTest() {
        SessionParams sessionParams = null;
        QueryableParams queryable = null;
        // CustomSyllabusDTO response = api.listAllClassesUsingGET(sessionParams, queryable);

        // TODO: test validations
    }
    
}
