package com.zensar.db;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.TicketBooking;

@Repository
public interface TicketBookingDAO extends JpaRepository<TicketBooking, Integer> {

	//List<TicketBooking> findAll(LocalDate date);

	
}
