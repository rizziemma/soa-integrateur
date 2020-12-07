package fr.insa.ms.server.config.ConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientConfigResource {
	@Value("${server.port}")
	private String serverPort;
	
	@Value("${db.connection}")
	private String typeConnectionDB;
	
	@Value("${db.host}")
	private String dbHost;
	
	@Value("${db.port}")
	private String dbPort;
	
	
	
	public ClientConfigResource(String serverPort, String typeConnectionDB, String dbHost, String dbPort) {
		super();
		this.serverPort = serverPort;
		this.typeConnectionDB = typeConnectionDB;
		this.dbHost = dbHost;
		this.dbPort = dbPort;
	}
	public ClientConfigResource() {
		super();
	}
	public String getServerPort() {
		return serverPort;
	}
	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}
	public String getTypeConnectionDB() {
		return typeConnectionDB;
	}
	public void setTypeConnectionDB(String typeConnectionDB) {
		this.typeConnectionDB = typeConnectionDB;
	}
	
	@GetMapping("/dbHost")
	public String getDbHost() {
		return dbHost;
	}
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	public String getDbPort() {
		return dbPort;
	}
	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}
	
	

}
