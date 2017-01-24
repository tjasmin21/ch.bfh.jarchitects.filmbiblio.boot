package ch.bfh.jarchitects.filmbiblio;

import ch.bfh.jarchitects.filmbiblio.model.Biblio;
import ch.bfh.jarchitects.filmbiblio.model.User;
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



        User user1 = new User();
        user1.setUserid( "Jimmy" );
        user1.setEmail( "jimmy@mail.com" );



    }
}
