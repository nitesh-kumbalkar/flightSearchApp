package com.altimetrik.flightBooking.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.altimetrik.flightBooking.model.FlightInfo;
import com.altimetrik.flightBooking.model.Search;


public interface SearchService {

	List<FlightInfo> getSearchResult(Search search);

}
