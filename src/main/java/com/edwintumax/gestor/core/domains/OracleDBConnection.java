package com.edwintumax.gestor.core.domains;

import org.springframework.stereotype.Component;

@Component(value="oracleDBConnection")
public class OracleDBConnection extends AbstractConnection {
	private String description = "Es un sistema de administración de bases de datos relacionales (RDBMS) de Oracle Corporation";
	
	public OracleDBConnection() {
		super("OracleDB","oracle.jdbc.driver.OracleDriver");
	}

	@Override
	public void showDescription() {
		System.out.println(description);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
