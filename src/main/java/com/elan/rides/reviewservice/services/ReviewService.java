package com.elan.rides.reviewservice.services;

import com.elan.rides.reviewservice.models.Booking;
import com.elan.rides.reviewservice.models.Review;
import com.elan.rides.reviewservice.repo.BookingRepo;
import com.elan.rides.reviewservice.repo.ReviewRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ReviewService implements CommandLineRunner {

    private final ReviewRepo reviewRepo;
    private final BookingRepo bookingRepo;


    public ReviewService(ReviewRepo reviewRepo, BookingRepo bookingRepo) {
        this.reviewRepo = reviewRepo;
        this.bookingRepo = bookingRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("************");
        Review r = Review.builder()
                .content("Amazinghh to ride quality")
                .rating(5.0)
                .build();

        Booking b = Booking.builder()
                .startTime(new Date())
                .review(r)
                .endTime(new Date())
                .build();

//        reviewRepo.save(r);
        bookingRepo.save(b);



    }
}
