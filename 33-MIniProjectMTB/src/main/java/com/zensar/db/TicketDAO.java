package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Ticket;

@Repository
public interface TicketDAO extends JpaRepository<Ticket, Integer> {

}
