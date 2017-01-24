package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class MovieReview implements Serializable {
    private Long id;
    private User reviewer;
    private Movie movie;
    private Integer rating;

    @GeneratedValue
    @Id
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Basic
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    private String review;

    @Basic
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

}
