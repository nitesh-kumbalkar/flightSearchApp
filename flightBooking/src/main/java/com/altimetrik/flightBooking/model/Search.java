package com.altimetrik.flightBooking.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Search {
	
	String sourceCity;
	
	
	String destinationCity;
	

	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	Date travelDate;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	Date returnDate;


	public String getSourceCity() {
		return sourceCity;
	}
	
	
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}
	
	
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	@Override
	public String toString() {
		return "Search [sourceCity=" + sourceCity + ", destinationCity=" + destinationCity + ", travelDate="
				+ travelDate + ", returnDate=" + returnDate + "]";
	}

}
