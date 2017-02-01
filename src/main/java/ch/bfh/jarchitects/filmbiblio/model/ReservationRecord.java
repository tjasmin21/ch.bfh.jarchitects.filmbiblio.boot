package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class WaitingList
{
    @GeneratedValue
    @Id
    private Long id;

    @NotNull
    @Basic
    @Temporal(TemporalType.DATE)
    private Date request_date;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private Userr user;


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }


    public Date getRequest_date()
    {
        return request_date;
    }

    public void setRequest_date(Date request_date)
    {
        this.request_date = request_date;
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


}
