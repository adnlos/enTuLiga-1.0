package com.entuliga.factory;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactory {

	private static final Logger logger = Logger.getLogger(BeanFactory.class);
	private static ApplicationContext applicationContext;
	private static String context;

	static{
		logger.debug("begin");
		context = "/com/entuliga/context/application.context.xml";                
		init();
		
		logger.debug("finalize");
	}
	
	public static void init(){
		if(applicationContext == null){
			applicationContext = new ClassPathXmlApplicationContext(context);
			logger.info("Application Context cargado....."+applicationContext.getBeanDefinitionNames().toString());
		}
	}		
	
	public static Object getBean(String id){
		logger.debug("Va por el Bean>>" + id);
		return applicationContext.getBean(id);
	}
}
