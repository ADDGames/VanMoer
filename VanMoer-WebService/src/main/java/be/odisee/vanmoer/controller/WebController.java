package be.odisee.vanmoer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.odisee.vanmoer.domain.Transport;
import be.odisee.vanmoer.helper.Login;
import be.odisee.vanmoer.service.WebService;
import be.odisee.vanmoer.service.WebServiceImplementatie;


@Controller
@RequestMapping("/")
public class WebController {

	@Autowired
	protected WebService webService = new WebServiceImplementatie();
	
	@RequestMapping(value={"/login","/login.html"},method=RequestMethod.GET)
    public String login(@ModelAttribute("nieuwlogin") Login login,ModelMap model){
		model.addAttribute("nieuwlogin",new Login());
    	return "/login";
    }
	@RequestMapping("/login-error.html")
	public String loginError(ModelMap model) {
	    model.addAttribute("loginError", true);
	    return "/login";
	}
	@RequestMapping(value={"/","/home.html", "/index.html"}, method=RequestMethod.GET)
	public String index(ModelMap model) {
		return "/index";
	}
	@RequestMapping(value={"/login","/login.html"}, method=RequestMethod.POST)
	public String loginPost(@ModelAttribute("nieuwlogin") Login login,ModelMap model,BindingResult bindingresult) {
    	String uitleg = webService.Login(login);
    	System.out.println(uitleg);
    	System.out.println("Login POST");
    	System.out.println(login.getUsername());
    	System.out.println(login.getPaswoord());
    	System.out.println(login.getRol());
		model.addAttribute("nieuwlogin",login);
		return "/index";
        }
}
