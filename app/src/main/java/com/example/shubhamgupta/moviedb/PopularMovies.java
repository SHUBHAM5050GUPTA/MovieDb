package com.example.shubhamgupta.moviedb;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Shubham Gupta on 24-07-2017.
 */

public class PopularMovies implements Serializable{
    @SerializedName("poster_path")
    private String  popularPoster;

    @SerializedName( "backdrop_path")
    private String posterBack;

    @SerializedName("popularity")
    private String popularity;

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("overview")
    private String overview;

    @SerializedName("genre_ids")
    private ArrayList<String> genreIds;

    @SerializedName("vote_count")
    private String voteCount;

    @SerializedName("vote_average")
    private String VoteAverage;

    @SerializedName("adult")
    private String adult;

    @SerializedName("release_date")
    private String releaseDate;

    public PopularMovies(String popularPoster,String posterBack, String popularity, String id, String title, String overview,
                         ArrayList<String> genreIds, String voteCount, String voteAverage, String adult, String releaseDate) {
        this.popularPoster = popularPoster;
        this.posterBack=posterBack;
        this.popularity = popularity;
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.genreIds = genreIds;
        this.voteCount = voteCount;
        VoteAverage = voteAverage;
        this.adult = adult;
        this.releaseDate = releaseDate;
    }

    public String getPopularPoster() {
        return popularPoster;
    }

    public void setPopularPoster(String popularPoster) {
        this.popularPoster = popularPoster;
    }

    public String getPosterBack() {
        return posterBack;
    }

    public void setPosterBack(String posterBack) {
        this.posterBack = posterBack;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public ArrayList<String> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(ArrayList<String> genreIds) {
        this.genreIds = genreIds;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    public String getVoteAverage() {
        return VoteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        VoteAverage = voteAverage;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /* public PopularMovies(String popularPoster, String popularity) {
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
*/
}
