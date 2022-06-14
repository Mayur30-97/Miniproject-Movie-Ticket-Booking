package com.zensar.db;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Movie;
@Repository
public interface MovieDAO extends JpaRepository<Movie, Integer> {

//	List<Movie> findAllById(int theatreid);
//
//	List<Movie> getAllBymovieDate(LocalDate date);

}
