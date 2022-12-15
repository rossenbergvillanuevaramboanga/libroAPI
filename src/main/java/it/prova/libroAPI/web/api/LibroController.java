package it.prova.libroAPI.web.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import it.prova.libroAPI.model.Libro;
import it.prova.libroAPI.repository.LibroRepository;

@RestController
@RequestMapping("/api/libro")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class LibroController {
	
	@Autowired
	private LibroRepository libroRepository;
	
	@GetMapping
	public List<Libro> getAll(){
		return (List<Libro>) libroRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Libro> findById(@PathVariable(value = "id", required = true) Long id){
		return libroRepository.findById(id);
	}
	
	@PostMapping
	public Libro create(@RequestBody Libro libro){
		//if (libro.getId() != null) return null;
		return libroRepository.save(libro);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable(value = "id", required = true) Long id){
		libroRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@Valid @RequestBody Libro libro, @PathVariable(value = "id", required = true) Long id){
		Optional<Libro> result = libroRepository.findById(id);
		if (!result.isPresent()) return;
		libroRepository.save(libro);
	}

}
