package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.Advertise;
import com.zensar.service.AdvertiseService;

@RestController
public class AdvertiseController {
	
	@Autowired
	AdvertiseService service;
	
	@PostMapping("/advertise")
	public Advertise addAdvertise(@RequestBody Advertise advertise)
	{
		return this.service.addAdvertise(advertise);
	}
	
	@PutMapping("/advertise/{id}")
	public Advertise upadateAdvertise(@RequestBody Advertise advertise,@PathVariable Integer id)
	{
		return this.service.updateAdvertise(advertise,id);
	}
	
	@GetMapping("/user/advertise")
	public List<Advertise> getAllAdvertise(Advertise advertise)
	{
		return this.service.getAllAdvertise(advertise);
	}
	
	@DeleteMapping("/user/advertise/{postId}")
	public boolean removeAdvertise(@PathVariable("id") Integer id)
	{
		return this.service.removeAdvertise(id);
		
	}
	
	@GetMapping("/advertise/{postId}")
	public Advertise getAdvertiseById(@PathVariable Integer id)
	{
		return this.service.getAdvertiseById(id);
	}

	
	
	
	
}
