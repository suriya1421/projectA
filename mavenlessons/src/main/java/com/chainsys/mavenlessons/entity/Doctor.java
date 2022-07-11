package com.chainsys.mavenlessons.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Doctor")
public class Doctor {   
	@Id
	@Column(name="DOCTOR_ID")
	private int id; 
	@Column(name="DOCTOR_NAME")
	private String doctor_name;   
	@Column(name="DOB")
    private Date dob;  
	@Column(name="SPECIALITY ")
    private String speciality;
	@Column(name="CITY ")
    private String city;
	@Column(name="PHONE_NO ")
    private long phone_no;
	@Column(name="STANDARD_FEES")
    private float standard_fees; 
   
	// Bidirectional Association
	
		@OneToMany(mappedBy = "doctor",fetch = FetchType.LAZY )
		@JsonIgnore
		private List<Appointment > appointments;
		public List<Appointment> getAppointments(){
			return this.appointments;
		} 
		
		public int getDocId() {
			return id;
		}

		public void setDocId(int docId) {
			this.id = docId;
		}

		public String getDocName() {
			return getDocName();
		}

		public void setDocName(String docName) {
			this.doctor_name = docName;
		}

		public Date getDocDob() {
			return getDocDob();
		}

		public void setDocDob(Date docDob) {
			this.dob = docDob;
		}
        public String getSpeciality() {
			return speciality;
		}

		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public long getPhNo() {
			return getPhNo();
		}

		public void setPhNo(long phNo) {
			this.phone_no = phNo;
		}

		public float getFee() {
			return getFee();
		}

		public void setFee(float fee) {
			this.standard_fees = fee;
		}

		@Override
		public String toString() {
			return String.format(" { %d, %s, %s, %s, %s, %s,%d,%.2f }", id, doctor_name, dob, 
				 speciality, city, phone_no,standard_fees);
		}

	}
    