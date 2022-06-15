package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.Advertise;

import com.zensar.db.AdvertiseDAO;


@Service
public class AdvertiseService {
	
	@Autowired
	AdvertiseDAO dao;
	
	public Advertise addAdvertise(Advertise advertise)
	{
		return this.dao.save(advertise);
	}
	
	public Advertise updateAdvertise(Advertise advertise,Integer id)
	{
		Optional<Advertise> optional =dao.findById(id);
		if(optional.isPresent())
		{
			return dao.save(advertise);
		}
		return null;
	}
	
	public List<Advertise> getAllAdvertise(Advertise advertise)
	{
		return this.dao.findAll();
	}
	
	public Advertise getAdvertiseById(int id)
	{
		Optional<Advertise> optional=dao.findById(id);
		if(optional.isPresent())
		{	
		return optional.get();
		}
		return null;
	}
	
	public boolean removeAdvertise(Integer id)
	{
		dao.deleteById(id);
		if(dao.findById(id)!=null)
		{
			return false;
		}
		return true;
	}
	
	public Advertise getAdvertiseByText(String text)
	{
		//return this.dao.getAdvertiseByText(text);
		return null;
	}

}
