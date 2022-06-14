package com.zensar.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Movie;
import com.zensar.bean.Show;

import com.zensar.db.ShowDAO;

@Service
public class ShowService {

	@Autowired
	ShowDAO showDao;

// Add Show
	public Show addShow(Show show) {
		return this.showDao.save(show);
	}

// Update Show
	public Show updateShow(Show show) {
		return this.showDao.save(show);
	}

// Remove Show
	public boolean removeShow(Show show) {
		showDao.delete(show);
		return true;
	}

// View Show
	public Show viewShow(int showid) {
		Optional<Show> optional = showDao.findById(showid);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

// View All Shows
	public List<Show> viewAllShow() {
		return this.showDao.findAll();
	}

// View Show List by theater id
	public List<Show> viewShowList(int theatreid) {
		//return this.showDao.findAllById(theatreid);
		return null;
	}

// View Movie List by date
	public List<Show> viewShowList(LocalDate date) {
		//return this.showDao.getAllBymovieDate(date);
		return null;
	}

}
