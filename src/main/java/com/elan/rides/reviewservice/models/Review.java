package com.elan.rides.reviewservice.models;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends  BaseModel {

    @Column(nullable = false)
    private  String content;
    private  Double rating;


}
