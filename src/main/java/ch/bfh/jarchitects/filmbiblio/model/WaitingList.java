//package ch.bfh.jarchitects.filmbiblio.model;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Date;
//
///**
// * Created by Jasmin on 03.11.2016.
// */
//@Entity
//public class WaitingList implements Serializable
//{
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
//    private User user;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @Id
//    public User getUser()
//    {
//        return user;
//    }
//
//    public void setUser(User user)
//    {
//        this.user = user;
//    }
//
//    private Date request_date;
//
//    @Basic
//    @Temporal(TemporalType.DATE)
//    public Date getRequest_date()
//    {
//        return request_date;
//    }
//
//    public void setRequest_date(Date request_date)
//    {
//        this.request_date = request_date;
//    }
//
//
//}
