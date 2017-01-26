package ch.bfh.jarchitects.filmbiblio.repository;


import ch.bfh.jarchitects.filmbiblio.model.Biblio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "biblios")
public interface BiblioRepository extends CrudRepository<Biblio, Long> {

}
