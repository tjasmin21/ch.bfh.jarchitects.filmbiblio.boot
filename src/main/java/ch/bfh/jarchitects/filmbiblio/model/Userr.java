package ch.bfh.jarchitects.filmbiblio.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "user")
public class Userr
{
    @GeneratedValue
    @Id
    private Long id;

    @NotNull
    @Column(unique = true)
    private String username;

    @NotNull
    @Basic
    private String email;

    @NotNull
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
    private List<ReservationRecord> waitinglists;


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
        this.password = new BCryptPasswordEncoder().encode(password);
    }


    public Userr(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        setPassword(password);
    }

    public Userr()
    {
    }
}
