package ch.bfh.jarchitects.filmbiblio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Marc on 24.01.2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudBootTest {

    @Test
    public void bootAndCrud() {
        new CrudTest();
    }
}
