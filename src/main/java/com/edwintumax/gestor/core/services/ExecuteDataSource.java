package com.edwintumax.gestor.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.edwintumax.gestor.core.domains.AbstractConnection;
import com.edwintumax.gestor.core.domains.MongoDBConnection;
import com.edwintumax.gestor.core.domains.MySQLDBConnection;
import com.edwintumax.gestor.core.domains.OracleDBConnection;
import com.edwintumax.gestor.core.domains.SQLServerDBConnection;

@Component
public class ExecuteDataSource {

	@Qualifier("mongoDBConnection") // IoC
	private AbstractConnection mongoDBConnection;
	@Qualifier("mysqlDBConnection")
	private AbstractConnection mysqlDBConnection;
	@Qualifier("oracleDBConnection")
	private AbstractConnection oracleDBConnection;
	@Qualifier("sqlServerDBConnection")
	private AbstractConnection sqlServerDBConnection;

	public ExecuteDataSource(AbstractConnection mongoDBConnection, AbstractConnection mysqlDBConnection,
		AbstractConnection oracleDBConnection, AbstractConnection sqlServerDBConnection) {
		this.mongoDBConnection = mongoDBConnection;
		this.mysqlDBConnection = mysqlDBConnection;
		this.oracleDBConnection = oracleDBConnection;
		this.sqlServerDBConnection = sqlServerDBConnection;
	}
	
	/*@Autowired
	private MongoDBConnection mongoDBConnection;
	@Autowired
	private MySQLDBConnection mysqlDBConnection;
	@Autowired
	private OracleDBConnection oracleDBConnection;
	@Autowired
	private SQLServerDBConnection sqlServerDBConnection;*/
	
	/*@Autowired
	public ExecuteDataSource(MongoDBConnection mongoDBConnection, MySQLDBConnection mysqlDBConnection,
			OracleDBConnection oracleDBConnection, SQLServerDBConnection sqlServerDBConnection) {
		super();
		this.mongoDBConnection = mongoDBConnection;
		this.mysqlDBConnection = mysqlDBConnection;
		this.oracleDBConnection = oracleDBConnection;
		this.sqlServerDBConnection = sqlServerDBConnection;
	}*/
	
	@Override
	public String toString() {
		return "DataSource [SQLServer = " +
				sqlServerDBConnection.toString() + 
				" , Oracle=" + oracleDBConnection.toString() + 
				" , MySQL=" + mysqlDBConnection + 
				" , MongoDB=" + mongoDBConnection.toString() + "]";
	}
	
	
}
