package com.airlinebooking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	
	@RequestMapping(value = "/getAllTickets", method = RequestMethod.GET)
	public List<Booking> getAllBookingDetails() {
		
		return bookingService.getAllBookingDetails();
		
	}

	@RequestMapping(value = "/booktickets", method = RequestMethod.POST)
	public void bookingTicket(@RequestBody Booking booking) {
		bookingService.bookingTicket(booking);
		
	}
	
	@RequestMapping(value = "/getsingleTicket/{id}", method = RequestMethod.GET)
	public Booking getBookingDetailsByID(@PathVariable int id) {
		return null;
	}

}
