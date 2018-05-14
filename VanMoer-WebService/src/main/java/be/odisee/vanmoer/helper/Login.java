package be.odisee.vanmoer.helper;

public class Login {
	private String username;
	private String paswoord;
	private String rol;
	public Login(String username, String paswoord, String rol) {
		this.username = username;
		this.paswoord = paswoord;
		this.rol = rol;
	}
	public Login() {}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPaswoord() {
		return paswoord;
	}
	public void setPaswoord(String paswoord) {
		this.paswoord = paswoord;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
}
