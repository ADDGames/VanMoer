package be.odisee.vanmoer.controller;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.odisee.vanmoer.LVMWebfrontHomeApplication;
import be.odisee.vanmoer.domain.Locatie;
import be.odisee.vanmoer.domain.Product;
import be.odisee.vanmoer.domain.Transport;
import be.odisee.vanmoer.service.HomeWebfrontService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	protected HomeWebfrontService homeWebfrontService = null;
	
	@RequestMapping(value = { "/", "index.html"}, method=RequestMethod.GET)
	public String index(ModelMap model) {
        return "index";
    }
	
	@RequestMapping(value = {"login.html"}, method=RequestMethod.GET)
	public String login(ModelMap model) {
        return "login";
    }
	
	@RequestMapping(value={"/logout","/logoutSuccess.html"},method=RequestMethod.GET)
    public String logout(ModelMap model){
    	return "logoutSuccess";
    }
	
	
	@RequestMapping(value={"/nieuweAanvraag.html"}, method=RequestMethod.GET)
	public String NieuweAanvraag(@ModelAttribute("nieuwTransport") Transport transport, ModelMap model) {
		
		
		
		for(Transport tran : LVMWebfrontHomeApplication.transporten) {
			System.out.println("Transport GET");
            System.out.println(tran.getVertrek().toString());
            System.out.println(tran.getAankomst().toString());
            System.out.println(tran.getDatum().toString());
        }
		
		
		Product product = new Product();
		//Transport transport = new Transport();
		Locatie locatie = new Locatie();
		model.addAttribute("Locatie", locatie);
		model.addAttribute("nieuwTransport", transport);
		model.addAttribute("nieuwProduct", product);
		
		model.addAttribute("datexxx", LocalDate.now());
		
		return "NieuweAanvraag";
	}
	
	
	@RequestMapping(value={"/nieuweAanvraag.html"}, method=RequestMethod.POST)
	public String nieuwTransport(@ModelAttribute("nieuwTransport") Transport transport, ModelMap model, BindingResult bindingResult) {
		
        //System.out.println(bindingResult.toString());
       
		//Transport.setProducten(app.producten);
		
				
        LVMWebfrontHomeApplication.transporten.add(transport);
        
        for(Transport tran : LVMWebfrontHomeApplication.transporten) {
        	System.out.println("Transport POST");
            System.out.println(tran.getVertrek().toString());
            System.out.println(tran.getAankomst().toString());
            System.out.println(tran.getDatum().toString());
        }
        
        Locatie locatie = new Locatie();
        Product product = new Product();
		model.addAttribute("Locatie", locatie);
		model.addAttribute("nieuwTransport", transport);
		model.addAttribute("nieuwProduct", product);
		
		
		
		
		return "NieuweAanvraag";
		
		
		
		
	}
	
	
	@RequestMapping(value={"/nieuwProduct.html"}, method=RequestMethod.GET)
	public String NieuweProduct(@ModelAttribute("nieuwProduct") Product product, ModelMap model) {
		
		
		System.out.println("Product");
		Locatie locatie = new Locatie();
		Transport transport = new Transport();
		
        model.addAttribute("nieuwTransport", transport);
		model.addAttribute("nieuwProduct", product);
		return "NieuweAanvraag";
	}
	
	@RequestMapping(value={"/nieuwProduct.html"}, method=RequestMethod.POST)
	public String nieuwProduct(@ModelAttribute("nieuwProduct") Product product, ModelMap model, BindingResult bindingResult) {
		
        //System.out.println(bindingResult.toString());
		System.out.println("Product");
        LVMWebfrontHomeApplication.producten.add(product);
        
        for(Product prod : LVMWebfrontHomeApplication.producten) {   
            System.out.println(prod.getNaam().toString());
            System.out.println(prod.getGewicht().toString()); 
        }
        
        
        Locatie locatie = new Locatie();
        Transport transport = new Transport();
        model.addAttribute("nieuwTransport", transport);
		model.addAttribute("nieuwProduct", product);
		return "NieuweAanvraag";
		
		
		
		
	}
	
	@RequestMapping(value={"/inbox.html", "/Inbox.html"}, method=RequestMethod.GET)
	public String inbox(@ModelAttribute("inbox") Transport transport, ModelMap model) {
		
		
	
		
 
		return "inbox";
	}
	
	
	
	
}
	
