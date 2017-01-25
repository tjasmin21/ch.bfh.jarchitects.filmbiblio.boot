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
    private List<Dvd> dvdsOwn;
    private List<Dvd> dvdsForeign;

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
    public List<Dvd> getDvdsOwn() {
        return dvdsOwn;
    }
    public void setDvdsOwn(List<Dvd> dvdsOwn)
    {
        this.dvdsOwn = dvdsOwn;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<Dvd> getDvdsForeign() {
        return dvdsForeign;
    }
    public void setDvdsForeign(List<Dvd> dvdsFordeing)
    {
        this.dvdsForeign = dvdsForeign;
    }

    // ausgeben, output
    public boolean issue( Dvd dvd, User user ) {
        if ( dvd.getOwner() == this ) {
            if (this.dvdsOwn.contains(dvd))
                if (dvd.isLendable())
                    if (dvd.getWaitingList().getNReservations() == 0) {
                        dvd.getWaitingList().getUsers().add(user);
                        this.dvdsForeign.add(dvd);
                        this.dvdsOwn.remove(dvd);
                        return true;
                    }
                    else
                        return false;
        }

        return this.dvdsForeign.remove( dvd );

    }

    // Jemandem etwas leihen mit Wartezeit
    public boolean reserve( Dvd dvd, User user ) {
        if ( dvd.getOwner() == this ) {
            if (this.dvdsOwn.contains(dvd))
                if (dvd.isLendable() && dvd.isReservable()) {
                    dvd.getWaitingList().getUsers().add(user);
                    this.dvdsForeign.add(dvd);
                    this.dvdsOwn.remove(dvd);
                    return true;
                }
                else
                    return false;
        }

        return this.dvdsForeign.remove( dvd );

    }

    // erhalten, input
    public boolean receipt( Dvd dvd, User user ) {
        if ( dvd.getOwner() == this ) {
            dvd.getWaitingList().getUsers().remove( user );
            return this.dvdsOwn.add( dvd );

        }

        this.dvdsForeign.add( dvd );
        this.dvdsOwn.remove( dvd );

        return true;

    }

}
