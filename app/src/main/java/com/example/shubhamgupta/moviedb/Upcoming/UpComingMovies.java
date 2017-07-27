package com.example.shubhamgupta.moviedb.Upcoming;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Shubham Gupta on 28-07-2017.
 */

public class UpComingMovies implements Serializable {
    @SerializedName("poster_path")
    private String upComingPoster;
    @SerializedName("release_date")
    private String releaseDate;

    public UpComingMovies(String upComingPoster, String releaseDate) {
        this.upComingPoster = upComingPoster;
        this.releaseDate = releaseDate;
    }

    public String getUpComingPoster() {
        return upComingPoster;
    }

    public void setUpComingPoster(String upComingPoster) {
        this.upComingPoster = upComingPoster;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
