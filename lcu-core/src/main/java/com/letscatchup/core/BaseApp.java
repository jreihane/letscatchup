package com.letscatchup.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = "com.letscatchup.*.domain.entity")
public class BaseApp 
{
	final static Logger logger = LoggerFactory.getLogger(BaseApp.class);
	
    public static void main( String[] args )
    {
    	SpringApplication.run(BaseApp.class, args);
    }
}
