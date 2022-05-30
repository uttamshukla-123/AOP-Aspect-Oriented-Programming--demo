package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
	
	public void addAcoount() {
		System.out.println(getClass() +"Doing my DB Work: Adding an Account");
	}

}
