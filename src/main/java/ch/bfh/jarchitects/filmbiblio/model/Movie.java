package ch.bfh.jarchitects.filmbiblio.model;

import com.sun.org.apache.xpath.internal.operations.String;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie
{
    @GeneratedValue
    @Id
    private Long id;

    /**
     * @Basic(optional = false) - this feature should be evaluated within the runtime
     * An exception raised before SQL is sent to the database
     * *
     * Similar:
     * @Column(nullable = false) - only a reference to database column
     */
    @NotBlank
    @Column(unique = true)
    private String title;

    /**
     * @Column(length = 500) - limits description length
     */
    @NotBlank
    @Column(length = 500)
    private String description;

    /**
     * @Basic - signifies that an attribute is to be persisted and a standard mapping is to be used
     */
    @Basic
    private Integer release_year;

    @Basic
    private Long duration;

    @OneToMany(mappedBy = "movie")
    private List<Dvd> dvds;

    @OneToMany(mappedBy = "movie")
    private List<MovieReview> reviews;

    @OneToMany(mappedBy = "movie")
    private List<WaitingList> waitingLists;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }


    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }


    public Integer getRelease_year()
    {
        return release_year;
    }

    public void setRelease_year(Integer release_year)
    {
        this.release_year = release_year;
    }


    public Long getDuration()
    {
        return duration;
    }

    public void setDuration(Long duration)
    {
        this.duration = duration;
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

    public List<WaitingList> getWaitingLists()
    {
        return waitingLists;
    }

    public void setWaitingLists(List<WaitingList> waitingLists)
    {
        this.waitingLists = waitingLists;
    }
}
