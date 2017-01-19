//package ch.bfh.jarchitects.filmbiblio.model;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
///**
// * Created by Jasmin on 03.11.2016.
// */
//@Entity
//public class MovieReview implements Serializable
//{
//    private Userr reviewer;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @Id
//    public Userr getReviewer()
//    {
//        return reviewer;
//    }
//
//    public void setReviewer(Userr reviewer)
//    {
//        this.reviewer = reviewer;
//    }
//
//    private Movie movie;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @Id
//    public Movie getMovie()
//    {
//        return movie;
//    }
//
//    public void setMovie(Movie movie)
//    {
//        this.movie = movie;
//    }
//
//    private Integer rating;
//
//    @Basic
//    public Integer getRating()
//    {
//        return rating;
//    }
//
//    public void setRating(Integer rating)
//    {
//        this.rating = rating;
//    }
//
//    private String review;
//
//    @Basic
//    public String getReview()
//    {
//        return review;
//    }
//
//    public void setReview(String review)
//    {
//        this.review = review;
//    }
//
//
//}
