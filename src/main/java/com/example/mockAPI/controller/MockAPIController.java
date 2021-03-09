package com.example.mockAPI.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mockAPI.service.MockService;

/**
 * @author Anup Gupta
 * Controller class to generate mockAPI
 * Save the json file in file path and pass same name in API 
 * parameter and get the response
 *
 */
@RestController
@RequestMapping(value = "v1/mockAPI")
public class MockAPIController {
	
	@Autowired
	MockService mockService;

	@RequestMapping(method = RequestMethod.GET, value = "/{jsonFileName}", produces = "application/json")
	public ResponseEntity<?> getMockDetails(@PathVariable String jsonFileName, HttpServletRequest request)
			throws IOException, ParseException {
		try {
			return ResponseEntity.ok().body(mockService.getResponseData(jsonFileName));
		} catch (IOException e) {
			return ResponseEntity.notFound().build();

		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{jsonFileName}", produces = "application/json")
	public ResponseEntity<?> postMockDetails(@PathVariable String jsonFileName, HttpServletRequest request)
			throws IOException, ParseException {
		try {
			return ResponseEntity.ok().body(mockService.getResponseData(jsonFileName));
		} catch (IOException e) {
			return ResponseEntity.notFound().build();
		}
	}
}
