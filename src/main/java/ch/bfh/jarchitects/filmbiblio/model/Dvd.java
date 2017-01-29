package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Traditional JPA ‘Entity’ classes are specified in a persistence.xml file
 * With Spring Boot this file is not used --> instead it makes a 'Entity Scanning'
 */
@Entity
public class Dvd implements Serializable
{
    @GeneratedValue
    @Id
    private Long id;

    @ManyToOne
    private Userr owner;

    @ManyToOne
    private Movie movie;



    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Userr getOwner()
    {
        return owner;
    }

    public void setOwner(Userr owner)
    {
        this.owner = owner;
    }

    public Movie getMovie()
    {
        return movie;
    }

    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }
}
