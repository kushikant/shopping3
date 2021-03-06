package com.niit.shoppingbackend.dao;

import java.util.List;

import com.niit.shoppingbackend.dto.Address;
import com.niit.shoppingbackend.dto.User;

public interface AddressDao {
	public boolean add(Address address);
	 	
	 List<Address>list();
	 Address get(int id);
	 boolean update(Address address);
	 boolean delete(Address address);
	 List<Address> getAddress(User user);
	
	  

}
