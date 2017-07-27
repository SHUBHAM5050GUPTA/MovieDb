package com.example.shubhamgupta.moviedb.Network;

import com.example.shubhamgupta.moviedb.PopularMovies;

import java.util.ArrayList;

/**
 * Created by Shubham Gupta on 24-07-2017.
 */

public class PopularMoviesJson {

    ArrayList<PopularMovies> results;

    public ArrayList<PopularMovies> getResults() {
        return results;
    }

    public void setResults(ArrayList<PopularMovies> results) {
        this.results = results;
    }
}
