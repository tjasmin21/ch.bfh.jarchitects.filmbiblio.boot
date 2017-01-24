package ch.bfh.jarchitects.filmbiblio.repository;

import ch.bfh.jarchitects.filmbiblio.model.Dvd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Jasmin on 17.11.2016.
 */

/**
 * By extending CrudRepository, DvdRepository inherits
 * several methods for working with Dvd persistence,
 * including methods for saving, deleting, and finding Dvd entities.
 */
@RepositoryRestResource(path = "dvds")
public interface DvdRepository extends CrudRepository<Dvd, Long>
{
}
