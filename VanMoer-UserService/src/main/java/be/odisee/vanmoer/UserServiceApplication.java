package be.odisee.vanmoer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import be.odisee.vanmoer.controller.UserController;
import be.odisee.vanmoer.domain.*;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner init(UserController controller) {
		return(evt) ->{
			controller.nieuwKlant(new Klant("KvoornaamK","KfamilienaamK","KgebruikersnaamK","KpaswoordK","KstatusK","KbedrijfsnaamK","KemailadresK"));
			controller.nieuwTransportplanner(new Transportplanner("TvoornaamT","TfamilienaamT","TgebruikersnaamT","TpaswoordT","TstatusT","TemailadresT"));
			controller.nieuwChauffeur(new Chauffeur("CvoornaamC","CfamilienaamC","CgebruikersnaamC","CpaswoordC","CstatusC"));
		};
	}
}
