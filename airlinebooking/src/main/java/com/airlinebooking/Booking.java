package com.airlinebooking;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

	@Id
	private int bookingId;

	@Column
	private String psngrName;

	@Column
	private String departure;

	@Column
	private String destination;

	@Column
	private Date travelDate;

	public Booking() {
	}

	public Booking(int bookingId, String psngrName, String departure, String destination, Date travelDate) {
		super();
		this.bookingId = bookingId;
		this.psngrName = psngrName;
		this.departure = departure;
		this.destination = destination;
		this.travelDate = travelDate;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getPsngrName() {
		return psngrName;
	}

	public void setPsngrName(String psngrName) {
		this.psngrName = psngrName;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

}
