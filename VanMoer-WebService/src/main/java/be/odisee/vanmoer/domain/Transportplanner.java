package be.odisee.vanmoer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

public class Transportplanner extends Rol {

	private int id;
	private String emailadres;

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Transportplanner(){

	}

	public Transportplanner(String voornaam,String familienaam,String gebruikersnaam, String paswoord, String status, String emailadres){
		this.setVoornaam(voornaam);
		this.setFamilienaam(familienaam);
		this.setGebruikersnaam(gebruikersnaam);
		this.setPaswoord(paswoord);
		this.setStatus(status);
		this.setEmailadres(emailadres);
	}

	public String getEmailadres() {
		return emailadres;
	}

	public void setEmailadres(String emailadres) {
		this.emailadres = emailadres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
