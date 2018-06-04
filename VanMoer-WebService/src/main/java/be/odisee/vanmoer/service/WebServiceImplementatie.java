package be.odisee.vanmoer.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import be.odisee.vanmoer.domain.Rol;
import be.odisee.vanmoer.helper.*;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.client.Traverson;
import org.springframework.hateoas.client.Traverson.TraversalBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.security.crypto.codec.Base64;


@Service
public class WebServiceImplementatie implements WebService {

	private RestTemplate authRestTemplate() {
		RestTemplate rt = new RestTemplate();
				rt.getInterceptors().add(new BasicAuthorizationInterceptor("VanMoerUser","VanMoerPass.2018"));
		return rt;
	}
	@Override
	public String Login(Login login) {
		boolean correct = false;
		try {
		ResponseEntity<Object[]> responseEntity = authRestTemplate().getForEntity("http://localhost:8081/getAllUsers", Object[].class);
		List<Object> objList=Arrays.asList(responseEntity.getBody());
		List<Rol> rolList=(List<Rol>)(Object)objList;
		for (Rol rol : rolList) {
			if(rol.getGebruikersnaam() == login.getUsername() && rol.getPaswoord() == login.getPaswoord()) {
				correct = true;
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(correct)
			return "Login succesfull";
		else
			return "Login failed";
	}
}
