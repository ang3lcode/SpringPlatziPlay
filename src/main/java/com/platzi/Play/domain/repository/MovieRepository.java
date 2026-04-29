package com.platzi.Play.domain.repository;

import com.platzi.Play.domain.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
}
