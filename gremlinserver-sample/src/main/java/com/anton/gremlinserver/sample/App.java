package com.anton.gremlinserver.sample;

import com.google.gson.Gson;


public class App 
{
    public static void main( String[] args )
    {
    	Gson jsonSerializer = null;
    	EntityModel model = null;
    	
    	jsonSerializer = new Gson();
    	
    	model = new EntityModel();
    	
        System.out.println(jsonSerializer.toJson("GitHub Checkin Hello World!"));
        
        System.out.println("Model :" + model.generateObject());
        
        
    }
}
