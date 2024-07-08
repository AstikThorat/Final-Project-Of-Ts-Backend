package com.ts.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ts.Service.TataService;
import com.ts.model.Tata;


@RestController
@CrossOrigin("*")
public class TataController {
	
	 @Autowired
	    TataService tataService;

	    @PostMapping("/register")
	    public Tata register(@RequestPart("tata") Tata tata, @RequestPart("image")  MultipartFile image ){
	    	
	    	  byte[] imageBytes = null;
	          if (!image.isEmpty()) {
	              try {
	                  imageBytes = image.getBytes();
	              } catch (IOException e) {
	                  e.printStackTrace();
	              }
	          }
	    	
	    	return tataService.save(tata.getUsername(),tata.getPhoneno(),tata.getEmailid(),tata.getPassword(), imageBytes);
	    }
	    
	    @GetMapping("/findByusername")
	    public List<Tata> findByName(@RequestParam("username") String username) {
			
	    	return tataService.findByName(username);
		}
}


