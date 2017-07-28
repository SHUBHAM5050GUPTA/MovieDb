package com.example.shubhamgupta.moviedb.Network;

import com.example.shubhamgupta.moviedb.Upcoming.UpComingMovies;

import java.util.ArrayList;

/**
 * Created by Shubham Gupta on 28-07-2017.
 */

public class UpcomingMoviesJson {
    ArrayList<UpComingMovies> results;
    dates mdates;

    public ArrayList<UpComingMovies> getResults() {
        return results;
    }

    public void setResults(ArrayList<UpComingMovies> results) {
        this.results = results;
    }

    public class dates
    {
        String maximum;
        String minimum;
    }
}
