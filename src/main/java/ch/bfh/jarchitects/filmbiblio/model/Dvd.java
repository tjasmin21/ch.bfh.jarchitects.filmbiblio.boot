package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;


/**
 * Traditional JPA ‘Entity’ classes are specified in a persistence.xml file
 * With Spring Boot this file is not used --> instead it makes a 'Entity Scanning'
 */
@Entity
public class Dvd
{
    @GeneratedValue
    @Id
    private Long id;

    @OneToOne(mappedBy = "dvd")
    private Rent rent;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "owner_id")
    private Userr owner;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Rent getRent()
    {
        return rent;
    }

    public void setRent(Rent rent)
    {
        this.rent = rent;
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
