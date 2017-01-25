package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class Dvd implements Serializable {
    private Long id;
//    private User owner;
    private Movie movie;
    private WaitingList waitingList;
    private boolean lendable;
    private boolean reservable;

    private Biblio owner;

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

//    @ManyToOne(cascade = CascadeType.ALL)
//    public User getOwner()
//    {
//        return owner;
//    }
//    public void setOwner(User owner)
//    {
//        this.owner = owner;
//    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Biblio getOwner()
    {
        return owner;
    }
    public void setOwner(Biblio owner)
    {
        this.owner = owner;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Movie getMovie()
    {
        return movie;
    }
    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public WaitingList getWaitingList() {
        return waitingList;

    }
    public void setWaitingList( WaitingList waitingList ) {
        this.waitingList = waitingList;

    }

    public boolean isLendable() {
        return this.lendable;
    }
    public boolean setLendable( boolean lendable ) {
        return this.lendable = lendable;
    }

    public boolean isReservable() {
        return this.reservable;
    }
    public boolean setReservable( boolean reservable ) {
        return this.reservable = reservable;
    }

}
