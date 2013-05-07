package com.highview.app;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 5/7/13
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Movie {

    @Id
    private Long movieId;
    private String title;

    public Movie() {
    }

    public Movie(String title, Long movieId) {
        this.title = title;
        this.movieId = movieId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
