/**
 * 
 */
package be.odisee.vanmoer.domain;

import java.util.List;

/**
 * @author Tijs De Belie
 *
 */
public class Transport {

	
	private String vertrek;
	private String aankomst;
	private String datum;
	private List<Product> producten;
	
	
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public String getVertrek() {
		return vertrek;
	}
	public void setVertrek(String vertrek) {
		this.vertrek = vertrek;
	}
	public String getAankomst() {
		return aankomst;
	}
	public void setAankomst(String aankomst) {
		this.aankomst = aankomst;
	}
	
	public List<Product> getProducten() {
		return producten;
	}
	public void setProducten(List<Product> producten) {
		this.producten = producten;
	}
}
