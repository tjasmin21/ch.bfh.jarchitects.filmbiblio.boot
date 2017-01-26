package ch.bfh.jarchitects.filmbiblio.model;

import com.sun.org.apache.xpath.internal.operations.String;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class Movie implements Serializable
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
    @Basic(optional = false)
    private String title;

    /**
     * @Column(length = 500) - limits description length
     */
    @Column(length = 5000)
    private String description;

    /**
     * @Basic - signifies that an attribute is to be persisted and a standard mapping is to be used
     */
    @Basic
    private Integer release_year;

    @Basic
    private Long duration;


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


}
