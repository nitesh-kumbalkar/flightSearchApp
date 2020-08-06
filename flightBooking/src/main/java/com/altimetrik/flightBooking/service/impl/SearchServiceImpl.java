package com.altimetrik.flightBooking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.flightBooking.model.FlightInfo;
import com.altimetrik.flightBooking.model.Flights;
import com.altimetrik.flightBooking.model.Search;
import com.altimetrik.flightBooking.repository.FlightRepository;
import com.altimetrik.flightBooking.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService{
	
	@Autowired
	FlightRepository flightRepo;

	@Override
	public List<FlightInfo> getSearchResult(Search search) {
		
		List<FlightInfo> list = new ArrayList<>();
		List<Flights> flightList = flightRepo.findFight(search);
		
		for(Flights f: flightList) {
			FlightInfo fi = new FlightInfo();
			fi.setAirlineName(f.getAirlineName());
			fi.setArrivalTime(f.getArrivalTime());
			fi.setDepartureTime(f.getDepartureTime());
			fi.setDuration(f.getDuration());
			fi.setFlightNo(f.getFlightNo());
			fi.setPrice(f.getPrice());
			fi.setStops(f.getStops());
		}
		
		return list;
	}



}
