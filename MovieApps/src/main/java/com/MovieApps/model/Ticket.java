package com.MovieApps.model;

import java.util.List;

import javax.annotation.processing.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Document(collection = "Tickets")
public class Ticket {
		@Id
	    private String id;
	    private String movieId;
	    private String theatreName;
	    private int numTickets;
	    private List<String> seatNumbers;
	    private String status;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getMovieId() {
			return movieId;
		}
		public void setMovieId(String movieId) {
			this.movieId = movieId;
		}
		public String getTheatreName() {
			return theatreName;
		}
		public void setTheatreName(String theatreName) {
			this.theatreName = theatreName;
		}
		public int getNumTickets() {
			return numTickets;
		}
		public void setNumTickets(int numTickets) {
			this.numTickets = numTickets;
		}
		public List<String> getSeatNumbers() {
			return seatNumbers;
		}
		public void setSeatNumbers(List<String> seatNumbers) {
			this.seatNumbers = seatNumbers;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Ticket(String id, String movieId, String theatreName, int numTickets, List<String> seatNumbers,
				String status) {
			super();
			this.id = id;
			this.movieId = movieId;
			this.theatreName = theatreName;
			this.numTickets = numTickets;
			this.seatNumbers = seatNumbers;
			this.status = status;
		}
		public Ticket() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Ticket [id=" + id + ", movieId=" + movieId + ", theatreName=" + theatreName + ", numTickets="
					+ numTickets + ", seatNumbers=" + seatNumbers + ", status=" + status + "]";
		}

}
