package com.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.aopdemo.Account;

@Component
public class AccountDao {

	/*public void addAcoount() {
		System.out.println(getClass() + "Doing my DB Work: Adding an Account");
	}*/
	
	//Adding the parameter
	public void addAcoount(Account account,boolean flag) {
		System.out.println(getClass() + "Doing my DB Work: Adding an Account Class");
	}
	
	public void doWork() {
		System.out.println(getClass() + "I am Doing some Stuff");
	}
	
	

}
