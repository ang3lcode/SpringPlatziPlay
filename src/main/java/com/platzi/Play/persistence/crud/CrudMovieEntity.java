package com.platzi.Play.persistence.crud;

import com.platzi.Play.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

// MovieEntity viene del archivo MovieEntity.java
// CrudRepository es una interfaz que proporciona operaciones CRUD
// Long es el tipo de dato del identificador de la tabla
public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {
}
