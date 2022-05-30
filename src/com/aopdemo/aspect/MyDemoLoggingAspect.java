package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging

	// lets create @Before Aspect

	
	//add pointcut expression on fully qualified class name
	
	/*@Before("execution(public void com.aopdemo.dao.AccountDao.addAcoount())")
	public void beforeAddAccountAdvice() {

		System.out.println("Executing @Before Aspect on addAccount");

	}*/
	
	//add pointcut expression on wildcards
	/*
	@Before("execution(public void add*())")
	public void beforeAddAccountAdvice() {

		System.out.println("Executing @Before Aspect on addAccount");

	}
    */
	
	//add pointcut expression on return type
	/*@Before("execution( void add*())")
	public void beforeAddAccountAdvice() {

		System.out.println("Executing @Before Aspect on addAccount");

	}*/
	//add pointcut expression on any returen type
		@Before("execution( * add*())")
		public void beforeAddAccountAdvice() {

			System.out.println("Executing @Before Aspect on addAccount");

		}
}
