
package be.odisee.vanmoer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:18:17
 */
public class Product {

	private int aantal;
	private String code;
	private int id;
	private String naam;
	public Product(int aantal, String code, int id, String naam) {
		this.setAantal(aantal);
		this.setCode(code);
		this.setId(id);
		this.setNaam(naam);
	}
	public Product() {}
	public int getAantal() {
		return aantal;
	}
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}

}