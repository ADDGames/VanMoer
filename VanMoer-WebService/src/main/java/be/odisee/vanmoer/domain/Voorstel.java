
package be.odisee.vanmoer.domain;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:18:32
 */
public class Voorstel {
	private Aanvraag aanvraagId;
	private int bestemmingId;
	private int chauffeurId;
	private Date datum;
	private int id;
	private int klantId;
	private List<Integer> producten;
	private String status;
	private int tijd;
	private int transportverantwoordelijkeId;
	private int vertrekpuntId;
	public Voorstel(Aanvraag aanvraagId, int bestemmingId, int chauffeurId, Date datum, int id, int klantId,
			List<Integer> producten, String status, int tijd, int transportverantwoordelijkeId, int vertrekpuntId) {
		this.setAanvraagId(aanvraagId);
		this.setBestemmingId(bestemmingId);
		this.setChauffeurId(chauffeurId);
		this.setDatum(datum);
		this.setId(id);
		this.setKlantId(klantId);
		this.setProducten(producten);
		this.setStatus(status);
		this.setTijd(tijd);
		this.setTransportverantwoordelijkeId(transportverantwoordelijkeId);
		this.setVertrekpuntId(vertrekpuntId);
	}
	public Voorstel() {}
	public Aanvraag getAanvraagId() {
		return aanvraagId;
	}
	public void setAanvraagId(Aanvraag aanvraagId) {
		this.aanvraagId = aanvraagId;
	}
	public int getBestemmingId() {
		return bestemmingId;
	}
	public void setBestemmingId(int bestemmingId) {
		this.bestemmingId = bestemmingId;
	}
	public int getChauffeurId() {
		return chauffeurId;
	}
	public void setChauffeurId(int chauffeurId) {
		this.chauffeurId = chauffeurId;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKlantId() {
		return klantId;
	}
	public void setKlantId(int klantId) {
		this.klantId = klantId;
	}
	public List<Integer> getProducten() {
		return producten;
	}
	public void setProducten(List<Integer> producten) {
		this.producten = producten;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTijd() {
		return tijd;
	}
	public void setTijd(int tijd) {
		this.tijd = tijd;
	}
	public int getTransportverantwoordelijkeId() {
		return transportverantwoordelijkeId;
	}
	public void setTransportverantwoordelijkeId(int transportverantwoordelijkeId) {
		this.transportverantwoordelijkeId = transportverantwoordelijkeId;
	}
	public int getVertrekpuntId() {
		return vertrekpuntId;
	}
	public void setVertrekpuntId(int vertrekpuntId) {
		this.vertrekpuntId = vertrekpuntId;
	}


}