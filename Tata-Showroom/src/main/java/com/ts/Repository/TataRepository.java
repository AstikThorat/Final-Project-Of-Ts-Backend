package com.ts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Tata;

@Repository
public interface TataRepository extends JpaRepository<Tata, Long> {

	static Tata save() {
		// TODO Auto-generated method stub
		return null;
	}

}
