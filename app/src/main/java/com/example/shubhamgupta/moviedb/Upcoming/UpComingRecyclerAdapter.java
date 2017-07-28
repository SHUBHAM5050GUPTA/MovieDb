package com.example.shubhamgupta.moviedb.Upcoming;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shubhamgupta.moviedb.InCinemas.InCinemasMovies;
import com.example.shubhamgupta.moviedb.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Shubham Gupta on 28-07-2017.
 */

public class UpComingRecyclerAdapter extends RecyclerView.Adapter<UpComingRecyclerAdapter.UpComingViewHolder> {
    Context mContext;
    ArrayList<UpComingMovies> mUpComingMoviesList;

    public UpComingRecyclerAdapter(Context mContext, ArrayList<UpComingMovies> mUpComingMoviesList) {
        this.mContext = mContext;
        this.mUpComingMoviesList = mUpComingMoviesList;
    }

    @Override
    public UpComingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(mContext).inflate(R.layout.popular_movies_view,parent,false);
        return new UpComingViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(UpComingViewHolder holder, int position) {
        UpComingMovies mUoComingMovies=mUpComingMoviesList.get(position);
        Picasso.with(mContext).load("https://image.tmdb.org/t/p/w500"+mUoComingMovies.getUpComingPoster())
                .into(holder.upComingPosterImageview);
        String date=dateConverter(mUoComingMovies.getReleaseDate());
        holder.releasedate.setText(date);

    }

    @Override
    public int getItemCount() {
        return mUpComingMoviesList.size();
    }

    public class UpComingViewHolder extends RecyclerView.ViewHolder
{
    ImageView upComingPosterImageview;
    TextView releasedate;

    public UpComingViewHolder(View itemView) {
        super(itemView);
        upComingPosterImageview=itemView.findViewById(R.id.imageView_popular_movies);
        releasedate=itemView.findViewById(R.id.textView_popular_movies);

    }
}


public String dateConverter(String releasedate)
{
    String date[]=releasedate.split("-");
    String result="";

    if(date[1].equals("01"))
    {
       result="Jan" ;
    }
    else if(date[1].equals("02"))
    {
        result="Feb" ;
    }
    else if(date[1].equals("03"))
    {
        result="Mar" ;
    }
    else if(date[1].equals("04"))
    {
        result="Apr" ;
    }
    else if(date[1].equals("05"))
    {
        result="May" ;
    }
    else if(date[1].equals("06"))
    {
        result="Jun" ;
    }
    else if(date[1].equals("07"))
    {
        result="Jul" ;
    }
    else if(date[1].equals("08"))
    {
        result="Aug" ;
    }
    else if(date[1].equals("09"))
    {
        result="Sep" ;
    }
    else if(date[1].equals("10"))
    {
        result="Oct" ;
    }
    else if(date[1].equals("11"))
    {
        result="Nov" ;
    }
    else if(date[1].equals("12"))
    {
        result="Dec" ;
    }

    result=result+" "+date[2];
    return result;

}

}
