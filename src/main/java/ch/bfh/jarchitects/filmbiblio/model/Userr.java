package ch.bfh.jarchitects.filmbiblio.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class Userr
{
    @GeneratedValue
    @Id
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String username;

    @Basic
    private String email;

    @Basic
    private String password;

    /**
     * the cascade being useful for the one-to-many side only
     * if user gets deleted, also his "children" should get deleted(like dvd, rents, waitinglist entries)
     */
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Dvd> dvds;

    @OneToMany(mappedBy = "reviewer", cascade = CascadeType.ALL)
    private List<MovieReview> reviews;

    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL)
    private List<Rent> rents;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<WaitingList> waitinglists;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }


    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }


    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public List<Dvd> getDvds()
    {
        return dvds;
    }

    public void setDvds(List<Dvd> dvds)
    {
        this.dvds = dvds;
    }

    public List<MovieReview> getReviews()
    {
        return reviews;
    }

    public void setReviews(List<MovieReview> reviews)
    {
        this.reviews = reviews;
    }

    public List<Rent> getRents()
    {
        return rents;
    }

    public void setRents(List<Rent> rents)
    {
        this.rents = rents;
    }

    public List<WaitingList> getWaitinglists()
    {
        return waitinglists;
    }

    public void setWaitinglists(List<WaitingList> waitinglists)
    {
        this.waitinglists = waitinglists;
    }
}
