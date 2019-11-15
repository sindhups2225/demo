package com.airlinebooking;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

	@Autowired
	private BookingRepo bookingrepo;

	@Transactional
	public void bookingTicket(Booking booking) {
		System.out.println("booking-----" + booking.getBookingId() + "--" + booking.getDeparture() + "--"
				+ booking.getDestination());

		bookingrepo.bookingTicket(booking);

	}

	@Transactional
	public List<Booking> getAllBookingDetails() {

		return bookingrepo.getAllBookingDetails();
	}

}
