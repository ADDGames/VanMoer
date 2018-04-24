package be.odisee.vanmoer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import be.odisee.vanmoer.dao.*;
import be.odisee.vanmoer.domain.*;

@SpringBootApplication
public class VanMoerUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VanMoerUserServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner init(KlantRepository klantRepo,TransportplannerRepository transRepo,ChauffeurRepository chaufRepo) {
		return(evt) ->{
		klantRepo.save(new Klant("KvoornaamK","KfamilienaamK","KgebruikersnaamK","KpaswoordK","KstatusK","KbedrijfsnaamK","KemailadresK"));
		transRepo.save(new Transportplanner("TvoornaamT","TfamilienaamT","TgebruikersnaamT","TpaswoordT","TstatusT","TemailadresT"));
		chaufRepo.save(new Chauffeur("CvoornaamC","CfamilienaamC","CgebruikersnaamC","CpaswoordC","CstatusC"));
		};
	}
}
