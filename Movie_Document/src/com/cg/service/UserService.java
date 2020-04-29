package com.cg.service;

import com.cg.dto.Customer;

public interface UserService {

	public  Customer registerNewUser();
	public Boolean signIn(String userId,String passWord);
	public Boolean signOut();
}
