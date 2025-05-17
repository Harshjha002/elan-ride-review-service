package com.elan.rides.reviewservice.models;

import com.elan.rides.reviewservice.models.Review;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassengerReview extends Review {

    @Column(nullable = false)
    private  String passengerReviewComment;

    @Column(nullable = false)
    private  String passengerRating;

}
