package com.tts.JokeAPI.entity;

import lombok.Data;

@Data
public class JokeResponse {
	private String type;
	private Value value;
}