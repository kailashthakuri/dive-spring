package io.ace.springframework.core.ioc.annotationbased.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {

    @Autowired
    @Genre("action")
    private MovieCatalog actionCatalog;

    private MovieCatalog comedyCatelog;


    @Autowired
    @MovieQualifier(genre = "action", format = Format.DVD)
    private MovieCatalog comedyDVDCatalog;

    @Autowired
    public void setMovieCatalog(@Genre("comedy") MovieCatalog movieCatalog) {
        this.comedyCatelog = movieCatalog;
    }
}
