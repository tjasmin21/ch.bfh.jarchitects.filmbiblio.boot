package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Rent implements Serializable
{
    @GeneratedValue
    @Id
    private Long id;

    @OneToOne
    private Dvd dvd;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date lent_date;

    @ManyToOne
    private Userr tenant;


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }


    public Dvd getDvd()
    {
        return dvd;
    }

    public void setDvd(Dvd dvd)
    {
        this.dvd = dvd;
    }


    public Date getLent_date()
    {
        return lent_date;
    }

    public void setLent_date(Date lentdate)
    {
        this.lent_date = lentdate;
    }


    public Userr getTenant()
    {
        return tenant;
    }

    public void setTenant(Userr tenant)
    {
        this.tenant = tenant;
    }


}
