package com.example.shubhamgupta.moviedb.InCinemas;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Shubham Gupta on 27-07-2017.
 */

public class InCinemasMovies  implements Serializable {
    @SerializedName("poster_path")
    private String inCinemasPoster;
    @SerializedName("vote_average")
    private String votes;

    public InCinemasMovies(String inCinemasPoster, String votes) {
        this.inCinemasPoster = inCinemasPoster;
        this.votes = votes;
    }

    public String getInCinemasPoster() {
        return inCinemasPoster;
    }

    public void setInCinemasPoster(String inCinemasPoster) {
        this.inCinemasPoster = inCinemasPoster;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }
}
