package my.exercise.designmode.singleton;

import java.util.Vector;

public class PropertiesSingleton {
	private static PropertiesSingleton instance = null;
	private Vector<?> properties = null;
	
	public Vector<?> getProperties() {
		return properties;
	}
	
	private PropertiesSingleton() {
	}
	
	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new PropertiesSingleton();
		}
	}
	
	public static PropertiesSingleton getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}
	
	public void updateProperties() {
		PropertiesSingleton shadow = new PropertiesSingleton();
		properties = shadow.getProperties();
	}
}
