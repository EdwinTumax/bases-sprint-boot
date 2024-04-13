package com.edwintumax.gestor.core.domains;

import org.springframework.stereotype.Component;

@Component(value="sqlServerDBConnection")
public class SQLServerDBConnection extends AbstractConnection {
	private String description = "Es un sistema de gestión de bases de datos relacionales";
	
	public SQLServerDBConnection() {
		super("SQL Server Microsoft","com.microsoft.jdbc.sqlserver.SQLServerDriver");
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
