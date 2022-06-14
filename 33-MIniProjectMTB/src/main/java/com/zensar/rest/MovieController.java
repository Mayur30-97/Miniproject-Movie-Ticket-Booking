package com.zensar.rest;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.Movie;
import com.zensar.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;

// ADD Movie
	@PostMapping(value = "/addMovie")
	public Movie f1(@RequestBody Movie movie) {
		return this.movieService.addMovie(movie);
	}

// UPDATE Movie
	@PutMapping(value = "/updateMovie")
	public Movie f2(@RequestBody Movie movie) {
		return this.movieService.updateMovie(movie);
	}

// DELETE Movie

	@DeleteMapping(value = "/deleteMovie")
	public boolean f3(@RequestBody Movie movie) {
		return this.movieService.removeMovie(movie);
	}

// GET Movie By Id
	@GetMapping(value = "/get/{mid}")
	public Movie f4(@PathVariable(name = "mid") int movieid) {
		return this.movieService.viewMovie(movieid);
	}

// GET All
	@GetMapping(value = "/getMovies")
	public List<Movie> f5() {
		return this.movieService.viewMovieList();
	}

// GET Movie List by theater id
	@GetMapping(value = "/getTheatre/{tid}")
	public List<Movie> f6(@PathVariable(name = "tid") int theatreid) {
		return this.movieService.viewMovieList(theatreid);
	}

// GET Movie List by date
	@GetMapping(value = "/getMoviesonDate/{d}")
	public List<Movie> f7(@PathVariable(name = "d") LocalDate date) {
		return this.movieService.viewMovieList(date);
	}

}