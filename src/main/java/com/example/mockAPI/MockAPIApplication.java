package com.example.mockAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Anup Gupta
 * Application to generate mockAPI
 * Save the json file in file path and pass same name in API 
 * parameter and get the response
 *
 */
@SpringBootApplication
@ComponentScan("com.example.*")
public class MockAPIApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(MockAPIApplication.class, args);
    }
}
