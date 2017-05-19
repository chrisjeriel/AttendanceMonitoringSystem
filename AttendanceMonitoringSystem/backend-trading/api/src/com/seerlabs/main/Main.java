package com.seerlabs.main;

import java.io.File;
import java.net.MalformedURLException;

import javax.servlet.ServletException;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.log4j.Logger;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import com.seerlabs.resource.ResourceLoader;

public class Main{

	Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) throws ServletException, LifecycleException, MalformedURLException{
		new Main().start();
	}

	public void start() throws ServletException, LifecycleException, MalformedURLException{
		
		logger.info("starting...");
		System.out.println("starting...");
		// Define a folder to hold web application contents.
		String webappDirLocation = "WebContent/";
		Tomcat tomcat = new Tomcat();

		// Define port number for the web application
		String webPort = System.getenv("PORT");
		if(webPort == null || webPort.isEmpty()){
			webPort = "8880";
		}
		// Bind the port to Tomcat server
		tomcat.setPort(Integer.valueOf(webPort));

		// Define a web application context.
//		Context context = tomcat.addWebapp("/cbgfx-trading", new File(webappDirLocation).getAbsolutePath());
		Context context = tomcat.addWebapp("/amsys", new File(webappDirLocation).getAbsolutePath());

		// File configFile = new File(webappDirLocation + "/WEB-INF/web.xml");
		// context.setConfigFile(configFile.toURI().toURL());

		// Add servlet that will register Jersey REST resources
		Tomcat.addServlet(context, "jersey-container-servlet", resourceConfig());
		context.addServletMapping("/rest/*", "jersey-container-servlet");

		tomcat.start();
		tomcat.getServer().await();
	}

	private ServletContainer resourceConfig(){
		return new ServletContainer(new ResourceConfig(new ResourceLoader().getClasses()));
	}
}
