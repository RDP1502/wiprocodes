package com.wipro.letsgo.service;

import java.util.List;

import com.wipro.letsgo.entity.LetsGo;

public interface LetsGoService {

	String save(LetsGo letsGo);
	List<LetsGo> findAll();
}
