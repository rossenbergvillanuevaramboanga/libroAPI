package it.prova.libroAPI.repository;

import org.springframework.data.repository.CrudRepository;

import it.prova.libroAPI.model.Libro;

public interface LibroRepository extends CrudRepository<Libro, Long> {

}
