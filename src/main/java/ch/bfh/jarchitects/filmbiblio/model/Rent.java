//package ch.bfh.jarchitects.filmbiblio.model;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Date;
//
///**
// * Created by Jasmin on 03.11.2016.
// */
//@Entity
//public class Rent implements Serializable
//{
//    @OneToOne(cascade = CascadeType.ALL)
//    @Id
//    private Dvd dvd;
//
//    public Dvd getDvd()
//    {
//        return dvd;
//    }
//
//    public void setDvd(Dvd dvd)
//    {
//        this.dvd = dvd;
//    }
//
//    @Basic
//    @Temporal(TemporalType.DATE)
//    private Date lent_date;
//
//    public Date getLent_date()
//    {
//        return lent_date;
//    }
//
//    public void setLent_date(Date lentdate)
//    {
//        this.lent_date = lentdate;
//    }
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Userr tenant;
//
//    public Userr getTenant()
//    {
//        return tenant;
//    }
//
//    public void setTenant(Userr tenant)
//    {
//        this.tenant = tenant;
//    }
//
//
//}
