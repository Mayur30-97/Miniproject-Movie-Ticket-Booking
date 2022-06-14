package com.zensar.service;



import java.time.LocalDate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zensar.bean.TicketBooking;
import com.zensar.db.TicketBookingDAO;
import com.zensar.db.TicketDAO;

@Service
public class BookingService {
	@Autowired
	TicketBookingDAO ibookingdao;
	
	@Autowired
	TicketDAO iticketdao;

	public TicketBooking addBooking(TicketBooking booking) {
		return this.ibookingdao.save(booking);
	}

	public TicketBooking updateBooking(TicketBooking booking) {
		return this.ibookingdao.saveAndFlush(booking);
	}

	
	public TicketBooking cancelBooking(int bookingid) {
		TicketBooking b = ibookingdao.getOne(bookingid);
		ibookingdao.delete(b);
		return b;
	}

	public Optional<TicketBooking> showAllBooking(int movieid) {
		return this.ibookingdao.findById(movieid);
	}

	public List<TicketBooking> showAllBookings(LocalDate date) {
		//return this.ibookingdao.findAll(date);
		return null;

	}

	public List<TicketBooking> showBookingList() {
		List<TicketBooking> b = ibookingdao.findAll();

		return b;
	}

	public Optional<TicketBooking> showBookingList(int showid) {
		
		return this.ibookingdao.findById(showid);
	}
	
	
	



}
