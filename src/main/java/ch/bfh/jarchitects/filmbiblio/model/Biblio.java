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

    @OneToMany(cascade = CascadeType.ALL)
    public List<Dvd> getDvds()
    {
        return dvds;
    }

    public void setDvds(List<Dvd> dvds)
    {
        this.dvds = dvds;
    }


}
