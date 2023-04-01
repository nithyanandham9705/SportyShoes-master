package com.aman.phase3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartDao {
	
	@Autowired
	CartRepo c_repo;
	
	//USER INSERT ITEMS INTO CART'
	public Cart addcart(Cart c)
	{
		return c_repo.save(c);
	}
}
