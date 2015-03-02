package com.citrix.movies;

import java.util.stream.Stream;

public interface MovieProcessor {

    Stream<Movie> getMoviesByTitle(String search);

}
