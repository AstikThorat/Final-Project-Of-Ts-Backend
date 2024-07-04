package com.ts.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ts.Repository.LoginRepository;
import com.ts.model.Tata;

public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	
//	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Save method (with password hashing)
//    public Tata save(Tata tata) {
//        tata.setPassword(passwordEncoder.encode(tata.getPassword()));
//        return loginRepository.save(tata);
//    }

    // Login method
    public Tata login(String emailid, String password) {
        Tata tata = loginRepository.findByEmailid(emailid)
                                  .orElseThrow(() -> new IllegalArgumentException("Invalid emailid or password"));
        if (!passwordEncoder.matches(password, tata.getPassword())) {
            throw new IllegalArgumentException("Invalid emailid or password");
        }
        return tata;
    }
}
