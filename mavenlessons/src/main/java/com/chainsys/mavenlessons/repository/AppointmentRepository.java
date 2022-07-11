package com.chainsys.mavenlessons.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.chainsys.mavenlessons.entity.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment,Integer> {
 Appointment findById(int id);
 Appointment save(Appointment apt);
 void deleteById(int id);
 List<Appointment> findAll();
// @Query(value="select a from Appointments a where doc_id=?1")
 //jpql- java presistent query language
 //here a is an instance of appointments Entity
 List<Appointment> findAllByDoctorId(int drId);

 }