package io.ace.springframework.core.ioc.jsr330;

import javax.inject.Inject;
import javax.inject.Provider;

public class SimpleMovieLister {

    Provider<MovieFinder> movieFinderProvider;

    @Inject
    public SimpleMovieLister(Provider<MovieFinder> movieFinderProvider) {
        this.movieFinderProvider = movieFinderProvider;
    }

    public void listMovies() {
        System.out.println(this.movieFinderProvider.get());
    }

}
