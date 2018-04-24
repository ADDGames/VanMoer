package be.odisee.vanmoer.domain;

import javax.persistence.*;
@MappedSuperclass
@Table(name="rol")
public abstract  class Rol {
	@Column(name="familienaam")
	private String familienaam;
	@Column(name="gebruikersnaam")
	private String gebruikersnaam;
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="paswoord")
	private String paswoord;
	@Column(name="status")
	private String status;
	@Column(name="voornaam")
	private String voornaam;



	public void finalize() throws Throwable {

	}

	public Rol(){

	}

	public String getFamilienaam() {
		return familienaam;
	}

	public void setFamilienaam(String familienaam) {
		this.familienaam = familienaam;
	}

	public String getGebruikersnaam() {
		return gebruikersnaam;
	}

	public void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaswoord() {
		return paswoord;
	}

	public void setPaswoord(String paswoord) {
		this.paswoord = paswoord;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
}
