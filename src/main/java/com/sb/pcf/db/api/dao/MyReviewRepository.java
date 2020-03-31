package com.sb.pcf.db.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.pcf.db.api.model.Review;

public interface MyReviewRepository extends JpaRepository<Review, Integer>{

}
