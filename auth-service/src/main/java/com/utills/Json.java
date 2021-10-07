package com.utills;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
	
	private ObjectMapper mapper = new ObjectMapper();
	private static Json json = null;
	
	public static JsonNode toJson(Object o) {
		return  getJsonInstance().mapper.convertValue(o, JsonNode.class);
	}
	
	public static <T> T convert(Object fromValue, Class<T> toValue)
	{
		return getJsonInstance().mapper.convertValue(fromValue, toValue);
	}
	
	private static Json getJsonInstance() {
		if(json == null)
			json= new Json();
		
		return json;
	}
	
	public static JsonNode createObjectNode()
	{
		return getJsonInstance().mapper.createObjectNode();
	}

}
