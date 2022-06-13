package com.chainsys.springproject.beans;

public class Actor {
	private int id;
	 private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void print() {
		System.out.println(this.getId());
		System.out.println(this.getName());
		
	}
	public Actor() {
		System.out.println("actor object created");
	}
}
