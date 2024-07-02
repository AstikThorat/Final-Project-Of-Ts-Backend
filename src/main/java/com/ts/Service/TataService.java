package com.ts.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.Repository.TataRepository;
import com.ts.model.Tata;

@Service
public class TataService {
	
	@Autowired
	TataRepository tataRepository;
	
	public Tata save(String username, String phoneno,String emailid, String password) {
		
		Tata t = new Tata();
		t.setUsername(username);
		t.setPhoneno(phoneno);
		t.setEmailid(emailid);
		t.setPassward(password);
		return tataRepository.save(t);
	}
}


