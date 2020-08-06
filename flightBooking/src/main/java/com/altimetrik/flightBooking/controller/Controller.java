package com.altimetrik.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.flightBooking.model.FlightInfo;
import com.altimetrik.flightBooking.model.Search;
import com.altimetrik.flightBooking.service.SearchService;

@RestController
public class Controller {
	
	@Autowired
	SearchService searchService;
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
    public List < FlightInfo > getResults(@RequestBody Search search) {
        
		System.out.println();
        return searchService.getSearchResult(search);
    }

}
