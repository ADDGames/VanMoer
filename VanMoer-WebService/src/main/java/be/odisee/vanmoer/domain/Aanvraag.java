
package be.odisee.vanmoer.domain;
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
import javax.persistence.Table;
/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:17:53
 */

public class Aanvraag {

	private int bestemmingId;
	private Date datum;
	private int id;
	private int klantId;
	private List<Integer> producten;
	private String status;
	private int tijd;
	private int vertrekpuntId;
	public Aanvraag(int bestemmingId, Date datum, int id, int klantId,
			List<Integer> producten, String status, int tijd, int vertrekpuntId) {
		this.setBestemmingId(bestemmingId);
		this.setDatum(datum);
		this.setId(id);
		this.setKlantId(klantId);
		this.setProducten(producten);
		this.setStatus(status);
		this.setTijd(tijd);
		this.setVertrekpuntId(vertrekpuntId);
	}

	public Aanvraag() {
	}
	
	public int getBestemmingId() {
		return bestemmingId;
	}
	public void setBestemmingId(int bestemmingId) {
		this.bestemmingId = bestemmingId;
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
	public int getVertrekpuntId() {
		return vertrekpuntId;
	}
	public void setVertrekpuntId(int vertrekpuntId) {
		this.vertrekpuntId = vertrekpuntId;
	}

}