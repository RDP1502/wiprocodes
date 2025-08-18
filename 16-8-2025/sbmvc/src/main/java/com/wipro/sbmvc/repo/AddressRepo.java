package com.wipro.sbmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.sbmvc.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
