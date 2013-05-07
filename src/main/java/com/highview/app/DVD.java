package com.highview.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 5/7/13
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class DVD {

    @Id
    @GeneratedValue
    private Long dvdId;
    private boolean isAvailable;


    @ManyToOne
    private Movie movie;

    public DVD() {
    }

    public DVD( Movie movie) {

        isAvailable = true;
        this.movie = movie;
    }


}
