package com.ts.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.model.Tata;

public interface LoginRepository extends JpaRepository<Tata, Long> {
	
	 public Optional<Tata> findByEmailid(String emailid);
}
