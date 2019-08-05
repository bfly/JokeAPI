package com.tts.JokeAPI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tts.JokeAPI.service.JokeService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class JokeApiApplicationTests {
	@Autowired
	JokeService jokeService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testJoke() {
		log.info(jokeService.getJoke("Bill", "Fly"));
	}
}
