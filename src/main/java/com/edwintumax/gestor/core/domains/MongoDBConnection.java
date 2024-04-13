package com.edwintumax.gestor.core.domains;

import org.springframework.stereotype.Component;

@Component(value="mongoDBConnection")
public class MongoDBConnection extends AbstractConnection {
	private String description = "Base de datos NoSQL orientada a documentos";
	
	public MongoDBConnection() {
		super("MongoDB","com.mongodb.client.MongoDatabase");
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
