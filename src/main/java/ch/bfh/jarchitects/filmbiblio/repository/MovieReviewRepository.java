package ch.bfh.jarchitects.filmbiblio.repository;//package ch.bfh.jarchitects.filmbiblio.repository;
//
//import org.h2.engine.Userr;
//import org.springframework.data.repository.CrudRepository;
//

import ch.bfh.jarchitects.filmbiblio.model.MovieReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "moviereviews")
public interface MovieReviewRepository extends CrudRepository<MovieReview, Long>
{

}
