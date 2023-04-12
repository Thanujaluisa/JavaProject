package com.tns.orderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
public class OrderServices {

	@Autowired
	
	private OrderServicesRepository repo;
	public List <Order> listAll()
	{
		return repo.findAll();
	}
	public Order get(Integer od_id)
	{
		return repo.findById(od_id).get();
	}
	public void delete(Integer od_id)
	{
		repo.deleteById(od_id);
	}
	public void save (Order odr)
	{
		repo.save(odr);
	}
}