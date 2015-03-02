package com.citrix.web;

import com.citrix.movies.Movie;
import com.citrix.movies.MovieProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Collectors;

@Controller
public class WebController {

    @Autowired
    private MovieProcessor movieProcessor;

    @RequestMapping("/movies")
    @ResponseBody
    public String getMovies(@RequestParam(required = false, defaultValue = "") String search) {
        return movieProcessor.getMoviesByTitle(search)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
    }

}
