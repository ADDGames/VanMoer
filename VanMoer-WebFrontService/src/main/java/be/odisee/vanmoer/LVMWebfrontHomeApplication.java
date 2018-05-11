package be.odisee.vanmoer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import be.odisee.vanmoer.domain.Locatie;
import be.odisee.vanmoer.domain.Product;
import be.odisee.vanmoer.domain.Transport;


@SpringBootApplication
public class LVMWebfrontHomeApplication {

	
	public static List<Locatie> locaties;
	public static List<Product> producten;
	
	public static List<Transport> transporten;
	public static void main(String[] args) {
		
		//LVMWebfrontHomeApplication app = new LVMWebfrontHomeApplication();
		
		locaties = new ArrayList<Locatie>();
		producten = new ArrayList<Product>();
		transporten = new ArrayList<Transport>();
		SpringApplication.run(LVMWebfrontHomeApplication.class, args);
		
	}
}

