package com.citrix.movies;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class ParallelMovieProcessorTest {

    @Test
    public void testGetMoviesByTitle() {
        MovieFinder movieFinder = () -> Stream.of(new Movie("Test"));

        ParallelMovieProcessor processor = new ParallelMovieProcessor(movieFinder);
        Assert.assertEquals(0, processor.getMoviesByTitle("x").count());
        Assert.assertEquals(1, processor.getMoviesByTitle("test").count());
    }

}
