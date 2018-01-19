package com.example.shubhamgupta.moviedb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Shubham Gupta on 24-07-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MoviesViewHolder> {

    Context mContext;
    ArrayList<PopularMovies> mPopularMoviesList;
    OnMovieClickListner mOnMovieClickListner;


    interface OnMovieClickListner
    {
        public  void  movieClickListner(View view,int position);
    }

    public RecyclerAdapter(Context mContext, ArrayList<PopularMovies> mPopularMoviesList,OnMovieClickListner mOnMovieClickListner) {
        this.mContext = mContext;
        this.mPopularMoviesList = mPopularMoviesList;
        this.mOnMovieClickListner=mOnMovieClickListner;
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(mContext).inflate(R.layout.popular_movies_view,parent,false);
        return new MoviesViewHolder(mView,mOnMovieClickListner);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        PopularMovies mPopularMovies=mPopularMoviesList.get(position);
        Picasso.with(mContext).load("https://image.tmdb.org/t/p/w500"+mPopularMovies.getPopularPoster())
                .into(holder.popularMoviesImageView);
        holder.popularMoviesTextView.setText(mPopularMovies.getPopularity());

    }

    @Override
    public int getItemCount() {
        return mPopularMoviesList.size();
    }

    class MoviesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView popularMoviesImageView;
        TextView popularMoviesTextView;
        OnMovieClickListner mOnMovieClickListner;

        public MoviesViewHolder(View itemView,OnMovieClickListner mOnMovieClickListner) {

            super(itemView);
            popularMoviesImageView=itemView.findViewById(R.id.imageView_popular_movies);
            popularMoviesTextView=itemView.findViewById(R.id.textView_popular_movies);
            this.mOnMovieClickListner=mOnMovieClickListner;
            popularMoviesImageView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            mOnMovieClickListner.movieClickListner(view,position);
        }
    }
}
