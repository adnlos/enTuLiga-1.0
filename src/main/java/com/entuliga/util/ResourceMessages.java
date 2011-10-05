package com.entuliga.util;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class ResourceMessages {
	
private static final Logger logger = Logger.getLogger(ResourceMessages.class);
	
	public static String  getResources(String nameProperties){
		logger.debug("init resources > " + nameProperties);
		ResourceBundle resource = ResourceBundle.getBundle("resources");
		String gResources=resource.getString(nameProperties);
		logger.debug("fin resources > "  + nameProperties);
		return gResources;
	}
}
