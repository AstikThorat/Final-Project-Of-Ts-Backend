package com.ts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.Service.TataService;
import com.ts.model.Tata;

@RestController
@CrossOrigin("*")

@Controller
@RequestMapping("/api/tata")
public class TataController {
	
	 @Autowired
	    TataService tataService;

	    @PostMapping("/register")
	    public Tata register(@RequestBody Tata tata){
	    	
	    	return tataService.save(tata.getUsername(),tata.getPhoneno(),tata.getEmailid(),tata.getPassward());
	    }
	    
	    @GetMapping("/findByusername")
	    public Tata findByName(@RequestBody String username) {
			
	    	return tataService.findByName(username);
		}
}


