
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.me.data.model.Country;
import com.me.data.model.State;
import com.me.data.serviceImpl.CountryService;



@RestController
@RequestMapping(value="/country")
public class CountryResource 
{
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(method=RequestMethod.GET)
	public HttpEntity<List<Country>> countries()
	{
		
		/*State st1 = new State( "Maharashtra", "Mumbai");		
		State st2 = new State( "Haryana", "Noida");
		State st3 = new State( "Telengana", "Hydrabad");
		
		List<State> sl = new ArrayList<State>(){*//**
			 * 
			 *//*
			private static final long serialVersionUID = 1L;

		{
			add(st1);
			add(st2);
			add(st3);
		
		}};

		Country country = new Country("India", "Delghi", sl);
		
		countryService.addCountry(country);*/
		
		List<Country> countries = countryService.getAllCountries();
		 
		return new ResponseEntity<List<Country>>(countries, HttpStatus.OK);
	}
}
