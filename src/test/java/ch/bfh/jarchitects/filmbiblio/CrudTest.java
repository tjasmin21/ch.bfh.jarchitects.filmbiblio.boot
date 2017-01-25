package ch.bfh.jarchitects.filmbiblio;

import ch.bfh.jarchitects.filmbiblio.model.Biblio;
import ch.bfh.jarchitects.filmbiblio.model.Dvd;
import ch.bfh.jarchitects.filmbiblio.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc on 24.01.2017.
 */
public class CrudTest {

    public CrudTest() {
        create();

    }

    @Test
    public void create() {
        Dvd dvd1 = new Dvd();
        Dvd dvd2 = new Dvd();

        Biblio stadtBiblio = new Biblio();
        stadtBiblio.getDvdsOwn().add( dvd1 );

//
//        User stadtBiblioBetreiber = new User();
//
//
//        Biblio stadtBiblio = new Biblio();
//        stadtBiblio.setName( "Stadtbibliothek");
//        stadtBiblio.setAdress( "Bern" );
//        stadtBiblioBetreiber.setBiblio( stadtBiblio );
//        Dvd inceptionDvd = new Dvd();
//        stadtBiblio.getDvdsOwn().add( inceptionDvd );
//
//        Biblio bfhBiblio = new Biblio();
//        bfhBiblio.setName( "BFH Bibliothek" );
//        bfhBiblio.setAdress( "Bern" );
//
//        User jimmy = new User();
//        jimmy.setUserid( "Jimmy" );
//        jimmy.setEmail( "jimmy@mail.com" );
//        Biblio jimmysBiblio = new Biblio();
//        jimmysBiblio.setName( "Jimmys Biblio" );
//        jimmysBiblio.setAdress( "Bern" );
//        jimmy.setBiblio( jimmysBiblio );
//        Dvd madagaskarDvd = new Dvd();
//        madagaskarDvd.setOwner( jimmysBiblio );
//
//        stadtBiblio.receipt( madagaskarDvd, jimmy );
//        jimmysBiblio.issue( madagaskarDvd, stadtBiblioBetreiber );

    }
}
