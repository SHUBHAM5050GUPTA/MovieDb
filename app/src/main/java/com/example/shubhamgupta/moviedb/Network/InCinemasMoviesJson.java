package com.example.shubhamgupta.moviedb.Network;

import com.example.shubhamgupta.moviedb.InCinemas.InCinemasMovies;

import java.util.ArrayList;

/**
 * Created by Shubham Gupta on 27-07-2017.
 */

public class InCinemasMoviesJson {

    ArrayList<InCinemasMovies> results;
    dates mdates;

    public ArrayList<InCinemasMovies> getResults() {
        return results;
    }

    public void setResults(ArrayList<InCinemasMovies> results) {
        this.results = results;
    }

   public class dates
   {
       String maximum;
       String minimum;
   }
}
