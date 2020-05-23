package com.vamshi.springdemo.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vamshi.springdemo.entity.Details;

@Service
public class CoronaServiceRestImpl implements CoronaService {
	
	private RestTemplate restTemplate;
	
	private String apiUrl;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public CoronaServiceRestImpl(
					RestTemplate theRestTemplate,
					@Value("${api.rest.url}") String theUrl) {
		
		restTemplate = theRestTemplate;
		apiUrl = theUrl;
		
	logger.info("Loaded Property: api.rest.url = " + apiUrl);
	}

	@Override
	public Details getDetails() {
		
		logger.info("in getDetails(): Calling REST API " + apiUrl);
		
		
		
		Details details = restTemplate.getForObject(apiUrl, Details.class);
		
		logger.info("in getDetails(): customers" + details);
		return details;
	}
}
















