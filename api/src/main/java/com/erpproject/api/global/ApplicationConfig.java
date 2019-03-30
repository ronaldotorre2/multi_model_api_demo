package com.erpproject.api.global;

import java.util.Set;
import javax.ws.rs.core.Application;

import com.erpproject.api.teste.testews;

@javax.ws.rs.ApplicationPath("/")
public class ApplicationConfig extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);
		return resources;
	}

	private void addRestResourceClasses(Set<Class<?>>resources) {
		resources.add(testews.class);
	}
}