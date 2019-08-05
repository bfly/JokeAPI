package com.tts.JokeAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.JokeAPI.service.JokeService;

@RestController
public class RESTController {
	private final JokeService jokeService;
	
	@Autowired
	public RESTController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@GetMapping("/")
	public String getJoke() throws Exception { // consume a REST service
		return jokeService.getJoke("Bill", "Fly");
	}
}
