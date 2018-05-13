package be.odisee.vanmoer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=javax.persistence.InheritanceType.TABLE_PER_CLASS )
@Table(name="klant")
public class Klant extends Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="bedrijfsnaam")
	private String bedrijfsnaam;
	@Column(name="emailadres")
	private String emailadres;

	public Klant() {

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Klant(String voornaam,String familienaam,String gebruikersnaam, String paswoord, String status, String bedrijfsnaam, String emailadres){
		this.setVoornaam(voornaam);
		this.setFamilienaam(familienaam);
		this.setGebruikersnaam(gebruikersnaam);
		this.setPaswoord(paswoord);
		this.setStatus(status);
		this.setBedrijfsnaam(bedrijfsnaam);
		this.setEmailadres(emailadres);
	}

		public String getBedrijfsnaam() {
			return bedrijfsnaam;
		}

		public void setBedrijfsnaam(String bedrijfsnaam) {
			this.bedrijfsnaam = bedrijfsnaam;
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