package com.chainsys.springproject.beans;

public class CalendarFactory {
	//the factory method is not static here
	public  Calendar createCalendar() {
		//the calendar constructor is default acces moifier so, can be call here
		//the calendar class and the calendar factory class are both in the same package
		return new Calendar();
		
	}
	public Appointments createAppointments() {
		return new Appointments();
		
	}

}
