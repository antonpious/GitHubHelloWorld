package com.anton.gremlinserver.sample;

import com.google.gson.Gson;


public class App 
{
    public static void main( String[] args )
    {
    	Gson jsonSerializer = null;
    	
    	jsonSerializer = new Gson();
    	
        System.out.println(jsonSerializer.toJson("GitHub Checkin Hello World!"));
    }
}
