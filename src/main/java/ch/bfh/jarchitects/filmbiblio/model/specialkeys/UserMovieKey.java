package ch.bfh.jarchitects.filmbiblio.model.specialkeys;

import ch.bfh.jarchitects.filmbiblio.model.Movie;
import ch.bfh.jarchitects.filmbiblio.model.User;

import java.io.Serializable;

/**
 * Created by NTHEVJ on 17.01.2017.
 */
public class UserMovieKey implements Serializable
{
    private User user;
    private Movie movie;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Movie getMovie()
    {
        return movie;
    }

    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }
}
