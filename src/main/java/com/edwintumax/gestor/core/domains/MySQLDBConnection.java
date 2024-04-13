package com.edwintumax.gestor.core.domains;

import org.springframework.stereotype.Component;

@Component(value="mysqlDBConnection")
public class MySQLDBConnection extends AbstractConnection {
	private String description = "Es un sistema de bases de datos de Oracle que se utiliza en todo el mundo para gestionar bases de datos";
	
	public MySQLDBConnection() {
		super("MySQL","com.mysql.jdbc.Driver");
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
