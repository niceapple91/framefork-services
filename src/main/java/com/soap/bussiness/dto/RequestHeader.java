package com.soap.bussiness.dto;

import com.soap.properties.SimplePropertyCreator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 04.09.2016.
 */
public class RequestHeader {

    public static Map<String, String> getRequestHeader(){
        Map<String, String> properties = new HashMap<>();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        properties.put("username",reader.getProperty("username"));
        properties.put("businessProcess",reader.getProperty("businessProcess"));
        properties.put("consumer",reader.getProperty("consumer"));
        return properties;
    }

    public static Map<String, String> getRequestHeader(String user){
        Map<String, String> properties = new HashMap<>();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        properties.put("username",reader.getProperty(user));
        properties.put("businessProcess",reader.getProperty("businessProcess"));
        properties.put("consumer",reader.getProperty("consumer"));
        return properties;
    }

}
