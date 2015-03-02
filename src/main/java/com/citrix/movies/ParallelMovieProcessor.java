package com.citrix.movies;

import java.util.stream.Stream;

public class ParallelMovieProcessor implements MovieProcessor {

    private final MovieFinder movieFinder;

    public ParallelMovieProcessor(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public Stream<Movie> getMoviesByTitle(String search) {
        return movieFinder.findMovies()
                .parallel()
                .filter((m) -> m.titleContains(search));
    }

}
