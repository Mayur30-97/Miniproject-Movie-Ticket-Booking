package com.zensar.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Movie;

import com.zensar.db.MovieDAO;

@Service
public class MovieService {

	@Autowired
	MovieDAO movieDao;

// Add Movie
	public Movie addMovie(Movie movie) {
		return this.movieDao.save(movie);
	}

// Update Movie
	public Movie updateMovie(Movie movie) {
		return this.movieDao.save(movie);
	}

// Remove Movie
	public boolean removeMovie(Movie movie) {
		movieDao.delete(movie);
		return true;
	}

// View Movie By Id
	public Movie viewMovie(int movieid) {
		Optional<Movie> optional = movieDao.findById(movieid);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

// View Movie List
	public List<Movie> viewMovieList() {
		return this.movieDao.findAll();
	}

// View Movie List by theater id
	public List<Movie> viewMovieList(int theatreid) {
		//return this.movieDao.findAllById(theatreid);
		return null;
	}

// View Movie List by date
	public List<Movie> viewMovieList(LocalDate date) {
		//return this.movieDao.getAllBymovieDate(date);
		return null;
	}

}