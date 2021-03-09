package com.example.mockAPI.service;

import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Service
public class MockService {

	public String getResponseData(String jsonFileName) throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser
				.parse(new FileReader(System.getProperty("user.dir") + "//resources//" + jsonFileName + ".json"));
		return obj.toString();
		
	}
}
