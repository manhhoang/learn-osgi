package com.mh.learn_osgi.hello_service;

public class HelloServiceImpl implements HelloService {
	
    public String sayHello() {
        System.out.println("Inside HelloServiceImple.sayHello()");
        return "Say Hello";
    }
}
