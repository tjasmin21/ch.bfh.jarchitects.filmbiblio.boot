package ch.bfh.jarchitects.filmbiblio.repository;

import ch.bfh.jarchitects.filmbiblio.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Jasmin on 17.11.2016.
 */
@RepositoryRestResource(path = "users")
public interface UserRepository extends CrudRepository<User, String>
{
}
