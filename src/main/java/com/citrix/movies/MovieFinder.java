package com.citrix.movies;

import java.util.stream.Stream;

public interface MovieFinder {

    Stream<Movie> findMovies();

}
