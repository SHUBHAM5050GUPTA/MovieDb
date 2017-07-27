package com.example.shubhamgupta.moviedb.InCinemas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shubhamgupta.moviedb.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Shubham Gupta on 27-07-2017.
 */

public class InCinemasRecyclerAdapter extends RecyclerView.Adapter<InCinemasRecyclerAdapter.MoviesViewHolder> {

    Context mContext;
    ArrayList<InCinemasMovies> mInCinemasMoviesList;

    public InCinemasRecyclerAdapter(Context mContext, ArrayList<InCinemasMovies> mInCinemasMoviesList) {
        this.mContext = mContext;
        this.mInCinemasMoviesList = mInCinemasMoviesList;
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(mContext).inflate(R.layout.popular_movies_view,parent,false);
        return new MoviesViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        InCinemasMovies mInCinemasMovies=mInCinemasMoviesList.get(position);
        Picasso.with(mContext).load("https://image.tmdb.org/t/p/w500"+mInCinemasMovies.getInCinemasPoster())
                .into(holder.inCinemasMoviesImageView);
        holder.inCinemasMoviesTextView.setText(mInCinemasMovies.getVotes());

    }

    @Override
    public int getItemCount() {
        return mInCinemasMoviesList.size();
    }

    class MoviesViewHolder extends RecyclerView.ViewHolder
    {
        ImageView inCinemasMoviesImageView;
        TextView inCinemasMoviesTextView;

        public MoviesViewHolder(View itemView) {

            super(itemView);
            inCinemasMoviesImageView=itemView.findViewById(R.id.imageView_popular_movies);
            inCinemasMoviesTextView=itemView.findViewById(R.id.textView_popular_movies);


        }
    }
}

