package com.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopdemo.dao.AccountDao;

public class MainDemoApp {

	public static void main(String[] args) {

		// read the config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);

		// call the business method
		theAccountDao.addAcoount();

		// do it again!
		System.out.println("\nlet's call it again!\n");

		// call the business method again
		theAccountDao.addAcoount();

		// close the context
		context.close();

	}

}
