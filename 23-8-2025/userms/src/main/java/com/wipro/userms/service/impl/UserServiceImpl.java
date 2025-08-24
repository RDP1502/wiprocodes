package com.wipro.userms.service.impl;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import com.wipro.userms.dto.Token;
import com.wipro.userms.entity.User;
import com.wipro.userms.repo.UserRepo;
import com.wipro.userms.service.UserService;
import com.wipro.userms.util.AppConstant;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		
		Optional<User>optUser = userRepo.findById(id);
		if(optUser.isPresent()) {
			return optUser.get();
		}else {
		return null;
		}
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);

	}

	@Override
	public Token login(User user) {
		// TODO Auto-generated method stub
		
		User userData = userRepo.findByUserEmailAndPassWord(user.getUserEmail(), user.getPassWord());
		if(userData!=null) {
			System.out.println(getJWTToken(userData.getUserEmail())); 
			String jwtToken="Bearer " + getJWTToken(user.getUserEmail());
			System.out.println("token="+jwtToken);
			Token token=new Token();
			token.setToken(jwtToken);
			return token;
		}
		return null;
	}
	
	 private String getJWTToken(String username) {
	        Key key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(AppConstant.SECRET));
		 	List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

	        return Jwts.builder()
	                .setId("jwtExample")
	                .setSubject(username)
	                .claim("authorities", grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + 600000))
	                .signWith(key)
	                .compact();
	    }

}
