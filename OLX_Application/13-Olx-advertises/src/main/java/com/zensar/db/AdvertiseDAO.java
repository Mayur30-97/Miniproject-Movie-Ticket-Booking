package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Advertise;

@Repository
public interface AdvertiseDAO extends JpaRepository<Advertise,Integer>{

	 Advertise getAdvertiseByText(String text);
	
}
