package com.zensar.bean;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "screens")
public class Screen {
	@Id
	private int screenId;

	private int theatreId;
	private String screenName;
	
	@ElementCollection
	private List<Show> showList;
	
	private int rows;
	private int coloumns;

	public Screen(int screenId, int theatreId, String screenName, List<Show> showList, int rows, int coloumns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.showList = showList;
		this.rows = rows;
		this.coloumns = coloumns;
	}

	public Screen() {
		super();
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public List<Show> getShowList() {
		return showList;
	}

	public void setShowList(List<Show> showList) {
		this.showList = showList;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColoumns() {
		return coloumns;
	}

	public void setColoumns(int coloumns) {
		this.coloumns = coloumns;
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", theatreId=" + theatreId + ", screenName=" + screenName
				+ ", showList=" + showList + ", rows=" + rows + ", coloumns=" + coloumns + "]";
	}

}
