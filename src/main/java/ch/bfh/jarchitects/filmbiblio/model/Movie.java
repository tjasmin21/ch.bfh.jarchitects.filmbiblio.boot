package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class Movie implements Serializable
{

    private Long id;

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

    private String title;

    @Basic
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    private String decription;

    @Basic
    public String getDecription()
    {
        return decription;
    }

    public void setDecription(String decription)
    {
        this.decription = decription;
    }

    private Integer release_year;

    @Basic
    public Integer getRelease_year()
    {
        return release_year;
    }

    public void setRelease_year(Integer release_year)
    {
        this.release_year = release_year;
    }

    private Long duration;

    @Basic
    public Long getDuration()
    {
        return duration;
    }

    public void setDuration(Long duration)
    {
        this.duration = duration;
    }


//    private List<MovieReview> reviews;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    public List<MovieReview> getReviews()
//    {
//        return reviews;
//    }
//
//    public void setReviews(List<MovieReview> reviews)
//    {
//        this.reviews = reviews;
//    }
//
//    private List<WaitingList> waitinglist;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    public List<WaitingList> getWaitinglist()
//    {
//        return waitinglist;
//    }
//
//    public void setWaitinglist(List<WaitingList> waitinglist)
//    {
//        this.waitinglist = waitinglist;
//    }

    private List<Dvd> dvds;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Dvd> getDvds()
    {
        return dvds;
    }

    public void setDvds(List<Dvd> dvds)
    {
        this.dvds = dvds;
    }
}
