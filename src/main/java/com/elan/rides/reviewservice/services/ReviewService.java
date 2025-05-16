package com.elan.rides.reviewservice.services;

import com.elan.rides.reviewservice.models.Review;
import com.elan.rides.reviewservice.repo.ReviewRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ReviewService implements CommandLineRunner {

    private final ReviewRepo reviewRepo;

    public ReviewService(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("************");
        Review r = Review.builder()
                .content("Amazinghh to ride quality")
                .rating(5.0)
                .build();


        List<Review> reviews = reviewRepo.findAll();

        for (Review review : reviews){
            System.out.println(r.getContent());
        }

    }
}
