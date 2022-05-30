package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging

	// lets create @Before Aspect

	@Before("execution(public void addAcoount())")
	public void beforeAddAccountAdvice() {

		System.out.println("Executing @Before Aspect on addAccount");

	}

}
