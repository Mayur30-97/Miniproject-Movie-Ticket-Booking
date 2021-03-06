package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Seat;

@Repository
public interface SeatDAO extends JpaRepository<Seat, Integer> {

}
