

package be.odisee.vanmoer.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:18:14
 */
public class Locatie {

	private String adres;
	private int id;
	private List<Product> producten;
	private String status;
	public Locatie(String adres, int id, List<Product> producten, String status) {
		this.setAdres(adres);
		this.setId(id);
		this.setProducten(producten);
		this.setStatus(status);
	}
	public Locatie() {}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Product> getProducten() {
		return producten;
	}
	public void setProducten(List<Product> producten) {
		this.producten = producten;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}