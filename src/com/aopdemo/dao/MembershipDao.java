package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {
	
	public boolean addSillyMember() {
		System.out.println(getClass() +"Doing stuff : Membership Dao Adding ");
		
		return true;
	}

}
