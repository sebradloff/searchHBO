package com.sebradloff.searchhbo.web;

import com.sebradloff.searchhbo.models.Movie;
import com.sebradloff.searchhbo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

/**
 * Created by sradloff on 6/27/15.
 */
@Controller
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @RequestMapping(value={"/"}, method = RequestMethod.GET)
    public String printMovies(Model model) {
        ArrayList<Movie> allMovies = movieService.getAllMovies();
        model.addAttribute("allMovies", allMovies);
        return "home";
    }
}
