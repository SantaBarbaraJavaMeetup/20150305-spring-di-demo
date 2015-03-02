package com.citrix.movies;

import java.util.stream.Stream;

public class InMemoryMovieFinder implements MovieFinder {

    @Override
    public Stream<Movie> findMovies() {
        return Stream.of(
                "The Grand Budapest Hotel",
                "The Imitation Game",
                "Boyhood",
                "Selma",
                "Whiplash",
                "Birdman",
                "The Theory of Everything"
        ).map(Movie::new);
    }

}
