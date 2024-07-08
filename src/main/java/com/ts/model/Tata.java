package com.ts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tata {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String phoneno;
    private String emailid;
    private String password;
    
    @Column(columnDefinition = "MEDIUMBLOB" )
    private byte[] image;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
   public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		 final int MAX_SIZE = 1024 * 1024; // 1MB
		    if (image.length > MAX_SIZE) {
		        throw new IllegalArgumentException("Image size exceeds 1MB");
		  }
		    
		this.image = image;
	}
	
	public Tata() {}
	
	public Tata(long id, String username, String phoneno, String emailid, String password, byte[] image) {
		this.id = id;
		this.username = username;
		this.phoneno = phoneno;
		this.emailid = emailid;
		this.password = password;
		this.image = image;
	}
    
    
}



