package ch.bfh.jarchitects.filmbiblio;

import ch.bfh.jarchitects.filmbiblio.model.Biblio;
import ch.bfh.jarchitects.filmbiblio.model.Userr;
import org.junit.Test;

/**
 * Created by Marc on 24.01.2017.
 */
public class CrudTest {

    @Test
    public void create() {
        Biblio biblio1 = new Biblio();
        biblio1.setName( "Stadtbibliothek");
        biblio1.setAdress( "Bern" );



        Userr user1 = new Userr();
        user1.setUsername( "Jimmy" );
        user1.setEmail( "jimmy@mail.com" );



    }
}
