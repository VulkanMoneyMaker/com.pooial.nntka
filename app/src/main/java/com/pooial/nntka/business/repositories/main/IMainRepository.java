package com.pooial.nntka.business.repositories.main;




import io.reactivex.Single;

public interface IMainRepository {

    Single<MovieWrapper> getPopularMovie(int pageNumber);
    Single<MovieWrapper> getTopRated(int pageNumber);
}
