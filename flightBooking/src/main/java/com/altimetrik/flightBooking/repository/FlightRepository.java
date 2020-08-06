package com.altimetrik.flightBooking.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.altimetrik.flightBooking.model.Flights;
import com.altimetrik.flightBooking.model.Search;

@Repository
public class FlightRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class FlightRowMapper implements RowMapper<Flights> {
		@Override
		public Flights mapRow(ResultSet rs, int rowNum) throws SQLException {
			Flights flight = new Flights();
			flight.setAirlineName(rs.getString("airlineName"));
			flight.setArrivalTime(rs.getTimestamp("arrivalTime"));
			flight.setDepartureTime(rs.getTimestamp("departureTime"));
			
			flight.setDuration(rs.getString("duration"));
			flight.setFlightNo(rs.getInt("flightNo"));
			flight.setPrice(rs.getFloat("price"));
			
			return flight;
		}

	}
	
	public List<Flights> findFight(Search search) {
		return (List<Flights>) jdbcTemplate.query("select * from flights where source=? and destination=?", new Object[] { search.getSourceCity(), search.getDestinationCity() },
				new FlightRowMapper());
	}

}
