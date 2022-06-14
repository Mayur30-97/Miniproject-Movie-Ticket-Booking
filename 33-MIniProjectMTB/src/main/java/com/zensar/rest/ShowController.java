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
import com.zensar.bean.Show;
import com.zensar.service.ShowService;

@RestController
public class ShowController {

	@Autowired
	ShowService showService;

	@PostMapping(value = "/inertshow")
	public Show f1(@RequestBody Show show) {
		return this.showService.addShow(show);
	}

	@PutMapping("/updateshow")
	public Show f2(@RequestBody Show show) {
		return this.showService.updateShow(show);
	}

	@DeleteMapping("/deleteshow")
	public boolean f3(@RequestBody Show show) {
		return this.showService.removeShow(show);
	}

	@GetMapping(value = "/get/{sid}")
	public Show f4(@PathVariable(name = "sid") int showid) {
		return this.showService.viewShow(showid);
	}

// GET All
	@GetMapping(value = "/getAllShows")
	public List<Show> f5() {
		return this.showService.viewAllShow();
	}

// GET Movie List by theater id
	@GetMapping(value = "/getTheatre/{sid}")
	public List<Show> f6(@PathVariable(name = "sid") int theatreid) {
		return this.showService.viewShowList(theatreid);
	}

// GET Movie List by date
	@GetMapping(value = "/getDate/{d}")
	public List<Show> f7(@PathVariable(name = "d") LocalDate date) {
		return this.showService.viewShowList(date);
	}

}
