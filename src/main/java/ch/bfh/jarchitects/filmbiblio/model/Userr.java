package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class Userr implements Serializable
{
    private String userid;

    @Id
    public String getUserid()
    {
        return userid;
    }

    public void setUserid(String userid)
    {
        this.userid = userid;
    }

    private String email;

    @Basic
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    private String password;

    @Basic
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

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

//    private List<Rent> rents;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    public List<Rent> getRents()
//    {
//        return rents;
//    }
//
//    public void setRents(List<Rent> rents)
//    {
//        this.rents = rents;
//    }
//
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
}
