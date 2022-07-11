package com.chainsys.mavenlessons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.chainsys.mavenlessons.entity.Appointment;
import com.chainsys.mavenlessons.entity.Doctor;
import com.chainsys.mavenlessons.repository.AppointmentRepository;


@RestController
public class AppointmentControl {
	@Autowired
//	--------------------------------------------------
	private AppointmentRepository aptRepo;
	@GetMapping(value = "/fetchdoctorbyappointmentid")
	public String getDoctorByAppointmentId(int id) {
		Appointment app = aptRepo.findById(id);
		Doctor doc = app.getDoctor();
		return doc.toString();
	}
//	------------------------------------------------------
	@GetMapping(value = "/fetchappointment")
	public Appointment getAppointmentById(int id) {
		System.out.println("id= "+id);
		Appointment app=aptRepo.findById(id);
		System.out.println(app.getFee() + " "+app.getPatName());
		return app;
	}

	@GetMapping(value = "/fetchallappointments")
	public List<Appointment> getAllAppointments(){
		return aptRepo.findAll();
	}
	@PostMapping(value = "/newappointment", consumes = "application/json")
	public RedirectView addAppointment(@RequestBody Appointment apt) {
		 aptRepo.save(apt);
		 return new RedirectView("fetchallappointments");
	}
	@PutMapping(value = "/modifyappointment", consumes = "application/json")
	public RedirectView updateAppointment(@RequestBody Appointment apt) {
		 aptRepo.save(apt);
		 return new RedirectView("fetchallappointments");
	}
	@DeleteMapping(value = "/removeappointment")
	public RedirectView deleteAppointment(int id) {
		 return new RedirectView("fetchallappointments");
	}
}
