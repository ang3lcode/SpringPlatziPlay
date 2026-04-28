package com.platzi.Play.web.controller;

import com.platzi.Play.persistence.crud.CrudMovieEntity;
import com.platzi.Play.persistence.entity.MovieEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// @RequestMapping("/movies")
public class MovieController {
    private final CrudMovieEntity crudMovieEntity;

    public MovieController(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }

    @GetMapping("/movies")
    public List<MovieEntity> getAll() {
        return (List<MovieEntity>) this.crudMovieEntity.findAll();
    }
}
