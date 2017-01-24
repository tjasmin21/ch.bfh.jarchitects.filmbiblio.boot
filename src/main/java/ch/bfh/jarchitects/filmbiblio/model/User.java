package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class User implements Serializable
{
    private String userid;

    @Id
    public String getUserid()
    {
        return userid;
    }

    public void setUserid(String userid)
    {
        this.userid = userid;
    }

    private String email;

    @Basic
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    private String password;

    @Basic
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

}
