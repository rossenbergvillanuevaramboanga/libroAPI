package it.prova.libroAPI.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id; 
	
	@Column(name = "titolo")
	private String titolo;
	
	@Column(name = "pagine")
	private Integer pagine;
	
	@Column(name = "autore")
	private String autore;
	
	@Column(name = "dataPubblicazione")
	private LocalDate dataPubblicazione;
	
	@Column(name = "premiato")
	private Boolean premiato;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(Long id, String titolo, Integer pagine, String autore, LocalDate dataPubblicazione,
			Boolean premiato) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.pagine = pagine;
		this.autore = autore;
		this.dataPubblicazione = dataPubblicazione;
		this.premiato = premiato;
	}
	
	public Libro(String titolo, Integer pagine, String autore, LocalDate dataPubblicazione,
			Boolean premiato) {
		super();
		this.titolo = titolo;
		this.pagine = pagine;
		this.autore = autore;
		this.dataPubblicazione = dataPubblicazione;
		this.premiato = premiato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getPagine() {
		return pagine;
	}

	public void setPagine(Integer pagine) {
		this.pagine = pagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public LocalDate getDataPubblicazione() {
		return dataPubblicazione;
	}

	public void setDataPubblicazione(LocalDate dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}

	public Boolean getPremiato() {
		return premiato;
	}

	public void setPremiato(Boolean premiato) {
		this.premiato = premiato;
	}
	
	
	
	
	
	

}
