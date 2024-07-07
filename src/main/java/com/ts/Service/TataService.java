package com.ts.Service;


import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.Repository.TataRepository;
import com.ts.model.Tata;

@Service
public class TataService {
	
	@Autowired
	TataRepository tataRepository;
	
	public Tata save(String username, String phoneno,String emailid, String password,byte[] image) {
		
		Tata t = new Tata();
		t.setUsername(username);
		t.setPhoneno(phoneno);
		t.setEmailid(emailid);
		t.setPassword(password);
		
		if(image != null) {
			String img = Base64.getEncoder().encodeToString(image);
			t.setImage(img.getBytes());
		}
		
		return tataRepository.save(t);
	}
	
	public Tata findByName(String username) {
		return tataRepository.findByusername(username);
	}

	
}


