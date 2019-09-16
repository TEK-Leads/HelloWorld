package com.nit.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.nit.exception.TicketNotFoundExceptionMapper;
import com.nit.resources.ERailResource;

@ApplicationPath("/rest/*")
public class MyApplication extends Application {

	@Override
	public Set<Object> getSingletons() {
		Set<Object> objs = new HashSet<Object>();
		objs.add(new ERailResource());
		return objs;
	}

	

}
