package com.altimetrik.flightBooking.model;

import java.sql.Timestamp;

public class FlightInfo {
	
	int flightNo;
	String airlineName;
	Timestamp arrivalTime;
	Timestamp departureTime;
	String duration;
	int stops;
	float price;
	
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public Timestamp getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Timestamp getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getStops() {
		return stops;
	}
	public void setStops(int stops) {
		this.stops = stops;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "SearchResult [flightNo=" + flightNo + ", airlineName=" + airlineName + ", arrivalTime=" + arrivalTime
				+ ", departureTime=" + departureTime + ", duration=" + duration + ", stops=" + stops + ", price="
				+ price +  "]";
	}
	
	

}
