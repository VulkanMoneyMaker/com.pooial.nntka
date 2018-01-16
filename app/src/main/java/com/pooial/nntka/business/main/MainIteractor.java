package com.pooial.nntka.business.main;


import android.graphics.Movie;

import com.pooial.nntka.business.repositories.main.IMainRepository;

import java.util.List;

import io.reactivex.Single;

public class MainIteractor implements IMainIteractor {

    private IMainRepository repository;

    public MainIteractor(IMainRepository repository) {
        this.repository = repository;
    }


    @Override
    public Single<List<Movie>> getPopularMovie(int page) {
        return null;
    }

    @Override
    public Single<List<Movie>> getTopRated(int page) {
        return null;
    }
}
