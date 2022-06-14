package com.zensar.db;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Movie;
import com.zensar.bean.Show;

@Repository
public interface ShowDAO extends JpaRepository<Show, Integer> {

//	List<Show> findAllById(int theatreid);
//
//	List<Movie> getAllBymovieDate(LocalDate date);

}
