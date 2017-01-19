package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class Dvd implements Serializable
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

    private Userr owner;

    @ManyToOne(cascade = CascadeType.ALL)
    public Userr getOwner()
    {
        return owner;
    }

    public void setOwner(Userr owner)
    {
        this.owner = owner;
    }

    private Movie movie;

    @ManyToOne(cascade = CascadeType.ALL)
    public Movie getMovie()
    {
        return movie;
    }

    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }
}