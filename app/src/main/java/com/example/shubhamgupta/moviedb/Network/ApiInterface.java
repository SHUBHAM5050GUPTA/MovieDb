package com.example.shubhamgupta.moviedb.Network;

import com.example.shubhamgupta.moviedb.Cast.MovieCast;
import com.example.shubhamgupta.moviedb.PopularMovies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Shubham Gupta on 25-07-2017.
 */

public interface ApiInterface {

    @GET("movie/popular")
    public Call<PopularMoviesJson> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/now_playing")
    public Call<InCinemasMoviesJson> getInCinemasMovies(@Query("api_key") String apiKey);

    @GET("movie/upcoming")
    public Call<UpcomingMoviesJson> getUpComingMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated")
    public Call<TopRatedMoviesJson> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{movie_id}/credits")
    public  Call<MovieCastJson> getMovieCast(@Path("movie_id") String movieId, @Query("api_key") String apiKey);

    @GET("movie/{movie_id}/similar")
    public Call<PopularMoviesJson> getSimilarMovies(@Path("movie_id")String movieId, @Query("api_key") String apiKey);


}
