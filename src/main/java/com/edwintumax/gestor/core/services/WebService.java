package com.edwintumax.gestor.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebService {
	private String name = "Orders";
	private String type = "SOAP";
	
	@Autowired
	private ExecuteDataSource executeDataSource;

	public WebService() {
	}

	/*public void setExecuteDataSource(ExecuteDataSource executeDataSource) {
		this.executeDataSource = executeDataSource;
	}*/
	
	@Override
	public String toString() {
		return "WebService [name=" + this.name + ", type=" + this.type + " DataSource=" + executeDataSource.toString() + "]";
	}
	
}
