package ch.bfh.jarchitects.filmbiblio.repository;

import ch.bfh.jarchitects.filmbiblio.model.Dvd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Marc on 25.01.2017.
 */
@RepositoryRestResource(path = "dvds")
public interface DvdRepository extends CrudRepository<Dvd, Long> {


}
