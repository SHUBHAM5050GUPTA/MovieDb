package com.example.shubhamgupta.moviedb;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Shubham Gupta on 24-07-2017.
 */

public class PopularMovies implements Serializable{
    @SerializedName("poster_path")
    private String  popularPoster;
    @SerializedName("popularity")
    private String popularity;

    public PopularMovies(String popularPoster, String popularity) {
        this.popularPoster = popularPoster;
        this.popularity = popularity;
    }

    public String getPopularPoster() {
        return popularPoster;
    }

    public void setPopularPoster(String popularPoster) {
        this.popularPoster = popularPoster;
    }

    public String getPopularity(){return popularity;}

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

}
