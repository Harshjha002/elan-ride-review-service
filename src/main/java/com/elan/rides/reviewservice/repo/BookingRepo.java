package com.elan.rides.reviewservice.repo;

import com.elan.rides.reviewservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingRepo extends JpaRepository<Booking,Long> {
}
