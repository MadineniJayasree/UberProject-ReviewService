package com.jpa.product.service;

import com.jpa.product.models.Review;
import com.jpa.product.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {
    @Autowired
    private ReviewRepository reviewRepository;
    @Override
    public void run(String... args) throws Exception{
        System.out.println("*******");
        Review r = Review.builder().content("Amazing ride quality").createdAt(new Date()).rating(5.0).updatedAt(new Date()).build();
        System.out.println(r);
        reviewRepository.save(r); // executes sql query
    }
}
