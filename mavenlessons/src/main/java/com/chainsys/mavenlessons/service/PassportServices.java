package com.chainsys.mavenlessons.service;
import com.chainsys.mavenlessons.entity.Passport;
import com.chainsys.mavenlessons.repository.PassportRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportServices {

	@Autowired
	private PassportRepository repo;
	public void addPassport(Passport passport) {
		repo.save(passport);
	}
	public Passport findPassportById(int id) {
		return repo.findById(id);
	}
	public List<Passport> getPassports(){
		return repo.findAll();
	}
	public void modifyPassport(Passport passport) {
//		TODO: validate passport.id before repo.save()
		repo.save(passport);
	}
	public void deletePassportById(int id) {
		repo.deleteById(id);
	} 
}
