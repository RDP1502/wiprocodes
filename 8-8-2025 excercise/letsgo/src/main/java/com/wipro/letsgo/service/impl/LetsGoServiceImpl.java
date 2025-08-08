package com.wipro.letsgo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.letsgo.entity.LetsGo;
import com.wipro.letsgo.repo.LetsGoRepo;
import com.wipro.letsgo.service.LetsGoService;

@Service
public class LetsGoServiceImpl implements LetsGoService {

	@Autowired
	LetsGoRepo letsGoRepo;
	
	@Override
	public String save(LetsGo letsGo) {
		// TODO Auto-generated method stub
		letsGoRepo.save(letsGo);
		return "Saved Successfully";
	}

	@Override
	public List<LetsGo> findAll() {
		// TODO Auto-generated method stub
		return letsGoRepo.findAll();
	}

}
