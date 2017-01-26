package ch.bfh.jarchitects.filmbiblio.model;

import com.sun.org.apache.xpath.internal.operations.String;

import javax.persistence.*;


@Entity
public class MovieReview {
    @GeneratedValue
    @Id
    private Long id;

    /**
     * Why not @ManyToOne(cascade = CascadeType.ALL) here
     * The cascade being useful for the one-to-many side only
     * In case one MovieReview will get removed, it leads to deletion of the userr entity
     * Which shouldn't happen!!!
     */
    @ManyToOne
    private Userr reviewer;

    @ManyToOne
    private Movie movie;

    @Basic
    private Integer rating;

    @Basic
    private String review;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Userr getReviewer() {
        return reviewer;
    }

    public void setReviewer(Userr reviewer) {
        this.reviewer = reviewer;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

}
