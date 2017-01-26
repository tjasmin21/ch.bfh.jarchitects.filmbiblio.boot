package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Marc on 24.01.2017.
 */
@Entity
public class Biblio implements Serializable {
    private Long id;
    private String adress;
    private String name;
    private List<Dvd> dvds;

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

    @Basic
    public String getAdress()
    {
        return adress;
    }
    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    @Basic
    public String getName() {
        return this.name;
    }
    public void setName( String name ) {
        this.name = name;

    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<Dvd> getDvds() {
        return dvds;
    }
    public void setDvds(List<Dvd> dvds)
    {
        this.dvds = dvds;
    }


}
