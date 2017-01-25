package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class User implements Serializable {
    private String userid;
    private Biblio biblio;
    private String email;
    private String password;

    @Id
    public String getUserid()
    {
        return userid;
    }
    public void setUserid(String userid)
    {
        this.userid = userid;
    }

    @Basic
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    @Basic
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public Biblio getBiblio() {
        return this.biblio;
    }
    public void setBiblio( Biblio biblio ) {
        this.biblio = biblio;
    }


}
