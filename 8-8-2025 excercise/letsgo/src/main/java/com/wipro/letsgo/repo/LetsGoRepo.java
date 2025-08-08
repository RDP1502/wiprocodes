package com.wipro.letsgo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.letsgo.entity.LetsGo;

@Repository
public interface LetsGoRepo extends JpaRepository<LetsGo, Integer> {
	

}
