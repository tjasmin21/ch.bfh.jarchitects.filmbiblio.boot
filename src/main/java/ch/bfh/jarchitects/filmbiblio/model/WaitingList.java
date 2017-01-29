package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class WaitingList implements Serializable
{

    @GeneratedValue
    @Id
    private Long id;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Userr user;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date request_date;


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Movie getMovie()
    {
        return movie;
    }

    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }

    public Userr getUser()
    {
        return user;
    }

    public void setUser(Userr user)
    {
        this.user = user;
    }


    public Date getRequest_date()
    {
        return request_date;
    }

    public void setRequest_date(Date request_date)
    {
        this.request_date = request_date;
    }


}
