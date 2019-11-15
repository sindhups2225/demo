package com.airlinebooking;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookingRepo {

	@Autowired
	private SessionFactory sessionFactory;

	public void bookingTicket(Booking booking) {
		
		sessionFactory.getCurrentSession().save(booking);
	}

	public List<Booking> getAllBookingDetails() {

		return (List<Booking>) sessionFactory.getCurrentSession().createCriteria(Booking.class).list();
	}

}
