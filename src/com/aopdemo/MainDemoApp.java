package com.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopdemo.dao.AccountDao;
import com.aopdemo.dao.MembershipDao;

public class MainDemoApp {

	public static void main(String[] args) {

		// read the config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);
		
		// get the memebership bean from spring container
		MembershipDao theMembershipDao=context.getBean("membershipDao",MembershipDao.class);

		// call the business method
		theAccountDao.addAcoount();


		// call the  Membership business method again
		theMembershipDao.addSillyMember();

		// close the context
		context.close();

	}

}
