package com.platzi.Play.persistence;

import com.platzi.Play.domain.dto.MovieDto;
import com.platzi.Play.domain.repository.MovieRepository;
import com.platzi.Play.persistence.crud.CrudMovieEntity;
import com.platzi.Play.persistence.mapper.MovieMapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll() {

        return this.movieMapper.toDtos(this.crudMovieEntity.findAll());
    }
}
