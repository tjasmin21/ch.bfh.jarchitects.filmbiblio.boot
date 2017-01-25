package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Jasmin on 03.11.2016.
 */

@Entity
public class WaitingList implements Serializable {
    private Long id;
    private Movie movie;
    private Date request_date;
    private List<User> users;

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
    @Temporal(TemporalType.DATE)
    public Date getRequest_date() {
        return request_date;
    }
    public void setRequest_date(Date request_date) {
        this.request_date = request_date;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<User> getUsers() {
        return this.users;
    }
    public void setUsers( List<User> users ) {
        this.users = users;
    }

    @Transient
    public int getNReservations() {
        return users.size();

    }

}
