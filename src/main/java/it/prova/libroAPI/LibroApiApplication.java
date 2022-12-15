package it.prova.libroAPI;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.libroAPI.model.Libro;
import it.prova.libroAPI.repository.LibroRepository;

@SpringBootApplication
public class LibroApiApplication implements CommandLineRunner{
	
	@Autowired
	private LibroRepository libroRepository; 

	public static void main(String[] args) {
		SpringApplication.run(LibroApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("Libro1",100, "Autore1", LocalDate.now(), false);
		Libro libro2 = new Libro("Libro2",100, "Autore2", LocalDate.now(), false);
		Libro libro3 = new Libro("Libro3",100, "Autore3", LocalDate.now(), false);
		Libro libro4 = new Libro("Libro4",100, "Autore4", LocalDate.now(), false);
		

		if (!libroRepository.findById((long) 1).isPresent()) {
			libroRepository.save(libro1);
		}
		
		if (!libroRepository.findById((long) 2).isPresent()) {
			libroRepository.save(libro2);
		}
		
		if (!libroRepository.findById((long) 3).isPresent()) {
			libroRepository.save(libro3);
		}
		
		if (!libroRepository.findById((long) 4).isPresent()) {
			libroRepository.save(libro4);
		}
		
		
		
	}

}
