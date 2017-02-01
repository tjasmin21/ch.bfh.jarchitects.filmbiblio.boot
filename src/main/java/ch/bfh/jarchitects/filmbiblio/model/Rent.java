package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Rent
{
    @GeneratedValue
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "dvd_id", referencedColumnName = "ID")
    private Dvd dvd;

    @NotNull
    @Basic
    @Temporal(TemporalType.DATE)
    private Date lent_date;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "tenant_id")
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
