package com.edwintumax.gestor.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.edwintumax.gestor.core.domains.AbstractConnection;
import com.edwintumax.gestor.core.domains.MongoDBConnection;
import com.edwintumax.gestor.core.domains.MySQLDBConnection;
import com.edwintumax.gestor.core.domains.OracleDBConnection;
import com.edwintumax.gestor.core.domains.SQLServerDBConnection;
import com.edwintumax.gestor.core.services.ExecuteDataSource;
import com.edwintumax.gestor.core.services.WebService;
import com.google.gson.Gson;

@SpringBootApplication
public class GestorDbV1Application implements CommandLineRunner {

	@Value("${com.edwintumax.db.configuration.username}")
	private String username;
	
	@Value("${com.edwintumax.db.configuration.password}")
	private String password;
	
	@Autowired
	private WebService webService;
	
	@Autowired
	private StringBuffer sb;
	
	@Autowired
	private Gson gson;
	
	public static void main(String[] args) {
		SpringApplication.run(GestorDbV1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		/*AbstractConnection mongoDBConnection = new MongoDBConnection();
		AbstractConnection mySQLDBConnection = new MySQLDBConnection();
		AbstractConnection oracleDBConnection = new OracleDBConnection();
		AbstractConnection sqlServerDBConnection = new SQLServerDBConnection();		
		ExecuteDataSource ds = new ExecuteDataSource(mongoDBConnection,mySQLDBConnection,oracleDBConnection,sqlServerDBConnection);
		WebService webService = new WebService();
		webService.setExecuteDataSource(ds);*/
		
		/*String saludo = "Hola ";
		String nombre = "Edwin Tumax";
		String salida = saludo + nombre;		
		sb.append("Hola ");
		sb.append("Edwin Tumax!!!!");*/
		
		System.out.println(webService.toString());
		
		System.out.println(gson.toJson(webService));
		
		System.out.println("Credenciales: " + username + " & " + password);
	}

}
