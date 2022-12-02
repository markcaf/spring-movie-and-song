package org.generation.italy.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.generation.italy.demo.pojo.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String getHome(Model model) {

		String name = "markcaf";

		model.addAttribute("name", name);
		
		return "home"; 
	}
	
	@RequestMapping("/best_movies")
	public String getBestMovies(Model model) {
		String name = "markcaf";
		model.addAttribute("name", name);
		
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "The Lord Of The Rings"));
		movies.add(new Movie(2, "Star Wars"));
		movies.add(new Movie(5, "Back To The Future"));
		movies.add(new Movie(9, "Shutter Island"));

		model.addAttribute("movies", movies);

		return "best_movies"; 
	}
}