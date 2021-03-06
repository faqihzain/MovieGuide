package com.faqihzain.movieguide.details;

import android.content.Context;

import com.faqihzain.movieguide.Movie;
import com.faqihzain.movieguide.Review;
import com.faqihzain.movieguide.Video;

import java.util.List;


interface MovieDetailsView
{
    void showDetails(Movie movie);
    void showTrailers(List<Video> trailers);
    void showReviews(List<Review> reviews);
    void showFavorited();
    void showUnFavorited();
    void toSimilarActivity(Context context, String id);

}
