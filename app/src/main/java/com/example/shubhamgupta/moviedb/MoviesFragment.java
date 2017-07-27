package com.example.shubhamgupta.moviedb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shubhamgupta.moviedb.InCinemas.InCinemasMovies;
import com.example.shubhamgupta.moviedb.InCinemas.InCinemasRecyclerAdapter;
import com.example.shubhamgupta.moviedb.Network.ApiInterface;
import com.example.shubhamgupta.moviedb.Network.InCinemasMoviesJson;
import com.example.shubhamgupta.moviedb.Network.PopularMoviesJson;
import com.example.shubhamgupta.moviedb.Upcoming.UpComingMovies;
import com.example.shubhamgupta.moviedb.Upcoming.UpComingRecyclerAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Shubham Gupta on 24-07-2017.
 */

public class MoviesFragment extends Fragment{

    RecyclerAdapter mRecyclerAdapter;
    ArrayList<PopularMovies> mPopularMoviesList;
    RecyclerView mRecyclerView;

    InCinemasRecyclerAdapter mInCinemasRecyclerAdapter;
    ArrayList<InCinemasMovies> mInCinemasMoviesList;
    RecyclerView mInCinemasRecyclerView;


    UpComingRecyclerAdapter mUpComingRecyclerAdapter;
    ArrayList<UpComingMovies> mUpComingMoviesList;
    RecyclerView mUpComingRecyclerView;


    Retrofit mRetrofit;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View mView=inflater.inflate(R.layout.movies_view,container,false);



        //Most Popular Movies
        mRecyclerView=mView.findViewById(R.id.popular_movies_recycler_view);
        mPopularMoviesList=new ArrayList<>();
        mRecyclerAdapter=new RecyclerAdapter(getContext(),mPopularMoviesList);
        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
       // mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.HORIZONTAL));
        fetchPopularMovies();


        //In Cinemas Movies
        mInCinemasRecyclerView=mView.findViewById(R.id.inCinemas_movies_recycler_view);
        mInCinemasMoviesList=new ArrayList<>();
        mInCinemasRecyclerAdapter=new InCinemasRecyclerAdapter(getContext(),mInCinemasMoviesList);
        mInCinemasRecyclerView.setAdapter(mInCinemasRecyclerAdapter);
        mInCinemasRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        // mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.HORIZONTAL));
        fetchInCinemasMovies();



        //UpComingMovies




        return mView;

    }

    private void fetchInCinemasMovies() {

        ApiInterface mApiInterface=mRetrofit.create(ApiInterface.class);
        Call<InCinemasMoviesJson> mCallResponse=mApiInterface.getInCinemasMovies("53f2c2d690d584b74a488657b393cd17");
        mCallResponse.enqueue(new Callback<InCinemasMoviesJson>() {
            @Override
            public void onResponse(Call<InCinemasMoviesJson> call, Response<InCinemasMoviesJson> response) {
                InCinemasMoviesJson mCallResponse=response.body();
                ArrayList<InCinemasMovies> mInCinemasMovies=mCallResponse.getResults();
                onDownloadCompleteInCinemas(mInCinemasMovies);
            }

            @Override
            public void onFailure(Call<InCinemasMoviesJson> call, Throwable t) {
            }
        });

    }

    private void onDownloadCompleteInCinemas(ArrayList<InCinemasMovies> mInCinemasMovies) {
        mInCinemasMoviesList.addAll(mInCinemasMovies);
        mInCinemasRecyclerAdapter.notifyDataSetChanged();
    }

    private void fetchPopularMovies() {
        mRetrofit=new Retrofit.Builder()
                .baseUrl("http://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface mApiInterface=mRetrofit.create(ApiInterface.class);
        Call<PopularMoviesJson> mCallResponse=mApiInterface.getPopularMovies("53f2c2d690d584b74a488657b393cd17");
        mCallResponse.enqueue(new Callback<PopularMoviesJson>() {
            @Override
            public void onResponse(Call<PopularMoviesJson> call, Response<PopularMoviesJson> response) {
                PopularMoviesJson mCallResponse=response.body();
                ArrayList<PopularMovies> mPopularMovies=mCallResponse.getResults();
                onDownloadCompletePopular(mPopularMovies);
            }

            @Override
            public void onFailure(Call<PopularMoviesJson> call, Throwable t) {

            }
        });

    }

    private void onDownloadCompletePopular(ArrayList<PopularMovies> mPopularMovies) {
        mPopularMoviesList.addAll(mPopularMovies);
        mRecyclerAdapter.notifyDataSetChanged();
    }
}
