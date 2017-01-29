package ch.bfh.jarchitects.filmbiblio.repository;

import ch.bfh.jarchitects.filmbiblio.model.WaitingList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "waitinglists")
public interface WaitingListRepository extends CrudRepository<WaitingList, Long>
{

}
