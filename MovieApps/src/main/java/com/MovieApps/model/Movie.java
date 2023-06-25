package com.MovieApps.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Document(collection = "movies")
public class Movie  {
	/*  	@Id
	    private String id;
	    private String name;
	    private String theatreName;
	    private List<Ticket> tickets;*/
	@Id
    private String id;
    private String name;
    private String theatreName;
    private String releaseDate;
		
    public String getId() {
    	return id;
    }
    public void setId(String id) {
    	this.id = id;
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getTheatreName() {
    	return theatreName;
    }
    public void setTheatreName(String theatreName) {
    	this.theatreName = theatreName;
    }
    public String getReleaseDate() {
    	return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
    	this.releaseDate = releaseDate;
    }
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", theatreName=" + theatreName + ", releaseDate=" + releaseDate
				+ "]";
	}
	public Movie(String id, String name, String theatreName, String releaseDate) {
		super();
		this.id = id;
		this.name = name;
		this.theatreName = theatreName;
		this.releaseDate = releaseDate;
	}
	public Movie() {
		super();
	}
}
