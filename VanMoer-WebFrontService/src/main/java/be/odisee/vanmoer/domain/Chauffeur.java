package be.odisee.vanmoer.domain;



public class Chauffeur extends Rol {

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