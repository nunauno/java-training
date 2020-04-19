package com.solve.singleton;

public class LazyInitializedSingleton {
	
	private LazyInitializedSingleton() {}
	
	private static LazyInitializedSingleton instance;
	
	public LazyInitializedSingleton getInstance() {
		if(instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
