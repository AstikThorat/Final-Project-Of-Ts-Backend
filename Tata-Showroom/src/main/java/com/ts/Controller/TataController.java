package com.ts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ts.Repository.TataRepository;
import com.ts.Service.TataService;
import com.ts.model.Tata;

@RestController
@CrossOrigin("*")
public class TataController {
	
	 @Autowired
	    TataService tataService;

	    @PostMapping("/register")
	    public Tata register(@RequestBody Tata tata){
	        return TataRepository.save();
	    }
}


