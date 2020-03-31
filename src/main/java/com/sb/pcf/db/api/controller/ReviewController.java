package com.sb.pcf.db.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sb.pcf.db.api.dao.MyReviewRepository;
import com.sb.pcf.db.api.model.Review;

@Controller
public class ReviewController {
	
	@Autowired
	private MyReviewRepository repository;
	
	
	@PostMapping("/submitReview")
	public String addReview(@ModelAttribute("review") Review review,Model model)
	{
		repository.save(review);
		model.addAttribute("status", "Hi"+review.getName()+"Your review submitted sucessfully");
		return "home";
	}
	
	@GetMapping("/getReviews")
	public String getReviews(Model model)
	{
		model.addAttribute("reviews", repository.findAll());
		return "results";
	}

}
