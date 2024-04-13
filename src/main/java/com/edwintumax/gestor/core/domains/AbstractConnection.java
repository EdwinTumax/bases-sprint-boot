package com.edwintumax.gestor.core.domains;

public abstract class AbstractConnection {
	private String provider;
	private String driverClassName;
	
	protected AbstractConnection(String provider, String driverClassName) {
		this.provider = provider;
		this.driverClassName = driverClassName;
	}
	
	public abstract void showDescription();
	
	public void showInfo() {
		System.out.println("Provider: " + this.provider + "driver class name " + this.driverClassName);
	}
	
	@Override
	public String toString() {
		return "name=" + this.provider + ", driverClassName=" + this.driverClassName + "\n";
	}
	
}
