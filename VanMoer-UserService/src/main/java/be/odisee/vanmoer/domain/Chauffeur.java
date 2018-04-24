package be.odisee.vanmoer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=javax.persistence.InheritanceType.JOINED)
@Table(name="chauffeur")
public class Chauffeur extends Rol {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Chauffeur(){

	}

	public Chauffeur(String voornaam,String familienaam,String gebruikersnaam, String paswoord, String status){
		this.setVoornaam(voornaam);
		this.setFamilienaam(familienaam);
		this.setGebruikersnaam(gebruikersnaam);
		this.setPaswoord(paswoord);
		this.setStatus(status);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}