package com.elan.rides.reviewservice.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Booking extends  BaseModel {

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})

    private  Review review;

    @ManyToOne
    private Passenger passenger;

    @Enumerated(value = EnumType.STRING)
    private  BookingStatus bookingStatus;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;


    @Temporal(value = TemporalType.TIMESTAMP)
    private  Date endTime;

    private Long totalDistance;

    @ManyToOne
    private  Driver driver;

}
