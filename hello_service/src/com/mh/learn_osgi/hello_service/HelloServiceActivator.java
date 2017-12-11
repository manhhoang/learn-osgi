package com.mh.learn_osgi.hello_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class HelloServiceActivator implements BundleActivator {

	ServiceRegistration helloServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
        HelloServiceFactory helloServiceFactory = new HelloServiceFactory();
        helloServiceRegistration = context.registerService(HelloService.class.getName(), helloServiceFactory, null);
    }
	
    public void stop(BundleContext context) throws Exception {
        helloServiceRegistration.unregister();
    }

}
