package com.zensar.bean;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="theatres")
public class Theatre {
	@Id
	private int theatreId;
	
	private String theatreName;
	private String theatreCity;
	
	@ElementCollection
	private List<Movie> listOfMovies;
	
	@ElementCollection
	private List<Screen> listOfScreens;
	
	private String mangerContact;
	
	
	public Theatre(int theatreId, String theatreName, String theatreCity, List<Movie> listOfMovies,
			List<Screen> listOfScreens, String mangerContact) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.listOfMovies = listOfMovies;
		this.listOfScreens = listOfScreens;
		this.mangerContact = mangerContact;
	}


	public Theatre() {
		super();
	}


	public int getTheatreId() {
		return theatreId;
	}


	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}


	public String getTheatreName() {
		return theatreName;
	}


	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}


	public String getTheatreCity() {
		return theatreCity;
	}


	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}


	public List<Movie> getListOfMovies() {
		return listOfMovies;
	}


	public void setListOfMovies(List<Movie> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}


	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}


	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}


	public String getMangerContact() {
		return mangerContact;
	}


	public void setMangerContact(String mangerContact) {
		this.mangerContact = mangerContact;
	}


	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ ", listOfMovies=" + listOfMovies + ", listOfScreens=" + listOfScreens + ", mangerContact="
				+ mangerContact + "]";
	} 
	
	

}
