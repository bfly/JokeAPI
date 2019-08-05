package com.tts.JokeAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tts.JokeAPI.entity.JokeResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JokeService {
	private RestTemplate restTemplate;
	
	private final static String BASE = "http://api.icndb.com/jokes/random?limitTo=[nerdy]";
	
	@Autowired
	public JokeService( RestTemplateBuilder restTemplate) {
		this.restTemplate = restTemplate.build();
	}
	
	public String getJoke(String first, String last) {
		String url = String.format("%s&firstName=%s&lastName=%s", BASE, first, last);
		log.info(url);
		JokeResponse response = restTemplate.getForObject(url, JokeResponse.class);
		log.info(response.toString());
		String joke = response.getValue().getJoke();
		return joke;
	}
}
